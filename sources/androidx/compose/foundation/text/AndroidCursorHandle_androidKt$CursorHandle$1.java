package androidx.compose.foundation.text;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AndroidCursorHandle_androidKt$CursorHandle$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1436d dVar, int i) {
        super(2);
        this.$content = pVar;
        this.$modifier = dVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) == 2 && dVar.mo5442i()) {
            dVar.mo5396C();
        } else if (this.$content == null) {
            dVar.mo5465u(1275643833);
            AndroidCursorHandle_androidKt.m1950b(this.$modifier, dVar, (this.$$dirty >> 3) & 14);
            dVar.mo5406H();
        } else {
            dVar.mo5465u(1275643903);
            this.$content.invoke(dVar, Integer.valueOf((this.$$dirty >> 6) & 14));
            dVar.mo5406H();
        }
    }
}
