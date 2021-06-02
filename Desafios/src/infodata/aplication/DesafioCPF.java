package infodata.aplication;
import java.util.Scanner;
import java.util.Locale;

/**
 * Dividir um CPF com "." e "-", em 4 Strings sem "." nem "-"
 *
 * Nota: Utilize System.out.println() apenas para os resultados de saída
 *
 *
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 */

public class DesafioCPF {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];

        cpf = sc.nextLine().split("[-.]");

        for (String parte:cpf) {
            System.out.println(parte);
        }

        sc.close();

    }
}
