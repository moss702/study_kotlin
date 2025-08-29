class CollectionTest {
// 코틀린에서 대표적인 collection은
//  listOf(), setOf(), mapOf() : 기본이 Immutable // 불변(고정)
    // mutable 타입은 아래와 같음 // 가변(변수처럼 쓸거임)
    // mutableListOf(), mutableSetOf(), mutableMapOf()
    // mutable? 값 변동이 자유로움.

  // --------- sample1 : 컬렉션(ListOf)의 값 넣기
  fun sample1() {
    // 변수는 val, var로 먼저 시작. : 변수타입(Int...) 으로 선언
    val nums = mutableListOf<Int>(1,2,3);
    nums.add(4);
    println(nums)
  }
  // --------- sample2 : 컬렉션(SetOf)의 값 넣기와 중복값에 대한 처리
  fun sample2() {
    val nums = mutableSetOf<Int>(1,2,3);
    nums.add(3); // set은 집합. 중복된 값은 안받아줌.
    println(nums)
  }
  // --------- sample3 : 컬렉션(MapOf)의 값 꺼내고 넣기
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
  // --------- sample4 : 람다식 변환하여 함수 사용하기
  fun sample4() {
    // 일반함수
    val f1 = fun() {println("Hello world");}
    // 람다식
    val f2 : () -> Unit = {println("Hello world");}
    // 일반함수  --->  람다식
    // fun() {}  --->  () -> Unit = {}

    // x, y 값을 받아서, x + y로 리턴해라
    val sum1 : (x: Int, y: Int) -> Int = { x, y -> x + y }
    val sum2 = {x:Int, y:Int -> x + y}
    fun sum3 (x: Int, y: Int): Int = x + y // 함수선언처럼 할수도있음
    // 위 3개는 동일한 기능을 하는 함수

    val sum4 = {x:Int, y:Int ->
      println("$x, $y"); // 변수 이름만 있다면 {} 생략가능. 연산할때는 {}로 감싸주기.
      x + y // return을 따로 써주지 않아도, 마지막 줄에 쓴 값이 리턴됨.
    }

    println(sum1(1,2));
    println("${sum2(2,2)}")
  }



}