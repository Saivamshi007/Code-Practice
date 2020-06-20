import java.util.*;

public class det{

public static void main(String args[]){
float a[][]=new float[3][3],det;

Scanner s=new Scanner(System.in);

// fetch inputs
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
  //System.out.println("%f",&a[i][j]);
   a[i][j]=s.nextInt();  
}
}


//print matric

for (int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j]+" ");


}
System.out.println();
}


if(a[1][0]==0 && a[2][0]==0 && a[2][1]==0){

   det=a[0][0]*a[1][1]*a[2][2];

   
}else{

//System.out.print(a[0][0]);

det=((a[0][0]*a[1][1]*a[2][2])+(a[0][1]*a[1][2]*a[2][0])+(a[0][2]*a[1][0]*a[2][1])-(a[0][0]*a[1][2]*a[2][1])-(a[0][1]*a[1][0]*a[2][2])-(a[0][2]*a[1][1]*a[2][0]));

}

System.out.print(det);


}
}
