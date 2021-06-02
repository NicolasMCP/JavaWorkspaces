package infodata.aplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Imprimir em Console os Números pares até o valor fornecido (inclusive ele, se for o caso).
 * Use BufferedReader para ler o teclado.
 *
 * Nota: Utilize System.out.println() apenas para os resultados de saída
 *
 *
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 */

public class DesafioNumerosParesV1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entrada = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= entrada ; i++) {
            if (i % 2 == 0 ) System.out.println(i);
        }
    }
}
