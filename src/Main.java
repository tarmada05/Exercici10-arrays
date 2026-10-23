import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int[] a = new int[5];
    int[] b = new int[5];
    int[] resultat = new int[5];
    System.out.println("Introdueix els primers 5 numeros:");
    for (int i = 0; i < a.length; i++) {
        a[i] = input.nextInt();
    }
    System.out.println("Introdueix els següents 5 numeros:");

    for (int i = 0; i < b.length; i++) {
        b[i] = input.nextInt();
    }

    for (int i = 0; i < resultat.length; i++) {
        resultat[i] = a[i] + b[i];
    }

    System.out.print("a:");
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + (i < a.length - 1 ? ", " : ""));
    }

    System.out.print("b:");
    for (int i = 0; i < b.length; i++) {
        System.out.print(b[i] + (i < b.length - 1 ? ", " : ""));
    }

    System.out.print("resultat:");
    for (int i = 0; i < resultat.length; i++) {
        System.out.print(resultat[i] + (i < resultat.length - 1 ? ", " : ""));
    }
}