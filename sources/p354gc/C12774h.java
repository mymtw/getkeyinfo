package p354gc;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: gc.h */
public final class C12774h {

    /* renamed from: a */
    public final List<C12772f> f28227a;

    public C12774h(List<C12772f> list) {
        C19383o.m32797g(list, ResponseConstants.SOURCES);
        this.f28227a = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = r0.f28226c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo45540a() {
        /*
            r5 = this;
            java.util.List<gc.f> r0 = r5.f28227a
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x000e
            r0 = 0
            goto L_0x0033
        L_0x000e:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x001a
        L_0x0018:
            r0 = r1
            goto L_0x0033
        L_0x001a:
            r2 = r1
            gc.f r2 = (p354gc.C12772f) r2
            int r2 = r2.f28225b
        L_0x001f:
            java.lang.Object r3 = r0.next()
            r4 = r3
            gc.f r4 = (p354gc.C12772f) r4
            int r4 = r4.f28225b
            if (r2 >= r4) goto L_0x002c
            r1 = r3
            r2 = r4
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x001f
            goto L_0x0018
        L_0x0033:
            gc.f r0 = (p354gc.C12772f) r0
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.f28226c
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r0 = ""
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p354gc.C12774h.mo45540a():java.lang.String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12774h) && C19383o.m32792b(this.f28227a, ((C12774h) obj).f28227a);
    }

    public final int hashCode() {
        return this.f28227a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("ImageUiModel(sources="), this.f28227a, ')');
    }
}
