import java.util.ArrayList;
import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
        HashSet<String> plant = new HashSet<String>();

        // добавим в список ряд элементов
        plant.add("арбуз");
        plant.add("банан");
        plant.add("вишня");
        plant.add("груша");
        plant.add("дыня");
        plant.add("ежевика");
        plant.add("жень-шень");
        plant.add("земляника");
        plant.add("ирис");
        plant.add("картофель");

        System.out.printf("В коллекции 'Растения' %d элементов \n", plant.size());

        for(String plants : plant){

            System.out.println(plants);
        }
    }
}