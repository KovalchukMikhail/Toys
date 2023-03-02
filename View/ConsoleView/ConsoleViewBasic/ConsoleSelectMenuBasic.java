package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleSelectMenu;
import Controller.Interfaces.Controller;


public class ConsoleSelectMenuBasic implements ConsoleSelectMenu{
 
    Controller controller;
    Utilities util;
    TextMenu menu;

    public ConsoleSelectMenuBasic(Controller controller, Utilities util, TextMenu menu){
        this.controller = controller;
        this.util = util;
        this.menu = menu;
    }


    @Override
    public void runSelectMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runSelectMenu'");
    }
    
}
