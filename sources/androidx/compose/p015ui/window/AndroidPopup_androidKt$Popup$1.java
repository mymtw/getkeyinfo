package androidx.compose.p015ui.window;

import androidx.compose.p015ui.C1428a;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 */
public final class AndroidPopup_androidKt$Popup$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1428a $alignment;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2093f $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(C1428a aVar, long j, C19846a<C19394m> aVar2, C2093f fVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$alignment = aVar;
        this.$offset = j;
        this.$onDismissRequest = aVar2;
        this.$properties = fVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidPopup_androidKt.m4515b(this.$alignment, this.$offset, this.$onDismissRequest, this.$properties, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
