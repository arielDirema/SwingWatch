package cpts;

public class Affichage implements Etat{

    @Override
    public void appuyer2xBouton1(Montre montre) {
        System.out.println("état modification heure");
        montre.setEtatCourant(new ModificationHeure());
    }

    @Override
    public void appuyerBouton1(Montre montre) {
        System.out.println("RAS");
    }

    @Override
    public void appuyerBouton2(Montre montre) {
        System.out.println("RAS");
    }
}
