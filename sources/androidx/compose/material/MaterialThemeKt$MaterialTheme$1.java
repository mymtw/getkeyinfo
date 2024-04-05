package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

public final class MaterialThemeKt$MaterialTheme$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1178d2 $typography;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$1(C1178d2 d2Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$typography = d2Var;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C2023s sVar = this.$typography.f2410i;
            final C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            final int i2 = this.$$dirty;
            TextKt.m2282a(sVar, C18263b.m30805A(dVar, 181426554, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        MaterialTheme_androidKt.m2190a(pVar, dVar, (i2 >> 9) & 14);
                    } else {
                        dVar.mo5396C();
                    }
                }
            }), dVar, 48);
            return;
        }
        dVar.mo5396C();
    }
}
