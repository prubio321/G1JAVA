package com.generation.f20220601.pruebasunitarias;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(12, 42);//54

        //assertEquals(valorEsperado,Resultado);
        assertEquals(54, resultado);

    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(12, 42);//54

        //assertEquals(valorEsperado,Resultado);
        assertEquals(-30, resultado);

    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacion(12, 42);//54

        //assertEquals(valorEsperado,Resultado);
        assertEquals(504, resultado);

    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        String resultado = calc.division(0, 0);//54

        //assertEquals(valorEsperado,Resultado);
        assertEquals("No se puede dividir por cero", resultado);
        assertNotNull(resultado);
        assertNotEquals("0", resultado);

    }

    @Test
    public void testResto() {
        Calculadora calc = new Calculadora();

        String resultado = calc.resto(3);//54

        //assertEquals("Es par", resultado);//cuando es par
        //assertTrue("Es Par", Boolean.parseBoolean((resultado)));//cuando es par
        assertFalse("Es Impar", Boolean.parseBoolean(resultado));//cuando es impar
        assertNotEquals("Es Par", resultado);//cuando es impar

    }

}

