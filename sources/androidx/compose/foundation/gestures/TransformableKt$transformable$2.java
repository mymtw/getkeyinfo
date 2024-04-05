package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class TransformableKt$transformable$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $lockRotationOnZoomPan;
    public final /* synthetic */ C0619q $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$2(C0619q qVar, boolean z, boolean z2) {
        super(3);
        this.$state = qVar;
        this.$lockRotationOnZoomPan = z;
        this.$enabled = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1509335853);
        C1338j0 E0 = C0761x.m1664E0(this.$state, dVar2);
        C1338j0 E02 = C0761x.m1664E0(Boolean.valueOf(this.$lockRotationOnZoomPan), dVar2);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new TransformableKt$transformable$2$block$1$1(E02, E0, (C19340c<? super TransformableKt$transformable$2$block$1$1>) null);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1436d b = this.$enabled ? SuspendingPointerInputFilterKt.m3484b(C1436d.C1437a.f3125b, C19394m.f43287a, (C19861p) v) : C1436d.C1437a.f3125b;
        dVar2.mo5406H();
        return b;
    }
}
