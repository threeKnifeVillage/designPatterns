
public class StaticProxy implements PersonBean {
	PersonBean mPersonBean;
	
	public StaticProxy(PersonBean personBean) {
		mPersonBean = personBean;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return mPersonBean.getName();
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return mPersonBean.getGender();
	}

	@Override
	public String getHotOrNotRating() {
		// TODO Auto-generated method stub
		return mPersonBean.getHotOrNotRating();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		mPersonBean.setName(name);
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		mPersonBean.setGender(gender);
	}

	@Override
	public void setHotOrNotRating(int rating) {
		// TODO Auto-generated method stub
		mPersonBean.setHotOrNotRating(rating);
	}


}
