package androidx.compose.foundation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19857l;
import p753kq.C19861p;

public final class CanvasKt$Canvas$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C8412e, C19394m> $onDraw;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CanvasKt$Canvas$1(C1436d dVar, C19857l<? super C8412e, C19394m> lVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$onDraw = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CanvasKt.m1294a(this.$modifier, this.$onDraw, dVar, this.$$changed | 1);
    }
}
