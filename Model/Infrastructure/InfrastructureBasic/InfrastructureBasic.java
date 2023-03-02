package Model.Infrastructure.InfrastructureBasic;

import java.util.List;

import Database.Interfaces.DbRequest;
import Model.Entities.Entity;
import Model.Infrastructure.Interfaces.EntityFactory;
import Model.Infrastructure.Interfaces.Infrastructure;

public class InfrastructureBasic implements Infrastructure{
    
    DbRequest db;
    EntityFactory factory;

    public InfrastructureBasic(DbRequest db, EntityFactory factory){
        this.db = db;
        this.factory = factory;
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
}
