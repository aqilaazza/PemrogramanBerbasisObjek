package Exercise2;

public class Manusia {

    public void nyalakanPerangkat (Elektronik perangkat) {
        int voltase = perangkat.getVoltase();

        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Menyalakan televisi jadul dengan input: " + ((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase televisi: " + ((Elektronik) perangkat).getVoltase());
        } else if(perangkat instanceof TelevisiModern) {
            System.out.println("Menyalakan televisi modern dengan input: " + ((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltase televisi: " + ((Elektronik) perangkat).getVoltase());
        }
    }
}