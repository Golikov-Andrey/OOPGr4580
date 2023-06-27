package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Places;

public class Holder {
    private List<Places> places;

    public Holder(int xSize, int ySize){
        places = new ArrayList<>(xSize*ySize);
        for(int x = 0; x < xSize; x++){
            for(int y = 0; y < ySize; y++){
                places.add(new Places(x, y));
            }
        }
    }

    public boolean release(int x, int y){
        return places.stream().filter(place -> place.getCol() == x && place.getRow() == y)
                .findFirst().get().setEmpty(true);
    }

    public int getBalance() {
        return 0;
    }
}