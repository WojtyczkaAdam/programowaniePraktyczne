import java.util.Scanner;

public class testowanie {
    public static void main(String[] args) {
        //Napisz program, w którym możemy wprowadzać kolejne liczby całkowite.
        // Liczby zapisujemy w tablicy. Wypisz tablicę. Oblicz i wyświetl statystyki:
        // największa wartość, najmniejsza wartość, wartość średnia, *odchylenie standardowe

        System.out.println("wprowadz liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        int[] tab=new int[5];
        for(int i=0; i<5; i++){
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++)
            System.out.println("Kolejna cyfra to: " + tab[i]);



        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        System.out.println("max= " + max);


        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min)
                min = tab[i];

        }
        System.out.println("min= " + min);

        double suma = 0;
        for(double pomiar : tab) {
            suma += pomiar;
        }

        double srednia = suma/tab.length;
        System.out.println("Srednia liczb wynosi: "+srednia);

        System.out.println("======================");



    }
    }

