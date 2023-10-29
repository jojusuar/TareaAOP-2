package modelos;
import adapter.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Orientación a aspectos");
		AuxCable auxCable = new AuxCable();
        BluetoothDevice bluetoothDevice = new BluetoothDevice();

        System.out.println("Conexión a través del cable auxiliar:");
        auxCable.Conectar();

        System.out.println("\n\nConexión a través del adaptador Bluetooth:");
        Conectable adapter = (Conectable) bluetoothDevice;
        adapter.Conectar();
	}

}
