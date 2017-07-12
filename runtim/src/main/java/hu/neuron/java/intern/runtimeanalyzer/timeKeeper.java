package hu.neuron.java.intern.runtimeanalyzer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class timeKeeper {
	public static Long methodTimeKeeper(Method metodh, Class<?> params, Class<?> params2, Object c) {

		JsonReader jsonr = new JsonReader();
		int size = Integer.parseInt(jsonr.elementSize());
		int tomb[] = new int[size];

		long kezesiIdo, befejezesiIdo;
		long time = 0L;
		for (int i = 0; i < tomb.length; i++) {

			try {
				kezesiIdo = System.nanoTime();
				metodh.invoke(c, params, params2);
				befejezesiIdo = System.nanoTime();
				time += (befejezesiIdo - kezesiIdo);
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return time;

	}

	public static Long methodTimeKeeper(Method metodh, Class<?> params, Object c) {

		JsonReader jsonr = new JsonReader();
		int size = Integer.parseInt(jsonr.elementSize());
		int tomb[] = new int[size];

		long kezesiIdo, befejezesiIdo;
		long time = 0L;
		for (int i = 0; i < tomb.length; i++) {

			try {
				kezesiIdo = System.nanoTime();
				metodh.invoke(c, params);
				befejezesiIdo = System.nanoTime();
				time += (befejezesiIdo - kezesiIdo);
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return time;

	}

	public static Long methodTimeKeeper(Method metodh, Object c) {

		JsonReader jsonr = new JsonReader();
		int size = Integer.parseInt(jsonr.elementSize());
		int tomb[] = new int[size];
		long kezesiIdo, befejezesiIdo;
		long time = 0L;
		for (int i = 0; i < tomb.length; i++) {

			try {
				kezesiIdo = System.nanoTime();
				metodh.invoke(c);
				befejezesiIdo = System.nanoTime();
				time += (befejezesiIdo - kezesiIdo);
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return time;

	}
}
