package androidx.compose.p015ui.text.font;

import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 */
final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements C19857l<C1974z, C19394m> {
    public final /* synthetic */ C1972x $typefaceRequest;
    public final /* synthetic */ C1973y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(C1973y yVar, C1972x xVar) {
        super(1);
        this.this$0 = yVar;
        this.$typefaceRequest = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1974z) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1974z zVar) {
        C19383o.m32797g(zVar, "finalResult");
        C1973y yVar = this.this$0;
        C15588c1 c1Var = yVar.f4434a;
        C1972x xVar = this.$typefaceRequest;
        synchronized (c1Var) {
            if (zVar.mo7592a()) {
                yVar.f4435b.mo19419b(xVar, zVar);
            } else {
                yVar.f4435b.mo19420c(xVar);
            }
            C19394m mVar = C19394m.f43287a;
        }
    }
}
