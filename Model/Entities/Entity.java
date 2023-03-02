package Model.Entities;

public abstract class Entity {
    protected int id = 0;
    protected String name;
    protected int count;

    public Entity(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean setCount(int count){
        if (count >= 0){
            this.count = count; 
            return true;
        }
        else return false;    
    }

    public void addCount(){
        this.count ++;
    }

    public int getCount(){
        return this.count;
    }

    public boolean takeOne(){
        if(this.count > 0){
            this.count--;
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return this.name + ":" + Integer.toString(this.count) + ":";
    }
}
