

public class DeliveredState implements StickerState {

	@Override
	public void next(sticker st) {
		// TODO Auto-generated method stub
	     st.setState(new ReceivedState());
		
	}

	@Override
	public void prev(sticker st) {
		// TODO Auto-generated method stub
		st.setState(new OrderedState());
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("Package delivered but not received yet.");
		
	}

}
