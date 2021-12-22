import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TestListMap{
	public static void main(String[] args)
	{
		book b1 = new book(1000, "b1", 30.5, "bjsxt");
        book b2 = new book(1001, "b2", 50, "bjsxt");
        book b3 = new book(1002, "b3", 30.5, "bjsxt");
        book b4 = new book(1003, "b4", 30.5, "bjsxt");
        book b5 = new book(1004, "b5", 50, "bjsxt1");
        //ʹ��HashSet�洢ͼ�鲢����
        List<book> bookList = new ArrayList<book>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        System.out.println("�������list");
        System.out.println("���\t����\t����\t������");
        for (book book1: bookList)
        {
            System.out.println(book1);
        }
        //ʹ��TreeSet�洢ͼ�鲢����
        HashMap<Integer, book> bookMap = new HashMap<>();
        bookMap.put(b1.getId(), b1);
        bookMap.put(b2.getId(), b2);
        bookMap.put(b3.getId(), b3);
        bookMap.put(b4.getId(), b4);
        bookMap.put(b5.getId(), b5);
        System.out.println("�������hashmap");
        System.out.println("���\t����\t����\t������");
        Set<Integer>keyset = bookMap.keySet();
        for(Integer key:keyset){
			System.out.println(bookMap.get(key));
		}
	}
}
