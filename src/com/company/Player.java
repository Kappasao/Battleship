package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private int number;
    private ArrayList<Ship> fleet = new ArrayList<>();

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", fleet=" + fleet +
                '}';
    }

    public Player(String name, int i) {
        this.name = name;
        this.number = i;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ship> getFleet() { return fleet; }

    //    Pregunta las coordenadas
    public Point askCoordinates() {
        //TODO solicitar las cordenadas (x,y) y crear/devolver un punto con (x,y).
        return point;
    }

    //    Construir el barco
    public Ship buildShip() {
        while (true) {
            try {
                GamePrinter.printIntroduceShipName();
                String n = scanner.nextLine();
                GamePrinter.printIntroduceShipSource();
                Point p = askCoordinates();
                GamePrinter.printIntroduceShipSize();
                int s = scanner.nextInt();
                scanner.nextLine();
                GamePrinter.printIntroduceShipOrientation();
                int o = scanner.nextInt();
                scanner.nextLine();

                Orientation orientation = Orientation.values()[o - 1];

                //TODO construir un barco con el constructor de la clase Ship y
                // los valores que hemos obtenido del usuario.


                return ship;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    //    Construir la flota (5 barcos)
    public void buildFleet() {
        //TODO construir 5 barcos con un bucle for y con la ayuda del metodo buildShip.
        //Añadir los 5 barcos a fleet (flota).
    }

    //    Devuelve cierto si el ataque ha dado al blanco
    public boolean verifyAttack(Point p) {
        for (Ship ship : fleet) {
           //TODO llamar al metodo verifyAttack del barco actual (ship).
        }
        System.out.println("Agua...");
        return false;
    }

    //    Devuelve cierto si la flota ha sido hundida
    public boolean sunkenFleet() {
        for (Ship ships : fleet) {
            if (!ships.isSunken()) {
                return false;
            }
        }
        return true;
    }

}

