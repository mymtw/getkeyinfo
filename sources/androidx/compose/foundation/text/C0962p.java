package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.input.C2005w;
import p288y.C8345d;

/* renamed from: androidx.compose.foundation.text.p */
public final class C0962p {

    /* renamed from: androidx.compose.foundation.text.p$a */
    public /* synthetic */ class C0963a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2035a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f2035a = iArr;
        }
    }

    /* renamed from: a */
    public static final C8345d m2001a(C1713x xVar, int i, C2005w wVar, C2021q qVar, boolean z, int i2) {
        C8345d c = qVar != null ? qVar.mo7740c(wVar.f4529b.mo7684b(i)) : C8345d.f18300e;
        int V = xVar.mo3791V(C0959m.f2023a);
        return new C8345d(z ? (((float) i2) - c.f18301a) - ((float) V) : c.f18301a, c.f18302b, z ? ((float) i2) - c.f18301a : ((float) V) + c.f18301a, c.f18304d);
    }
}
