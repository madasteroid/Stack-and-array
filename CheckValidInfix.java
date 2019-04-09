#include<stdio.h>
int main()
{
      char array[100];
      int count, n, Start, End; /*n is the limit of expression of characters*/
      printf("\n Enter for the value of n:\t");
      scanf("%d", &n);
      printf("\n Enter the infix equation: \t");
      scanf("%s", array);
      for(count = 0; count < n; count++)
      {
            if(array[count] == '{' || array[count] == '[' || array[count] == '(')
            {
                  Start++;
            }
            else if(array[count] == '}' || array[count] == ']' || array[count] == ')')
            {
                  End++;
            }
      }
      if(Start == End)
      {
            printf("\nThe infix equation is valid.\n");
      }
      else
      {
            printf("\nThe infix equation is not valid.\n");
      }
      return 0;
}
