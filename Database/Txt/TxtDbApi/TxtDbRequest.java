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

    public TxtDbRequest(String path, EntityFactory <T> factory) {
        this.path = path;
        this.util = new Utilities();
        this.factory = factory;
    }


    @Override
    public void CreateTable() {
        File file = new File(this.path);
        if (file.exists()) return;
        else{
            this.util.WriteFile(this.path, "0<maxId>\n");
        }
    }

    @Override
    public List<T> getAllEntities() {
        StringBuilder data = util.ReadFile(this.path);
        return getEntities(data);
    }

    public List<T> getEntities(StringBuilder data){
        List<T> result = new ArrayList<T>();
        String[] stringsData = data.toString().split("<maxId>\n")[1].split("\n");
        if(stringsData.length == 0) return result;
        Arrays.stream(stringsData).forEach(s -> result.add(factory.createEntity(s)));
        return result;
    }

    @Override
    public T getEntityById(int id) {
        StringBuilder data = util.ReadFile(this.path);
        return getEntities(data).stream().filter(t -> t.getId() == id).findFirst().get();
    }

    @Override
    public List<T> getEntitiesByName(String name) {
        StringBuilder data = util.ReadFile(this.path);
        return getEntities(data).stream().filter(t -> t.getName().toLowerCase().indexOf(name.toLowerCase()) != -1).toList();
    }

    @Override
    public void addEntity(T entity) {
        StringBuilder data = util.ReadFile(this.path);
        int maxId = Integer.valueOf(data.toString().split("<maxId>\n")[0]);
        String newMaxId = Integer.toString(maxId + 1);
        String entityData = newMaxId + ":" + entity.toString() + "\n";
        data.append(entityData).replace(0, data.indexOf("<maxId>\n"), newMaxId);
        util.WriteFile(this.path, data.toString());
    }

    @Override
    public void updateEntity(T entity) {
        StringBuilder data = util.ReadFile(this.path);
        List<T> entities = getEntities(data);
        String resultStr = data.toString();
        for (T t : entities) {
            if(t.getId() == entity.getId()){
                String oldEntityData = Integer.toString(t.getId()) + ":" + t.toString();
                String newEntityData = Integer.toString(entity.getId()) + ":" + entity.toString();
                resultStr = resultStr.replace(oldEntityData, newEntityData);
                break;
            }
        }
        util.WriteFile(this.path, resultStr);
    }

    @Override
    public void removeEntityById(int id) {
        StringBuilder data = util.ReadFile(this.path);
        List<T> entities = getEntities(data);
        String resultStr = data.toString();
        for (T t : entities) {
            if(t.getId() == id){
                String oldEntityData = Integer.toString(t.getId()) + ":" + t.toString() + "\n";
                resultStr = resultStr.replace(oldEntityData, "");
                break;
            }
        }
        util.WriteFile(this.path, resultStr);
    }

    @Override
    public void removeAllEntity() {
        StringBuilder data = util.ReadFile(this.path);
        String maxId = data.toString().split("<maxId>\n")[0];
        this.util.WriteFile(this.path, maxId + "<maxId>\n");
    }

    
}
