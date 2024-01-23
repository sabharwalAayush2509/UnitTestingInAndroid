package com.example.unittestinginandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ValidationTest {

    private lateinit var validation: Validation

    @Before
    fun setUp() {
        validation = Validation()
    }

    @Test
    fun checkEmail() {
        val result = validation.email("test123@gmail.com")
        assertThat(result).isTrue()
    }
}