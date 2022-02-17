import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) throws Exception {

        //Entrada de dados com input de um inteiro.
        
        System.out.println("insira um número de níveis para execução da pirâmide com '*'");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        niveis(n);

        sc.close();
    }

    static void niveis(int n){

        //Inicialização do vetor nivel para adicionar cada linha da "pirâmide".

        List<String> nivel = new ArrayList<>();
        
        //Estrutura de repetição onde adiciona no vetor nivel a quantidade
        //de espaços e '*' solicitada.

        for(int i = 0; i<n; i++){
            nivel.add(" ".repeat(n - i - 1) + "*".repeat(i + 1));
        }

        //Print do resultado.

        for (String a : nivel) {
            System.out.println(a);
            }
    }
}
