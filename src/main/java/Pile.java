package main;

public class Pile {

    private int[] tabPile;
    private int nbElt;
    private int indiceSommet;
    
    public Pile() {
        tabPile = new int[200];
        nbElt = 0;
        indiceSommet = -1;
    }
    
    public boolean estVide() {
        if (indiceSommet == -1){
            return true; // si indiceSommet ets -1 alors elle est vide sinon elle n'est pas vide
        } else {
            return false;
        }
    }

    public boolean estPlein() {
        if (nbElt == tabPile.length){
            return true; // Si le nombre d'élement est égal à la taille elle est pleine
        } else{
            return false; // Sinon elle n'est pas pleine
        }
    }

    public int empiler(int pfElt) {
        if (estPlein()) {
            System.out.println("Erreur : la pile est pleine."); // Si elle est pleine on ne peut pas l'empiler
        } else {
            indiceSommet++; // Sinon on empile
            tabPile[indiceSommet] = pfElt;
            nbElt++;
        }
        return pfElt;
    }

    public int depiler() {
        if (estVide()) {
            System.out.println("Erreur : la pile est déjà vide."); // Si elle est vide on ne peut pas dépiler
            return -1;
        } else {
            int eltDep = tabPile[indiceSommet]; // Sinon on dépile
            indiceSommet--;
            nbElt--;
            return eltDep;
        }
    }

    public int indiceSommet() {
        if (estVide()) {
            System.out.println("La pile est vide."); // Si elle est vide l'indice de sommet est -1
            return -1;
        } else {
            return tabPile[indiceSommet]; // Si estVide est false on retourne l'indice de sommet
        }
    }

    public void vider() {
        while (!estVide()) { // Tant que la pile n'est pas vide, on la dépile.
            depiler();
        }
    }
}