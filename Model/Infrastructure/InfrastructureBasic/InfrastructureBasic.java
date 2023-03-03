package Model.Infrastructure.InfrastructureBasic;

import java.util.List;

import Database.Interfaces.DbRequest;
import Model.Entities.AbstractClasses.Entity;
import Model.Infrastructure.Interfaces.EntityFactory;
import Model.Infrastructure.Interfaces.Infrastructure;

public class InfrastructureBasic implements Infrastructure{
    
    DbRequest db;
    EntityFactory factory;

    public InfrastructureBasic(DbRequest db, EntityFactory factory){
        this.db = db;
        this.factory = factory;
        db.CreateTable();
    }

    public List<Entity> getAllEntities(){
        return db.getAllEntities();
    }

    @Override
    public Entity createEntity(String data) {
        return factory.createEntity(data);
    }

    @Override
    public void addEntity(Entity entity) {
        db.addEntity(entity);
    }

    @Override
    public Entity getEntityById(int id) {
        return db.getEntityById(id);
    }

    @Override
    public List<Entity> getEntitiesByName(String name) {
        return db.getEntitiesByName(name);
    }

    @Override
    public void updateEntity(Entity entity) {
        db.updateEntity(entity);
    }

    @Override
    public void removeEntityById(int id) {
        db.removeEntityById(id);
    }

    @Override
    public void removeAllEntity() {
        db.removeAllEntity();
    }
}
