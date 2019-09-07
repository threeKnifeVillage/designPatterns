import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvationHandler implements InvocationHandler {
	private PersonBean personBean;
	
	public OwnerInvationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return method.invoke(personBean, args);
	}
}
