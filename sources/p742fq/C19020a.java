package p742fq;

import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C19383o;

/* renamed from: fq.a */
public final class C19020a implements Comparator<Comparable<? super Object>> {

    /* renamed from: b */
    public static final C19020a f42387b = new C19020a();

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C19383o.m32797g(comparable, Constants.APPBOY_PUSH_CONTENT_KEY);
        C19383o.m32797g(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C19021b.f42388b;
    }
}
