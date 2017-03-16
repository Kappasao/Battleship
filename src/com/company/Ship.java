package com.company;

import java.util.*;

public class Ship {

    private String name;
    private List<Point> points = new ArrayList<>();
    private List<Boolean> hits = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Ship(String name, Point source, int size, Orientation orientation) {
        this.name = name;

        //TODO inicializar hits, todos a falso. El tamaño del ArrayList hits ha de ser el mismo que el de points.

//        Añadir los puntos del barco dependiendo de la orientación que tengan
//        Inicializa los valores de los puntos en false
        if (orientation == Orientation.NORTE) {
            if (source.getY() + size >= GameRunner.MAX) {
                throw new RuntimeException(GamePrinter.printErrorTable());
            }

            if (size > 5) {
                throw new RuntimeException(GamePrinter.printErrorSize());
            }

            for (int i = 0; i < size; i++) {
                Point p = new Point(source.getX(), source.getY() + i);
                points.add(p);
            }
        } else if (orientation == Orientation.SUD) {
            // TODO gestionar caso sud
        } else if (orientation == Orientation.ESTE) {
            //TODO gestionar caso este
        } else if (orientation == Orientation.OESTE) {
            //TODO gestionar caso oeste
        }

    }

    public boolean isSunken() {

        //TODO devolver cierto si el barco está hundido.
    }

    public boolean recieveAttack(Point p) {
        //TODO actualizar hits en el caso de que el punto p pertenezca al ArrayList Points.
        //Devolver true en el caso de que el punto p pertenezca al ArrayList Points
    }

    @Override
    public String toString() {
       //TODO implementar el to String
    }
}
