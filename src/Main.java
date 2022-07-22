public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.addDoor();
        System.out.println(miCoche.doors);
    }
}

class coche{
    public int doors = 5;

    public void addDoor() {
        this.doors = doors + 1;
    }
}