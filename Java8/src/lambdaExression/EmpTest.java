package lambdaExression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpTest {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.addAll(Arrays.asList(new Employee("amol", 101), new Employee("xyz", 102), new Employee("abc", 103),
				new Employee("pqr", 105)

		));
		System.out.println(list);

	}

}
