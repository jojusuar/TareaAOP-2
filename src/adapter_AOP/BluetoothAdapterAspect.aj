package adapter_AOP;


public aspect BluetoothAdapterAspect {
	declare parents: (BluetoothAdapter) implements Connectable;
	
	pointcut adaptSignal(BluetoothAdapter invoker):this(invoker) && execution(void BluetoothAdapter.plugIntoJack());
	before(BluetoothAdapter invoker):adaptSignal(invoker){
		invoker.getDevice().pairDevice(invoker);
		System.out.println("Successfully converted a digital signal into an analog one!");
		System.out.println("Bluetooth adapter successfully plugged into jack!");
	}

}
