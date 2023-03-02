package Model.Infrastructure.Interfaces;

import java.util.List;
import Model.Entities.Entity;


public interface Infrastructure {
    public List<Entity> getAllEntities();

    public Entity createEntity(String data);

    public void addEntity(Entity entity);
}
