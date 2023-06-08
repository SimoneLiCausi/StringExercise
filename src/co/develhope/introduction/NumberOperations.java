package co.develhope.introduction;

public class NumberOperations {
    public static void main (String[] args) {
        int a = 15;
        // aggiungo alla variabile "a" 5, senza ripetere
        // il nome della variabile "a".
        a += 5;
        System.out.println(a);

        // Adesso sottrango alla stessa variabile 4.
        a -= 4;
        System.out.println(a);

        //Creo una nuova variabile di nome "b" e gli assegnerò come valore "a".

        int b = a;
        b++;
        System.out.println(b);
// Controllo se la variabile "a" è un numero Pari con un If statement
        if(a % 2 == 0) {
            System.out.println("Is and Odd number");
        } else {
            System.out.println("Isn't and Odd number");

        }
// Controllo se la variabile "b" moltiplicata per "b" + 1 è un multiplo di 3.
        if(b * b+1 == b%3){
            System.out.println("Is a multiple of 3");
        } else {
            System.out.println("Isn't a multiple of 3");

        }
    }
}
