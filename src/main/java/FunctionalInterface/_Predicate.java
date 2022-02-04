package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate{
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValid.test("07000000000"));
        System.out.println(isPhoneNumberValid.test("0700000000"));
        System.out.println(isPhoneNumberValid.test("09000000000"));

        System.out.println("Is phone number valid and contains number 3\n"
                +isPhoneNumberValid.and(containsNumber3).test("09000000000"));
        System.out.println("Is phone number valid and contains number 3\n"
                +isPhoneNumberValid.or(containsNumber3).test("07000000000"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValid= phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
