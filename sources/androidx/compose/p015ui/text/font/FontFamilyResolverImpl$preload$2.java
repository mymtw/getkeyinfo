package androidx.compose.p015ui.text.font;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 */
final class FontFamilyResolverImpl$preload$2 extends Lambda implements C19857l<C1972x, C1974z> {
    public final /* synthetic */ C1954h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(C1954h hVar) {
        super(1);
        this.this$0 = hVar;
    }

    public final C1974z invoke(C1972x xVar) {
        C19383o.m32797g(xVar, "typeRequest");
        C1954h hVar = this.this$0;
        C1974z a = hVar.f4400d.mo7517a(xVar, hVar.f4397a, C19401.INSTANCE, hVar.f4402f);
        if (a == null) {
            C1954h hVar2 = this.this$0;
            a = hVar2.f4401e.mo7582a(xVar, hVar2.f4397a, C19412.INSTANCE, hVar2.f4402f);
            if (a == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return a;
    }
}
