package androidx.compose.p015ui.text.platform;

import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p134i0.C6978a;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2 */
public final class AndroidParagraph$wordBoundary$2 extends Lambda implements C19846a<C6978a> {
    public final /* synthetic */ AndroidParagraph this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$wordBoundary$2(AndroidParagraph androidParagraph) {
        super(0);
        this.this$0 = androidParagraph;
    }

    public final C6978a invoke() {
        Locale textLocale = this.this$0.f4566a.f4578f.getTextLocale();
        C19383o.m32796f(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return new C6978a(textLocale, this.this$0.f4569d.mo7427e());
    }
}
