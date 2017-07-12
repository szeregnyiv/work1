package hu.neuron.java.intern.runtimeanalyzer;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

public class MethodsOperations {
	public static Long[] setMethodFromJsonFile() {

		JsonReader jsonr = new JsonReader();
		List implementsList = jsonr.getList("implementsList");
		List methodsList = jsonr.getList("methodsList");
		List parametersList = jsonr.getList("parametersList");
		Long[] times = selectMethodByParameters(methodsList, parametersList, implementsList);
		return times;
	}

	public static Long[] selectMethodByParameters(List methodsList, List parametersList, List implementsList) {
		Long[] time = new Long[(methodsList.size() * implementsList.size())];
		int index = 0;
		Method method = null;
		for (Object object : implementsList) {

			for (int i = 0; i < methodsList.size(); i++) {
				Class<?> params = null;
				Class<?> params2 = null;
				try {

					Class<?> clazz = Class.forName(object.toString());
					Object c;
					c = clazz.newInstance();

					if (parametersList.get(i).toString().equals("Object")) {
						params = Object.class;
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString(), params);
						time[index] = timeKeeper.methodTimeKeeper(method, params, c);
					} else if (parametersList.get(i).toString().equals("int")) {
						params = int.class;
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString(), params);
						time[index] = timeKeeper.methodTimeKeeper(method, params, c);
					} else if (parametersList.get(i).toString().equals("null")) {
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString());
						time[index] = timeKeeper.methodTimeKeeper(method, c);
					} else if (parametersList.get(i).toString().equals("intObject")) {
						params = int.class;
						params2 = Object.class;
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString(), params,
								params2);
						time[index] = timeKeeper.methodTimeKeeper(method, params, params2, c);
					} else if (parametersList.get(i).toString().equals("intint")) {
						params = int.class;
						params2 = int.class;
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString(), params,
								params2);
						time[index] = timeKeeper.methodTimeKeeper(method, params, params2, c);
					} else if (parametersList.get(i).toString().equals("Collection")) {
						params = Collection.class;
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString(), params);
						time[index] = timeKeeper.methodTimeKeeper(method, params, c);
					} else if (parametersList.get(i).toString().equals("intCollection")) {
						params = int.class;
						params2 = Collection.class;
						method = Class.forName(object.toString()).getMethod(methodsList.get(i).toString(), params,
								params2);
						time[index] = timeKeeper.methodTimeKeeper(method, params, params2, c);
					}

				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (NullPointerException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

				index++;
			}
		}
		return time;
	}

}
