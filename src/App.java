import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo!");

        try (Scanner scanner = new Scanner(System.in)){
          int n = scanner.nextInt(); //Lea n
          int m = scanner.nextInt(); //Lea m
// 2 3
          if(n%2==0 && m%2==0){ //verdadero && falso
            System.out.println("n y m son pares"); //Muestra "n y m son pares"
          } else if (n%2!=0 && m%2==0){   
            System.out.println("solo m es par");
          } else if (n%2==0 && m%2!=0){ // verdadero && verdadero
            System.out.println("solo n es par"); // Muestre "solo n es par"
          } else {
            System.err.println("n y m son impares");
          }
        }
    }
}
