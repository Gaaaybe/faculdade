/*
Q4) Crie um programa que receba dois vetores (os valores devem ser digitados pelo usuário)
e compare quantos elementos são iguais.
*/

#include <stdio.h>
#include <stdlib.h>
#define TAM 3

int main(){
//Definindo as variaveis e seus tipos...
    int array1[TAM];
    int array2[TAM];
    int i, u, elementos = 0;

//Preechendo os arrays...
    printf("Digite numeros inteiros para uma lista: \n");
    for (int i = 0; i < TAM; i++){
        scanf("%d", &array1[i]);
    }
    printf("Digite numeros inteiros para uma lista: \n");
    for (int i=0; i<TAM; i++){
        scanf("%d", &array2[i]);
    }

//Comparando e somando os valores iguais...
    for(i=0; i<TAM; i++){
        for(u=0; u<TAM; u++){
            if(array1[i]==array2[u]){
                elementos++;
                
            }
        }
    }
    if(elementos==1){
        printf("Existem %d elemento igual!",elementos);
    }
    else{
        printf("Existem %d elementos iguais!",elementos);
    }
}