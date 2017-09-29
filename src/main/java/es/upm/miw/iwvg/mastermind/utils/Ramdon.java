package es.upm.miw.iwvg.mastermind.utils;

public class Ramdon {
    public static int getRamdonNumber(int cardinal) {
    	return (int) Math.floor(Math.random()*(cardinal - 1)+1);
    }
    
}
