package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Doarcutine on 2017/9/15.
 */
public class LibraryTest {


    @Test
    public void getWelcomeInformationTest() {
        Library library = new Library();
        assertEquals("welcome",library.getWelcomeInformation());
    }

}

