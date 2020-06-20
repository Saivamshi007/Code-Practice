import java.util.*;


public class Binary{
    public static void main(String [] args){
        int n,temp,key;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the length of the array");

        n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

       /* for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }*/


        //sorting

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;


                }

            }
        }

        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


        System.out.println("Binary sort");

        int left=0;
        int right=n-1;

        while(left<=right){
            
        }








        


    }
    
}