package com.example.myapplication

import androidx.activity.ComponentActivity
import androidx.compose.material3.Surface
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.isToggleable
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@MediumTest
@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
@ExperimentalCoroutinesApi
class TaskDetailScreenTest {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<HiltTestActivity>()

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun activeTaskDetails_DisplayedInUi() = runTest {
        // GIVEN - repo or w/e

        // WHEN - Screen is opened
        setContent()

        // THEN - asserts
        composeTestRule.onNodeWithText("Lorem Ipsum").assertIsDisplayed()
        composeTestRule.onNode(isToggleable()).assertIsOff()
    }

    private fun setContent() {
        composeTestRule.setContent {
            MainTheme {
                Surface {
                    // Screen
                }
            }
        }
    }
}

@AndroidEntryPoint
class HiltTestActivity : ComponentActivity()