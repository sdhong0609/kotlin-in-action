package ch06.ex1_8_1_LateinitializedProperties

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null

    @BeforeEach
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction() {
        assertEquals(
            "foo",
            myService!!.performAction()
        )
    }
}
