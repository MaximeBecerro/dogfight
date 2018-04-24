package jpu2016.dogfight.model;


import java.awt.Dimension;

public interface IDogfightModel {
	
	public IArea getArea();
	
	public void buildArea(Dimension dimension);
	
	public void addMobile(IMobile Mobile);
 
	public void removeMobile(IMobil Mobile);
	
	public ArrayList<IMobile> getIMobile();
	
	public IMobile getIMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
	 
}
