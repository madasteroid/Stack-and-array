#include<stdio.h>

int main(){
    int row, col, j;
    int x[5][5];
    for(row=0;row<5; row++){
        for(col=0; col<5; col++){
            x[row][col]= (row*5) + col;
            if(row==col)
            printf("%d ", 1);
            else
            printf("%d ", 0);
        }
    }
    
}

