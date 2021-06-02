package infodata.aplication;
import java.io.IOException;
import java.util.Scanner;

/**
 * Leia um número inteiro que representa um código de DDD para discagem interurbana.
 * Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
 *       DDD       Destination
 *       61        Brasilia
 *       71        Salvador
 *       11        Sao Paulo
 *       21        Rio de Janeiro
 *       32        Juiz de Fora
 *       19        Campinas
 *       27        Vitoria
 *       31        Belo Horizonte
 * Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
 * DDD nao cadastrado
 * Entrada: A entrada consiste de um único valor inteiro.
 *
 * Nota: Utilize System.out.println() apenas para os resultados de saída
 *
 *
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 */

public class DesafioDDD {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        try{
            int DDD = leitor.nextInt();
            switch (DDD) {
                case 61: System.out.println("Brasilia"); break;
                case 71: System.out.println("Salvador"); break;
                case 11: System.out.println("Sao Paulo"); break;
                case 21: System.out.println("Rio de Janeiro"); break;
                case 32: System.out.println("Juiz de Fora"); break;
                case 19: System.out.println("Campinas"); break;
                case 27: System.out.println("Vitoria"); break;
                case 31: System.out.println("Belo Horizonte"); break;
                default: System.out.println("DDD nao cadastrado");
            }
        } catch (Exception e){
            System.out.println("Erro: valor inválido");
        }

    }

}