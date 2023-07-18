package Rewards;

public abstract class ItemGen{

    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}