# DESAFIO-ACADEMIA-CAPGEMINI
Desafio para o processo seletivo da academia capgemini

Tecnologia utilizada: JAVA

Candidato: José Augusto Machado Omena

QUESTÃO 1:

Para inicializar a Questão1 basta rodar o programa através da Main, o mesmo irá solicitar que o usuário informe um número inteiro, tal número representará
a quantidade de linhas da pirâmide de '*', o resultado será exibido em tela.

Ex:

insira um número de níveis para execução da pirâmide com '*'

input:

6

output:
<p>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp*<br>
&nbsp&nbsp&nbsp&nbsp&nbsp**<br>
&nbsp&nbsp&nbsp&nbsp***<br>
&nbsp&nbsp&nbsp****<br>
&nbsp&nbsp*****<br>
&nbsp******<br>
</p>

QUESTÃO 2:

Para a segunda questão, após a execução do programa uma mensagem irá aparecer em tela solicitando que usuário insira uma senha, para verificação de força.
Uma senha forte satisfaz os seguintes critérios:

•Possui no mínimo 6 caracteres.

•Contém no mínimo 1 digito.

•Contém no mínimo 1 letra em minúsculo.

•Contém no mínimo 1 letra em maiúsculo.

•Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Após a inserção da senha pelo usuário o programa informará o número mínimo de caracteres necessários para fazer com que a senha seja considerada forte.

Ex:

Insira a senha para verificação.

input:

Ya3

output:

3

QUESTÃO 3:

Na questão três o programa procura pela quantidade de anagramas dentro de uma mesma palavra a partir da divisão da mesma em substrings.
Existem três possíveis casos para tais anagramas:

1. letras repetidas numa mesma palavra que estejam juntas. Ex: iia / anagramas: [i]
2. letras repetidas numa palavra porém separadas por outros caracteres. Ex: iai / anagramas: [i]
3. Caso de letras entre dois caracteres iguais, esses pares substrings serão sempre anagramas pois compoem o sentido direto e inverso da palavra.
A substring vai do primeiro caractere que aparece mais de uma vez, até antes de sua repetição. Ex: iai / anagramas:[ia],[ai]

Para iniciar o programa, basta inserir alguma palavra após rodá-lo. No final a quantidade de anagramas é exibida em tela para o usuário.

Ex:

Insira a palavra para verificação da quantidade de Anagramas.

input:

ovo

output:

2

Ex2:

Insira a palavra para verificação da quantidade de Anagramas.

input:

ifailuhkqq

output:

3

-----------------------------------------------------------------------------------------------

#A título de conferência de anagramas:

ovo --> A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições 
[[0, 2] e [0, 1],[1, 2]] respectivamente.

2 pares de anagramas.

ifailuhkqq --> A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições:
[[0, 3]],[[8, 9]] e [[0, 1, 2], [1, 2, 3]], respectivamente.

3 pares de anagramas.
