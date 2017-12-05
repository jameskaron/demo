package com.james.demo

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	fun contextLoads() {

	}

	@Test
	fun test(){
		val list = listOf(1,2,3,4,5,6)
//		assertEquals(mapOf("odd" to listOf(1, 3, 5), "even" to listOf(2, 4, 6)), list.groupBy { if (it % 2 == 0) "even" else "odd" })
		print(list.groupBy { if (it % 2 == 0) "even" else "odd"})
	}
}
