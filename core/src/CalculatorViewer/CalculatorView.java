package CalculatorViewer;

import CalculatorController.Division;
import CalculatorController.ProdactOfNumbers;
import CalculatorController.Substraction;
import CalculatorController.Summary;

public class CalculatorView extends Promter {
    public CalculatorView() {
    }

    public void run() {
        while (true) {
            Float primaryNumber = promptFloat("Введите первый аргумент: ");
            while (true) {
                String command = prompt("Введите команду ( +, -, *, /, =) : ");
                if (command.equals("+")) {
                    Float arg = promptFloat("Введите второй аргумент: ");
                    Summary summary = new Summary(primaryNumber);
                    summary.getSum(arg);
                    break;
                }
                if (command.equals("-")) {
                    Float arg = promptFloat("Введите второй аргумент: ");
                    Substraction substraction = new Substraction(primaryNumber);
                    substraction.getDif(arg);
                    break;
                }
                if (command.equals("*")) {
                    Float arg = promptFloat("Введите второй аргумент: ");
                    ProdactOfNumbers prodact = new ProdactOfNumbers(primaryNumber);
                    prodact.getMult(arg);
                    break;
                }
                if (command.equals("/")) {
                    Float arg = promptFloat("Введите второй аргумент: ");
                    Division division = new Division(primaryNumber);
                    division.getDiv(arg);
                    break;
                }

            }
            String command = prompt("Еще посчитать (Y/N)?");
            if (command.equals("Y")) {
                continue;
            }
            break;
        }
    }
}
