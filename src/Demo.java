import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        LoteriaPrimitiva loteria = new LoteriaPrimitiva();

        Jugador j1 = new Jugador("Juan", Arrays.asList(0,1,2,3,4,5));
        Jugador j2 = new Jugador("Pepe", Arrays.asList(1,2,3,4,3,3));
        Jugador j3 = new Jugador("Jose", Arrays.asList(1,2,3,3,3,3));
        loteria.registerObserver(j1);
        loteria.registerObserver(j2);
        loteria.registerObserver(j3);



        loteria.nuevoSorteo();
    }
}
