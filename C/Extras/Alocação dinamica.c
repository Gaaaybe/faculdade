#include <stdio.h>
#include <stdlib.h>

int main(){

    int *p;
    int i,t;

    scanf("%d", &t);

    p = (int*) malloc(t*sizeof(int));

    if(!p){
        printf("Erro");
        exit(1);
    }
    else{
        printf("Alocação de Memoria");
    }

    for(i=0;i<t;i++){
        scanf("%d",&p[i]);
    }
    for(i=0;i<t;i++){
        printf("%d",p[i]);
    }

    p = (int*) realloc(p, 2*sizeof(int));
    
    free(p);

    return 0;
}