import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int semanas, dias, horas, numHoras;

        Scanner entrada = new Scanner(System.in);
        System.out.println("inresa el valor de horas: ");
        numHoras = entrada.nextInt();
        semanas = numHoras / 168;
        dias = numHoras % 168 / 24;
        horas = numHoras % 24;

        System.out.println(semanas + " semanas, " + dias + " dias y " + horas + " horas");
    }
}