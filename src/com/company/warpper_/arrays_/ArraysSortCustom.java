package com.company.warpper_.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author iVan
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 1, -3, 111, 32};
        int[] arr2 = {1, 3, 2, 6, -1, 11, 12};

//        int[] arrNew = arr1.(new ASort() {
//            this.BBSort(arr1);
//        });
        SortTools sortTools = new SortTools();
        sortTools.BBSort(arr2);

        BBSort1(arr1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {//重写compara方法 决定比较的逻辑，是从大到小还是从小到大
                return (Integer) o2 - (Integer) o1;//此处o1-o2 为 从大到小，o2-o1 为 从小到大。结合BBsort1()方法的的具体逻辑
            }
        });


        System.out.println("普通冒泡排序，指定从大到小: " + Arrays.toString(arr2));
        System.out.println("使用comparator的冒泡排序，可切换大小逻辑: " + Arrays.toString(arr1));



    }
    public static void BBSort1(int[] arrin,Comparator c) {
        for (int i = 0; i < arrin.length; i++) {
            for (int j = 0; j < arrin.length - i - 1; j++) {
                if (c.compare(arrin[j],arrin[j + 1]) > 0) {
                    int temp = arrin[j];
                    arrin[j] = arrin[j + 1];
                    arrin[j + 1] = temp;
                }
            }
        }

    }


}


interface ASort {
    void BBSort(int[] arrin);
}

class SortTools implements ASort {
    @Override
    public void BBSort(int[] arrin) {
        for (int i = 0; i < arrin.length; i++) {
            for (int j = 0; j < arrin.length - i - 1; j++) {
                if (arrin[j] < arrin[j + 1]) {
                    int temp = arrin[j];
                    arrin[j] = arrin[j + 1];
                    arrin[j + 1] = temp;
                }
            }
        }

    }



}