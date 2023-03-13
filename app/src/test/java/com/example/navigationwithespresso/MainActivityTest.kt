package com.example.navigationwithespresso

import androidx.test.core.app.ActivityScenario
import org.junit.Assert.*
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }
}