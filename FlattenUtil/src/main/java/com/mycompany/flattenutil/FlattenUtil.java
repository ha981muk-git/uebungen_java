/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flattenutil;

/**
 *
 * @author harsh
 */
import static java.util.Arrays.asList;
import java.util.LinkedList;
import java.util.List;
 
public final class FlattenUtil {
 
	public static List<Object> flatten(List<?> list) {
		List<Object> retVal = new LinkedList<Object>();
		flatten(list, retVal);
		return retVal;
	}
 
	public static void flatten(List<?> fromTreeList, List<Object> toFlatList) {
		for (Object item : fromTreeList) {
			if (item instanceof List<?>) {
				flatten((List<?>) item, toFlatList);
			} else {
				toFlatList.add(item);
			}
		}
	}
        
        private static List<Object> a(Object... a) {
		return asList(a);
	}
        
        public static void main(String[] args) {
		List<Object> treeList = a(a(1), 2, a(a(3, 4), 5), a(a(a())), a(a(a(6))), 7, 8, a());
		List<Object> flatList = FlattenUtil.flatten(treeList);
		System.out.println(treeList);
		System.out.println("flatten: " + flatList);
	}
}
