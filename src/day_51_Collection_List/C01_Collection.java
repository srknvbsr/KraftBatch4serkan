package day_51_Collection_List;

import java.util.*;

public class C01_Collection {
    public static void main(String[] args) {


    /*Collection nesneleri objelerli bir arada tutan yapılardır.
    Karşılaşılan veya istenilen durumlara göre farklı yapıları gösterir.
    Hangi collection tipini kullanacaginizi biz belirleriz.

    1.List  : Array, Linkekd List, Vector-->Stack(yığın)
    2.Queue : Prioriity(Öncelikli) Que, Array Que
    3.Set   :  Hashset, Linkedhashset, TreeSet
   İnterfacelarden obje oluşturamadığımız için Child classlardan constructorları kullanılarak objeler oluşturuyoruz.

     */
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // System.out.println(arr);


        //List<String> coll1=new List<String>();//İnterface olan Listten obje oluşturamıyoruz.
        List<String> coll2 = new ArrayList<>();
        List<Objects> coll3 = new LinkedList<>();
        Queue<String> coll4 = new LinkedList<>();
        Queue<String> coll5 = new PriorityQueue<>();
        List<String> coll6 = new Vector<>();
        List<String> coll7 = new Stack<>();

        Set<String> coll8 = new HashSet<>();
        Set<String> coll9 = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();
        HashSet<String> set1 = new HashSet<>();


    }

}
