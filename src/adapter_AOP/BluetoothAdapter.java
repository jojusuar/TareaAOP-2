package adapter_AOP;

public class BluetoothAdapter extends ElectronicDevice {
	private BluetoothDevice device;
	
	public BluetoothAdapter(BluetoothDevice device) {
		this.device = device;
	}
	
	public BluetoothDevice getDevice() {
		return device;
	}

	public void setDevice(BluetoothDevice device) {
		this.device = device;
	}

	public void plugIntoJack() {}

}
