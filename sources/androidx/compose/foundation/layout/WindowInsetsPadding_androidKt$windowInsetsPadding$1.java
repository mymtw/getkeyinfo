package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.foundation.layout.C0740i0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19862q;

public final class WindowInsetsPadding_androidKt$windowInsetsPadding$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19857l<C0740i0, C0736g0> $insetsCalculation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPadding_androidKt$windowInsetsPadding$1(C19857l<? super C0740i0, ? extends C0736g0> lVar) {
        super(3);
        this.$insetsCalculation = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(359872873);
        WeakHashMap<View, C0740i0> weakHashMap = C0740i0.f1505v;
        C0740i0 c = C0740i0.C0741a.m1619c(dVar2);
        C19857l<C0740i0, C0736g0> lVar = this.$insetsCalculation;
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(c);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new InsetsPaddingModifier(lVar.invoke(c));
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) v;
        dVar2.mo5406H();
        return insetsPaddingModifier;
    }
}
