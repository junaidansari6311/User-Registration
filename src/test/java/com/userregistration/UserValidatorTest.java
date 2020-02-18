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
    //Test Cases for email address
    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateEmailAddress("abc.xyz@bridgeLabz.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailAddress_WhenImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateEmailAddress("abc.@gmail.com");
        Assert.assertFalse(result);
    }
    //Test Cases for mobile number

    @Test
    public void givenMobileNumber_WhenProper_shouldReturnTrue() {
        boolean result = UserValidator.validateMobileNumber("91 7666659442");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNoCountryCode_shouldReturnFalse() {
        boolean result = UserValidator.validateMobileNumber("7666659442");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenCounrtryCodeImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateMobileNumber("12234 6789543526");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNoIsImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateMobileNumber("91 7896453");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenCountryCodeAndMobileNumberBothImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateMobileNumber("21413 726857634654");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenFormatImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validateMobileNumber("917666544990");
        Assert.assertFalse(result);
    }
    //Test Cases for password for minimum 8 characters
    @Test
    public void givenPasswordForRule1_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePasswordMinimum8Characters("junaidansari");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordForRule1_WhenImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordMinimum8Characters("junaid");
        Assert.assertFalse(result);
    }
    //Test Cases for password for atleast one upper case

    @Test
    public void givenPasswordWithAtleastOneUpperCase_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePasswordAtleastOneUpperCase("Junaidansari");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtleastOneUpperCase_WhenSpecialCharactersPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordAtleastOneUpperCase("junaid@as");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtleastOneUpperCase_WhenNumbersPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordAtleastOneUpperCase("Junaid123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtleastOneUpperCase_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordAtleastOneUpperCase("junaidansari");
        Assert.assertFalse(result);
    }
}
