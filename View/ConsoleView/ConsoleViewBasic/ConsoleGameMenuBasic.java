package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleGameMenu;
import Controller.Interfaces.Controller;


public class ConsoleGameMenuBasic implements ConsoleGameMenu{  
   
    Controller controller;

    public ConsoleGameMenuBasic(Controller controller){
        this.controller = controller;
    }


    @Override
    public void runGameMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runGameMenu'");
    }
    
}
