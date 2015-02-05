
package com.mycompany.cap02test;

import com.mycompany.cap02.QualifiedThis;

public class QualifiedThisTest {

    public static void main(String[] args) {
        QualifiedThis qt = new QualifiedThis();
        System.out.println("printValue():");
        qt.printValue();
        System.out.println("\nprintHiddenValue():");
        qt.printHiddenValue();
    }
}
