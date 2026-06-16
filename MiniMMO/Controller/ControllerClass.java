package praktik.MiniMMO.Controller;

import praktik.MiniMMO.Model.*;
import praktik.MiniMMO.View.*;

public class ControllerClass {


    public static void main(String[] args)
    {
        Charakter chark = new  Charakter();
        System.out.println(chark.getName());

        new MMOFrame();
    }
}
