package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class TouchTargetKt$minimumTouchTargetSize$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public static final TouchTargetKt$minimumTouchTargetSize$2 INSTANCE = new TouchTargetKt$minimumTouchTargetSize$2();

    public TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C1436d dVar3;
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1220403677);
        if (((Boolean) dVar2.mo5410J(TouchTargetKt.f2355a)).booleanValue()) {
            dVar3 = new MinimumTouchTargetModifier(((C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o)).mo6772d());
        } else {
            dVar3 = C1436d.C1437a.f3125b;
        }
        dVar2.mo5406H();
        return dVar3;
    }
}
