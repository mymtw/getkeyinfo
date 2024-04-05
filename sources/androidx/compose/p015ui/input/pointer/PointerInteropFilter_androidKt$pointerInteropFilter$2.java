package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2 */
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19857l<MotionEvent, Boolean> $onTouchEvent;
    public final /* synthetic */ C1655z $requestDisallowInterceptTouchEvent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(C19857l<? super MotionEvent, Boolean> lVar, C1655z zVar) {
        super(3);
        this.$onTouchEvent = lVar;
        this.$requestDisallowInterceptTouchEvent = zVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(374375707);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new PointerInteropFilter();
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) v;
        C19857l<MotionEvent, Boolean> lVar = this.$onTouchEvent;
        pointerInteropFilter.getClass();
        C19383o.m32797g(lVar, "<set-?>");
        pointerInteropFilter.f3601b = lVar;
        C1655z zVar = this.$requestDisallowInterceptTouchEvent;
        C1655z zVar2 = pointerInteropFilter.f3602c;
        if (zVar2 != null) {
            zVar2.f3689b = null;
        }
        pointerInteropFilter.f3602c = zVar;
        if (zVar != null) {
            zVar.f3689b = pointerInteropFilter;
        }
        dVar2.mo5406H();
        return pointerInteropFilter;
    }
}
