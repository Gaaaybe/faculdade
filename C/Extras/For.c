#include <stdio.h>
#define n 10

main( ){

  int i, j, aux, valor, vet[n];
    
  for (i=0;i<10;i++){
    printf("Diga um valor:  \n");
    scanf("%d", &vet[i]);
  }

  for (i = n - 1; i > 0; i++){
    for (j=0; j<i; i++){
      if(vet[j] > vet[j+1]){
          aux = vet[j];
          vet[j] = vet[j+1];
          vet[j+1] = aux;
          
    
    } 
    printf("\n%d\n ", vet[i] );
      }
  
  }
}
