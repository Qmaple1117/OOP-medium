package com.Qmaple.debug_09;

import java.util.Arrays;

public class Debug02 {
    public static void main(String[] args) {
        int arr[] = {1, 20, -15, 5};
        //看看Arrays.sort底层实现，利用debug -> step into（一般是F7）
        //查源码方法时，若进不去，进入setting-> build,execution,deployment
        // -> stepping,把java,javax点掉就行了

        //可以动态的下断点，以便实时观察代码逻辑或检查代码
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

//还有跳到下一个断点 这一功能，详情见p358
