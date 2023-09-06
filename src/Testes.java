import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Testes {
    
    @Test
    public void validaRetorno(){
        String[] esperado = {"x", "y", "z"};
        String[] obtido = App.substringsBetween("axcaycazc", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void entradasNulas(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween(null, null, null);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void stringNula(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween(null, "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void openNulo(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", null, "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void closeNulo(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "a", null);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void stringVazia(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween(" ", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void openVazio(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", " ", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void closeVazio(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "a", " ");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void stringSemSubstring(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "b", "d");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void strignSubstrings(){
        String[] esperado = {"c", "a", "c", "a", "c", "a"};
        String[] obtido = App.substringsBetween("acacacac", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    
}