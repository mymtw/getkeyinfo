package androidx.compose.p015ui.text.android;

import android.text.TextPaint;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics$maxIntrinsicWidth$2 */
final class LayoutIntrinsics$maxIntrinsicWidth$2 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ TextPaint $textPaint;
    public final /* synthetic */ C1920c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$maxIntrinsicWidth$2(C1920c cVar, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.this$0 = cVar;
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (androidx.activity.C0114h.m304i0(r2, androidx.compose.p015ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Float invoke() {
        /*
            r7 = this;
            androidx.compose.ui.text.android.c r0 = r7.this$0
            kotlin.c r0 = r0.f4324a
            java.lang.Object r0 = r0.getValue()
            android.text.BoringLayout$Metrics r0 = (android.text.BoringLayout.Metrics) r0
            r1 = 0
            if (r0 == 0) goto L_0x0011
            int r0 = r0.width
            float r0 = (float) r0
            goto L_0x001d
        L_0x0011:
            java.lang.CharSequence r0 = r7.$charSequence
            int r2 = r0.length()
            android.text.TextPaint r3 = r7.$textPaint
            float r0 = android.text.Layout.getDesiredWidth(r0, r1, r2, r3)
        L_0x001d:
            java.lang.CharSequence r2 = r7.$charSequence
            android.text.TextPaint r3 = r7.$textPaint
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L_0x0029
            r5 = r6
            goto L_0x002a
        L_0x0029:
            r5 = r1
        L_0x002a:
            if (r5 != 0) goto L_0x0050
            boolean r5 = r2 instanceof android.text.Spanned
            if (r5 == 0) goto L_0x0050
            float r3 = r3.getLetterSpacing()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x003a
            r3 = r6
            goto L_0x003b
        L_0x003a:
            r3 = r1
        L_0x003b:
            if (r3 == 0) goto L_0x004f
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanPx> r3 = androidx.compose.p015ui.text.android.style.LetterSpacingSpanPx.class
            boolean r3 = androidx.activity.C0114h.m304i0(r2, r3)
            if (r3 != 0) goto L_0x004f
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanEm> r3 = androidx.compose.p015ui.text.android.style.LetterSpacingSpanEm.class
            boolean r2 = androidx.activity.C0114h.m304i0(r2, r3)
            if (r2 == 0) goto L_0x0050
        L_0x004f:
            r1 = r6
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L_0x0055:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.android.LayoutIntrinsics$maxIntrinsicWidth$2.invoke():java.lang.Float");
    }
}
