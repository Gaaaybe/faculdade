#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>


int main(){

    char nome[30];
    char cep[16];
    char tel[18];

    setlocale(LC_ALL, "Portuguese");

    printf("Digite seu nome completo: ");
    scanf("%s", nome);

    printf("Digite seu CEP(sem simbolos): ");
    scanf("%s", cep);

    printf("Digite seu telefone: ");
    scanf("%s", tel);

    printf("\nSeu nome: %s \nSeu CEP: %s \nSeu telefone: %s",nome, cep, tel);
    

}