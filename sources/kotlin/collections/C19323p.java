package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.collections.p */
public class C19323p extends C19322o {
    /* renamed from: H0 */
    public static final <T extends Comparable<? super T>> void m32626H0(List<T> list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: I0 */
    public static final <T> void m32627I0(List<T> list, Comparator<? super T> comparator) {
        C19383o.m32797g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
