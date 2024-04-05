package p145io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.util.ArrayListSupplier */
public enum ArrayListSupplier implements Callable<List<Object>>, C8339g<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> C8339g<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
