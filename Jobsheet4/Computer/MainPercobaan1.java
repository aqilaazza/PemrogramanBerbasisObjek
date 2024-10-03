package Computer;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad");
        l.setProc(p); 
        l.info();
        Processor p1 = new Processor("Intel i5", 4);
        Laptop l1 = new Laptop("Thinkpad");
        l1.setProc(p1); 
        l1.info();
    }

}
