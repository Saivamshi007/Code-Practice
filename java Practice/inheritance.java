import java.util.*;

 class inheritance{

public static void main(String args[]){

b obj= new b();




obj.method2();
obj.method1();


}

public static class  a{

void method1(){
String s="sai";
System.out.println(s);





}


}


public static class b extends a{

void method2(){

String s="vamshi";

System.out.println(s);






}


}


}
