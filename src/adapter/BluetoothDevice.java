package adapter;

public class BluetoothDevice implements HumanInterfaceDevice{
	@Override
	public void sendData() {
		System.out.println("Enviando Audio");
	}
	@Override
	public void recieveData() {
		System.out.println("Recibiendo Audio");
	}
}
