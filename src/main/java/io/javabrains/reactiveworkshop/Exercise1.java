package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(n -> System.out.println(n));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(n -> n < 5).forEach(n -> System.out.println(n));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream().filter(n -> n > 5).limit(2).forEach(n -> System.out.println(n));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println("Print the first number in intNumbersStream that's greater than 5. If nothing is found, print -1");
        StreamSources.intNumbersStream().filter(n -> n > 5).findFirst()
                .ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("-1"));

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("Print first names of all users in userStream");
        StreamSources.userStream().map(user -> user.getFirstName()).forEach(n -> System.out.println(n));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream()
                        .anyMatch(id -> id == user.getId()))
                .map(user -> user.getFirstName())
                .forEach(n -> System.out.println(n));

        // flatMap takes a stream and gives stream data as a flow of stream.
        StreamSources.intNumbersStream()
                .flatMap(number -> StreamSources.userStream()
                        .filter(user -> user.getId() == number)
                ).forEach(user -> System.out.println(user));

    }

}
