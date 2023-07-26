package CalculatorController;

import CalculatorModel.Multiply;
import CalculatorModel.Summa;

public class ProdactOfNumbers {
    private Float primaryNumber;

    public ProdactOfNumbers(Float primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Float getMult(Float arg){
        Multiply multiply = new Multiply(primaryNumber);
        Float mult;
        mult = (Float)multiply.mult(arg);
        return mult;
    }

}
