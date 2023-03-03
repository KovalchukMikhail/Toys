package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleGameMenu;
import Controller.Interfaces.Controller;
import Model.Entities.AbstractClasses.Entity;


public class ConsoleGameMenuBasic implements ConsoleGameMenu{  
   
    Controller controller;
    Utilities util;
    TextMenu menu;

    public ConsoleGameMenuBasic(Controller controller, Utilities util, TextMenu menu){
        this.controller = controller;
        this.util = util;
        this.menu = menu;
    }


    @Override
    public void runGameMenu() {
        while (true) {
            util.showText(menu.gameMenu);
            int answer = util.inputInt();
            switch (answer) {
                case 1:
                    if(controller.requestGame()){
                        Entity entity = controller.runGame();
                        if(entity == null) util.showText(menu.loserText);
                        else{
                            util.showText(menu.winText);
                            util.showText(entity.getName() + "\n");
                            util.showText(menu.requestToContinue);
                            util.inputString();
                        }
                    }
                    util.showText(menu.thereIsNoAward);
                    break;
                case 2:
                    gameMenu.runGameMenu();
                    break;
                case 3:
                    addMenu.runAddMenu();
                    break;
                case 4:
                    selectMenu.runSelectMenu();
                    break;
                case 5:
                    updateMenu.runUpdateMenu();
                    break;
                case 6:
                    removeMenu.runRemoveMenu();
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
