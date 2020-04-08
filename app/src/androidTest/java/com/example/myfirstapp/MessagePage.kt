package com.example.myfirstapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers

object MessagePage {
    fun assessMessage(message: String): MessagePage {
        onView(withId(R.id.textView))
            .check(ViewAssertions.matches(ViewMatchers.withText(message)))
        return this
    }
}

