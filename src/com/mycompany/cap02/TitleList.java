package com.mycompany.cap02;

import java.util.ArrayList;
import java.util.Iterator;

public class TitleList {

    private ArrayList<String> titleList = new ArrayList<String>();

    public void addTitle(String title) {
        titleList.add(title);
    }

    public void removeTitle(String title) {
        titleList.remove(title);
    }
    
    public Iterator<String> titleIterator(){
        // A local inner class - TitleIterator
        class TitleIterator implements Iterator<String>{
            int count = 0;
            @Override
            public boolean hasNext() {
                return (count<titleList.size());
            }

            @Override
            public String next() {
                return titleList.get(count++);
            }
        }
        TitleIterator titleIterator = new TitleIterator();
        return titleIterator;
    }
}
