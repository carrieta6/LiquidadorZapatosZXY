package com.example.android.liquidadorzapatoszxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void probarCombinacion1(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 0;
        marc1 = 0;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 120000;
        
        assertEquals(actual,esperado,0);

    }
}