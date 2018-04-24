package jpu2016.dogfight.model;

import java.awt.Dimension;

// TODO: Auto-generated Javadoc
/**
 * The Interface IDogfightModel.
 */
public interface IDogfightModel {
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public IArea getArea();
	
	/**
	 * Builds the area.
	 *
	 * @param dimension the dimension
	 */
	public void buildArea(Dimension dimension);
	
	/**
	 * Adds the mobile.
	 *
	 * @param Mobile the mobile
	 */
	public void addMobile(IMobile Mobile);
 
	/**
	 * Removes the mobile.
	 *
	 * @param Mobile the mobile
	 */
	public void removeMobile(IMobil Mobile);
	
	/**
	 * Gets the i mobile.
	 *
	 * @return the i mobile
	 */
	public ArrayList<IMobile> getIMobile();
	
	/**
	 * Gets the i mobile by player.
	 *
	 * @param player the player
	 * @return the i mobile by player
	 */
	public IMobile getIMobileByPlayer(int player);
	
	/**
	 * Sets the mobiles haves moved.
	 */
	public void setMobilesHavesMoved();
	 
}
