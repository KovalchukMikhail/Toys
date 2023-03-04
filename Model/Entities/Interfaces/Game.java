package Model.Entities.Interfaces;

import java.util.List;

import Model.Entities.AbstractClasses.Entity;

public interface Game <T extends Entity & WeigthForGame>{
    public boolean addAward(T entity);
    public void removeAwardbyId(int id);
    public void removeAllAwards();
    public void chooseAwordById(int id);
    public void chooseAwardByIndex(int index);
    public String getAllAwardData();
    public List <T> getAllAwards();
    public Entity getAward();
}
