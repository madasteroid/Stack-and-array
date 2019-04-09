#include<stdio.h>
#include<ctype.h>

int stack[100];
int top = -1;
 
void push(int kash)
{
        stack[++top] = kash;
}
 
int pop()
{
        return stack[top--];
}
 
int main()
{
        char s[100];
        char *jim;
        int x,y,z,num;
        printf("Enter the valid postfix equation from validation: ");
        scanf("%s",s);
        jim = s;
        while(*jim != '\0')
        {
                if(isdigit(*jim))
                {
                        num = *jim - 48;
                        push(num);
                }
                else
                {
                        x = pop();
                        y = pop();
                        switch(*jim)
                        {
                                case '+':
                                {
                                        z=x+y;
                    break;
                                }
                                case '-':
                                {
                                        z=y-x;
                                        break;
                                }
                                case '*':
                                {
                                       z=x*y;
                                        break;
                                }
                                case '/':
                                {
                                        z=y/x;
                                        break;
                                }
                        }
                        push(z);
                }
                jim++;
        }
        printf("\n The evaluated postfix equation is %s  =  %d\n\n",s,pop());
        return 0;
 
}


