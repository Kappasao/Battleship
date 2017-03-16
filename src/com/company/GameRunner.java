package com.company;

public class GameRunner {

    public static final int MAX = 20;

    private Player player1;
    private Player player2;


    public void run() {
        initPlayers();

        while (!isOver()) {
            attack(player1, player2);

            if (isOver()) {
                break;
            }

            attack(player2, player1);
        }

        getWinner();
    }

    public void initPlayers() {
//        Inicializa el jugador1 y construye su flota
        player1 = new Player(GamePrinter.readPlayerName(1), 1);
        player1.buildFleet();

//        Inicializa el jugador2 y construye su flota
        player2 = new Player(GamePrinter.readPlayerName(2), 2);
        player2.buildFleet();
    }

    //    Devuelve cierto si la partida ha acabado
    public boolean isOver() {
        if (player1.sunkenFleet() || player2.sunkenFleet()) {
            return true;
        } else {
            return false;
        }
    }

    //    Dice quien ha ganado la partida
    public void getWinner() {
        if (player2.sunkenFleet()) {
            GamePrinter.printWinner(player1, player2);
        } else if (player1.sunkenFleet()) {
            GamePrinter.printWinner(player2, player1);
        }
    }

    //    Pide coordenadas al jugador del turno y verifica si ha tocado a un barco del otro jugador
    public void attack(Player p1, Player p2) {
        GamePrinter.printTurn(p1);
        p2.verifyAttack(p1.askCoordinates());
    }

}
