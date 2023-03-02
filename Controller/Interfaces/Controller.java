package Controller.Interfaces;

import java.util.List;
import Model.Entities.Entity;

public interface Controller {
    public List <Entity> getAllEntities();

    public void addEntity(String data);
}
