package com.mycompany.cap02test;

import com.mycompany.cap02.TitleList;
import java.util.Iterator;

public class TitleListTest {
    public static void main(String[] args) {
        TitleList tl = new TitleList();
        tl.addTitle("Beginning Java 8");
        tl.addTitle("Scripting in Java");
        Iterator iterator = tl.titleIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
    }
}
