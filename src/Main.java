
public class Main {
    public static void main(String[] args) {
        Societe societe = new Societe(1, "SDCC");
        Impots imp1 = new Impots(2022);
        societe.add(imp1);
        imp1.add(new DossierRevenus(156 , 1000000));
        imp1.add(new DossierVehicule(1, 6,'A'));
        imp1.add(new DossierVehicule(512, 8,'B'));
        System.out.println(societe.toString());
        System.out.println(societe.getImpots(2022));
    }
}