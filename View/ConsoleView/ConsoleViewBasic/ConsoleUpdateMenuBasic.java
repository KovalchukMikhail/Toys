package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleUpdateMenu;
import Controller.Interfaces.Controller;


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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runUpdateMenu'");
    }
    
}
