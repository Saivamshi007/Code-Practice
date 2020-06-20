import java.util.*;

class SumRule {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s=new Scanner(System.in);
        float Pmb=s.nextFloat();
        float Pab=s.nextFloat();
        float P1=s.nextFloat();
        
        //using sun rule
        float Pmora=Pmb+Pab-2*(Pab*Pmb);
        //Probalility it will rain is
	float round=P1*Pmora;
        System.out.format("%.6f",round);

    }
}

