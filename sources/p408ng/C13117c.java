package p408ng;

import java.util.Comparator;
import kotlin.jvm.internal.C19383o;

/* renamed from: ng.c */
public final class C13117c<T> implements Comparator {

    /* renamed from: b */
    public static final C13117c f28842b = new C13117c();

    public final int compare(Object obj, Object obj2) {
        C13115a aVar = (C13115a) obj;
        C13115a aVar2 = (C13115a) obj2;
        C19383o.m32796f(aVar2, "o2");
        aVar.getClass();
        Long l = aVar.f28840c;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = aVar2.f28840c;
        if (l2 != null) {
            return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
        }
        return 1;
    }
}
