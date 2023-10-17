package controller;

import common.Algorithm;
import view.Menu;

public class ShapeController extends Menu<String> {

    static String[] options = {"Circle", "Triangle", "Rectangle", "Exit"};
    Algorithm algorithm;

    public ShapeController() {
        super("===== CALCULATOR SHAPE PROGRAM =====", options);
        algorithm = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.displayCircle();
                break;
            case 2:
                algorithm.displayTriangle();
                break;
            case 3 :
                algorithm.displayRectangle();
                break;
            case 4 :
                System.exit(0);
                break;
        }
    }
}
