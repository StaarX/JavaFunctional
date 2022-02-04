package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0823412345",
                LocalDate.of(2000,1,1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        //We can store customer in db

        //Using combinator pattern
       CustomerRegistrationValidator.ValidationResult result=CustomerRegistrationValidator.isEmailVALID()
                .and(CustomerRegistrationValidator.isPhoneNumberVALID())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result!= CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
