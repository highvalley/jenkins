import org.specs2.mutable._

class HelloWorldSpec extends Specification {

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
  }

  "The Hello#sayHello" should {
    "contain 13 characters" in {
      val hello = new Hello
      hello.sayHello must have size(13)
    }
  }
}
