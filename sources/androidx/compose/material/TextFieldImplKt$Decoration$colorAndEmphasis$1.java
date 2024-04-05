package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

public final class TextFieldImplKt$Decoration$colorAndEmphasis$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ Float $contentAlpha;
    public final /* synthetic */ long $contentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$Decoration$colorAndEmphasis$1(long j, Float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$contentColor = j;
        this.$contentAlpha = f;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {ContentColorKt.f2199a.mo5908b(new C1545s(this.$contentColor))};
            final Float f = this.$contentAlpha;
            final C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            final int i2 = this.$$dirty;
            final long j = this.$contentColor;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, -1132188434, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) == 2 && dVar.mo5442i()) {
                        dVar.mo5396C();
                    } else if (f != null) {
                        dVar.mo5465u(-452622131);
                        CompositionLocalKt.m2530a(new C1412t0[]{ContentAlphaKt.f2198a.mo5908b(f)}, pVar, dVar, ((i2 >> 6) & 112) | 8);
                        dVar.mo5406H();
                    } else {
                        dVar.mo5465u(-452621951);
                        CompositionLocalKt.m2530a(new C1412t0[]{ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(j)))}, pVar, dVar, ((i2 >> 6) & 112) | 8);
                        dVar.mo5406H();
                    }
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
