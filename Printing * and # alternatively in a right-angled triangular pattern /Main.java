#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int i = 0;
    for(int curr_row = 1; curr_row <= n; curr_row++)
    {
        for(int curr_col = 1; curr_col <= curr_row; curr_col++)
        {
            if( i == 0)
            {
                printf("*");
                i = 1;
            }
            else
            {
                printf("#");
                i = 0;
            }
        }
        printf("\n");
    }
}
