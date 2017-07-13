package com.mycompany.app;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hillel on 13.07.2017.
 */
public class MainTest {

    Sum sum;

    @Before
    public void setUp() throws Exception
    {
        sum = new Sum();
    }

    @Test
    public void testPlus() throws Exception
    {
        assertEquals(4, sum.plus(2,2));
    }

}
