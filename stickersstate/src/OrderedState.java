

public class OrderedState implements StickerState {

	@Override
	public void next(sticker st) {
		// TODO Auto-generated method stub
		
		st.setState(new DeliveredState());
		
	}

	@Override
	public void prev(sticker st) {
		// TODO Auto-generated method stub
		System.out.println("The Sticker is in its root state.");
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("Sticker ordered, not delivered yet.");
	}

}
