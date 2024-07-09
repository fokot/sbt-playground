package dependent1

class Dependent1Test extends munit.FunSuite {
  test("f") {
    assertEquals(Dependent1.f(), 1)
  }
}