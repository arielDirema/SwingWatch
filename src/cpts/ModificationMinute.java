package cpts;

public class ModificationMinute implements Etat{
    @Override
    public void appuyer2xBouton1(Montre montre) {
        System.out.println("RAS");
    }

    @Override
    public void appuyerBouton1(Montre montre) {
        System.out.println("etat modification secondes");
        montre.setEtatCourant(new ModificationSecondes());
    }

    @Override
    public void appuyerBouton2(Montre montre) {
        System.out.println("ajouter minutes");
        montre.setTime(montre.getTime().plusMinutes(1));
    }
}
