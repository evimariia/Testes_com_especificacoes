import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Testes {
    
    @Test
    public void confereRetorno(){
        String[] esperado = {"x", "y", "z"};
        String[] obtido = App.substringsBetween("axcaycazc", "a", "c");
        assertArrayEquals(esperado, obtido);
    }
}