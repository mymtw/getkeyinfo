package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 */
public final class AndroidPopup_androidKt$Popup$9 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2092e $popupPositionProvider;
    public final /* synthetic */ C2093f $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$9(C2092e eVar, C19846a<C19394m> aVar, C2093f fVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$popupPositionProvider = eVar;
        this.$onDismissRequest = aVar;
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
        AndroidPopup_androidKt.m4514a(this.$popupPositionProvider, this.$onDismissRequest, this.$properties, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
