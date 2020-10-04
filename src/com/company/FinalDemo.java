package com.company;

// Final variables cannot be reassigned
// Final methods cannot be overridden
// Final classes cannot be extended

public class FinalDemo {
    final static float PI = 3.14f;

    public final void show() {
        System.out.println("Hello");
    }
}

final class FinalClassDemo {
}

class FinalSub extends FinalDemo {
//    public  void show() { // error
//    }
}

//class FinalClassSub extends FinalClassDemo { // error
//}