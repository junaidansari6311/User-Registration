package com.userregistration;

public class UserValidator {
        private static final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
        private static final String EMAIL_PATTERN = "^[A-Za-z]{3,}([-|+|.]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4})?$";
        private static final String MOBILE_NO_PATTERN="[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
        private static final String PASSWORD_MINIMUM_8_CHARACTER_PATTERN ="^[A-Za-z]{8,}$";
        private static final String PASSWORD_WITH_ONE_UPPERCASE_PATTERN ="^(?=.*[A-Z])[A-Za-z]{8,}$";
        private static final String PASSWORD_WITH_ONE_NUMERIC_PATTERN ="^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
        private static final String PASSWORD_WITH_ONE_SPECIAL_CHARACTER_PATTERN ="^(?=.*[A-Z])(?=.*[0-9])(?=[^@|#|$|%|&]*[@|#|$|%|&][^@|#|$|%|&]*$)[A-Za-z0-9@#$%^&]{8,}$";

        public static boolean validateName(String name) {
            if (name.matches(NAME_PATTERN)) {
                return true;
            }
            return false;
        }

        public static boolean validateEmailAddress(String email) {
            if (email.matches(EMAIL_PATTERN)) {
                return true;
            }
            return false;
        }

        public static boolean validateMobileNumber(String mobileNo) {
            if (mobileNo.matches(MOBILE_NO_PATTERN)) {
                return true;
            }
            return false;
        }
        public static boolean validatePasswordMinimum8Characters(String passwordRule1) {
            if (passwordRule1.matches(PASSWORD_MINIMUM_8_CHARACTER_PATTERN)) {
                return true;
            }
            return false;
        }

        public static boolean validatePasswordAtleastOneUpperCase(String passwordWithOneUpperCase) {
            if (passwordWithOneUpperCase.matches(PASSWORD_WITH_ONE_UPPERCASE_PATTERN)){
                return true;
            }
            return false;
        }

        public static boolean validatePasswordAtleastOneNumericValue(String passwordWithOneNumericValue) {
            if (passwordWithOneNumericValue.matches(PASSWORD_WITH_ONE_NUMERIC_PATTERN)){
                return true;
            }
            return false;
        }

        public static boolean validatePasswordAtleastOneSpecialCharacter(String passwordWithOneSpecialCharacter) {
            if (passwordWithOneSpecialCharacter.matches(PASSWORD_WITH_ONE_SPECIAL_CHARACTER_PATTERN)){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println("WELCOME TO USER REGISTRATION");
        }
    }

