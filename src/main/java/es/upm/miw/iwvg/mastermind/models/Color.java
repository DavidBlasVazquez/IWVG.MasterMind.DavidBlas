package es.upm.miw.iwvg.mastermind.models;

public enum Color {
    A("A"),
    R("R"),
    V("V"),
    Z("Z"),
    B("B"),
    N("N");
	
	public static int length () {
	    return Color.values().length;
	}
	
    public static Color factory (String letter)  {
    	switch (letter.toUpperCase()) {
    	    case "A" : return Color.A;
    	    case "R" : return Color.R;
    	    case "V" : return Color.V;
    	    case "Z" : return Color.Z;
    	    case "B" : return Color.B;
    	    case "N" : return Color.N;
    	}
		return null;   	
    }
    
    private final String text;    
      
    Color (String text) {
    	this.text = text; 
    }
    
    public String toString() {
    	return this.text;
    }
}
