package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(C1436d dVar, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, int i) {
        super(2);
        this.$modifier = dVar;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidSelectionHandles_androidKt.m2006a(this.$modifier, this.$isStartHandle, this.$direction, this.$handlesCrossed, dVar, this.$$changed | 1);
    }
}
