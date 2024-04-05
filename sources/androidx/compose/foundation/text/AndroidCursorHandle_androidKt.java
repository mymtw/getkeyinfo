package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19861p;

public final class AndroidCursorHandle_androidKt {

    /* renamed from: a */
    public static final float f1904a;

    /* renamed from: b */
    public static final float f1905b;

    static {
        float f = (float) 25;
        f1904a = f;
        f1905b = (f * 2.0f) / 2.4142137f;
    }

    /* renamed from: a */
    public static final void m1949a(long j, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar2, int i) {
        int i2;
        C19383o.m32797g(dVar, "modifier");
        ComposerImpl h = dVar2.mo5440h(-5185995);
        if ((i & 14) == 0) {
            i2 = (h.mo5434e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(dVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(pVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            AndroidSelectionHandles_androidKt.m2007b(j, HandleReferencePoint.TopMiddle, C18263b.m30805A(h, -1458480226, new AndroidCursorHandle_androidKt$CursorHandle$1(pVar, dVar, i2)), h, (i2 & 14) | 432);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidCursorHandle_androidKt$CursorHandle$2(j, dVar, pVar, i);
        }
    }

    /* renamed from: b */
    public static final void m1950b(C1436d dVar, C1302d dVar2, int i) {
        int i2;
        C19383o.m32797g(dVar, "modifier");
        ComposerImpl h = dVar2.mo5440h(694251107);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            C1436d m = SizeKt.m1493m(dVar, f1905b, f1904a);
            C19383o.m32797g(m, "<this>");
            C15588c1.m25324f(ComposedModifierKt.m3049a(m, InspectableValueKt.f4032a, AndroidCursorHandle_androidKt$drawCursorHandle$1.INSTANCE), h, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(dVar, i);
        }
    }
}
