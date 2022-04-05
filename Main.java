import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char znak = 'z';
    while(true)
      {
        znak = s.next().charAt(0);
        if(znak == 'q') break;
        System.out.println(znak);
      }
   
  }
}