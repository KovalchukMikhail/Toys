package View.ConsoleView.ConsoleViewBasic;

import Controller.Interfaces.Controller;
import View.ConsoleView.Interfaces.ConsoleAddMenu;


public class ConsoleAddMenuBasic implements ConsoleAddMenu{

    Controller controller;
    Utilities util;
    TextMenu menu;

    public ConsoleAddMenuBasic(Controller controller, Utilities util, TextMenu menu){
        this.controller = controller;
        this.util = util;
        this.menu = menu;
    }

    @Override
    public void runAddMenu() {
        String name = "Noname";
        int count = 0;
        int weight = 0;
        while (true) {
            util.showText(menu.addMenu);
            int answer = util.inputInt();
            switch (answer) {
                case 1:
                    util.showText(menu.requestData);
                    name = util.inputString();
                    break;
                case 2:
                    util.showText(menu.requestData);
                    answer = util.inputInt();
                    if (answer < 0) util.showText(menu.errorText);
                    else count = answer;
                    break;
                case 3:
                    util.showText(menu.requestData);
                    answer = util.inputInt();
                    if (answer < 0 || answer > 100) util.showText(menu.errorText);
                    else weight = answer;
                break;
                case 4:
                    util.showText(menu.previewText);
                    util.preview(name, count, weight);
                    if(util.checkMenu()){
                        String data = name + ":" + Integer.toString(count) + ":" + Integer.toString(weight);
                        controller.addEntity(data);
                    }
                    break;
                case 0:
                    return;
                default:
                    util.showText(menu.errorText);
                    break;
            }
        }
    }
    
}
