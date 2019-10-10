import java.util.ArrayList;
import java.util.List;

public class Jugador implements Observer{

    String name;
    List<Integer> numbers;

    public Jugador(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    private int numeroAciertos(List<Integer> winners){
        int counter = 0;
        for(int i = 0; i<winners.size();i++){
            if(winners.get(i).equals(numbers.get(i)))
                counter++;
        }
        return counter;
    }

    @Override
    public void update(ArrayList<Integer> numbers) {
        int aciertos = numeroAciertos(numbers);
        if(aciertos==4){
            System.out.println("4 matches. You won a lot of money.");
        }else if(aciertos==5){
            System.out.println("5 matches. You won too much money.");
        }else if(aciertos==6){
            System.out.println("6 matches. You are rich now.");
        }else{
            System.out.println("You won NOTHING.");
        }
    }
}
