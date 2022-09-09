package com.baeldung;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import  hudson.plugins.checkstyle;

public class SomeUnitTest extends CheckStylePublisher{
    @Test
    public void init() {
        assertEquals(1, 1);
    }
}
