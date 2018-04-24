package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;

// TODO: Auto-generated Javadoc
/**
 * The Class DogfightController.
 */
public class DogfightController implements IOrderPerformer{
	
	/** The time sleep. */
	private int TIME_SLEEP = 30;
	
	/**
	 * Instantiates a new dogfight controller.
	 *
	 * @param dogfightModel the dogfight model
	 */
	DogfightController(IDogfightModel dogfightModel){
		
	}
	
	/**
	 * Play.
	 */
	public void play() {}
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.controller.IOrderPerformer#orderPerform(jpu2016.dogfight.controller.UserOrder)
	 */
	@Override
	public void orderPerform(UserOrder userorder) {}
	public void setViewSystem(IViewSystem viewSYSTEM) {}
	private void launchMissile (int player) {}
	private void gameLoop() {}
}
