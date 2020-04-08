package com.example.myfirstapp

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.matcher.ViewMatchers.withId

object TextFieldPage {

    fun typeText(message: String): TextFieldPage {
            onView(withId(R.id.editText))
                .perform(replaceText(message))
        return this
    }

    fun sendMessage(): MessagePage {
        onView(withId(R.id.button))
            .perform(click())
        return MessagePage
    }
}
