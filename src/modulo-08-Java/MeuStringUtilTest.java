/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crescer.aula1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alycio
 */
public class MeuStringUtilTest {
    
    public MeuStringUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class MeuStringUtil.
     */
    @Test
    public void verificaSeRetornaTrueParaUmaStringEmBranco() {
        System.out.println("isNullOrWhiteSpace");
        String string = "";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = true;
        boolean result = instance.isNullOrWhiteSpace(string);
        assertEquals(expResult, result);
    }
    @Test
    public void verificaSeRetornaTrueParaUmaStringNull() {
        System.out.println("isNullOrWhiteSpace");
        String string = null;
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = true;
        boolean result = instance.isNullOrWhiteSpace(string);
        assertEquals(expResult, result);
    }
    @Test
    public void verificaSeRetornaFalseParaUmaStringComLetras() {
        System.out.println("isNullOrWhiteSpace");
        String string = "Teste";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = false;
        boolean result = instance.isNullOrWhiteSpace(string);
        assertEquals(expResult, result);
    }
    /**
     * Test of numeroDeVogais method, of class MeuStringUtil.
     */
    @Test
    public void ContaDuasVogaisEmOla() {
        System.out.println("numeroDeVogais");
        String string = "Ola";
        MeuStringUtil instance = new MeuStringUtil();
        int expResult = 2;
        int result = instance.numeroDeVogais(string);
        assertEquals(expResult, result);
    }
    @Test
    public void ContaZeroParaUmaCCC(){
        System.out.println("numeroDeVogais");
        String string = "CCC";
        MeuStringUtil instance = new MeuStringUtil();
        int expResult = 0;
        int result = instance.numeroDeVogais(string);
        assertEquals(expResult, result);
    }
    @Test
    public void inverteOlaEmAlo(){
        System.out.println("inverteString");
        String string = "Ola";
        MeuStringUtil instance = new MeuStringUtil();
        String expResult = "alO";
        String result = instance.inverteString(string);
        assertEquals(expResult, result);
    }
    @Test
    public void invertePalavraComEspaco(){
        System.out.println("inverteString");
        String string = "Ola ";
        MeuStringUtil instance = new MeuStringUtil();
        String expResult = " alO";
        String result = instance.inverteString(string);
        assertEquals(expResult, result);
    }
    @Test
    public void ovoEPalindromo(){
        System.out.println("ePalindromo");
        String string = "ovo";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = true;
        boolean result = instance.ePalindromo(string);
        assertEquals(expResult, result);
    }
    @Test
    public void frasePalindromoRetornaTrue(){
        System.out.println("ePalindromo");
        String string = "Ame a ema";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = true;
        boolean result = instance.ePalindromo(string);
        assertEquals(expResult, result);
    }
    @Test
    public void fraseNaoPalindromaRetornaFalse(){
        System.out.println("ePalindromo");
        String string = "Retornara False";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = false;
        boolean result = instance.ePalindromo(string);
        assertEquals(expResult, result);
    }
}
