/*
Q1) Acompanhe o programa abaixo e explique o seu funcionamento. Caso o usuário digite
as entradas 2.5, 3.5 e 6 qual será a saída impressa na tela do usuário?
*/

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){

    int cont;
    float n1, n2, n3, valor;

    cont = 0;
    for (cont=1; cont<=2; cont++){

        printf("Digite um valor: ");
        scanf("%f", &n1);

        printf("Digite um valor: ");
        scanf("%f", &n2);

        printf("Digite um valor: ");
        scanf("%f", &n3);

        valor = (n1+n2+n3)/3; //A media dos 3 valores

        printf("O resultado e: %f\n", valor);
    }

    return 0;
}

//Para a entrada 2.5, 3.5 e 6 o resultado "é 4.0000".