package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleRemoveMenu;
import Controller.Interfaces.Controller;


public class ConsoleRemoveMenuBasic implements ConsoleRemoveMenu{
  
    Controller controller;

    public ConsoleRemoveMenuBasic(Controller controller){
        this.controller = controller;
    }


    @Override
    public void rumRemoveMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rumRemoveMenu'");
    }
    
}
