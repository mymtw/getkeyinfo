package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$2(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$position = j;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
        this.$modifier = dVar;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidSelectionHandles_androidKt.m2008c(this.$position, this.$isStartHandle, this.$direction, this.$handlesCrossed, this.$modifier, this.$content, dVar, this.$$changed | 1);
    }
}
