package Model.Infrastructure.Interfaces;

import Model.Entities.Entity;

public interface EntityFactory<T extends Entity> {
    public T createEntity(String data);
}
