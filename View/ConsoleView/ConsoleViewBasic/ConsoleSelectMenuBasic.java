package View.ConsoleView.ConsoleViewBasic;

import View.ConsoleView.Interfaces.ConsoleSelectMenu;
import Controller.Interfaces.Controller;


public class ConsoleSelectMenuBasic implements ConsoleSelectMenu{
 
    Controller controller;

    public ConsoleSelectMenuBasic(Controller controller){
        this.controller = controller;
    }


    @Override
    public void runSelectMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runSelectMenu'");
    }
    
}
