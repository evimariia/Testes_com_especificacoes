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
    public void stringEmBranco(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween(" ", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void openEmBranco(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", " ", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void closeEmBranco(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "a", " ");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void stringVazia(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void openVazio(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "", "c");
        assertArrayEquals(esperado, obtido);
    }

     @Test
    public void closeVazio(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "a", "");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void stringSemSubstring(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("axcaycazc", "b", "d");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void stringDeSubstrings(){
        String[] esperado = {"", "", "", ""};
        String[] obtido = App.substringsBetween("acacacac", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void substringCaracterCloseDiferente(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("aaaaaa", "a", "c");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void substringCaracterOpenDiferente(){
        String[] esperado = null;
        String[] obtido = App.substringsBetween("aaaaaa", "c", "a");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void substringCaracterOpenCloseIguais(){
        String[] esperado = {"", "", ""};
        String[] obtido = App.substringsBetween("aaaaaa", "a", "a");
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSubstringsBetweenWithNoMatches() {
        String input = "This is a test string with no matches.";
        String[] esperado = null;
        String[] result = App.substringsBetween(input, "start", "end");
        assertArrayEquals(esperado, result);
    }

    @Test
    public void testSubstringsBetweenWithMultipleMatches() {
        String input = "This [open] is [a] test [string] with [multiple] matches [close].";
        String[] expected = {"open", "a", "string", "multiple", "close"};
        String[] result = App.substringsBetween(input, "[", "]");
        assertArrayEquals(expected, result);
    }


}