package com.mobylab.workshop2023_2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun dice_isCorrect() {
        assertTrue("Dice value was not between 1 and 6", MainActivity.Dice(6).roll() in 1..6)
    }
}