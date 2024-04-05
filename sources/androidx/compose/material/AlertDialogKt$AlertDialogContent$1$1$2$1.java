package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p628nj.C18263b;
import p753kq.C19861p;

public final class AlertDialogKt$AlertDialogContent$1$1$2$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$1$1$2$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$text = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C19543e0.m33302T(dVar)))};
            final C19861p<C1302d, Integer, C19394m> pVar = this.$text;
            final int i2 = this.$$dirty;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 2115920639, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        TextKt.m2282a(((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2411j, pVar, dVar, (i2 >> 6) & 112);
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
