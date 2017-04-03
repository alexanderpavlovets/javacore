package com.alexanderpavlovets.app.homework.lesson4expressions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olpav on 04/03/2017.
 */
public class MenuOfSimplestUtilsTest {

    @Test
    public void additionViaMenu(){
        MenuOfSimplestUtils menu = new MenuOfSimplestUtils();
        int actRes = menu.add(1,2);
        int expRes = 3;
        Assert.assertEquals(expRes,actRes);
    }

}
