package p144ih;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
import p003a2.C0015b;

/* renamed from: ih.a */
public final class C7008a {

    /* renamed from: a */
    public static SparseArray<Priority> f15564a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<Priority, Integer> f15565b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f15565b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f15565b.put(Priority.VERY_LOW, 1);
        f15565b.put(Priority.HIGHEST, 2);
        for (Priority next : f15565b.keySet()) {
            f15564a.append(f15565b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m13568a(Priority priority) {
        Integer num = f15565b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    /* renamed from: b */
    public static Priority m13569b(int i) {
        Priority priority = f15564a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(C0015b.m88g("Unknown Priority for value ", i));
    }
}
