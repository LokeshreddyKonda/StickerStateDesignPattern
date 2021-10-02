

public class ReceivedState implements StickerState {

	@Override
	public void next(sticker st) {
		// TODO Auto-generated method stub
		 System.out.println("This package is already received");
		
	}

	@Override
	public void prev(sticker st) {
		// TODO Auto-generated method stub
		st.setState(new DeliveredState());
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}

	

	

}
