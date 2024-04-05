package p742fq;

import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C19383o;

/* renamed from: fq.b */
public final class C19021b implements Comparator<Comparable<? super Object>> {

    /* renamed from: b */
    public static final C19021b f42388b = new C19021b();

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C19383o.m32797g(comparable, Constants.APPBOY_PUSH_CONTENT_KEY);
        C19383o.m32797g(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C19020a.f42387b;
    }
}
