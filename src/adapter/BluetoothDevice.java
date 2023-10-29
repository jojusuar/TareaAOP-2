package adapter;

public class BluetoothDevice extends ElectronicDevice implements HumanInterfaceDevice{
	private String version;
	
	public BluetoothDevice() {
		this.macAddress = "00:00:00:00:00:00";
		this.version = "unknown";
	}
	
	public BluetoothDevice(String macAddress, String version) {
		this.macAddress = macAddress;
		this.version = version;
	}

	@Override
	public void recieveData() {
		System.out.println("Data recieved using Bluetooth protocol ver. "+version);
	}

	@Override
	public void sendData() {
		System.out.println("Data sent using Bluetooth protocol ver. "+version);
		
	}
	
	public void pairDevice(ElectronicDevice device) {
		System.out.println("Successfully paired device MAC "+this.macAddress+" with device MAC "+device.macAddress);
	}
	
	
}
