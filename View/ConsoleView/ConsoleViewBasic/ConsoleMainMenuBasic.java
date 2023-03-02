package View.ConsoleView.ConsoleViewBasic;

import Controller.Interfaces.Controller;
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

    public ConsoleMainMenuBasic(Controller controller){
        this.controller = controller;
        addMenu = new ConsoleAddMenuBasic(controller);
        gameMenu = new ConsoleGameMenuBasic(controller);
        removeMenu = new ConsoleRemoveMenuBasic(controller);
        updateMenu = new ConsoleUpdateMenuBasic(controller);
        selectMenu = new ConsoleSelectMenuBasic(controller);
    }

    @Override
    public void runMainMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runMainMenu'");
    }

    @Override
    public void showAllToys() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAllToys'");
    }
    
}
