package telran.list.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.list.interfaces.IList;
import telran.list.model.MyArrayList;

class ListTest {

	@Test
	void test() {
		IList<Integer> list = new MyArrayList<>();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(null);
		list.add(9);
		list.add(3, 8);
		list.add(2, 10);
		list.add(7, 12);
		
		System.out.println(list.size());
		System.out.println(list.indexOf(8));
		System.out.println("=============");
		System.out.println("Iterator:");
        for (Integer element : list) {
            System.out.println(element);
        }   
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
      
        
//		System.out.println(list.get(2));
//		System.out.println(list.get(5));
//		System.out.println(list.indexOf(3));
//		System.out.println(list.indexOf(null));
//		System.out.println(list.lastIndexOf(3));
//		System.out.println(list.containts(11));
//		System.out.println(list.isEmpty());
//		System.out.println(list.remove(2));
//		System.out.println(list.size());
//		System.out.println(list.set(0, 11));
//		System.out.println(list.size());
//		System.out.println(list.get(0));
	
		
	}

}
