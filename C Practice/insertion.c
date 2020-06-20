#include<stdio.h>
int main(){
int a[20],n,pos,value;


printf("Enter the size of the array");
scanf("%d",&n);

printf("Enter the elements of the array");
for(int i=0;i<n;i++){
scanf("%d",&a[i]);
}

printf("enter the position to be inserted");
scanf("%d",&pos);
printf("Enter the element to be inserted");
scanf("%d",&value);

for(int i=n-1;i>=pos-1;i--){
 a[i+1]=a[i];
}

a[pos-1]=value;
n++;

for(int j=0;j<n;j++){
 printf("%d\n",a[j]);
}
}
