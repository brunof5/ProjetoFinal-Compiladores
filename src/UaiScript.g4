grammar UaiScript;

/***** Definição dos tokens *****/
// Tipos
Tipo: 'cado' | 'tiquim' | 'trem' | 'paia';
// Estruturas
Est: 'truco' | 'meiPau' | 'corri' | 'todaVida';
// Funções Específicas
FunEsp: 'ler' | 'mostrar';
// Final de Arquivo
Fim: 'acabou';
// Verdadeiro e Falso
Bool: 'god' | 'bigode';
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
// Identificadores das cadeias
Str: '"' (LETRA | DIGITO)* '"';
// Fragmentos auxiliares
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
// Ignorar espaços, quebras de linha, etc
WS: [ \r\t\n]+ ->skip;