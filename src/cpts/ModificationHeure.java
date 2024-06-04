package cpts;

public class ModificationHeure implements Etat{
    @Override
    public void appuyer2xBouton1(Montre montre) {
        System.out.println("RAS");
    }

    @Override
    public void appuyerBouton1(Montre montre) {
        System.out.println("etat modification minutes");
        montre.setEtatCourant(new ModificationMinute());
    }

    @Override
    public void appuyerBouton2(Montre montre) {
        System.out.println("ajouter heure");
        montre.setTime(montre.getTime().plusHours(1));
    }
}
