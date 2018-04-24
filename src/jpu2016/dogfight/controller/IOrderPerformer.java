package jpu2016.dogfight.controller;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOrderPerformer.
 */
public interface IOrderPerformer {
	
	/**
	 * Order perform.
	 *
	 * @param userorder the userorder
	 */
	public default void orderPerform(UserOrder userorder) {}
}
