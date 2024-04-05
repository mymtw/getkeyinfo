package androidx.compose.p015ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1 */
final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements C19863r<C1952g, C1959m, C1957k, C1958l, Typeface> {
    public final /* synthetic */ C2016a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(C2016a aVar) {
        super(4);
        this.this$0 = aVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m34823invokeDPcqOEQ((C1952g) obj, (C1959m) obj2, ((C1957k) obj3).f4407a, ((C1958l) obj4).f4408a);
    }

    /* renamed from: invoke-DPcqOEQ  reason: not valid java name */
    public final Typeface m34823invokeDPcqOEQ(C1952g gVar, C1959m mVar, int i, int i2) {
        C19383o.m32797g(mVar, "fontWeight");
        C2017b bVar = new C2017b(this.this$0.f4576d.mo7537a(gVar, mVar, i, i2));
        this.this$0.f4581i.add(bVar);
        return (Typeface) bVar.f4584b;
    }
}
