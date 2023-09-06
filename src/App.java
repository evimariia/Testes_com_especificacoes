
import java.util.ArrayList;
import java.util.List;

public class App {

    //Cria string vazia
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    //Método para verificar se a string é nula
    public static boolean isEmpty(final String array) {
        return array == null;
    }

    //Método para extrair as substrings
    public static String[] substringsBetween(final String str, final String open, final String close) {

        //Verifica se alguma das strings está vazia
        if (str == null || isEmpty(open) || isEmpty(close)) {
            return null;
        }

        //Extrai o tamanho da string
        final int strLen = str.length();

        //Se a string tiver tamanho 0, retorna EMPTY_STRING_ARRAY
        if (strLen == 0) {
            return EMPTY_STRING_ARRAY;
        }

        //Extrai o tamanho das strings inicial e final
        final int closeLen = close.length();
        final int openLen = open.length();
        final List<String> list = new ArrayList<>();
        int pos = 0;

        //Enquanto posição for menor do que a diferença entre o tamanho da string e o final
        //Enquanto não percorrer toda a string
        while (pos < strLen - closeLen) {

            //Define a posição de início como a posição onde a primeira substring for encontrada
            int start = str.indexOf(open, pos);

            //Substring não encontrada
            if (start < 0) {
                break;
            }

            //Define start como tamanho da substring inicial
            start += openLen;

            //Repete o processo para o fim
            final int end = str.indexOf(close, start);

            if (end < 0) {
                break;
            }

            //Adiciona a substring a lista
            list.add(str.substring(start, end));
            pos = end + closeLen;
        }

        //Verifica se a lista está vazia/se existem substrings
        if (list.isEmpty()) {
            return null;
        }

        //Retorna a lista
        return list.toArray(EMPTY_STRING_ARRAY);
    }
}
