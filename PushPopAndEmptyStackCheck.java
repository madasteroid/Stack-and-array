#include<stdio.h>
#include <string.h>
#define MAX 100	/*how many characters our stack can take*/


int top=-1;
int item;

char stack_string[MAX]; /*String*/
void pushChar(char item);/*Push*/
char popChar(void); /*Pop*/
int isEmpty(void); /*Emptystackcheck*/
int isFull(void); /*Reverse of line 12*/
 
int main()
{
    char str[MAX];
    
    int i;
    
    printf("\n Enter the character string from a, b, c &d: ");
    scanf("%[^\n]s",str); /*Just because I didn't wanted to do four different programs I took scan string and we take input string*/
    for(i=0;i<strlen(str);i++)
        pushChar(str[i]);
    for(i=0;i<strlen(str);i++)
        str[i]=popChar();

    printf("The result is: %s\n",str);
    
    return 0;
}
 
void pushChar(char item)
{
    if(isFull())
    {
        printf("\n The stack is full.\n");
        return;
    }
    
    top=top+1;
    stack_string[top]=item;
}
 
 char popChar()
{
    
    if(isEmpty())
    {
        printf("\nThe Stack is empty.\n");
        return 0;
    }
    item = stack_string[top];
    top=top-1;
    return item;
}
int isEmpty()
{
    if(top==-1)
        return 1;
    else
        return 0;
}
int isFull()
{
    if(top==MAX-1)
        return 1;
    else
        return 0;
}


