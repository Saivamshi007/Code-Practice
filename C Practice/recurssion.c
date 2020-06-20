#include<stdio.h>
int recurse(int a, int b);
int a=0,b=1,temp,n=5,i=0;
int main(){
printf("0 1 ");
printf("%2d", recurse(a,b));
}
int recurse(int a, int b){
temp=a+b;
a=b;
b=temp;
i++;
if(i==n) return b;
else return recurse(a,b);
}
