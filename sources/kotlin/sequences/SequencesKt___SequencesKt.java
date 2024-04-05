package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19857l;

public class SequencesKt___SequencesKt extends C19437l {
    /* renamed from: m1 */
    public static final <T> int m32982m1(C19431g<? extends T> gVar) {
        C19383o.m32797g(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    /* renamed from: n1 */
    public static final <T> T m32983n1(C19431g<? extends T> gVar, int i) {
        C19383o.m32797g(gVar, "<this>");
        SequencesKt___SequencesKt$elementAt$1 sequencesKt___SequencesKt$elementAt$1 = new SequencesKt___SequencesKt$elementAt$1(i);
        if (i < 0) {
            return sequencesKt___SequencesKt$elementAt$1.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T next : gVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return next;
            }
            i2 = i3;
        }
        return sequencesKt___SequencesKt$elementAt$1.invoke(Integer.valueOf(i));
    }

    /* renamed from: o1 */
    public static final C19427e m32984o1(C19431g gVar, C19857l lVar) {
        C19383o.m32797g(lVar, "predicate");
        return new C19427e(gVar, true, lVar);
    }

    /* renamed from: p1 */
    public static final C19439n m32985p1(C19431g gVar, C19857l lVar) {
        C19383o.m32797g(lVar, "transform");
        return new C19439n(gVar, lVar);
    }

    /* renamed from: q1 */
    public static final C19427e m32986q1(C19431g gVar, C19857l lVar) {
        C19383o.m32797g(lVar, "transform");
        C19439n nVar = new C19439n(gVar, lVar);
        SequencesKt___SequencesKt$filterNotNull$1 sequencesKt___SequencesKt$filterNotNull$1 = SequencesKt___SequencesKt$filterNotNull$1.INSTANCE;
        C19383o.m32797g(sequencesKt___SequencesKt$filterNotNull$1, "predicate");
        return new C19427e(nVar, false, sequencesKt___SequencesKt$filterNotNull$1);
    }

    /* renamed from: r1 */
    public static final Comparable m32987r1(C19439n nVar) {
        Iterator<T> it = nVar.f43362a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) nVar.f43363b.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) nVar.f43363b.invoke(it.next());
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: s1 */
    public static final <T> List<T> m32988s1(C19431g<? extends T> gVar) {
        return C17782b.m29867g0(m32989t1(gVar));
    }

    /* renamed from: t1 */
    public static final ArrayList m32989t1(C19431g gVar) {
        C19383o.m32797g(gVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object add : gVar) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
