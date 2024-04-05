package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AndroidSelectionHandles_androidKt$HandlePopup$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ HandleReferencePoint $handleReferencePoint;
    public final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$HandlePopup$1(long j, HandleReferencePoint handleReferencePoint, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$position = j;
        this.$handleReferencePoint = handleReferencePoint;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidSelectionHandles_androidKt.m2007b(this.$position, this.$handleReferencePoint, this.$content, dVar, this.$$changed | 1);
    }
}
