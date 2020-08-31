#include <stdio.h>
#include <math.h>

int main()
{
    int a = 0, b = 1, n, lower;
    int count = 0;
    scanf("%d", &lower);
    scanf("%d", &n);

    int i = 0;

    int c;

    if (lower > n)
    {
        printf("%d", 0);
    }
    else
    {

        while (i < n)
        {

            c = a + b;
            if (c > lower)
            {
                count++;
            }

            if (count == 3)
            {
                printf("%d", c);
                break;
            }

            a = b;
            b = c;
            i++;
        }
    }
}
