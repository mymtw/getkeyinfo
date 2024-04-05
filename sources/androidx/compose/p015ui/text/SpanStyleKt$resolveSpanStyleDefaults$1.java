package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.style.C2026b;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1 */
final class SpanStyleKt$resolveSpanStyleDefaults$1 extends Lambda implements C19846a<TextDrawStyle> {
    public static final SpanStyleKt$resolveSpanStyleDefaults$1 INSTANCE = new SpanStyleKt$resolveSpanStyleDefaults$1();

    public SpanStyleKt$resolveSpanStyleDefaults$1() {
        super(0);
    }

    public final TextDrawStyle invoke() {
        long j = C2013o.f4554d;
        return (j > C1545s.f3364i ? 1 : (j == C1545s.f3364i ? 0 : -1)) != 0 ? new C2026b(j) : TextDrawStyle.C2024a.f4602a;
    }
}
