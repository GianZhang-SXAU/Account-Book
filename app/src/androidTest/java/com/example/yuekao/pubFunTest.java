package com.example.yuekao;

import junit.framework.Assert;
import junit.framework.TestCase;
import com.example.yuekao.util.pubFun;

public class pubFunTest extends TestCase {

    public void testIsEmpty() {
        String input = "";
        boolean expected = true;
        boolean actual = pubFun.isEmpty(input);
        Assert.assertEquals(expected, actual);
    }

    public void testIsEmptyWithNull() {
        String input = null;
        boolean expected = true;
        pubFun.isEmpty(null);
        boolean actual = true;
        Assert.assertEquals(expected, actual);
    }

    public void testIsEmptyWithWhitespace() {
        String input = "   ";
        boolean expected = true;
        boolean actual = pubFun.isEmpty(input);
        Assert.assertEquals(expected, actual);
    }

    public void testIsEmptyWithTab() {
        String input = "\t";
        boolean expected = true;
        boolean actual = pubFun.isEmpty(input);
        Assert.assertEquals(expected, actual);
    }

    public void testIsEmptyWithNewLine() {
        String input = "\n";
        boolean expected = true;
        boolean actual = pubFun.isEmpty(input);
        Assert.assertEquals(expected, actual);
    }

    public void testIsEmptyWithValidString() {
        String input = "hello";
        boolean expected = false;
        boolean actual = pubFun.isEmpty(input);
        Assert.assertEquals(expected, actual);
    }

    public void testIsPhoneNumberValidWithValidFormat1() {
        String phoneNumber = "123-456-7890";
        boolean expected = true;
        boolean actual = pubFun.isPhoneNumberValid(phoneNumber);
        Assert.assertEquals(expected, actual);
    }

    public void testIsPhoneNumberValidWithValidFormat2() {
        String phoneNumber = "(123) 456 7890";
        boolean expected = true;
        boolean actual = pubFun.isPhoneNumberValid(phoneNumber);
        Assert.assertEquals(expected, actual);
    }

    public void testIsPhoneNumberValidWithInvalidFormat() {
        String phoneNumber = "1234567890";
        boolean expected = false;
        boolean actual = pubFun.isPhoneNumberValid(phoneNumber);
        Assert.assertEquals(expected, actual);
    }
}