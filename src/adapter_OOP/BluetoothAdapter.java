package adapter_OOP;

public class BluetoothAdapter extends ElectronicDevice implements Connectable{
	private BluetoothDevice device;
	
	public BluetoothAdapter(BluetoothDevice device) {
		this.device = device;
	}

	@Override
	public void plugIntoJack() {
		device.pairDevice(this);
		System.out.println("Successfully converted a digital signal into an analog one!");
		System.out.println("Bluetooth adapter successfully plugged into jack!");
	}

}
