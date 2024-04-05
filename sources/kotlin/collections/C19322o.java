package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: kotlin.collections.o */
public class C19322o extends C17782b {
    /* renamed from: F0 */
    public static final int m32624F0(Iterable iterable) {
        C19383o.m32797g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* renamed from: G0 */
    public static final ArrayList m32625G0(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C19324q.m32628J0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
