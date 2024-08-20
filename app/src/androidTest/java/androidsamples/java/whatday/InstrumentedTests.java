package androidsamples.java.whatday;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented tests for the {@link MainActivity} behavior.
 */
@RunWith(AndroidJUnit4.class)
public class InstrumentedTests {
  @Rule
  public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

  @Test
  public void Aug15_1947_Friday() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("15"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("8"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("1947"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Friday")));
  }

  @Test
  public void test42isInvalidDate() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("42"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("8"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2021"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Invalid date")));
  }

  @Test
  public void testInvalidYear() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("15"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("8"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("999"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Tuesday")));
  }

  @Test
  public void testInvalidDate() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("32"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("8"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2021"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Invalid date")));
  }

  @Test
  public void testValidDate15082021() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("15"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("8"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2021"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Sunday")));
  }


  @Test
  public void testInvalidMonthZero() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("15"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("00"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2021"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Invalid month")));
  }

  @Test
  public void testInvalidDateFebruary() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("30"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("2"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2021"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("This month does not have 30 days")));
  }

  @Test
  public void testValidDate01012022() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("01"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("01"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2022"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("Saturday")));
  }

  @Test
  public void testInvalidDateApril() {
    onView(withId(R.id.editDate)).perform(clearText(), typeText("31"));
    onView(withId(R.id.editMonth)).perform(clearText(), typeText("4"));
    onView(withId(R.id.editYear)).perform(clearText(), typeText("2021"));

    onView(withId(R.id.btn_check)).perform(click());

    onView(withId(R.id.txt_display)).check(matches(withText("This month does not have 31 days")));
  }
}