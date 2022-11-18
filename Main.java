import java.util.Scanner;
 
 
 
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
 
 
 
String a[] = {"x","y","y","x"};
String b[] = {"red","black","black","red"};
 
//System.out.println("");
Boolean a1 = a[0].equals(a[1]);
Boolean a2 = a[0].equals(a[2]);
Boolean a3 = a[0].equals(a[3]);
Boolean a4 = a[1].equals(a[2]);
Boolean a5 = a[1].equals(a[3]);
Boolean a6 = a[2].equals(a[3]);
 
 
 
Boolean b1 = b[0].equals(b[1]);
Boolean b2 = b[0].equals(b[2]);
Boolean b3 = b[0].equals(b[3]);
Boolean b4 = b[1].equals(b[2]);
Boolean b5 = b[1].equals(b[3]);
Boolean b6 = b[2].equals(b[3]);
 
Boolean p1 = a1.equals(b1);
Boolean p2 = a2.equals(b2);
Boolean p3 = a3.equals(b3);
Boolean p4 = a4.equals(b4);
Boolean p5 = a5.equals(b5);
Boolean p6 = a6.equals(b6);
 
if(p1 == true & p2 == true & p3 == true & p4 == true & p6 == true){
System.out.print("padrão");
  else {
  System.out.print("Não é padrão");
  }
}
}
}