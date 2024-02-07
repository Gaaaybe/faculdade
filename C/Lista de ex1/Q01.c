// 1. Implemente um programa que apresente o elemento n da sequência Fibonacci solicitado pelo usuário.
//  O programa receberá a entrada n e devolverá o valor da sequência. Por exemplo, para a entrada n=5 o valor que será retornado é  3.

// Sequência: 0 1 1 2 3 5 8 13 21 34 …

// Utilize uma função para retornar esse valor e a implemente de forma recursiva.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{

    int aux, i, a, b, elemento;

    a = 0;
    b = 1;

    printf("Digite o elemento: ");
    scanf("%d", &elemento);

    printf("Sequencia: \n%d", b);

    for (i = 0; i < elemento; i++)
    {

        aux = a + b;
        a = b;
        b = aux;

        printf("\n%d", aux);
    }
}