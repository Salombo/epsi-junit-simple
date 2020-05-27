package fr.epsi.deemo;


import fr.epsi.demo.Calculator;
import fr.epsi.demo.UnknownOperatorException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @Test
    public void should_return_good_result_when_operator_plus_used() throws UnknownOperatorException{
        System.out.println("Vérification opérateur +");
        Assert.assertEquals(2, Calculator.calculate(1, 1, "+"));
    }
    @Test
    public void should_return_good_result_when_operator_sub_used() throws UnknownOperatorException{
        System.out.println("Vérification opérateur -");
        Assert.assertEquals(0, Calculator.calculate(1, 1, "-"));
    }
    @Test
    public void should_return_four() throws UnknownOperatorException{
        System.out.println("Vérification opérateur *");
        Assert.assertEquals(4, Calculator.calculate(2, 2, "*"));
    }
    @Test
    public void should_return_one() throws UnknownOperatorException{
        System.out.println("Vérification opérateur /");
        Assert.assertEquals(1, Calculator.calculate(2, 2, "/"));
    }

    @Test
    public void should_return_unknownoperator() throws UnknownOperatorException{
        System.out.println("Vérification retour opérande invalide");
        Assertions.assertThrows(UnknownOperatorException.class, () -> Calculator.calculate(2, 2, "%"));
    }

}
