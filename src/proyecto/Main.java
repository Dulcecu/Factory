package proyecto;

public class Main {

    public static void main(String[] args) {
	    Factory.getInstance().getCommand("Comanda1").execute();
        Factory.getInstance().getCommand("Comanda2").execute();
        Factory.getInstance().getCommand("Comanda3").execute();
        Factory.getInstance().getCommand("Comanda1").execute();
    }
}
