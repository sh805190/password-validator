package com.example.chenenlin.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)

public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity>  mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInput(){
        //input password in the edit text field
        onView(withId(R.id.password1)).perform(typeText("asdndsg"), closeSoftKeyboard());
        //close soft keyboard

        //perform button click
        onView(withId(R.id.validate)).perform(click());
        //checking if the "validation" in the text view
        onView(withId(R.id.textView)).check(matches(withText("Password is not strong enough!!!")));

    }
    @Test
    public void testUserInput1(){
        //input password in the edit text field
        onView(withId(R.id.password1)).perform(typeText("asdnd@1"), closeSoftKeyboard());
        //close soft keyboard

        //perform button click
        onView(withId(R.id.validate)).perform(click());
        //checking if the "validation" in the text view
        onView(withId(R.id.textView)).check(matches(withText("Password is not strong enough!!!")));

    }
    @Test
    public void testUserInput2(){
        //input password in the edit text field
        onView(withId(R.id.password1)).perform(typeText("asdnASD#1g"), closeSoftKeyboard());
        //close soft keyboard

        //perform button click
        onView(withId(R.id.validate)).perform(click());
        //checking if the "validation" in the text view
        onView(withId(R.id.textView)).check(matches(withText("Password is strong enough!!!")));

    }

    @Test
    public void testUserInput3(){
        //input password in the edit text field
        onView(withId(R.id.password1)).perform(typeText("as#1g"), closeSoftKeyboard());
        //close soft keyboard

        //perform button click
        onView(withId(R.id.validate)).perform(click());
        //checking if the "validation" in the text view
        onView(withId(R.id.textView)).check(matches(withText("Password is not strong enough!!!")));

    }

    @Test
    public void testUserInput4(){
        //input password in the edit text field
        onView(withId(R.id.password1)).perform(typeText("asd123"), closeSoftKeyboard());
        //close soft keyboard

        //perform button click
        onView(withId(R.id.validate)).perform(click());
        //checking if the "validation" in the text view
        onView(withId(R.id.textView)).check(matches(withText("Password is not strong enough!!!")));

    }

    @Test
    public void testUserInput5(){
        //input password in the edit text field
        onView(withId(R.id.password1)).perform(typeText("12344"), closeSoftKeyboard());
        //close soft keyboard

        //perform button click
        onView(withId(R.id.validate)).perform(click());
        //checking if the "validation" in the text view
        onView(withId(R.id.textView)).check(matches(withText("Password is not strong enough!!!")));

    }

    @After
    public void tearDown() throws Exception {
    }

}