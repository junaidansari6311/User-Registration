package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateFirstName("Junaid");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("Ju");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("junaid");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenAllUpperCase_ShouldReturnFalse(){
        boolean result = UserValidator.validateFirstName("JUNAID");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenNumbers_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("1234");
        Assert.assertFalse(result);
    }
}
