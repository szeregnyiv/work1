package hu.neuron.java.intern.runtimeanalyzer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class timeKeeper {
	public static Long timeKeeper(Method metodh, Class<?> params,Class<?> params2, Object c) {

		JsonReader jsonr = new JsonReader();
		int size = Integer.parseInt(jsonr.elementSize());
		int tomb[] = new int[size];
		Long time = (long) 20455225;
		
		long kezesiIdo = System.nanoTime();
		for (int i = 0; i < tomb.length; i++) {

			try {
				
				metodh.invoke(c, params, params2);
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
		
		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

		return time;

	}

	public static Long timeKeeper(Method metodh, Class<?> params, Object c) {

		JsonReader jsonr = new JsonReader();
		int size = Integer.parseInt(jsonr.elementSize());
		int tomb[] = new int[size];
		Long time = (long) 20455225;
		
		long kezesiIdo = System.nanoTime();
		for (int i = 0; i < tomb.length; i++) {

			try {
				
				metodh.invoke(c, params);
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
		
		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

		return time;

	}
	public static Long timeKeeper(Method metodh,  Object c) {

		JsonReader jsonr = new JsonReader();
		int size = Integer.parseInt(jsonr.elementSize());
		int tomb[] = new int[size];
		Long time = (long) 20455225;
		
		long kezesiIdo = System.nanoTime();
		for (int i = 0; i < tomb.length; i++) {

			try {
				
				metodh.invoke(c);
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
		
		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

		return time;

	}
}
