package androidx.compose.foundation.text;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AndroidCursorHandle_androidKt$CursorHandle$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $handlePosition;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$2(long j, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$handlePosition = j;
        this.$modifier = dVar;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidCursorHandle_androidKt.m1949a(this.$handlePosition, this.$modifier, this.$content, dVar, this.$$changed | 1);
    }
}
