# UaiScript
Trabalho desenvolvido na disciplica de Compiladores - GCC130 - 2023/2 - UFLA

## Descrição Geral da Linguagem
* Tipos:
  * Inteiro: cado
  * Real: tiquim
  * Texto: trem
  * Booleano: paia (verdadeiro: god, falso: bigode)

* Abertura e fechamento de bloco:
  * Abertura: {
  * Fechamento: }

* Operadores Aritméticos:
  * Adição: botaMais
  * Subtração: tira
  * Multiplicação: vezes
  * Divisão: partidoEm
  * Módulo: restinDe
  * Exponenciação: elevado 

* Operadores Relacionais:
  * Igualdade: igualzin
  * Diferença: nadaveh
  * Maior que: maioh
  * Menor que: menoh

* Operadores Lógicos:
  * And: e
  * Or: ou
  * Not: nop

* Operadores de incremento e decremento:
  * Incremento: maisUm
  * Decremento: tiraUm

* Operador de Atribuição: <-|

* Fim de linha: !

* Estruturas:
  * Condicional if: truco
  * Condicional else if: meiPau
  * Condicional else: corri
  * Repetição while: todaVida

* Funções Específicas:
  * Ler uma entrada qualquer: ler
  * Imprimir na tela uma variável qualquer: mostrar
 
* Parênteses:
  * Abre parênteses: (
  * Fecha parênteses: )
 
* Representações:
  * Variável: [a..z] ([a..zA..Z]+[0..9])*
  * Número Inteiro: [0..9]+
  * Número Real: [0..9]+ . [0..9]+
 
## Analisador Léxico
A análise léxica de algum código na linguagem UaiScript é realizada executando o programa ExemploLexer.java dentro da pasta src.

## Analisador Sintático
A análise sintática de algum código na linguagem UaiScript é realizada executando o programa CompiladorUaiScript.java dentro da pasta src.

## Analisador Semântico
A análise semântica de algum código na linguagem UaiScript é realizada executando o programa AnalisadorSemantico.java dentro da pasta src.
