#include<stdio.h>
int main(){
int a[20],n,pos,value;


printf("Enter the size of the array");
scanf("%d",&n);

printf("Enter the elements of the array");
for(int i=0;i<n;i++){
scanf("%d",&a[i]);
}

printf("Enter the position to be Deleted");
scanf("%d",&pos);

for(int i=0;i<n;i++){
if(i==pos-1){

for(int j=i;j<n;j++){

 a[j]=a[j+1];
}

 
}

}


n--;

for(int j=0;j<n;j++){
 printf("%d\n",a[j]);
}
}
