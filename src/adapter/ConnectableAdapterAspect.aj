package adapter;
public class ConnectableAdapterAspect extends AuxCable{
	private BluetoothDevice blue;
	public ConnectableAdapterAspect(BluetoothDevice blue) {
        this.blue = blue;
    }
    public void Conectar() {
        System.out.println("Conectado mediante adaptador Bluetooth-Connectable");
    }
}