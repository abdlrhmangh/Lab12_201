import java.util.Arrays;

public class Interfaces {

	public static void main(String[] args) {

		City[] cities = new City[6];
		cities[0] = new City("Dammam", 40);
		cities[1] = new City("Riyadh", 42);
		cities[2] = new City("Jeddah", 30);
		cities[3] = new City("California", 34);
		cities[4] = new City("Miami", 32);
		cities[5] = new City("New York", 38);

		System.out.println("Before:\n");

		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
			//you don't need to use toString.citis[i] to call the to String method
		}
		System.out.println("\nAfter:\n");

		Arrays.sort(cities);
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}

	}

}
