package adapter;

public class AuxCable implements Connectable{
	private boolean stereo;
	private float length;
	
	public AuxCable () {}
	
	public AuxCable(boolean stereo, float length) {
		this.stereo = stereo;
		this.length = length;
	}

	@Override
	public void plugIntoJack() {
		System.out.println("Aux cable successfully plugged into jack!");
	}
	
	
}
