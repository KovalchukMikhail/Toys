package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleUpdateMenu;
import Controller.Interfaces.Controller;
import Model.Entities.AbstractClasses.Entity;
import Model.Entities.Toys.Toy;


public class ConsoleUpdateMenuBasic implements ConsoleUpdateMenu{

    Controller controller;
    Utilities util;
    TextMenu menu;

    public ConsoleUpdateMenuBasic(Controller controller, Utilities util, TextMenu menu){
        this.controller = controller;
        this.util = util;
        this.menu = menu;
    }

    @Override
    public void runUpdateMenu() {
        Toy toy = getToy();
        if (toy == null) return;
        util.showText(toy.getData());
        String name = toy.getName();
        int count = toy.getCount();
        int weight = toy.getWeight();
        while (true) {
            util.showText(menu.updateMenu);
            int answer = util.inputInt();
            switch (answer) {
                case 1:
                    util.showText(menu.requestData);
                    name = util.inputString();
                    break;
                case 2:
                    util.showText(menu.requestData);
                    answer = util.inputInt();
                    if (answer < 0) util.showText(menu.errorText);
                    else count = answer;
                    break;
                case 3:
                    util.showText(menu.requestData);
                    answer = util.inputInt();
                    if (answer < 0 || answer > 100) util.showText(menu.errorText);
                    else weight = answer;
                break;
                case 4:
                    util.showText(menu.previewText);
                    util.preview(name, count, weight);
                    if(util.checkMenu()){
                        String data = Integer.toString(toy.getId()) + ":" + name + ":" + Integer.toString(count) + ":" + Integer.toString(weight);
                        controller.updateEntity(data);
                    }
                    break;
                case 0:
                    return;
                default:
                    util.showText(menu.errorText);
                    break;
            }
        }
    }
    

    public Toy getToy(){
        Entity entity;
        Toy toy;
        while (true) {
            util.showText(menu.requestId);
            int id = util.inputInt();
            if(id == 0) return null;
            else if(id > 0){
                entity = controller.getEntityById(id);
                if (entity != null){
                    try {
                        toy = (Toy) entity;
                        return toy;
                    } catch (Exception e) {
                        util.showText(menu.notFound);
                    }
                }
                else util.showText(menu.notFound);
            }
            else util.showText(menu.errorText);
        }
    }
}
