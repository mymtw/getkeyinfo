package androidx.compose.foundation;

import android.graphics.Canvas;
import android.support.p013v4.media.C0072d;
import android.widget.EdgeEffect;
import androidx.activity.C0114h;
import androidx.compose.p015ui.draw.C1444f;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.k */
public final class C0648k extends C1862p0 implements C1444f {

    /* renamed from: c */
    public final AndroidEdgeEffectOverscrollEffect f1387c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0648k(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "overscrollEffect"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1387c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C0648k.<init>(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect):void");
    }

    /* renamed from: P */
    public final void mo3715P(C1741h hVar) {
        boolean z;
        hVar.mo6911O0();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f1387c;
        androidEdgeEffectOverscrollEffect.getClass();
        C1537o a = hVar.f3917b.f18423c.mo20991a();
        androidEdgeEffectOverscrollEffect.f1247k.getValue();
        Canvas canvas = C1493c.f3222a;
        C19383o.m32797g(a, "<this>");
        Canvas canvas2 = ((C1491b) a).f3219a;
        boolean z2 = true;
        if (!(C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1245i) == 0.0f)) {
            androidEdgeEffectOverscrollEffect.mo3587j(hVar, androidEdgeEffectOverscrollEffect.f1245i, canvas2);
            androidEdgeEffectOverscrollEffect.f1245i.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f1240d.isFinished()) {
            z = androidEdgeEffectOverscrollEffect.mo3585i(hVar, androidEdgeEffectOverscrollEffect.f1240d, canvas2);
            C0114h.m314q0(androidEdgeEffectOverscrollEffect.f1245i, C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1240d));
        } else {
            z = false;
        }
        if (!(C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1243g) == 0.0f)) {
            androidEdgeEffectOverscrollEffect.mo3584h(hVar, androidEdgeEffectOverscrollEffect.f1243g, canvas2);
            androidEdgeEffectOverscrollEffect.f1243g.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f1238b.isFinished()) {
            EdgeEffect edgeEffect = androidEdgeEffectOverscrollEffect.f1238b;
            int save = canvas2.save();
            canvas2.translate(0.0f, hVar.mo3789B0(androidEdgeEffectOverscrollEffect.f1237a.f2159b.mo4153d()));
            boolean draw = edgeEffect.draw(canvas2);
            canvas2.restoreToCount(save);
            z = draw || z;
            C0114h.m314q0(androidEdgeEffectOverscrollEffect.f1243g, C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1238b));
        }
        if (!(C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1246j) == 0.0f)) {
            androidEdgeEffectOverscrollEffect.mo3585i(hVar, androidEdgeEffectOverscrollEffect.f1246j, canvas2);
            androidEdgeEffectOverscrollEffect.f1246j.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f1241e.isFinished()) {
            z = androidEdgeEffectOverscrollEffect.mo3587j(hVar, androidEdgeEffectOverscrollEffect.f1241e, canvas2) || z;
            C0114h.m314q0(androidEdgeEffectOverscrollEffect.f1246j, C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1241e));
        }
        if (!(C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1244h) == 0.0f)) {
            EdgeEffect edgeEffect2 = androidEdgeEffectOverscrollEffect.f1244h;
            int save2 = canvas2.save();
            canvas2.translate(0.0f, hVar.mo3789B0(androidEdgeEffectOverscrollEffect.f1237a.f2159b.mo4153d()));
            edgeEffect2.draw(canvas2);
            canvas2.restoreToCount(save2);
            androidEdgeEffectOverscrollEffect.f1244h.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f1239c.isFinished()) {
            if (!androidEdgeEffectOverscrollEffect.mo3584h(hVar, androidEdgeEffectOverscrollEffect.f1239c, canvas2) && !z) {
                z2 = false;
            }
            C0114h.m314q0(androidEdgeEffectOverscrollEffect.f1244h, C0114h.m299d0(androidEdgeEffectOverscrollEffect.f1239c));
            z = z2;
        }
        if (z) {
            androidEdgeEffectOverscrollEffect.mo3588k();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0648k)) {
            return false;
        }
        return C19383o.m32792b(this.f1387c, ((C0648k) obj).f1387c);
    }

    public final int hashCode() {
        return this.f1387c.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DrawOverscrollModifier(overscrollEffect=");
        h.append(this.f1387c);
        h.append(')');
        return h.toString();
    }
}
