import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        LoteriaPrimitiva loteria = new LoteriaPrimitiva();
        List<Jugador> jugadores = new ArrayList<Jugador>();
        Random r = new Random(32);

        int n = 5;
        //Crea n jugadores y los anyade a la lista de jugadores
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int x = 0; x < 6; x++) {
                numbers.add(x, r.nextInt(48) + 1);
            }
            Jugador j = new Jugador("Player " + i, numbers);
            jugadores.add(j);
        }

        //Anyade la lista de jugadores a la loteria
        for (Jugador jug : jugadores)
            loteria.registerObserver(jug);

        loteria.nuevoSorteo();
    }
}
