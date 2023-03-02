package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleRemoveMenu;
import Controller.Interfaces.Controller;
import Model.Entities.Entity;


public class ConsoleRemoveMenuBasic implements ConsoleRemoveMenu{
  
    Controller controller;
    Utilities util;
    TextMenu menu;

    public ConsoleRemoveMenuBasic(Controller controller, Utilities util, TextMenu menu){
        this.controller = controller;
        this.util = util;
        this.menu = menu;
    }


    @Override
    public void runRemoveMenu() {
        while (true) {
            util.showText(menu.removeMenu);
            int answer = util.inputInt();
            switch (answer) {
                case 1:
                    util.showText(menu.requestData);
                    int id = util.inputInt();
                    if(id > 0){
                        Entity entity = controller.getEntityById(id);
                        if (entity != null){
                            util.showText(entity.getData());
                            if(util.checkMenu()) controller.removeEntityById(id);
                        }
                        else util.showText(menu.notFound);
                    }
                    else util.showText(menu.errorText);
                    break;
                case 2:
                    util.showText(menu.checkMenu);
                    if(util.checkMenu()) controller.removeAllEntity();
                    break;
                case 0:
                    return;
                default:
                    util.showText(menu.errorText);
                    break;
            }
        }
    }
    
}
