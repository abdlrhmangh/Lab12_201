
public class City implements Comparable<City> {
	private String cityName;
	private int temperature;

	City(String cityName, int temp) {
		this.cityName = cityName;
		this.temperature = temp;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String newCityName) {
		this.cityName = newCityName;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int newTemperature) {
		this.temperature = newTemperature;
	}

	public String toString() {
		return getCityName() + " " + getTemperature();
	}

	@Override
	public int compareTo(City o) {
		//you can change the order by changing the if-statement arguments
		if (this.getTemperature() < o.getTemperature()) {
			return -1;
		} else if (this.getTemperature() > o.getTemperature()) {
			return 1;
		} else
			return 0;
	}
}
