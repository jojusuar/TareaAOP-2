package adapter;
public aspect ConnectableAdapterAspect {
	declare parents: BluetoothDevice implements Conectable;
    public void Conectable.Conectar() {
        System.out.println("Conectado mediante adaptador Bluetooth-Connectable");
    }
}