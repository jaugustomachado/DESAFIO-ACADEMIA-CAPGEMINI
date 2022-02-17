import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {

  public static void main(String[] args) {
    
    //Input de dados com a palavra desejada.
    
    System.out.println("Insira a palavra para verificação da quantidade de Anagramas.");
    Scanner sc = new Scanner(System.in);
     
    String palavra = sc.nextLine();
    contarAnagaramas(palavra);

    sc.close();
  }

  static void contarAnagaramas(String palavra){ 
    
    //Inicialização do vetor listaAnagramas onde são contados todos 
    //os possíveis Anagramas em substrings (letras repetidas, e palavras entre elas).

    ArrayList<String> listaAnagramas = new ArrayList<String>();
    
    //Estrutura de repetição composta onde o j será sempre uma unidade 
    //maior do que o i, logo cada caractere será comparado com o próximo,
    //afim de encontrar caracteres iguais e identificar palavras 
    //entre eles (se houver), formando anagramas. 

    for(int i = 0; i < palavra.length(); i++) {

        for(int j = 1; j < palavra.length(); j++) {
            
            //A função .charAt(), retorna o caractere de seu respectivo índice,
            //nessa condicional procura-se por letras iguais na hípotese em que
            //o índice i seja menor que o j, por que sem essa condição temos o erro:
            //String index out of range.

            if(palavra.charAt(i) == palavra.charAt(j) && i <j && i != j) {

                //Para caso das letras iguais juntas, a substring com 
                //tamanho de um caractere é criada e adicionada ao vetor listaAnagramas.

                if(palavra.charAt(i) == palavra.charAt(i+1)) {
                  
                  String x = palavra.substring(i, i + 1);
                  listaAnagramas.add(x);
                
                } else {
      
                  //Para o caso de letras iguais separadas, a substring com 
                  //tamanho de um caractere é criada e adicionada ao vetor 
                  //listaAnagramas uma vez que é uma excessão da condição anterior

                  String y = palavra.substring(i, i + 1);
                  listaAnagramas.add(y);

                  //Para o caso de letras entre dois caracteres iguais, 
                  //serão sempre anagramas indo ou voltando,conta-se como 
                  //1 anagrama. A substring vai do primeiro caractere que 
                  //aparece mais de uma vez, até antes de sua repetição.
                  
                  String z = palavra.substring(i, j);
                  listaAnagramas.add(z);

                }
            }
        }
    }
    //Print do tamanho do vetor de lista de anagramas, 
    //representando a saída desejada.

    System.out.println(listaAnagramas.size());
  }
}