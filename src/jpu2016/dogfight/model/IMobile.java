package jpu2016.dogfight.model;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMobile.
 */
public interface IMobile {

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection();
	
	/**
	 * Sets the direction.
	 *
	 * @param Direction the new direction
	 */
	public void setDirection(direction Direction);
	
	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public Point getPosition();
	
	/**
	 * Gets the dimension.
	 *
	 * @return the dimension
	 */
	public Dimension getDimension();
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth();
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight();
	
	/**
	 * Gets the speed.
	 *
	 * @return the speed
	 */
	public int getSpeed();
	
	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public Image getImage();
	
	/**
	 * Move.
	 */
	public void move();
	
	/**
	 * Place in area.
	 *
	 * @param area the area
	 */
	public void placeInArea(IArea area);
	
	/**
	 * Checks if is player.
	 *
	 * @param player the player
	 * @return true, if is player
	 */
	public boolean isPlayer(int player);
	
	/**
	 * Sets the dogfight model.
	 *
	 * @param dogfightModel the new dogfight model
	 */
	public void setDogfightModel(DogfightModel dogfightModel);
	
	/**
	 * Hit.
	 *
	 * @return true, if successful
	 */
	public boolean hit();
	
	/**
	 * Checks if is weapon.
	 *
	 * @return true, if is weapon
	 */
	public boolean isWeapon();
	
	
}
