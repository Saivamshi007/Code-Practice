/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class Trycode {
   public static void main(String args[] ) throws Exception {

              BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

              int testcases=Integer.parseInt(bf.readLine());

              while(testcases>0){

                 int HV=Integer.parseInt(bf.readLine());

                 int[] heroes=new int[HV];
                 int[] villains=new int[HV];

                 String [] villaninput=bf.readLine().split(" ");
                   String [] heroinput=bf.readLine().split(" ");


                   for(int i=0;i<HV;i++){
                      heroes[i]=Integer.parseInt(heroinput[i]);
                      villains[i]=Integer.parseInt(villaninput[i]);

                   }

                   Arrays.sort(heroes);
                   Arrays.sort(villains);


                   int count=0;


                   for(int i=0;i<HV;i++){

                      if(heroes[i]>villains[i]){
                         count++;
                      }

                   }


                   if(count==HV){
                      System.out.println("WIN");
                   }else{
                                            System.out.println("WIN");

                   }






              }



   }
}
