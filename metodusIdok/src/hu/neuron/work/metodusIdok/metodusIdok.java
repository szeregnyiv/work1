package hu.neuron.work.metodusIdok;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.management.AttributeList;
import javax.management.relation.RoleList;

public class metodusIdok {

	static long ido = 0;
	private static final String FILENAME = "C:\\Users\\szeregnyiv\\work\\metodusIdok\\idok.txt";

	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		int meret=1 ;
		
		try {
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			
			
			
			while(meret!=0){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Írd be a lista méretét: ");
			meret = scanner.nextInt();	
			if(meret==0){
				break;
			}
			String content = "Írd be a lista méretét:" + meret + "";
			bw.newLine();
			content = "A LinkedList futási ideje "+meret+" elemre: ";
			bw.write(content);
			bw.newLine();
			List linkedList = new LinkedList();
			linkedList=fvIdok(meret, linkedList);
			for (Object object : linkedList) {
				content=(String)object;
				bw.write(content);
				bw.newLine();
				
			}
			bw.newLine();
			content = "A ArrayList futási ideje "+meret+" elemre: ";
			bw.write(content);
			bw.newLine();
			List arrayList = new ArrayList();
			fvIdok(meret, arrayList);
			linkedList=fvIdok(meret, linkedList);
			for (Object object : linkedList) {
				content=(String)object;
				bw.write(content);
				bw.newLine();
				
			}
			bw.newLine();
			content = "A ArttributesList futási ideje "+meret+" elemre: ";
			bw.write(content);
			bw.newLine();
			List attributeList = new AttributeList();
			fvIdok(meret, attributeList);
			linkedList=fvIdok(meret, linkedList);
			for (Object object : linkedList) {
				content=(String)object;
				bw.write(content);
				bw.newLine();
				
			}
			bw.newLine();
			content = "A RoleList futási ideje "+meret+" elemre: ";
			bw.write(content);
			bw.newLine();
			List roleList = new RoleList();
			fvIdok(meret, roleList);
			linkedList=fvIdok(meret, linkedList);
			for (Object object : linkedList) {
				content=(String)object;
				bw.write(content);
				bw.newLine();
				
			}
			bw.newLine();
			content = "A Stack futási ideje "+meret+" elemre: ";
			bw.write(content);
			bw.newLine();
			List stackList = new Stack();
			fvIdok(meret, stackList);
			stackList=fvIdok(meret, stackList);
			for (Object object : stackList) {
				content=(String)object;
				bw.write(content);
				bw.newLine();
				
			}
			bw.newLine();
			
			
			};
			bw.close();fw.close();
			System.out.println("Done");
			
			
			
			
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		System.out.println("Vége mindennek, bezárva minden!");
	}

	public static List fvIdok(int meret, List list) {
		List linkedList = new LinkedList();
			
			ido = 0;
			fvIdoAdd(meret, list);
			Object content = "add(E) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoAddd(meret, list);
			content = "add(int, E) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoAddAll(meret, list);
			content = "addAll(Collection<? extends E>) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoAdddAll(meret, list);
			content = "addAll(int, Collection<? extends E>) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoGet(meret, list);
			content = "get(int) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoSize(meret, list);
			content = "size() " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoSet(meret, list);
			content = "set(int, E) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoSubList(meret, list);
			content = "subList(int, int)  " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoEquals(meret, list);
			content = "equals(Object) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoContains(meret, list);
			content = "contains(Object) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoIndexOf(meret, list);
			content = "indexOf(Object) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoLastIndexOf(meret, list);
			content = "lastIndexOf(Object) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoRemove(meret, list);
			content = "remove(int) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoRemovee(meret, list);
			content = "remove(Object) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoRemoveAll(meret, list);
			content = "removeAll(Collection<?>) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoRetainAll(meret, list);
			content = "retainAll(Collection<?>) " + ido;
			linkedList.add(content);
			
			ido = 0;
			fvIdoClear(meret, list);
			content = "clear() " + ido;
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
			ido += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAddd(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.add(i);

			long befejezesiIdo = System.nanoTime();
			ido += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAddAll(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.addAll(c);

			long befejezesiIdo = System.nanoTime();
			ido += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoAdddAll(int meret, List list) {
		int[] tomb = new int[meret];
		for (int i = 0; i < tomb.length; i++) {
			List c = new ArrayList();

			long kezesiIdo = System.nanoTime();

			list.addAll(i, c);

			long befejezesiIdo = System.nanoTime();
			ido += (befejezesiIdo - kezesiIdo);
		}

	}

	public static void fvIdoSize(int meret, List list) {
		long kezesiIdo = System.nanoTime();

		list.size();

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoSet(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.set(meret-7, meret);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoSubList(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.subList(meret-7, meret);
		
		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoRemove(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.remove(meret);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoEquals(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.equals(meret);
		
		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoContains(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.contains(meret);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoIndexOf(int meret, List list) {
		long kezesiIdo = System.nanoTime();

		list.indexOf((Object)meret);
		
		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoLastIndexOf(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.lastIndexOf((Object)meret);
		
		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoRemoveAll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.removeAll(c);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoRemovee(int meret, List list) {

		long kezesiIdo = System.nanoTime();
		
		list.remove((Object) meret);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoRemoveAlll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();
		
		list.retainAll(c);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoRetainAll(int meret, List list) {
		List c = new ArrayList();

		long kezesiIdo = System.nanoTime();

		list.retainAll(c);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoClear(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.clear();

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
	public static void fvIdoGet(int meret, List list) {

		long kezesiIdo = System.nanoTime();

		list.get(meret);

		long befejezesiIdo = System.nanoTime();
		ido += (befejezesiIdo - kezesiIdo);

	}
}