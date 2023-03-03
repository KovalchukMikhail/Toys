package Model.Entities.Games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Model.Entities.AbstractClasses.Entity;
import Model.Entities.Interfaces.Game;
import Model.Entities.Interfaces.WeigthForGame;

public class Lottery <T extends Entity & WeigthForGame> implements Game <T>{
    private List<T> awards = new ArrayList<T>();
    private int currentIndex = 0;

    @Override
    public boolean addAward(T entity) {
        if(entity.getCount() > 0){
            awards.add(entity);
            return true;
        }
        return false;
    }

    @Override
    public void removeAwardbyId(int id) {
        for (T entity : awards) {
            if(entity.getId() == id){
                awards.remove(entity);
                return;
            }
        }
    }

    @Override
    public void removeAllAwards() {
        awards.clear();
    }

    @Override
    public void chooseAwordById(int id) {
        for (int i = 0; i < awards.size(); i++){
            if(awards.get(i).getId() == id){
                currentIndex = i;
                return;
            }
        }
    }

    @Override
    public void chooseAwardByIndex(int index) {
        if(index < awards.size()){
            currentIndex = index;
        }
    }

    @Override
    public String getAllAwardData() {
        StringBuilder data = new StringBuilder();
        for (T entity : awards) {
            data.append("1. " + entity.getData());
        }
        return data.toString();
    }

    @Override
    public T getAward() {
        if(!awards.isEmpty()){
            T entity = awards.get(currentIndex);
            if(requestAward(entity.getWeight())){
                entity.setCount(entity.getCount() - 1);
                if(entity.getCount() == 0) removeAwardbyId(entity.getId());
                return entity;
            }  
        }
        return null;
    }

    private boolean requestAward(int weight){
        Random random = new Random();
        int num = random.nextInt(101);
        if (num <= weight) return true;
        return false;
    }
    
}
