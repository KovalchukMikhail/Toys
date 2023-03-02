package Model.Infrastructure.InfrastructureBasic;

import Database.Interfaces.DbRequest;
import Model.Infrastructure.Interfaces.Infrastructure;

public class InfrastructureBasic implements Infrastructure{
    
    DbRequest db;

    public InfrastructureBasic(DbRequest db){
        this.db = db;
    }
}
