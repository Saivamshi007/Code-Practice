#include <stdio.h>
int main()
{
    int lower, upper, ans;

    scanf("%d", &lower);
    scanf("%d", &upper);

    for (int i = lower; i <= upper; i++)
    {
        if (i % 3 == 0 || i % 5 == 0)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
            }
            else
            {
                printf("%d", i);
            }
        }
    }
}