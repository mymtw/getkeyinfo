package androidx.compose.p015ui.text.android;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics$boringMetrics$2 */
final class LayoutIntrinsics$boringMetrics$2 extends Lambda implements C19846a<BoringLayout.Metrics> {
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ int $textDirectionHeuristic;
    public final /* synthetic */ TextPaint $textPaint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$boringMetrics$2(int i, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.$textDirectionHeuristic = i;
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    public final BoringLayout.Metrics invoke() {
        TextDirectionHeuristic a = C1931n.m4230a(this.$textDirectionHeuristic);
        CharSequence charSequence = this.$charSequence;
        TextPaint textPaint = this.$textPaint;
        C19383o.m32797g(charSequence, "text");
        if (!a.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }
}
