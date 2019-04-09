
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
int top = -1; /*Stack variables for our function*/
char stack[100];
 
void push(char);
void pop();
void find_top();
 
void main()
{
	int j;
	char prakash[100];
	printf("Enter any expression from a to h in question no 4: \n");
	scanf("%s", &prakash);  /*Taking any user input of maximum character 100 so that I should not Program 8 times */
	for (j = 0; prakash[j] != '\0';j++)
	{
		if (prakash[j] == '(')
		{
			push(prakash[j]);
		}
		else if (prakash[j] == ')')
		{
			pop();
		}
	}
	find_top();
}
/*Starting push and pop as studied in stack using stack variables*/
void push(char prakash)
{
	stack[top] = prakash;
	top++;
}
 
void pop()
{
	if (top == -1)
	{
		printf("\n The entered expression is invalid. \n");
		exit(0);
	}	
	else
	{		
		top--;
	}
}
/*End of push and pop*/
 
void find_top()
{
	if (top == -1)
		printf("\n The entered expression is valid. \n");
	else
		printf("\n The entered expression is invalid. \n");
}



