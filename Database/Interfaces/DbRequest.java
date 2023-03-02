package Database.Interfaces;

import java.util.List;

import Model.Entities.Entity;

public interface DbRequest <T extends Entity>
{
    public void CreateTable();
    public List<T> getAllEntities();
    public T getEntityById(int id);
    public List<T> getEntitiesByName(String name);
    public void addEntity(T entity);
    public void updateEntity(T entity);
    public void removeEntityById(int id);
    public void removeAllEntity();
}
