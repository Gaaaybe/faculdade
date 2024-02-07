#include <stdio.h>
#include <stdlib.h>


typedef struct{

    char nome[10];
    int idade;

} 
pessoa;

void alteraIdade(pessoa *ponteiro){

    
    printf("Altere a idade");
    scanf("%d", &ponteiro->idade);


}

int main(){

    pessoa p;

    printf("Digite o nome \n");
    scanf("%s",p.nome);
    printf("Digite a idade \n");
    scanf("%d",&p.idade);

    printf("Nome: %s\n Idade: %d\n",p.nome,p.idade);

    alteraIdade(&p);

    printf("Nome: %s e idade %d\n",p.nome,p.idade);

}