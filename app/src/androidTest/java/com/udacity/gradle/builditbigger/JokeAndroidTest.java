package com.udacity.gradle.builditbigger;


import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.concretesolutions.showjoke.ShowJokeActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by douglasmotta on 16/05/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class JokeAndroidTest {
    @Rule
    public ActivityTestRule<ShowJokeActivity> activityTestRule
            = new ActivityTestRule<>(ShowJokeActivity.class);

    @Test
    public void testTellJokeAsyncTask() {
        new MainActivityFragment.EndpointsAsyncTask().execute(activityTestRule.getActivity());

        onView(withId(R.id.tv_show_joke)).check(matches(isDisplayed()));
    }
}
