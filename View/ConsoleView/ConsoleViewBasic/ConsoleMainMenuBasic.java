package View.ConsoleView.ConsoleViewBasic;

import java.util.List;

import Controller.Interfaces.Controller;
import Model.Entities.AbstractClasses.Entity;
import View.ConsoleView.Interfaces.ConsoleAddMenu;
import View.ConsoleView.Interfaces.ConsoleGameMenu;
import View.ConsoleView.Interfaces.ConsoleMainMenu;
import View.ConsoleView.Interfaces.ConsoleRemoveMenu;
import View.ConsoleView.Interfaces.ConsoleSelectMenu;
import View.ConsoleView.Interfaces.ConsoleUpdateMenu;


public class ConsoleMainMenuBasic implements ConsoleMainMenu{
    Controller controller;
    ConsoleAddMenu addMenu;
    ConsoleGameMenu gameMenu;
    ConsoleRemoveMenu removeMenu;
    ConsoleUpdateMenu updateMenu;
    ConsoleSelectMenu selectMenu;
    Utilities util;
    TextMenu menu;
    


    public ConsoleMainMenuBasic(Controller controller){
        this.controller = controller;
        util = new Utilities();
        menu = new TextMenu();
        addMenu = new ConsoleAddMenuBasic(this.controller, util, menu);
        gameMenu = new ConsoleGameMenuBasic(this.controller, util, menu);
        removeMenu = new ConsoleRemoveMenuBasic(this.controller, util, menu);
        updateMenu = new ConsoleUpdateMenuBasic(this.controller, util, menu);
        selectMenu = new ConsoleSelectMenuBasic(this.controller, util, menu);
    }

    @Override
    public void runMainMenu() {
        while (true) {
            util.showText(menu.mainMenu);
            int answer = util.inputInt();
            switch (answer) {
                case 1:
                    showAllToys();
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

    @Override
    public void showAllToys() {
        List<Entity> entities = controller.getAllEntities();
        if(entities.size() == 0){
            util.showText(menu.notFound);
        }
        for (Entity entity : entities) {
            util.showText(entity.getData());
        }
        util.showText(menu.requestToContinue);
        util.inputString();
    }
    
}
