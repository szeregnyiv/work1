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

import javax.management.AttributeList;
import javax.management.relation.RoleList;

/**
 * Hello world!
 *
 */
public class App 
{
	static long time = 0;
	
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
		boolean continueInput = true;

				System.out.print("Írd be a lista méretét: ");
				int meret = scanner.nextInt();

				List linkedList = new LinkedList();
				linkedList = fvIdok(meret, linkedList);
				
				List arrayList = new ArrayList();
				fvIdok(meret, arrayList);
				linkedList = fvIdok(meret, linkedList);
				
				List attributeList = new AttributeList();
				fvIdok(meret, attributeList);
				linkedList = fvIdok(meret, linkedList);
				
				List roleList = new RoleList();
				fvIdok(meret, roleList);
				linkedList = fvIdok(meret, linkedList);
				
				
				List stackList = new Stack();
				fvIdok(meret, stackList);
				stackList = fvIdok(meret, stackList);
				TxtWriter writer= new TxtWriter();
				writer.writer(linkedList);
				
    }
    public static List fvIdok(int meret, List list) {
		List linkedList = new LinkedList();

		time = 0;
		fvIdoAdd(meret, list);
		Object content = "add(E) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoAddd(meret, list);
		content = "add(int, E) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoAddAll(meret, list);
		content = "addAll(Collection<? extends E>) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoAdddAll(meret, list);
		content = "addAll(int, Collection<? extends E>) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoGet(meret, list);
		content = "get(int) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoSize(list);
		content = "size() " + time;
		linkedList.add(content);

		time = 0;
		fvIdoSet(meret, list);
		content = "set(int, E) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoSubList(meret, list);
		content = "subList(int, int)  " + time;
		linkedList.add(content);

		time = 0;
		fvIdoEquals(meret, list);
		content = "equals(Object) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoContains(meret, list);
		content = "contains(Object) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoIndexOf(meret, list);
		content = "indexOf(Object) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoLastIndexOf(meret, list);
		content = "lastIndexOf(Object) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoRemove(meret, list);
		content = "remove(int) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoRemovee(meret, list);
		content = "remove(Object) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoRemoveAll(meret, list);
		content = "removeAll(Collection<?>) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoRetainAll(meret, list);
		content = "retainAll(Collection<?>) " + time;
		linkedList.add(content);

		time = 0;
		fvIdoClear(meret, list);
		content = "clear() " + time;
		linkedList.add(content);

		return linkedList;

	}

	public static void fvIdoAdd(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.add(i, c);

			long befejezesiIdo = System.nanoTime();
			time += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAddd(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.add(i);

			long befejezesiIdo = System.nanoTime();
			time += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAddAll(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.addAll(c);

			long befejezesiIdo = System.nanoTime();
			time += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAdddAll(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.addAll(i, c);

			long befejezesiIdo = System.nanoTime();
			time += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoSize(List list) {
		long kezesiIdo = System.nanoTime();

		list.size();

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoSet(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.set(meret - 7, meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoSubList(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.subList(meret - 7, meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoEquals(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.equals(meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoContains(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.contains(meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoIndexOf(int meret, List list) {
		long kezesiIdo = System.nanoTime();

		list.indexOf(meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoLastIndexOf(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.lastIndexOf(meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemove(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.remove(meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemovee(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.remove((Object) meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemoveAll(int meret, List list) {

		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.removeAll(c);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRemoveAlll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.retainAll(c);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoRetainAll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.retainAll(c);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoClear(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.clear();

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}

	public static void fvIdoGet(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.get(meret);

		long befejezesiIdo = System.nanoTime();
		time += (befejezesiIdo - kezesiIdo);

	}
}
