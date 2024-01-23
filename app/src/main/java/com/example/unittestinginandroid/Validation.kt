package com.example.unittestinginandroid

class Validation {

    private val emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"

    fun email(email: String): Boolean {
        if (email.matches(emailPattern.toRegex())) return true
        return false
    }
}