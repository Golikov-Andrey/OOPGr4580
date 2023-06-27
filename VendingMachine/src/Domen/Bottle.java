package Domen;

public class Bottle extends Product {
    // Поля
    private float bottleVolume;
// Свойства
    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }
    //конструкторы
    public  Bottle(int price, int place, String name, long id){
        super(price,place,name,id);
        this.bottleVolume = 0f;
    }
    public Bottle (int price, int place, String name, long id, float bottleVolume){
        super(price,place,name,id);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvolume="+bottleVolume ;
    }

}
