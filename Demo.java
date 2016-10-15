
package cn.cost;

import java.text.DateFormat.Field;

public class Demo {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.cost.Student");
		Field[] field = c.getFields();
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	}
}
