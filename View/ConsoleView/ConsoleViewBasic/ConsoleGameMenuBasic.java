package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleGameMenu;
import Controller.Interfaces.Controller;


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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runGameMenu'");
    }
    
}
