package com.masai;

import java.util.List;

public class PlayerOperation {
    static double getPlayerWithMaximumWeight(List<Player> playerList) {
        double maxWeight = 0.0;
        for (Player player : playerList) {
            if (player.getWeight() > maxWeight) {
                maxWeight = player.getWeight();
            }
        }
        return maxWeight;
    }
}

@FunctionalInterface
interface PlayerCreator {
    Player createPlayer(int age, float weight, String name);
}

@FunctionalInterface
interface PlayerToString {
    String playerToString();
}

@FunctionalInterface
interface PlayerWeightGetter {
    double getMaxWeight(List<Player> p);
}

@FunctionalInterface
interface PlayerHashCode {
    int getPlayerHashCode(Player p);
}








