package fr.neamar.kiss;

import fr.neamar.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    @Test
    public void testSomething() throws Exception {
        // TODO-add more tests...
        assertTrue(Robolectric.setupActivity(MainActivity.class) != null);
        // Purposely break the test to make sure the test is run
        assertTrue(false);
    }
}
