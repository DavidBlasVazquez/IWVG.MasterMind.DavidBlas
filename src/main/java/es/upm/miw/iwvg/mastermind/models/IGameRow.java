package es.upm.miw.iwvg.mastermind.models;

public interface IGameRow {
	public void valueCombination ();
	public boolean isMatch();
	public int getDead();
	public int getWounded();
}
