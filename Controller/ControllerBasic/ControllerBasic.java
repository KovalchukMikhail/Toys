package Controller.ControllerBasic;

import Controller.Interfaces.Controller;
import Model.Infrastructure.Interfaces.Infrastructure;

public class ControllerBasic implements Controller{
    Infrastructure infrastructure;

    public ControllerBasic(Infrastructure infrastructure){
        this.infrastructure = infrastructure;
    }
}
