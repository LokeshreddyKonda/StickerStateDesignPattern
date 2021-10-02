

public class sticker {
	
	private StickerState state = new OrderedState();

    // getter, setter

    public StickerState getState() {
		return state;
	}

	public void setState(StickerState state) {
		this.state = state;
	}

	public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

	
}
