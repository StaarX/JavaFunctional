package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sendind email to "+ email),
                        ()->System.out.println("Could not sent email"));
    }
}
