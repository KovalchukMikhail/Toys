package Database.Interfaces;

import java.util.List;

import Model.Entities.Entity;

public interface DbRequest <T extends Entity>
{
    public void CreateTable();
    public List<T> getAllEntity();
    public T getEntityById();
    public List<T> getEntitiesByName();
    public void addEntity(T entity);
    public void updateEntity(T entity);
    public void removeEntityById(int id);
    public void removeAllEntity();
}
