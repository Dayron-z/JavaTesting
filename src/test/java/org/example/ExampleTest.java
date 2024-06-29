package org.example;



/*Modificamos este import para evitar la repeticiond de la palabra assertion*/
/*Antes -> import org.junit.jupiter.api.Assertions;
* Despues -> import static org.junit.jupiter.api.Assertions.*;
* */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ExampleTest {
    private Example example;

    // Usamos @BeforeEach para asegurar que cada prueba tenga una nueva instancia de Example.
// Esto garantiza que las pruebas sean independientes y no se vean afectadas por el estado
// modificado por otras pruebas, lo que lleva a resultados más fiables y fáciles de mantener.
    @BeforeEach
    public void init() {
        this.example = new Example();
    }
    @Test /*Importante: Todos los tests unitarios pasan por defecto*/
    public void testSumar() {
        /*Given - dado*/
        int numberA = 3;
        int numberB = 3;
        /*When*/
        int result = example.sumar(numberA,numberB);

        /*Then - entonces */
        assertEquals(6, result);
        assertInstanceOf(Integer.class, result);
    };
    @Test
    public void testCheckPositivo() {
        /*G*/
        int numero = 10;
        /*W*/
        boolean result = example.checkPositivo(numero);
        /*T*/
        assertTrue(result);
    }
    @Test
    public void testCheckPositivoError() {
        /*G*/
        int numero = -1;
        /*T*/
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(numero));

    }
    @Test
    public void testContarLetrasA() {
        /*G*/
        String text = "Hola";
        /*W*/
        int result = example.contarLetrasA(text);
        /*T*/
        assertEquals(result, 1);
    }
    @Test
    public void testContieneElemento(){
        List<String> cadena = List.of("hola","como", "estas")  ;
        String elemento = "hola";

        boolean result = example.contieneElemento(cadena, elemento);

        assertTrue(result);
    }
    @Test
    public void testRevertirCadena() {
        String cadena = "hola";

        String result = example.revertirCadena(cadena);

        assertEquals("aloh", result);

    }
    @Test
    public void testFactorial(){
        int numero = 5;

       long resultado =  example.factorial(numero);

        assertEquals(120, resultado);

    }
    @Test
    public void testFactorialError(){
        int numero = -5;

        assertThrows(IllegalArgumentException.class, ()->{
            example.factorial(numero);
        });

    }
    @Test
    public void testEsPrimo() {
        int numero = 7;

        boolean resultado = example.esPrimo(numero);

        assertTrue(resultado);
    }
    @Test
    public void testNoEsPrimo() {
        int numero = 4;

        boolean resultado = example.esPrimo(numero);

        assertFalse(resultado);
    }
    @Test
    public void testNoEsPrimoMenorAUno() {
        int numero = 1;

        boolean resultado = example.esPrimo(numero);

        assertFalse(resultado);
    }
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        String resultado =  example.mensajeConRetraso();
        assertNotNull(resultado);
    }
    @Test
    public void testConvertirAString() {
        List<Integer> numeros = List.of(1,2,3,4,5);

        List<String> resultados = example.convertirAString(numeros);

        assertEquals(List.of("1","2","3","4","5"), resultados);

    }
    @Test
    public void testCalcularMedia() {
        List<Integer> numeros =  List.of(1,2,3,4,5);

       Double resultado =  example.calcularMedia(numeros);

       assertEquals(3, resultado);


    }
    @Test
    public void testCalcularMediaErrorNull() {
        List<Integer> numeros =  null;


        assertThrows(IllegalArgumentException.class, ()->{
            example.calcularMedia(numeros);
        });

    }
    @Test
    public void testCalcularMediaErrorVacia() {
        List<Integer> numeros = Collections.emptyList();


        assertThrows(IllegalArgumentException.class, ()->{
            example.calcularMedia(numeros);
        });

    }
    @Test
    public void testConvertirListaAString() {
        List<String> string =  List.of("h","o","l","a");
        String texto =  example.convertirListaAString(string);
        assertEquals("H,O,L,A", texto);
    }

/*        @Test: Marca un método como una prueba.
        assertEquals(expected, actual): Verifica que los valores esperados y reales sean iguales.
                assertTrue(condition): Verifica que la condición sea verdadera.
        assertFalse(condition): Verifica que la condición sea falsa.
        assertNull(object): Verifica que el objeto sea nulo.
        assertNotNull(object): Verifica que el objeto no sea nulo.
                assertArrayEquals(expectedArray, actualArray): Verifica que dos arrays sean iguales.
        @Before: Método que se ejecuta antes de cada prueba.
        @After: Método que se ejecuta después de cada prueba.
        @BeforeClass: Método estático que se ejecuta una vez antes de todas las pruebas de la clase.
        @AfterClass: Método estático que se ejecuta una vez después de todas las pruebas de la clase.
        @Ignore: Ignora un método de prueba específico.*/
};
