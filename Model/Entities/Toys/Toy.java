package Model.Entities.Toys;

import Model.Entities.Entity;

public class Toy extends Entity {
    protected int weight = 0;

    public Toy(String name){
        super(name);
    }

    public Toy(Toy toy){
        this(toy.getName());
        super.id = toy.getId();
        this.weight = toy.getWeight();
        super.count = toy.getCount();
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

    @Override
    public String toString() {
        return super.toString() + Integer.toString(weight);
    }

    @Override
    public String getData() {
        return super.getData() + "Вес вероятности выпадения в %: " + Integer.toString(weight) + "\n";
    }
}
