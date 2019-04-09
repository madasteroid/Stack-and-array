#include<stdio.h>

int main(){
    int array2D[5][5];
    int *aPtr;
    int *rowIndices[5], *temp;
    int j,k, count;
    
    for(j=0;j<5;j++){
        for(k=0;k<5;k++){
            if(j==k){
                array2D[j][k]=1;
            }else{
                array2D[j][k]=0;
            }
        }
    }
    aPtr=&array2D[0][0];
    for(j=0;j<5;j++){
        for(k=0;k<5;k++){
            printf("%d ",*aPtr);
            aPtr++;
        }
    }
    printf("\n");
}


