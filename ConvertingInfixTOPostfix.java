#include<stdio.h>
#include <ctype.h>

char stack[100];
int top = -1;
void push(char prakash)
{
    stack[++top] = prakash;
}
 
char pop()
{
    if(top == -1)
        return -1;
    else
        return stack[top--];
}
 
int priority(char prakash)
{
    if(prakash == '(')
        return 0;
    if(prakash == '+' || prakash == '-')
        return 1;
    if(prakash == '*' || prakash == '/')
        return 2;
}
 
int main()
{
    char jim[100];
    char *a, x;
    printf("First enter any valid infix equation from a to h:   \nThe postfix equation is given by:  ");
    scanf("%s",jim);
    a = jim;
    while(*a != '\0')
    {
        if(isalnum(*a))
            printf("%c",*a);
        else if(*a == '(')
            push(*a);
        else if(*a == ')')
        {
            while((x = pop()) != '(')
                printf("%c", x);
        }
        else
        {
            while(priority(stack[top]) >= priority(*a))
                printf("%c",pop());
            push(*a);
        }
        a++;
    }
    while(top != -1)
    {
        printf("%c",pop());
    }
}
 
