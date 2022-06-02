package com.generation.f20220602;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrabajoTest {
    @Test
    public void testPresente() {
        Alumno alumno = new Alumno();
        Boolean resultado = alumno.presente();//true

        assertEquals("Presente", resultado);//cuando esta presente
        assertTrue("Presente", (resultado));//cuando esta presente
        assertFalse("Ausente", Boolean.parseBoolean(String.valueOf(resultado)));//cuando esta ausente
        assertNotEquals("Presente", resultado);//cuando esta ausente
    }

}
