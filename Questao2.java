import java.util.Scanner;

public class Questao2 {

  public static void main(String[] args) {

    //Input de dados com a senha.

    System.out.println("Insira a senha para verificação.");
    Scanner sc = new Scanner(System.in);
    
    String senha = sc.nextLine();
    testagemSenha(senha);
    
    sc.close();

  }

  static void testagemSenha(String senha){
      
    //Inicialização de variáveis booleanas que sinalizarão 
    //o encontro dos caracteres necessários.

    boolean achouNumero = false;
    boolean achouMaiuscula = false;
    boolean achouMinuscula = false;
    boolean achouSimbolo = false;

    //Inicialização da variável caracteresRestantes 
    //para tornar a senha válida (saída do programa).
    //Inicialização da string de caracteres especiais
    //uma vez que na tabela ASCII não temos um intervalo definido.

    int caracteresRestantes=0;
    String caracteresEspeciais="!@#$%^&*()-+";

    //Estrutura de repetição que percorre a senha e analisa cada caractere,
    //verificando se a senha satisfaz as condições solicitadas de acordo 
    //com a tabela ASCII e o comando da questão.

    for (char c : senha.toCharArray()) {
      if ((int) c >= 48 && (int) c <= 57) {
        achouNumero = true;

      } else if ((int) c >= 65 && (int) c <= 90) {
          achouMaiuscula = true;

      } else if ((int) c >= 97 && (int) c <= 122) {
          achouMinuscula = true;
      }
      for(char e:caracteresEspeciais.toCharArray()){
        if(c==e){
          achouSimbolo = true;
        }
      }
    }
    
    //Estruturas condicionais onde ocorre a soma
    //da quantia de caracteres necessários.
    
    if(achouNumero == false){
      caracteresRestantes+=1;     
    };
    if(achouMaiuscula == false){
      caracteresRestantes+=1;     
    };
    if(achouMinuscula == false){
      caracteresRestantes+=1;     
    };
    if(achouSimbolo == false){
      caracteresRestantes+=1;
    };

    //Atualização da variável caracteres restantes
    //para o caso da senha possuir menos de 6 dígitos.
  
    if(senha.length()<6){
      if(6-senha.length()>caracteresRestantes)
        caracteresRestantes=6-senha.length();
    }
    
    //Print da resposta.

    System.out.println(caracteresRestantes);
  }
}
