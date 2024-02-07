#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#define TAM 3

int main(){

    setlocale(LC_ALL, "Portuguese");

    float av[TAM], media, soma;
    int i;

    for(i=0; i<TAM; i++){
        printf("Digite a nota %d: ",i+1);
        scanf("%f", &av[i]);
        soma += av[i];
    }

    media = soma/TAM;

    printf("\n---Boletim---\n NOTA 1: %.1f\n NOTA 2: %.1f\n NOTA 3: %.1f\n MEDIA: %.1f", av[0], av[1], av[2], media);

    if(media >= 7){
        printf("\n Aprovado!");
    }
    else{
        printf("\n Reprovado!");
    }



}