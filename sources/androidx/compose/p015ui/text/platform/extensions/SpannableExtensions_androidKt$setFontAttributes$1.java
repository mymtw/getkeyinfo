package androidx.compose.p015ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.android.style.TypefaceSpan;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1 */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements C19862q<C2012n, Integer, Integer, C19394m> {
    public final /* synthetic */ C19863r<C1952g, C1959m, C1957k, C1958l, Typeface> $resolveTypeface;
    public final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, C19863r<? super C1952g, ? super C1959m, ? super C1957k, ? super C1958l, ? extends Typeface> rVar) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = rVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2012n) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C2012n nVar, int i, int i2) {
        C19383o.m32797g(nVar, "spanStyle");
        Spannable spannable = this.$this_setFontAttributes;
        C19863r<C1952g, C1959m, C1957k, C1958l, Typeface> rVar = this.$resolveTypeface;
        C1952g gVar = nVar.f4541f;
        C1959m mVar = nVar.f4538c;
        if (mVar == null) {
            C1959m mVar2 = C1959m.f4409c;
            mVar = C1959m.f4413g;
        }
        C1957k kVar = nVar.f4539d;
        C1957k kVar2 = new C1957k(kVar != null ? kVar.f4407a : 0);
        C1958l lVar = nVar.f4540e;
        spannable.setSpan(new TypefaceSpan(rVar.invoke(gVar, mVar, kVar2, new C1958l(lVar != null ? lVar.f4408a : 1))), i, i2, 33);
    }
}
