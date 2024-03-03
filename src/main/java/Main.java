package main;

public class Main {
    public static void main(String[] args) {
        Pile maPile = new Pile();

        // Empiler
        maPile.empiler(100);
        maPile.empiler(1000);
        maPile.empiler(10000); // On empile la pile
        System.out.println("Indice de sommet de la pile est " + maPile.indiceSommet()); // On donne son indice après avoir empilé

        // Dépiler
        int elementDepile = maPile.depiler();
        System.out.println(elementDepile + "est dépilé."); // On dépile la pile
        System.out.println("Indice de sommet de la pile : " + maPile.indiceSommet()); // On donne son indice après avoir dépilé

        // Vider
        System.out.println("La pile est elle vide ? : " + maPile.estVide()); // On test si elle est vide
        maPile.vider();
        System.out.println("La pile est elle vide ? " + maPile.estVide());
    }
}