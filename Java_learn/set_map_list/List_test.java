/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: List_test
 * date: 2019年10月2日
 */

/**
 * List接口是继承于Collection接口并定义一个允许重复项的有序集合。该接口不但能够对列表的一部分进行
 * 处理，还添加了面向位置的操作。
 * 
 *集合类存放的都是对象的引用，而非对象本身，出于表达上的便利， 我们称集合中的对象就是指集合中对象的引用。
 *
 *ArrayList:内部是通过数组实现的，它允许对元素进行快随机访问。当从ArrayList的中间位置插入或者删
 *除元素时，需要对数组进行复制、移动，代价比较高。适合随机查找和遍历，不适合插入和删除。
 *
 *LinkedList:则是链表结构存储数据的，很适合数据的动态插入和删除，随机访问和遍历速度比较慢。另外，它
 *还提供了List接口中没有定义的方法，专门用于操作表头和表尾元素，可以当做堆栈、队列和双向队列使用。
 *
 *Vector:通过数组实现的，不同的是它支持线程的同步。访问速度比ArrayList慢。
 */
//import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public class List_test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayListTest();
    }
    
    //ArrayList存储String类的情况
    public static void ArrayListTest() {
        ArrayList<String> studentList = new ArrayList<String>();
        //添加学生姓名
        studentList.add("李红");
        studentList.add("赵梦影");
        studentList.add("王国强");
        studentList.add("孙立");
        
        //原始的列表
        System.out.print("未处理前的列表: ");
        System.out.println(studentList);
        
        //删除列表中的元素，采用.remove()的方法
        //采用索引删除
        studentList.remove(1);
        //删除指定的元素
        studentList.remove("王国强");
        
        System.out.print("删除元素: ");
        System.out.println(studentList);
        
        //修改列表中的元素，采用.set(索引, 修改后的元素)的方法
        studentList.set(0, "李强");
        
        System.out.print("修改后的列表: ");
        System.out.println(studentList);
        
        //采用Iterator遍历输出列表元素
        Iterator<String> i = studentList.iterator();
        while(i.hasNext()) {
        	String s = (String) i.next();
        	System.out.println(s);
        }
    }
    
    public static void LinkedListTest() {
    	
    }
}