package androidx.compose.p015ui.platform;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 */
public final class C1781x611323ac extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ AndroidComposeView $owner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1781x611323ac(AndroidComposeView androidComposeView, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$owner = androidComposeView;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidCompositionLocals_androidKt.m3932a(this.$owner, this.$content, dVar, this.$$changed | 1);
    }
}
