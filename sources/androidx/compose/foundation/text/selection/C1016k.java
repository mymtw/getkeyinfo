package androidx.compose.foundation.text.selection;

import androidx.activity.C0114h;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C1011g;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.text.C2022r;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p288y.C8343c;
import p288y.C8345d;

/* renamed from: androidx.compose.foundation.text.selection.k */
public final class C1016k {

    /* renamed from: androidx.compose.foundation.text.selection.k$a */
    public /* synthetic */ class C1017a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2134a;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.SelectionStart.ordinal()] = 1;
            iArr[Handle.SelectionEnd.ordinal()] = 2;
            iArr[Handle.Cursor.ordinal()] = 3;
            f2134a = iArr;
        }
    }

    /* renamed from: a */
    public static final long m2108a(SelectionManager selectionManager, long j, C1011g.C1012a aVar, boolean z) {
        C1010f b = selectionManager.mo4610b(aVar);
        if (b == null) {
            return C8343c.f18297d;
        }
        C1689j jVar = selectionManager.f2074j;
        if (jVar == null) {
            return C8343c.f18297d;
        }
        C1689j c = b.mo4697c();
        if (c == null) {
            return C8343c.f18297d;
        }
        int i = z ? aVar.f2125b : aVar.f2125b - 1;
        C8343c cVar = (C8343c) selectionManager.f2080p.getValue();
        C19383o.m32794d(cVar);
        float c2 = C8343c.m16642c(c.mo6686m(jVar, cVar.f18299a));
        long g = b.mo4701g(i);
        C8345d a = b.mo4695a(C2022r.m4466e(g));
        int d = C2022r.m4465d(g) - 1;
        int e = C2022r.m4466e(g);
        if (d < e) {
            d = e;
        }
        C8345d a2 = b.mo4695a(d);
        float L = C19388s.m32831L(c2, Math.min(a.f18301a, a2.f18301a), Math.max(a.f18303c, a2.f18303c));
        return Math.abs(c2 - L) > ((float) (((int) (j >> 32)) / 2)) ? C8343c.f18297d : jVar.mo6686m(c, C19421p.m32952q(L, C8343c.m16643d(b.mo4695a(i).mo20927b())));
    }

    /* renamed from: b */
    public static final boolean m2109b(long j, C8345d dVar) {
        float f = dVar.f18301a;
        float f2 = dVar.f18303c;
        float c = C8343c.m16642c(j);
        if (f <= c && c <= f2) {
            float f3 = dVar.f18302b;
            float f4 = dVar.f18304d;
            float d = C8343c.m16643d(j);
            if (f3 <= d && d <= f4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final C1011g m2110c(C1011g gVar, C1011g gVar2) {
        if (gVar == null) {
            return gVar2;
        }
        if (gVar2 != null) {
            gVar = gVar.f2123c ? C1011g.m2102a(gVar, gVar2.f2121a, (C1011g.C1012a) null, 6) : C1011g.m2102a(gVar, (C1011g.C1012a) null, gVar2.f2122b, 5);
        }
        return gVar;
    }

    /* renamed from: d */
    public static final C8345d m2111d(C1689j jVar) {
        C8345d G = C0114h.m276G(jVar);
        long r = jVar.mo6687r(C19421p.m32952q(G.f18301a, G.f18302b));
        long r2 = jVar.mo6687r(C19421p.m32952q(G.f18303c, G.f18304d));
        return new C8345d(C8343c.m16642c(r), C8343c.m16643d(r), C8343c.m16642c(r2), C8343c.m16643d(r2));
    }
}
