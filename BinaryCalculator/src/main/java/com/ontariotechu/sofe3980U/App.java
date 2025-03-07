package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        System.out.print("Enter first binary number: ");
        Binary binary1 = new Binary(scanner.next());

        System.out.print("Enter second binary number: ");
        Binary binary2 = new Binary(scanner.next());

        System.out.println("First binary number: " + binary1.getValue());
        System.out.println("Second binary number: " + binary2.getValue());

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Sum (Addition): " + sum.getValue());

        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("Bitwise OR: " + orResult.getValue());

        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("Bitwise AND: " + andResult.getValue());

        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiplication: " + multiplyResult.getValue());

        scanner.close();
    }
}
