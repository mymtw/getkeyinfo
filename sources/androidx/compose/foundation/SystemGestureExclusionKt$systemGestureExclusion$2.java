package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8345d;
import p753kq.C19857l;
import p753kq.C19862q;

final class SystemGestureExclusionKt$systemGestureExclusion$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public static final SystemGestureExclusionKt$systemGestureExclusion$2 INSTANCE = new SystemGestureExclusionKt$systemGestureExclusion$2();

    public SystemGestureExclusionKt$systemGestureExclusion$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1120057036);
        dVar2.mo5465u(202618556);
        View view = (View) dVar2.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
        dVar2.mo5465u(511388516);
        boolean I = dVar2.mo5408I(view) | dVar2.mo5408I((Object) null);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C0649l(view, (C19857l<? super C1689j, C8345d>) null);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C0649l lVar = (C0649l) v;
        C1415u.m3028b(lVar, new SystemGestureExclusionKt$excludeFromSystemGestureR$1(lVar), dVar2);
        dVar2.mo5406H();
        dVar2.mo5406H();
        return lVar;
    }
}
