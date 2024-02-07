#include <stdio.h>
#include <stdlib.h>

int somaTotal(int n);

int main(){

    printf("%d", somaTotal(15));
    
}


int somaTotal(int n){
    /*
    n=5 -> 5+4+3+2+1 = 15
    n+somaTotal(n-1)

    n=5 n+somaTotal(n-1) -> 5+10=15
    n=4 n+somaTotal(n-1) -> 4+6=10
    ...
    n=1 -> 1
    */
   if(n==1){
    return 1;
   }

   return n+somaTotal(n-1);

}
