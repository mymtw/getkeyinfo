package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3 */
public final class AndroidDialog_androidKt$Dialog$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2089b $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$3(C19846a<C19394m> aVar, C2089b bVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$properties = bVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidDialog_androidKt.m4511a(this.$onDismissRequest, this.$properties, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
