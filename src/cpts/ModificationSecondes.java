package cpts;

public class ModificationSecondes implements Etat{
    @Override
    public void appuyer2xBouton1(Montre montre) {
        System.out.println("RAS");
    }

    @Override
    public void appuyerBouton1(Montre montre) {
        System.out.println("etat affichage");
        montre.setEtatCourant(new Affichage());
    }

    @Override
    public void appuyerBouton2(Montre montre) {
        System.out.println("ajouter seconde");
        montre.setTime(montre.getTime().plusSeconds(1));
    }
}
