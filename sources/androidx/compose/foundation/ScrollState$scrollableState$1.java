package androidx.compose.foundation;

import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p753kq.C19857l;

public final class ScrollState$scrollableState$1 extends Lambda implements C19857l<Float, Float> {
    public final /* synthetic */ ScrollState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Float invoke(float f) {
        ScrollState scrollState = this.this$0;
        float e = ((float) this.this$0.mo3693e()) + f + scrollState.f1283d;
        float L = C19388s.m32831L(e, 0.0f, (float) ((Number) scrollState.f1282c.getValue()).intValue());
        boolean z = !(e == L);
        float e2 = L - ((float) this.this$0.mo3693e());
        int l = C7279a.m13954l(e2);
        ScrollState scrollState2 = this.this$0;
        scrollState2.f1280a.setValue(Integer.valueOf(scrollState2.mo3693e() + l));
        this.this$0.f1283d = e2 - ((float) l);
        if (z) {
            f = e2;
        }
        return Float.valueOf(f);
    }
}
