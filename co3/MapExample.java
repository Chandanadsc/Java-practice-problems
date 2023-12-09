package co3;
import java.util.*;  
public class MapExample {  
public static void main(String[] args) {  
    Map<Integer,String> m1=new HashMap<Integer,String>();  
    
    
    
    m1.put(214,"Chandana");  
    m1.put(213,"Thribhuvana");  
    m1.put(045,"SaiSree");  
    m1.put(111,"xyz");  
    
    Set set=m1.entrySet();
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
          
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
    System.out.println(m1.containsKey(214));
    System.out.println(m1.containsValue("Chandana"));
    
    
}  
}  