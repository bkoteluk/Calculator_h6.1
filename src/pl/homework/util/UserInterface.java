package pl.homework.util;

import pl.homework.lib.Calculator;
import pl.homework.lib.TwoNumbers;

import java.util.Scanner;

public class UserInterface {

    public TwoNumbers setTowNumbers() {
        Scanner scanner = new Scanner(System.in);
        TwoNumbers twoNumbers = new TwoNumbers();
        System.out.println("Podaj pierwszą liczbę całkowitą : ");
        twoNumbers.setFirst(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj drugą liczbę całkowitą : ");
        twoNumbers.setSecond(scanner.nextInt());
        scanner.nextLine();
        return twoNumbers;
    }

    public String calculateResult(TwoNumbers twoNumbers) {
        String text;
        Calculator calc = new Calculator();

        if (twoNumbers.getFirst()-twoNumbers.getSecond()>0) {
            text = "Suma liczb: " + twoNumbers.toString() + " jest równa : " + calc.sum(twoNumbers.getFirst(), twoNumbers.getSecond());
        } else if (twoNumbers.getFirst()-twoNumbers.getSecond()<0) {
            text = "Iloczyn liczb: " + twoNumbers.toString() + " jest równy : " + calc.product(twoNumbers.getFirst(), twoNumbers.getSecond());
        } else {
            text = "Kwadrat liczby: " + twoNumbers.toString() + " jest równy : " + calc.square(twoNumbers.getFirst());
        }
        return text;
    }
}
