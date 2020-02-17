package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateName("Junaid");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateName("Ju");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateName("junaid");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenAllUpperCase_ShouldReturnFalse(){
        boolean result = UserValidator.validateName("JUNAID");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenNumbers_ShouldReturnFalse() {
        boolean result = UserValidator.validateName("1234");
        Assert.assertFalse(result);
    }
// Test Cases for Last Name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateName("Ansari");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateName("An");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateName("ansari");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenAllUpperCase_ShouldReturnFalse(){
        boolean result = UserValidator.validateName("ANSARI");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenNumbers_ShouldReturnFalse() {
        boolean result = UserValidator.validateName("1234");
        Assert.assertFalse(result);
    }

}
