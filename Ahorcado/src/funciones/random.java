/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author upszot
 */
public class random {
         
    public static int Entero_DesdeHasta(int min, int max) //MODIFICAR ENUM
    {
        Random random = new Random();
        int numero = random.nextInt(max + 1 - min) + min;
        return numero;
    }

    public static float Float()
    {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        float numero = random.nextFloat();
        return numero;
    }

}
