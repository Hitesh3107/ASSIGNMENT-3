package hb;


import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
   
        Scanner sc= new Scanner(System.in);
        
        Employee e=new Employee("HITESH","BENDALE",5,350000);
        System.out.print(e);
       
        Book b=new Book("Hitesh",5,5);
        System.out.println();
        System.out.print(b);
        
}
}