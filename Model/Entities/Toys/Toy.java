package Model.Entities.Toys;

import Model.Entities.Entity;

public class Toy extends Entity {
    protected int toyId;
    protected int weight;

    public Toy(String name){
        super(name);
    }

    public Toy(Toy toy){
        this(toy.getName());
        this.toyId = toy.getToyId();
        this.weight = toy.getWeight();
        super.count = toy.getCount();
    }

    public void setToyId(int id){
        this.toyId = id;
    }

    public int getToyId(){
        return this.toyId;
    }

    public boolean setWeight(int weight){
        if(weight >= 0 && weight <= 100){
            this.weight = weight;
            return true;
        }
        else return false;
    }

    public int getWeight(){
        return this.weight;
    }
}
