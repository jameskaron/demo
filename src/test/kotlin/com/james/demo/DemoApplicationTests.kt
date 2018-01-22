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
	fun test1(){
        val unsortedList = listOf(3, 2, 7, 5)
        assertEquals(listOf(3, 7, 2, 5), unsortedList.sortedBy { it % 3 })
        println(2%3)
        println(unsortedList.sortedBy { it % 3 })
	}

	@Test fun test(){
		val list = listOf(1,2,3)
		val ele = list.first()
		println(ele)
	}
}
