package androidx.compose.p015ui.text.font;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1 */
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements C19857l<C1972x, Object> {
    public final /* synthetic */ C1954h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(C1954h hVar) {
        super(1);
        this.this$0 = hVar;
    }

    public final Object invoke(C1972x xVar) {
        C19383o.m32797g(xVar, "it");
        C1954h hVar = this.this$0;
        C1959m mVar = xVar.f4430b;
        int i = xVar.f4431c;
        int i2 = xVar.f4432d;
        Object obj = xVar.f4433e;
        C19383o.m32797g(mVar, "fontWeight");
        return hVar.mo7538b(new C1972x((C1952g) null, mVar, i, i2, obj)).getValue();
    }
}
