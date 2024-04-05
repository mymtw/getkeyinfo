package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class BoxKt$Box$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxKt$Box$3(C1436d dVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        BoxKt.m1455a(this.$modifier, dVar, this.$$changed | 1);
    }
}
