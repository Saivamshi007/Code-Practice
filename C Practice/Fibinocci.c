#include<stdio.h>
int main(){
int temp,n,a=0,b=1;
printf("Enter the limit of the series");
scanf("%d",&n);
printf("%d\n",a);
printf("%d\n",b);
for(int i=0;i<n;i++){
temp=a+b;
a=b;
b=temp;
printf("%d\n",temp);
}

}
