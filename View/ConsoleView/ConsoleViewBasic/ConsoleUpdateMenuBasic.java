package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleUpdateMenu;
import Controller.Interfaces.Controller;


public class ConsoleUpdateMenuBasic implements ConsoleUpdateMenu{

    Controller controller;

    public ConsoleUpdateMenuBasic(Controller controller){
        this.controller = controller;
    }

    @Override
    public void runUpdateMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runUpdateMenu'");
    }
    
}
