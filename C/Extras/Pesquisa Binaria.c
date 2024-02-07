#include <stdio.h>
#include <stdlib.h>

int PesquisaBinaria (int vet[], int chave, int tam)
{
     int inf = 0;    
     int meio, sup;
     
     while (inf <= sup){
          meio = (inf + sup)/2;
          
          if (chave == vet[meio]){
               return meio;
               
			   }else
          if (chave < vet[meio]){
		  
               sup = meio-1;
           }
          else{
		  
               inf = meio+1;
           }
     }
     return -1;
}


int main() {
    int tam, valor;
    printf("Qual o tamanho do vetor: ");
    scanf("%d", &tam);
    int v[tam], i;
    printf("Informe os valores do vetor:\n");
    for (i = 0; i < tam; i++) {
        scanf("%d", &v[i]);
    }
    printf("Informe o numero a ser buscado: ");
    scanf("%d", &valor);
    int k = BuscaBinaria(v, 0, tam - 1, valor);
    printf("%d", k);
}