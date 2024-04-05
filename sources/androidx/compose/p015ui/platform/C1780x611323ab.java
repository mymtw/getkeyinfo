package androidx.compose.p015ui.platform;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 */
public final class C1780x611323ab extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ AndroidComposeView $owner;
    public final /* synthetic */ C1889y $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1780x611323ab(AndroidComposeView androidComposeView, C1889y yVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$owner = androidComposeView;
        this.$uriHandler = yVar;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            CompositionLocalsKt.m3939a(this.$owner, this.$uriHandler, this.$content, dVar, ((this.$$dirty << 3) & 896) | 72);
        } else {
            dVar.mo5396C();
        }
    }
}
