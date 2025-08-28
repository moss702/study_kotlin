class CollectionTest {
// 코틀린에서 대표적인 collection은
//  listOf(), setOf(), mapOf() : 기본이 Immutable
    // mutable 타입은 아래와 같음
    // mutableListOf(), mutableSetOf(), mutableMapOf()
    // mutable? 값 변동이 자유로움.

  fun sample1() {
    // 변수는 val, var로 먼저 시작. : 변수타입(Int...) 으로 선언
    val nums = mutableListOf<Int>(1,2,3);
    nums.add(4);
    println(nums)
  }

  fun sample2() {
    val nums = mutableSetOf<Int>(1,2,3);
    nums.add(3); // set은 집합. 중복된 값은 안받아줌.
    println(nums)
  }
  fun sample3() {
    // MapOf(key to value)
    val nums = mutableMapOf(1 to "one", 2 to "two", 3 to "three");
    nums[4] = "four"; // 여기에 값을 추가하려면 이렇게.

    //맵에서 값을 하나씩 꺼내려면?
    for((k, v) in nums) {
      println("$k -> $v");
    }

    // 또는, foreach 사용
    nums.forEach { (k, v) -> println("$k -> $v") }

    // 또는, Entry 객체를 이용
    for(entry in nums.entries) {
      println("${entry.key} -> ${entry.value}");
    }
  }

  fun sample4() {
    // 일반함수
    val f1 = fun() {println("Hello world");}
    // 람다식
    val f2 : () -> Unit = {println("Hello world");}

    // fun() {}  --->  () -> Unit = {}

  }

}