
package tabula;

import java.util.Scanner;


public class Tabula {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el limite inferior: ");
        double inferior = tec.nextDouble();
        
        System.out.println("Introdue el limite superior: ");
        double superior = tec.nextDouble();
        
        System.out.println("Introduce el incremento: ");
        double incremento = tec.nextDouble();
        
        tabula(inferior, superior, incremento);

    }
    
    public static void tabula(double inferior, double superior, double incremento){
        
        System.out.println("+-----------------------------------------+");
        System.out.println("|         X         |           Y         |");
        System.out.println("-------------------------------------------");
        for (double i = inferior; i < superior; i= i+incremento) {
            System.out.printf("|%20.3f|%20.3f|%n",i, f(i));
        }
        System.out.println("+-----------------------------------------+");
    }
    
    public static double f(double x){
        double y = 9 * Math.pow(x, 4) + 18 * Math.pow(x, 3) + 38 * Math.pow(x, 2) - 57 * x + 14;
        return y;
    }
    
}

