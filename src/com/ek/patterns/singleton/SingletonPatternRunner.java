package com.ek.patterns.singleton;

import com.ek.patterns.singleton.eager.EagerBillPughSingleton;
import com.ek.patterns.singleton.eager.EagerSingleton;
import com.ek.patterns.singleton.eager.EagerWithStaticInitSingleton;
import com.ek.patterns.singleton.lazy.LazyDoubleCheckSingleton;
import com.ek.patterns.singleton.lazy.LazySingleton;

public class SingletonPatternRunner {
    public static void run() {
        LazySingleton lazySingleton1 = LazySingleton.create("emre");
        LazyDoubleCheckSingleton lazySingleton2 = LazyDoubleCheckSingleton.getInstance();
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerWithStaticInitSingleton eagerSingleton2 = EagerWithStaticInitSingleton.getInstance();
        EagerBillPughSingleton eagerSingleton3 = EagerBillPughSingleton.getInstance();

        System.out.println(lazySingleton1.getName());
        System.out.println(lazySingleton2.getName());
        System.out.println(eagerSingleton.getName());
        System.out.println(eagerSingleton2.getName());
        System.out.println(eagerSingleton3.getName());
    }
}
