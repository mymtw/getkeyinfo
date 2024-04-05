package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AlertDialogKt$AlertDialogBaselineLayout$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ C0739i $this_AlertDialogBaselineLayout;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$3(C0739i iVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i) {
        super(2);
        this.$this_AlertDialogBaselineLayout = iVar;
        this.$title = pVar;
        this.$text = pVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AlertDialogKt.m2158a(this.$this_AlertDialogBaselineLayout, this.$title, this.$text, dVar, this.$$changed | 1);
    }
}
