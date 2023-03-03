package Model.Entities.Interfaces;

import Model.Entities.AbstractClasses.Entity;

public interface Game <T extends Entity & WeigthForGame>{
    public boolean addAward(T entity);
    public void removeAwardbyId(int id);
    public void removeAllAwards();
    public void chooseAwordById(int id);
    public void chooseAwardByIndex(int index);
    public String getAllAwardData();
    public Entity getAward();
}
