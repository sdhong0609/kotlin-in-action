package ch06.ex1_8_2_LateinitializedProperties1.ch06

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    @BeforeEach
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction() {
        assertEquals(
            "foo",
            myService.performAction()
        )
    }
}
