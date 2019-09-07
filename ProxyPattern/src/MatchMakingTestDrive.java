import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
	
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	private void drive() {
		PersonBean proxy = getProxy(new PersonBeanImpl("wanglei", "male", 100), "dynamic");
		System.out.print(proxy.getName());
	}

	private PersonBean getProxy(PersonBean personBean, String type) {
		// TODO Auto-generated method stub
		if (type.equals("static")) {
			return new StaticProxy(personBean);
		} else if (type.equals("dynamic")) {
			return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader()
					, personBean.getClass().getInterfaces(), new OwnerInvationHandler(personBean));
		}
		
		return null;
	}
	
	
}
