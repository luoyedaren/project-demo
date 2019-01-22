package lang.innerclass;

import lombok.Data;

import java.util.List;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/12 0012. - 星期六
 * nickName louyedaren
 */
@Data
public class Bus {

	private List<String> sitNumber;
	private String name;


	@Data
	public static class Passenger {
		private String name;
		private int number;
		public void test(){
			name = this.name;
		}
	}

	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.setName("test");
		System.out.println(passenger);
		System.out.println(new Bus());
	}

}
