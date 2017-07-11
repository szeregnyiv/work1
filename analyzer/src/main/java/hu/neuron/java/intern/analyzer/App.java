package hu.neuron.java.intern.analyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import org.jfree.chart.plot.DatasetRenderingOrder;

import javax.management.AttributeList;
import javax.management.relation.RoleList;

import org.jfree.data.category.CategoryDataset;
import org.jfree.ui.RefineryUtilities;

/**
 * Hello world!
 *
 */
public class App 
{
	static long time = 0;
	static Object content= new Object();
	static List linkedList = new LinkedList();
	static List implementsList;
	static List methodsList;
	static List timesList = new LinkedList();;
	
    public static void main( String[] args )
    {
    			Scanner scanner = new Scanner(System.in);
    			
    			
    			List implementsList = new LinkedList();
    			
    			
				System.out.print("Írd be a lista méretét: ");
				int meret = scanner.nextInt();

				List linkedList = new LinkedList();
				linkedList = fvIdok(meret, linkedList);
				implementsList.add("linkedList");
				
				List arrayList = new ArrayList();
				linkedList = fvIdok(meret, arrayList);
				implementsList.add("arrayList");
				
				List attributeList = new AttributeList();
				linkedList = fvIdok(meret, attributeList);
				implementsList.add("attributeList");
				
				List roleList = new RoleList();
				linkedList = fvIdok(meret, roleList);
				implementsList.add("roleList");
				
				
				List stackList = new Stack();
				linkedList = fvIdok(meret, stackList);
				implementsList.add("stackList");
				
				TxtMaker writer= new TxtMaker();
				writer.writer(implementsList,methodsList,timesList,"Szia");
				
				final ChartMaker demo = new ChartMaker(implementsList,methodsList,timesList,"Szia"); 
				demo.pack(); 
				RefineryUtilities.centerFrameOnScreen(demo); 
				demo.setVisible(true); 
				
    }
    public static List fvIdok(int meret, List list) {
    	methodsList = new LinkedList();
    	
		fvIdoAdd(meret, list);
		
		content = "add(E) " + time;
		linkedList.add(content);
		methodsList.add("add(E) " );
		timesList.add(time);

		fvIdoAddd(meret, list);
		content = "add(int, E) " + time;
		linkedList.add(content);
		methodsList.add("add(int, E) ");
		timesList.add(time);

		fvIdoAddAll(meret, list);
		content = "addAll(Collection<? extends E>) " + time;
		linkedList.add(content);
		methodsList.add("addAll(Collection<? extends E>) ");
		timesList.add(time);

		fvIdoAdddAll(meret, list);
		content = "addAll(int, Collection<? extends E>) " + time;
		linkedList.add(content);
		methodsList.add("addAll(int, Collection<? extends E>) ");
		timesList.add(time);

		fvIdoGet(meret, list);
		content = "get(int) " + time;
		linkedList.add(content);
		methodsList.add("get(int) ");
		timesList.add(time);

		fvIdoSize(list);
		content = "size() " + time;
		linkedList.add(content);
		methodsList.add("size() ");
		timesList.add(time);

		fvIdoSet(meret, list);
		content = "set(int, E) " + time;
		linkedList.add(content);
		methodsList.add("set(int, E) ");
		timesList.add(time);

		fvIdoSubList(meret, list);
		content = "subList(int, int)  " + time;
		linkedList.add(content);
		methodsList.add("subList(int, int)  ");
		timesList.add(time);

		fvIdoEquals(meret, list);
		content = "equals(Object) " + time;
		linkedList.add(content);
		methodsList.add("equals(Object) ");
		timesList.add(time);

		fvIdoContains(meret, list);
		content = "contains(Object) " + time;
		linkedList.add(content);
		methodsList.add("contains(Object) ");
		timesList.add(time);

		fvIdoIndexOf(meret, list);
		content = "indexOf(Object) " + time;
		linkedList.add(content);
		methodsList.add("indexOf(Object) ");
		timesList.add(time);

		fvIdoLastIndexOf(meret, list);
		content = "lastIndexOf(Object) " + time;
		linkedList.add(content);
		methodsList.add("lastIndexOf(Object) ");
		timesList.add(time);

		fvIdoRemove(meret, list);
		content = "remove(int) " + time;
		linkedList.add(content);
		methodsList.add("remove(int) " );
		timesList.add(time);

		fvIdoRemovee(meret, list);
		content = "remove(Object) " + time;
		linkedList.add(content);
		methodsList.add("remove(Object) ");
		timesList.add(time);

		fvIdoRemoveAll(meret, list);
		content = "removeAll(Collection<?>) " + time;
		linkedList.add(content);
		methodsList.add("removeAll(Collection<?>) ");
		timesList.add(time);

		fvIdoRetainAll(meret, list);
		content = "retainAll(Collection<?>) " + time;
		linkedList.add(content);
		methodsList.add("retainAll(Collection<?>) ");
		timesList.add(time);

		fvIdoClear(meret, list);
		content = "clear() " + time;
		linkedList.add(content);
		methodsList.add("clear() ");
		timesList.add(time);
		
		return linkedList;

	}

	public static void fvIdoAdd(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.add(i, c);

			long befejezesiIdo = System.nanoTime();
			time = (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAddd(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.add(i);

			long befejezesiIdo = System.nanoTime();
			time = (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAddAll(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.addAll(c);

			long befejezesiIdo = System.nanoTime();
			time = (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAdddAll(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.addAll(i, c);

			long befejezesiIdo = System.nanoTime();
			time = (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoSize(List list) {
		long kezesiIdo = System.nanoTime();

		list.size();

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoSet(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.set(meret - 7, meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoSubList(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.subList(meret - 7, meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoEquals(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.equals(meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoContains(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.contains(meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoIndexOf(int meret, List list) {
		long kezesiIdo = System.nanoTime();

		list.indexOf(meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoLastIndexOf(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.lastIndexOf(meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemove(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.remove(meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemovee(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.remove((Object) meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemoveAll(int meret, List list) {

		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.removeAll(c);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemoveAlll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.retainAll(c);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRetainAll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.retainAll(c);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoClear(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.clear();

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoGet(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.get(meret);

		long befejezesiIdo = System.nanoTime();
		time = (befejezesiIdo - kezesiIdo);

	}
}
