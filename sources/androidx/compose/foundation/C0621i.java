package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p174m0.C7282b;
import p288y.C8345d;
import p288y.C8347f;

/* renamed from: androidx.compose.foundation.i */
public final class C0621i {

    /* renamed from: a */
    public static final float f1364a = ((float) 30);

    /* renamed from: b */
    public static final C1436d f1365b;

    /* renamed from: c */
    public static final C1436d f1366c;

    /* renamed from: androidx.compose.foundation.i$a */
    public static final class C0622a implements C1530k0 {
        /* renamed from: a */
        public final C1606z mo3864a(long j, LayoutDirection layoutDirection, C7282b bVar) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(bVar, "density");
            float V = (float) bVar.mo3791V(C0621i.f1364a);
            return new C1606z.C1608b(new C8345d(0.0f, -V, C8347f.m16656d(j), C8347f.m16654b(j) + V));
        }
    }

    /* renamed from: androidx.compose.foundation.i$b */
    public static final class C0623b implements C1530k0 {
        /* renamed from: a */
        public final C1606z mo3864a(long j, LayoutDirection layoutDirection, C7282b bVar) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(bVar, "density");
            float V = (float) bVar.mo3791V(C0621i.f1364a);
            return new C1606z.C1608b(new C8345d(-V, 0.0f, C8347f.m16656d(j) + V, C8347f.m16654b(j)));
        }
    }

    static {
        int i = C1436d.f3124a0;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        f1365b = C19543e0.m33286B(aVar, new C0622a());
        f1366c = C19543e0.m33286B(aVar, new C0623b());
    }

    /* renamed from: a */
    public static final C1436d m1438a(C1436d dVar, Orientation orientation) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(orientation, "orientation");
        return dVar.mo6148i0(orientation == Orientation.Vertical ? f1366c : f1365b);
    }
}
