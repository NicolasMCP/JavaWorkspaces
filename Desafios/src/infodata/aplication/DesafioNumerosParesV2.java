package infodata.aplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Imprimir em Console os Números pares até o valor fornecido (inclusive ele, se for o caso).
 * Use BufferedReader e StringTokenizer para ler o teclado.
 *
 * Nota: Utilize System.out.println() apenas para os resultados de saída
 *
 *
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 */

public class DesafioNumerosParesV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int entrada = Integer.parseInt(st.nextToken());

        for (int i = 1 ; i <= entrada ; i++) {
            if (i % 2 == 0 ) System.out.println(i);
        }
    }
}
