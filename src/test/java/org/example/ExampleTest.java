package org.example;



/*Modificamos este import para evitar la repeticiond de la palabra assertion*/
/*Antes -> import org.junit.jupiter.api.Assertions;
* Despues -> import static org.junit.jupiter.api.Assertions.*;
* */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




public class ExampleTest {

    @Test /*Importante: Todos los tests unitarios pasan por defecto*/
    public void testSumar(){
        Example example = new Example();

        int result = example.sumar(10, 4); //14

        /*Valor esperado*/
        assertEquals(15, result); //Evaluar un valor esperado con un valor actual
        assertTrue(result < 5);  //Me retorna un booleano
        assertNotNull(result); //Valida que el objeto no sea nulo
        assertInstanceOf(String.class, result); /*Valida el tipo de objeto*/
/*        assertThrows() Me Sirve para validar excepeciones  */
    };
}
