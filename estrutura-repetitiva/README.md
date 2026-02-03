## Estrutura Repetitiva (Laços de Repetição)

Conteúdo estudado na Seção 06 do curso **Java Completo – Professor Nelio Alves (Udemy)**.  

### Conceito
Estruturas repetitivas permitem executar um mesmo bloco de código várias vezes, enquanto uma condição for verdadeira ou durante um intervalo controlado.

--- 

### Tipos de estruturas repetitivas em Java

#### while
- Verifica a condição **antes** de executar o bloco
- Pode não executar nenhuma vez

int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

#### do while
- Executa o bloco pelo menos uma vez
- Verifica a condição depois da execução

int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);

#### for
- Estrutura mais usada para contagens
- Possui inicialização, condição e incremento no mesmo comando

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}