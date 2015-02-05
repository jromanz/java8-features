package com.mycompany.cap02;

public class TopLevelOuter {

    private int v1 = 100;
// Here, only v1 is in scope

    public class InnerLevelOne {
        private int v2 = 200;
// Here, only v1 and v2 are in scope
        public class InnerLevelTwo {
            private int v3 = 300;
// Here, only v1, v2, and v3 are in scope
            public class InnerLevelThree {
                private int v4 = 400;
// Here, all v1, v2, v3, and v4 are in scope
            }
        }
    }
    
    public static void main(String[] args) {
        TopLevelOuter top = new TopLevelOuter();
        System.out.println(top.v1);
        TopLevelOuter.InnerLevelOne inner1 = top.new InnerLevelOne();
        System.out.println(inner1.v2);
        TopLevelOuter.InnerLevelOne.InnerLevelTwo inner2 = inner1.new InnerLevelTwo();
        System.out.println(inner2.v3);
    }
}
