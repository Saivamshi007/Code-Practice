#include <stdio.h>

int main()
{
    char s[100], r[100];
    int i, last, count = 0;

    fgets(s, 100, stdin);

    while (s[count] != '\0')
    {
        count++;
    }

    for (i = count - 1; i >= 0; i--)
    {

        printf("%c", s[i]);
    }
}