import java.util.Scanner;

public class Program{


 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
   System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>b){
        System.out.println("a is largest number");
    }else if(a<b){
        System.out.println("b is largest number");
    }
    else{
        System.out.println("two number are equal");
    }



 }

}