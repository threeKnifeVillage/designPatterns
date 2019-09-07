
public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private int rating;
	private int ratingCount;
	
	public PersonBeanImpl(String name, String gender, int rating) {
		this.name = name;
		this.gender = gender;
		this.rating = rating;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public String getHotOrNotRating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		// TODO Auto-generated method stub
		this.rating = rating;
	}
}
