import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Rewards.GemGen;
import Rewards.GoldGen;
import Rewards.ItemGen;
import Rewards.iGameItem;

public class App {
    public static void main(String[] args) throws Exception {

        Random rnd = ThreadLocalRandom.current();
        List<ItemGen> generators = new ArrayList<ItemGen>();
        generators.add(new GoldGen());
        generators.add(new GemGen());

        for(int i=0;i<10;i++)
        {
            generators.get(Math.abs(rnd.nextInt()%2==0?0:1)).createItem().open();           
        }
    }
}
