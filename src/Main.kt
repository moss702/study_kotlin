import org.w3c.dom.Attr

fun main() {
  val name = "Kotlin"  // val : 상수, var : 변수
  println("Hello, " + name + "!") // 화면 출력
//  println("Hello, $name!") // 위와 동일내용 출력

  for (i in 1..5) { // 1..5 == 1,2,3,4,5
    println("i = $i")
  }
  println("============= in ============")
//  val nums:Array<Int> = arrayOf(1,2,3,4,5) // 명시적 표현
  val nums = arrayOf(1,2,3,4,5)
  for (i in 1 until 9) { // .. 대신 until 사용가능
    if(i in nums) println("i in nums is $i. ") // 1, 2, 3, 4, 5
    if(i !in nums) println("i !in nums is $i. ") // 6, 7, 8
  }
  println("============ is =============")
  if (nums is Int) {println(nums.contentToString())}
  if (nums is Array<Int>) {println(nums.contentToString())}
  println("============ swutch case를 대신할 when else =============")
  // 코틀린에는 switch가 없음
  // 대신 when을 사용
  when(name) {
    "Kotlin" -> println("Kotlin") // case 1 : 대신 이렇게 람다식으로 사용
    else -> println("Unknown") // default 대신 else 사용. 위에서 없으면 else로 들어감
  }
  println("============ 구구단을 외자 =============")
  for (i in 2 until 10) {
    for (j in 1 until 10) {
      println("$i x $j = ${i * j}")
    }
  }
  println("============ 함수 : 더하기 =============")
  var sum = add(3, 5)
  println("sum = $sum")
  println("${add(3,7)}")

  println("============ 클래스 Animal =============")
  var a1 = Animal("사자", 5)
  var a2 = Animal("호랑이", 2)
  println("${a1.name}의 나이는 ${a1.age}살 입니다.")
  println("${a2.name}의 나이는 ${a2.age}살 입니다.")
  println(a1)
  println(a2)

  println("============ 스마트 형변환 =============")
  var numberString : Any = 1 // Any 타입의 변수 선언.
  // Any? 모든클래스(Int,String,Double...)의 최상위 타입 (자바의 Object와 비슷)
  println(numberString) // Int 타입의 1 출력
  numberString = "문자열입니당" // String 타입의 "문자열입니당" 대입(덮어쓰기됨)
  println(numberString) // 마지막으로 대입한 String 타입 출력

  var arrayTest : Array<Any> = arrayOf(1,2,3,"문자")

  println("============ 컬렉션 클래스 =============")
//  val class1 = CollectionTest();
//  class1.sample1();
  CollectionTest().sample4()


  println("============ sum 함수 사용 =============")
  CollectionTest().sample4()

}

// 함수의 반환 타입을 : Int 이런 식으로 표기
fun add(a: Int, b: Int): Int {
  return a + b
}

// 클래스 이름 (변수선언 변수명: 타입) <- 이렇게 필드를 선언한 것.
// 기본생성자까지 자동생성. 다른 생성자가 필요하다면 블록 열어서 선언.
open class Animal (val name: String, val age: Int) {
  override fun toString(): String {
    return "[name : ${name}, age : ${age}]"
  }
}

class Dog(name: String, age: Int) : Animal(name = name, age = age) {

}


// 코틀린에서
// var : 변수를 선언할때 사용
// val : 상수를 선언할때 사용
//
// 코틀린의 자료형
// 기본자료형이라는게 따로 없음. 기본적으로 자료형 불변
// Byte, Short, Int, Long, Float, Double, Char, Boolean, String
//
// 연산자는 java와 동일
// +, -, *, /, %, >, <, ==, >=, <=, !=, &&, ||, !
// 코틀린에만 있는 연산자
//   in : 배열형 자료에 값이 포함되어 있으면 True
//     ex.
//     var nums : Array<Int> = arrayOf(1,2,3,4,5,6)  // 배열선언 var 대신 val로 써도 됨! 단 배열의 크기 고정됨. 값은 변경 가능.
//     if(nums in 5) { 5가 있으면 이곳 진입 }
//   is : 변수의 자료형이 이것인지 확인
//     ex.
//     var num:Int = 1
//     if(num is Int){"num"이 Int형이면 이곳 진입}



