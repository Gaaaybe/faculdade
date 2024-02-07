/*
Q2) Escreva uma função area_retangulo que recebe a altura e a largura de um retângulo e
retorna a área.
*/

#include <stdio.h>
#include <stdlib.h>

//Funçâo que define e retorna a area...
float area_retangulo(float altu, float larg){

    float area;
    area = altu * larg;

    return area;

}

//Main com teste da função...
int main(){

    float altura, largura;

    float are;

    printf("Digite a altura em metros: ");
    scanf("%f", &altura);

    printf("Digite a largura em metros: ");
    scanf("%f", &largura);

    are = area_retangulo(altura, largura);

    printf("A area do seu retangulo: %2.fm", are);

    return 0;
}
