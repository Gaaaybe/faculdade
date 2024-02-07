/*
Q6) Uma construtora deseja informatizar os cadastros dos seus funcionários. Faça um pro-
grama que receba o nome, data de nascimento e matrícula de dois funcionário. Em seguida, imprima
uma lista com os dados dos dois funcionários cadastrados.
*/
#include <stdio.h>
#include <string.h>
#define TAM 50
#define NUMF 2 //Numero de funcionarios

//Usando uma estrutura pra criar um novo tipo com todos os parametros...
struct funcionario{
  int matricula;
  char dat_nas[TAM];
  char nome[TAM];
};

typedef struct funcionario tipo_func;

int main() {

//Definindo variaveis...
    tipo_func func;
    int i;

//Atribuindo os dados e mostrando-os na tela.
    for(i=0; i<NUMF; i++){

        printf("\n\n---FUNCIONARIO %d---",i+1);
        
        printf("\nInsira o nome do funcionario: ");
        scanf("%s",func.nome);

        printf("\nInsira a matricula do funcionario: ");
        scanf("%d", &func.matricula);

        printf("\nInsira a data de nascimento do funcionario(DD/MM/AAAA): ");
        scanf("%s", func.dat_nas);

        printf("\nProximo...\n\n");

        printf("---FUNCIONARIO %d---\n", i+1);

        printf("NOME: %s.\n", func.nome);
        printf("MATRICULA: [%d]\n", func.matricula);
        printf("DATA DE NASCIMENTO: (%s).", func.dat_nas);
    }  
    
    return 0;
}