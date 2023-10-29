package singleton_AOP;
import java.util.HashMap;

public aspect SingletonProtocol {
	private HashMap<Class<?>, Object> singletons;
	public interface Singleton {};
	
	declare parents: GradesRepository implements Singleton;
	
	pointcut ConstructorCall(): call(Singleton.new());
	Class<?> around():ConstructorCall(){
		Class<?> singletonClass = thisJoinPoint.getSignature().getDeclaringType();
		Object singletonObject = this.singletons.get(singletonClass);
		if (singletonObject == null) {
			singletonObject = proceed();
			this.singletons.put(singletonClass, singletonObject);
		}
		return (Class<?>) singletonObject;
	}
}
