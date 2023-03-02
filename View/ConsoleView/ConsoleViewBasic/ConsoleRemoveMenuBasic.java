package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleRemoveMenu;
import Controller.Interfaces.Controller;


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
    public void rumRemoveMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rumRemoveMenu'");
    }
    
}
