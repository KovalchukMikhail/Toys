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

    
}
