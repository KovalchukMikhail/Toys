package Controller.Interfaces;

import java.util.List;
import Model.Entities.Entity;

public interface Controller {
    public List <Entity> getAllEntities();

    public void addEntity(String data);

    public Entity getEntityById(int Id);

    public List <Entity> getEntitiesByName(String name);

    public void updateEntity(String data);

    public void removeEntityById(int id);

    public void removeAllEntity();
}
