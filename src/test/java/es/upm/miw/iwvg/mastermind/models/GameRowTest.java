package es.upm.miw.iwvg.mastermind.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GameRowTest {

	public List<Color> createListFromStringColors(String stringOfcolors) {
		List<Color> combination = new ArrayList<>();
		for (int i = 0; i< stringOfcolors.length(); i++) {
		    char letter = stringOfcolors.charAt(i);
		    combination.add(Color.factory(String.valueOf(letter)));
		}
		return combination;
    }
	
	@Test
	public void allDeadTest() {
		List<Color> combination = createListFromStringColors("AAAA");
		List<Color> secret = createListFromStringColors("AAAA");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(4, gameRow.getDead());
		assertEquals(0, gameRow.getWounded());
	}

	@Test
	public void allWoundedTest() {
		List<Color> combination = createListFromStringColors("ARZV");
		List<Color> secret = createListFromStringColors("ZVAR");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(0, gameRow.getDead());
		assertEquals(4, gameRow.getWounded());
	}
	@Test
	public void noneTest() {
		List<Color> combination = createListFromStringColors("BBBB");
		     List<Color> secret = createListFromStringColors("NNNN");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(0, gameRow.getDead());
		assertEquals(0, gameRow.getWounded());
	}
	@Test
	public void oneDeadTest() {
		List<Color> combination = createListFromStringColors("ANNN");
		List<Color> secret = createListFromStringColors("ABBB");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(1, gameRow.getDead());
		assertEquals(0, gameRow.getWounded());
	}
	@Test
	public void oneWoundedTest() {
		List<Color> combination = createListFromStringColors("ANNN");
		List<Color> secret = createListFromStringColors("BBBA");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(0, gameRow.getDead());
		assertEquals(1, gameRow.getWounded());
	}
	@Test
	public void falseWoundedTest() {
		List<Color> combination = createListFromStringColors("BBBA");
		     List<Color> secret = createListFromStringColors("ANNA");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(1, gameRow.getDead());
		assertEquals(0, gameRow.getWounded());
	}

	@Test
	public void reverseFalseWoundedTest() {
		List<Color> combination = createListFromStringColors("ABBB");
		     List<Color> secret = createListFromStringColors("ANNA");
		GameRow gameRow = new GameRow(combination, secret); 
		assertEquals(1, gameRow.getDead());
		assertEquals(0, gameRow.getWounded());
	}
}
