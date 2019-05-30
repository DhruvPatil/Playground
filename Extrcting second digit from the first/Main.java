
#include<stdio.h>
int main()
{
    int number, secondDigit;
    scanf("%d", &number);
    while(number >= 100)
    {
        number/= 10;
    }
    secondDigit =number % 10;
    printf("%d",secondDigit);
    return 0;
}
