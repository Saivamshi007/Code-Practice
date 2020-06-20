
#include <stdio.h>

int main()
{

    printf("%d",sum(4));

    return 0;
}


int sum(int n){
    
    if(n==0){
        return 1;
    }else{
        return n*sum(n-1);
    }
    
}


