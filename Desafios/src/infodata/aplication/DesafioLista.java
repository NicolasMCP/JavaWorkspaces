package infodata.aplication;

import java.util.Arrays;
import java.util.List;

/**
 * Criar uma lista a partir de um Array
 *
 * Nota: Utilize System.out.println() apenas para os resultados de saída
 *
 *
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 */
public class DesafioLista {
    public static void main(String[] args) {
        Long[] l = {1L, 9L, 18L, 22L, 5L, 7L, 99L};
        List<Long> lista = Arrays.asList(l);
        System.out.println(lista);
    }

}
