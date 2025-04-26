package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        //ReactiveSources.intNumbersFlux().log().filter(num -> num > 5).log().subscribe(System.out::println);

        // Print 10 multiplied by each value from intNumbersFlux that's greater than 5
        //ReactiveSources.intNumbersFlux().filter(ele -> ele > 5).map(ele -> ele * 10).log().subscribe(System.out::println);

        // Print 10 multiplied by each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        ReactiveSources.intNumbersFlux().filter(ele -> ele > 5).map(ele -> ele * 10).take(3).subscribe(System.out::println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        // TODO: Write code here

        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
