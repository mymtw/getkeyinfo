package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

final class ListItemKt$applyTextStyle$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ float $contentAlpha;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C2023s $textStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$applyTextStyle$1(float f, C2023s sVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        super(2);
        this.$contentAlpha = f;
        this.$textStyle = sVar;
        this.$icon = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(this.$contentAlpha))};
            final C2023s sVar = this.$textStyle;
            final C19861p<C1302d, Integer, C19394m> pVar = this.$icon;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 1665877604, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        TextKt.m2282a(sVar, pVar, dVar, 0);
                    } else {
                        dVar.mo5396C();
                    }
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
