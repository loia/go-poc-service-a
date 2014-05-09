package com.loia;

import org.junit.Assert;
import org.junit.Test;

public class MyControllerTest {

    private MyController controller = new MyController();

    @Test
    public void testAdd() throws Exception {
        String actual = this.controller.getResourceA();
        Assert.assertEquals("Resource A", actual);
    }
}
