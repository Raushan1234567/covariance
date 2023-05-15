package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class Main {
public static void main(String[] args) {
	List <Player> Playerlist=new ArrayList<>();
	Playerlist.add(new Player(23, 56.75f, "ABC"));
	Playerlist.add(new Player(24, 60.75f, "BCD"));
	Playerlist.add(new Player(32, 62.75f, "CDE"));
	Playerlist.add(new Player(21, 51.75f, "DEF"));
	Playerlist.add(new Player(35, 72.75f, "EFG"));
	Playerlist.add(new Player(38, 74.75f, "FGH"));
	Playerlist.add(new Player(39, 65.25f, "GHI"));
	Playerlist.add(new Player(42, 74.42f, "HIJ"));
	Playerlist.add(new Player(18, 55.56f, "IJK"));
	Playerlist.add(new Player(18, 55.56f, "IJK"));
	
	Predicate<Float> c= j-> {
		if(j < 50.00f){
			return true;
		}
		return false;
	};
	
	Predicate<Integer> findage= k-> {
		if(k >= 18 && k <= 60){
			return false;
		}
		return true;
	};
  System.out.println(Playerlist.stream().map(b -> b.getWeight()).anyMatch(c)?"One or more player is underweight":"All players are fit");
    
  System.out.println(Playerlist.stream().mapToDouble(Player::getWeight).average());
  
  System.out.println(Playerlist.stream().mapToInt(Player::getAge).reduce(0,Integer::sum));
  
  System.out.println(Playerlist.stream().sorted((p,q)-> p.getWeight()>q.getWeight()?-1:1).skip(2).limit(4).toList());
  
  System.out.println(Playerlist.stream().map(w -> w.getAge()).anyMatch(findage)?"Team contains kids or old":"Team contains young and middle aged");
}
}
