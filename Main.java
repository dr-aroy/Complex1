import java.util.Scanner;
class ComplexNo{
  int real, imaginary; // class attributes
  ComplexNo(){ } // Implicit constructor
  ComplexNo(int r, int i){
    this.real = r; this.imaginary = i;
  } // End of explicit constructor
  void getdata(){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter real part: ");
    this.real = in.nextInt();
    System.out.println("Enter imaginary part: ");
    this.imaginary = in.nextInt();
  } // End of getdata( ) method
  void showdata(){
    System.out.println("Complex No = " + this.real + " +i "+ this.imaginary);
  } // End of showdata( ) method
  ComplexNo addcomplexno (ComplexNo c1){
    ComplexNo t = new ComplexNo();
    t.real = this.real + c1.real;
    t.imaginary = this.imaginary + c1.imaginary;
    return t;
  } // End of addcomplexno ( ) method
} // End of ComplexNo class 
public class Main{
  public static void main (String args[]){
    ComplexNo c1 = new ComplexNo();
    ComplexNo c2 = new ComplexNo();
    ComplexNo c3 = new ComplexNo();
    System.out.println("\n Enter values for First Complex Number:");
    c1.getdata(); 
    System.out.println("\n Enter values for Second Complex Number:");
    c2.getdata();   
    System.out.println("\n Values before Complex Number addition:");
    c1.showdata();c2.showdata();
    // Complex No addition
    c3 = c1.addcomplexno(c2);
    System.out.println("\n Values after Complex Number addition:");
    c1.showdata(); c2.showdata(); c3.showdata();
  } // End of main () method
} // End of Main class 