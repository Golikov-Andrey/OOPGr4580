package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviuor actor);
    void releaseFromMarket(List<Actor> actor);
    void update();
}
