package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Long id = Long.MIN_VALUE;
        String name = "Foo";
        Person p = new Person(id, name);
        Assert.assertEquals(id, p.getId());
        Assert.assertEquals(name, p.getName());
    }

    @Test
    public void testSetName() {
        Long id = Long.MIN_VALUE;
        String name = "Foo";
        Person p = new Person(id, name);
        name = "Bar";
        p.setName(name);
        Assert.assertEquals(name, p.getName());
    }

}
