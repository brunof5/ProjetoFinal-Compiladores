grammar UaiScript;

/***** Definição Sintática *****/
programa: instrucao+ EOF;
instrucao: tipo VAR FL							// declaração
		 | tipo VAR OpAtrib expressao FL 		// declaração com atribuição
		 | VAR OpAtrib expressao FL				// atribuição variável já existente
		 | VAR OpCrem FL						// instrução de incremento ou decremento
         | Truco condicao bloco MeiPau bloco	// if condição bloco else if condição bloco
         | Truco condicao bloco Corri bloco		// if condição bloco else bloco
         | Truco condicao bloco					// if condição bloco
         | TodaVida condicao bloco				// while condição bloco
         | Ler VAR FL							// ler entrada
         | Mostrar expressao FL					// imprimir
         ;

expressao: elemento									// algum elemento
         | (numero | VAR) (OpArit (numero | VAR))*	// operações aritméticas
         | (numero | VAR) OpCrem					// operações de incremento ou decremento
         | AP expressao FP							// operações considerando precedência
         ;

condicao: BoolValue						// T ou F
        | expressao OpRel expressao		// operações relacionais
        | condicao OpLog condicao		// operações lógicas
        | AP condicao FP				// operações considerando precedência
        ;

tipo: Cado | Tiquim | Trem | Paia;
bloco: AB instrucao+ FB;
elemento: VAR | NumI | NumR | BoolValue | Str;
numero: NumI | NumR;

/***** Definição Léxica (tokens) *****/
// Tipos
Cado: 'cado';
Tiquim: 'tiquim';
Trem: 'trem';
Paia: 'paia';
// Estruturas
Truco: 'truco';
MeiPau: 'meiPau';
Corri: 'corri';
TodaVida: 'todaVida';
// Funções Específicas
Ler: 'ler';
Mostrar: 'mostrar';
// Verdadeiro e Falso
BoolValue: 'god' | 'bigode';
// Operadores Aritméticos, respectivamente: + - * / % ^
OpArit: 'botaMais' | 'tira' | 'vezes' | 'partidoEm' | 'restinDe' | 'elevado';
// Operadores Relacionais, respectivamente: = ≠ > <
OpRel: 'igualzin' | 'nadaveh' | 'maioh' | 'menoh';
// Operadores Lógicos, respectivamente: and or not
OpLog: 'e' | 'ou' | 'nop';
// Operadores de Incremento e Decremento, respectivamente ++ --
OpCrem: 'maisUm' | 'tiraUm';
// Operador de Atribuição
OpAtrib: '<-|';
// Parênteses
AP: '(';
FP: ')';
// Chaves de bloco
AB: '{';
FB: '}';
// Fim de linha
FL: '!';
// Identificadores das variáveis
VAR: LETRA(DIGITO|LETRA)*;
// Identificadores dos números inteiros e reais
NumI: DIGITO+;
NumR: DIGITO+'.'DIGITO+;
// Identificador das cadeias (baguio doido)
Str: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
// Fragmentos auxiliares
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
// Ignorar espaços, quebras de linha, etc
WS: [ \r\t\n]+ ->skip;