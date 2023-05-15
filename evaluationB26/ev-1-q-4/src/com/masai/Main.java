package com.masai;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        // Create a list of players
    	
    	PlayerCreator  s=Player::new;
		Player st=s.createPlayer(23, 56.75f, "ABC");
    	
		  
        PlayerToString ps = st::toString;
        System.out.println(ps.playerToString());
		//Part-----3
        List<Player> pl = new ArrayList<>();
        PlayerCreator playerCreator = Player::new;
        pl.add(playerCreator.createPlayer(23, 56.75f, "ABC"));
        pl.add(playerCreator.createPlayer(24, 60.75f, "BCD"));
        pl.add(playerCreator.createPlayer(32, 62.75f, "CDE"));
        pl.add(playerCreator.createPlayer(21, 51.75f, "DEF"));
        pl.add(playerCreator.createPlayer(35, 72.75f, "EFG"));
        pl.add(playerCreator.createPlayer(38, 74.75f, "FGH"));
        pl.add(playerCreator.createPlayer(39, 65.25f, "GHI"));
        pl.add(playerCreator.createPlayer(42, 74.42f, "HIJ"));
        pl.add(playerCreator.createPlayer(18, 55.56f, "IJK"));
        pl.add(playerCreator.createPlayer(56, 49.25f, "JKL"));

      

       
        PlayerWeightGetter playerWeightGetter = PlayerOperation::getPlayerWithMaximumWeight;
        double maxWeight = playerWeightGetter.getMaxWeight(pl);
        System.out.println("Maximum weight: " + maxWeight);

       System.out.println();
       System.out.println("part-4");
       System.out.println();
        PlayerHashCode playerHashCode = Player::hashCode;
        for (Player player : pl) {
            int hashCode = playerHashCode.getPlayerHashCode(player);
            System.out.println( hashCode);
        }
    }
}
