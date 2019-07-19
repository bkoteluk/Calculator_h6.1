package pl.homework.app;

import pl.homework.lib.TwoNumbers;
import pl.homework.util.UserInterface;

public class CalculatorTest {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        System.out.println(userInterface.calculateResult(userInterface.setTowNumbers()));
    }
}
