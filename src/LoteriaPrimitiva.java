import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoteriaPrimitiva implements Subject{

    private ArrayList<Integer> winners;
    private ArrayList<Observer> observers;

    public LoteriaPrimitiva(){
        winners = new ArrayList<Integer>();
        observers= new ArrayList<Observer>();
    }

    public void nuevoSorteo(){
        Random r = new Random(32);
        for (int i = 0; i<6; i++){
            winners.add(i, r.nextInt(49-1)+1);
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index>=0){
            observers.remove(index);
        }

    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(winners);
        }
    }
}
