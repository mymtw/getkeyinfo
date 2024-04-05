package p145io.reactivex.internal.util;

import java.util.List;
import p287xp.C8335c;

/* renamed from: io.reactivex.internal.util.ListAddBiConsumer */
public enum ListAddBiConsumer implements C8335c<List, Object, List> {
    INSTANCE;

    public static <T> C8335c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
