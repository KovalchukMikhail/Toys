package Database.Txt.TxtDbApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

import Database.Interfaces.DbRequest;
import Model.Entities.Entity;
import Model.Infrastructure.Interfaces.EntityFactory;

public class TxtDbRequest<T extends Entity> implements DbRequest<T> {

    private String path;
    private Utilities util;
    EntityFactory <T> factory;

    public TxtDbRequest(EntityFactory <T> factory) {
        this.path = path;
        this.util = new Utilities();
        this.factory = factory;
    }


    @Override
    public void CreateTable() {
        File file = new File(this.path);
        if (file.exists()) return;
        else{
            this.util.WriteFile(this.path, "");
        }
    }

    @Override
    public List<T> getAllEntity() {
        StringBuilder data = util.ReadFile(this.path);
        List<T> result = new ArrayList<T>();
        if(data.isEmpty()) return result;
        String[] stringsData = data.toString().split("\n");
        Arrays.stream(stringsData).forEach(s -> result.add(factory.createEntity(s)));
        return result;
    }

    @Override
    public T getEntityById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEntityById'");
    }

    @Override
    public List<T> getEntitiesByName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEntitiesByName'");
    }

    @Override
    public void addEntity(T entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEntity'");
    }

    @Override
    public void updateEntity(T entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEntity'");
    }

    @Override
    public void removeEntityById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeEntityById'");
    }

    @Override
    public void removeAllEntity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAllEntity'");
    }
    
}
