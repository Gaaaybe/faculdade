#include <stdio.h>
#include <stdlib.h>

int BuscaBinaria(int v[], int inicio, int fim, int valor) {
    int meio = (inicio + fim) / 2;
    if (v[meio] == valor) return meio;
    if (fim == inicio) return -1;
    if (v[meio] > valor) return BuscaBinaria(v, inicio, meio - 1, valor);
    return BuscaBinaria(v, inicio + 1, meio, valor);
}

int main(){

    int vetor[10], aux, numero;

    for(int i = 0; i <10; i++){
        printf("Digite o numero %d do vetor: ", i+1);
        scanf("%d", &vetor[i]);

    }

    for(int x = 0; x < 10; x++){
        for(int y = x; y < 10; y++){
            if(vetor[x] > vetor[y]){
                aux = vetor[x];
                vetor[x] = vetor[y];
                vetor[y] = aux;

            }
        }
    }

    for(int i = 0; i < 10; i++){
        printf("numero %d é: %d \n", i+1, vetor[i]);

    }

    printf("Escolha um numero para procurar na lista: ");
    scanf("%d", &numero);
   
   
   int k = BuscaBinaria(vetor, 0, 10, numero);
   if(k > 0){
    printf("O valor existe na lista e esta na posicao %d", k+1);
   }
   else{
    printf("O valor não existe na lista!");
   }

}