package com.alexanderpavlovets.app.homework.lesson5datadriventests;

import com.alexanderpavlovets.app.homework.lesson3unittests.Addition;
import com.alexanderpavlovets.app.homework.lesson3unittests.Division;
import com.alexanderpavlovets.app.homework.lesson3unittests.Multiplication;
import com.alexanderpavlovets.app.homework.lesson3unittests.Subtraction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by olpav on 04/12/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class DataDrivenTest {

    @Test
    @FileParameters(value = "src/test/java/resources/lesson5datadriventests/addition_parameters.csv", mapper = CsvWithHeaderMapper.class)
    public void additionWithParameters(int argA, int argB, int expRes){
        Addition addition = new Addition();
        Assert.assertEquals(expRes, addition.add(argA,argB));
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson5datadriventests/subtraction_parameters.csv", mapper = CsvWithHeaderMapper.class)
    public void subtractionWithParameters(int argA, int argB, int expRes){
        Subtraction subtraction = new Subtraction();
        Assert.assertEquals(expRes, subtraction.substract(argA,argB));
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson5datadriventests/multiplication_parameters.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplicationWithParameters(int argA, int argB, int expRes){
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals(expRes, multiplication.multiply(argA,argB));
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson5datadriventests/division_parameters.csv", mapper = CsvWithHeaderMapper.class)
    public void divisionWithParameters(int argA, int argB, int expRes){
        Division division = new Division();
        Assert.assertEquals(expRes, division.divide(argA,argB),0.01);
    }
}
