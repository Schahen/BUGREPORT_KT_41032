import kotlin.test.Test

interface GenericTests {
    @Test
    fun foo()
}

class GenericTestsImpl : GenericTests {
    override fun foo() {
    }
}

interface MyTests : GenericTests

class MyTestsImpl(transform: (String) -> String) : MyTests, GenericTests by GenericTestsImpl()