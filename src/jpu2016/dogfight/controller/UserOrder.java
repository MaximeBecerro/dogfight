package jpu2016.dogfight.controller;

// TODO: Auto-generated Javadoc
/**
 * The Class UserOrder.
 */
public class UserOrder implements IUserOrder{
	
	/** The player. */
	private int player;
	private Order order;
	
	/**
	 * Instantiates a new user order.
	 *
	 * @param player the player
	 * @param order the order
	 */
	public UserOrder(int player, Order order) {
		setOrder(order);
	}
	


	public Order getOrder() {
		return order;
	}


	private void setOrder(Order order) {
		this.order = order;
	}


	public int getPlayer() {
		return player;
	}


	private void setPlayer(int player) {
		this.player = player;
	}

}
