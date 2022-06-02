package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

import java.util.*;

public class Main {
    public static void main(String[] args) {//instancias y llamados
        //herencia

        Mascota mascota = new Mascota();
        mascota.setColor("gris");
        mascota.setNombre("tom");

        Perro perro = new Perro();
        perro.setColor("Blanco");
        perro.setNombre("Colu");

        Gato gato = new Gato();
        gato.getEspecie("felino");
        gato.setPelaje("pelo");
        gato.getPeso(3);

        System.out.println(gato.toString());

        Mishi mishi = new Mishi(true);
        System.out.println(mishi.toString());

        /*polimorfismo*/

        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        Mascota regalon = new Mascota("negro", "Canes", "Pelo", "Firulais", 1.5f, "Macho");
        listaMascotas.add(regalon);

        Mascota felix = new Gato();
        felix.setNombre("Felix");
        felix.setColor("Negro");
        felix.setPeso(3);
        listaMascotas.add(felix);

        Mascota chocolo = new Perro();
        chocolo.setNombre("Chocolo");
        chocolo.setColor("Café");
        chocolo.setPeso(10);
        listaMascotas.add(chocolo);

        regalon.hacerSonido();//Llamando al metodo en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();
        System.out.println("*******");
        for (Mascota mascota2 : listaMascotas) {
            mascota2.hacerSonido();
        }

        //transformar el objeto generico a uno especifico.
        Perro perroChocolo = (Perro) chocolo;
        perroChocolo.setCantPaseos(6);
    }
}
