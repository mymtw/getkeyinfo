package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19857l;
import p753kq.C19861p;

public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1436d dVar, boolean z, long j, int i, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(2);
        this.$content = pVar;
        this.$modifier = dVar;
        this.$isStartHandle = z;
        this.$position = j;
        this.$$dirty = i;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) == 2 && dVar.mo5442i()) {
            dVar.mo5396C();
        } else if (this.$content == null) {
            dVar.mo5465u(386443790);
            C1436d dVar2 = this.$modifier;
            Boolean valueOf = Boolean.valueOf(this.$isStartHandle);
            C8343c cVar = new C8343c(this.$position);
            boolean z = this.$isStartHandle;
            long j = this.$position;
            dVar.mo5465u(511388516);
            boolean I = dVar.mo5408I(valueOf) | dVar.mo5408I(cVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(z, j);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            C1436d a = SemanticsModifierKt.m4174a(dVar2, false, (C19857l) v);
            boolean z2 = this.$isStartHandle;
            ResolvedTextDirection resolvedTextDirection = this.$direction;
            boolean z3 = this.$handlesCrossed;
            int i2 = this.$$dirty;
            AndroidSelectionHandles_androidKt.m2006a(a, z2, resolvedTextDirection, z3, dVar, (i2 & 112) | (i2 & 896) | (i2 & 7168));
            dVar.mo5406H();
        } else {
            dVar.mo5465u(386444465);
            this.$content.invoke(dVar, Integer.valueOf((this.$$dirty >> 15) & 14));
            dVar.mo5406H();
        }
    }
}
