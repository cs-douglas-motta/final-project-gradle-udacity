package com.udacity.gradle.jokes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by douglasmotta on 16/05/17.
 */

public class JokeTest {
    private Joke joke;

    @Before
    public void setUpJoke() {
        joke = new Joke();
    }

    @Test
    public void testTellJoke() {
        Assert.assertEquals(joke.tellJoke(), "Joke of module telljoke");
    }
}
