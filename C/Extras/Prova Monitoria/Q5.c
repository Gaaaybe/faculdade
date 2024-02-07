/*
Q5) Em uma construção é necessário que diversos cálculos sejam realizados para que não
haja desperdícios de material. Bruno é engenheiro civil e precisa de um programa que facilite a vida
do seu mestre de obras. O programa é uma calculadora de obra que possui as seguintes opções: 1-
Cálculo de revestimento de piso e 2- Cálculo de concreto para laje. Se o usuário escolher a opção
1, o programa deve receber o comprimento e largura em m2 de piso que se deseja cobrir e retornar
a quantidade ideal de revestimento necessário em m2

. Se o usuário escolher a opção 2, o programa
deve receber o tamanho em m2 de laje que se deseja cobrir e a espessura da camada de concreto da
laje em cm e retornar a quantidade ideal de concreto necessário em m3

. Desenvolva um programa em
C que atenda a essa situação. Você pode usar a imagem abaixo como exemplo para se guiar. (Dica1:
QuantRevestimento = comprimento ∗ largura)(Dica2: QuantConcreto = area ∗ espessura)
*/

#include <stdio.h>
#include <string.h>

float calcular_revst(){
//Criando funções para cada opção...
    float comp, larg;

    printf("\n----CALCULAR REVESTIMENTO----\n");

    printf("Digite a comprimento(m²): ");
    scanf("%f", &comp);

    printf("Digite a largura(m²): ");
    scanf("%f", &larg);

    float quant_revst = comp * larg;

    printf("A quantidade de revestimento nessessaria sao%3.fm³.", quant_revst);

    return 0;

}

float calcular_concrt(){

    float area, esps;

    printf("\n----CALCULAR COMCRETO----\n");

    printf("Digite a area(cm) da laje: ");
    scanf("%f", &area);

    printf("Digite a espessura(m²) da laje: ");
    scanf("%f", &esps);

    float quant_concrt = area * esps;

    printf("A quantidade de concreto nessessaria sao%3.fm³.", quant_concrt);

    return 0;

}

//usando o switch para escolher qual opção da calculadora e usar determinada função...
int main(){

    int esco = 0;

    printf("________________________________________");
    printf("\n\n---CALCULADORA DE OBRAS---\n\n");
    printf("Escolha uma das opcoes abaixo:\n (1) - Calculadora de revestimento.\n (2) - Calculadora de concreto em laje.\n >>> ");
    scanf("%d", &esco);

    switch(esco){
    case 1:
        calcular_revst();
        
        break;
    case 2:
        calcular_concrt();

        break;

    default:
        printf("Parametros invalidos...");
        break;
}

printf("\n\nFIM...\n");

}