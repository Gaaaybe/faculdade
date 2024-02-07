#include <stdio.h>
#include <string.h>
#include <locale.h>

#define TAM 50

struct tipo_pessoa{
  int idade;
  float peso;
  char nome[TAM];
};

typedef struct tipo_pessoa tipo_pessoa;

int main() {
  setlocale(LC_ALL, "Portuguese");

  //Criando e inicializando
    tipo_pessoa pes = {0,0.0, "Teste"};
    
    printf("Inicio:\n");
    printf("Idade: %d\n", pes.idade);
    printf("Peso: %.2f\n", pes.peso);
    printf("Nome: %s\n", pes.nome);

  
  //Atribuindo valores aos campos
    pes.idade = 10;
    pes.peso = 99.99;
    strcpy(pes.nome, "Paulo");
  
    printf("Inicio:\n");
    printf("Idade: %d Anos\n", pes.idade);
    printf("Peso: %.2f Kg\n", pes.peso);
    printf("Nome: %s\n", pes.nome);

  //Solicitando inserções via teclado
  printf("\n Insira sua idade em anos: \n");
  scanf("%d",&pes.idade);
  printf("\n Insira seu peso em Kg \n");
  scanf("%f", &pes.peso);
  printf("\n Insira seu primeiro nome \n");
  scanf("%s", pes.nome);
  
  printf("\n Alterando com dados do usuario\n");
  
printf("Inicio\n");
printf("Idade: %d Anos\n", pes.idade);
printf("Peso: %.2f Kg\n", pes.peso);
printf("Nome: %s\n", pes.nome);  
  
  
  return 0;
}