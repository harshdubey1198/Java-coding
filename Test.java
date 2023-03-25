import java.util.Scanner;
class Test{
public static void main(String[] args) {
 int x;
 try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter the number : ");
     x=sc.nextInt();
}
 System.out.println("Data: "+x);
}
}