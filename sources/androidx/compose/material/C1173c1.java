package androidx.compose.material;

import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.coroutines.C19340c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.c1 */
public final class C1173c1 {
    /* renamed from: a */
    public static final void m2304a(long j, C19846a aVar, boolean z, C1302d dVar, int i) {
        int i2;
        C1436d dVar2;
        ComposerImpl h = dVar.mo5440h(-526532668);
        if ((i & 14) == 0) {
            i2 = (h.mo5434e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(aVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5427a(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            if (j != C1545s.f3364i) {
                float f = 0.0f;
                if (z) {
                    f = 1.0f;
                }
                C0424f b = C0411a.m1106b(f, new C0433j0(0, (C0448r) null, 7), h, 0, 12);
                String K = C1993m.m4350K(2, h);
                h.mo5465u(1010547488);
                if (z) {
                    C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
                    h.mo5465u(1157296644);
                    boolean I = h.mo5408I(aVar);
                    Object c0 = h.mo5431c0();
                    if (I || c0 == C1302d.C1303a.f2828a) {
                        c0 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(aVar, (C19340c<? super ModalBottomSheetKt$Scrim$dismissModifier$1$1>) null);
                        h.mo5407H0(c0);
                    }
                    h.mo5418R(false);
                    C1436d b2 = SuspendingPointerInputFilterKt.m3484b(aVar2, aVar, (C19861p) c0);
                    h.mo5465u(511388516);
                    boolean I2 = h.mo5408I(K) | h.mo5408I(aVar);
                    Object c02 = h.mo5431c0();
                    if (I2 || c02 == C1302d.C1303a.f2828a) {
                        c02 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(K, aVar);
                        h.mo5407H0(c02);
                    }
                    h.mo5418R(false);
                    dVar2 = SemanticsModifierKt.m4174a(b2, true, (C19857l) c02);
                } else {
                    dVar2 = C1436d.C1437a.f3125b;
                }
                h.mo5418R(false);
                C1436d i0 = SizeKt.m1486f(C1436d.C1437a.f3125b).mo6148i0(dVar2);
                C1545s sVar = new C1545s(j);
                h.mo5465u(511388516);
                boolean I3 = h.mo5408I(sVar) | h.mo5408I(b);
                Object c03 = h.mo5431c0();
                if (I3 || c03 == C1302d.C1303a.f2828a) {
                    c03 = new ModalBottomSheetKt$Scrim$1$1(j, b);
                    h.mo5407H0(c03);
                }
                h.mo5418R(false);
                CanvasKt.m1294a(i0, (C19857l) c03, h, 0);
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ModalBottomSheetKt$Scrim$2(j, aVar, z, i);
        }
    }
}
