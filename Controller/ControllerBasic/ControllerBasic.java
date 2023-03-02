package Controller.ControllerBasic;

import java.util.List;

import Controller.Interfaces.Controller;
import Model.Entities.Entity;
import Model.Infrastructure.Interfaces.Infrastructure;

public class ControllerBasic implements Controller{
    Infrastructure infrastructure;

    public ControllerBasic(Infrastructure infrastructure){
        this.infrastructure = infrastructure;
    }

    @Override
    public List <Entity> getAllEntities() {
        return this.infrastructure.getAllEntities();
    }

    @Override
    public void addEntity(String data) {
        Entity entity = infrastructure.createEntity(data);
        infrastructure.addEntity(entity);
    }

    @Override
    public Entity getEntityById(int id) {
        return infrastructure.getEntityById(id);
    }

    @Override
    public List<Entity> getEntitiesByName(String name) {
        return infrastructure.getEntitiesByName(name);
    }

    @Override
    public void updateEntity(String data) {
        Entity entity = infrastructure.createEntity(data);
        infrastructure.updateEntity(entity);
    }

    @Override
    public void removeEntityById(int id) {
        infrastructure.removeEntityById(id);
    }

    @Override
    public void removeAllEntity() {
        infrastructure.removeAllEntity();
    }

    
}
