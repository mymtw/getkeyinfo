package androidx.compose.p015ui.window;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1 */
public final class AndroidDialog_androidKt$Dialog$dialog$1$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C1342k1<C19861p<C1302d, Integer, C19394m>> $currentContent$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$dialog$1$1$1(C1342k1<? extends C19861p<? super C1302d, ? super Integer, C19394m>> k1Var) {
        super(2);
        this.$currentContent$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d a = SemanticsModifierKt.m4174a(C1436d.C1437a.f3125b, false, C20771.INSTANCE);
            final C1342k1<C19861p<C1302d, Integer, C19394m>> k1Var = this.$currentContent$delegate;
            AndroidDialog_androidKt.m4512b(a, C18263b.m30805A(dVar, -533674951, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        k1Var.getValue().invoke(dVar, 0);
                    } else {
                        dVar.mo5396C();
                    }
                }
            }), dVar, 48, 0);
            return;
        }
        dVar.mo5396C();
    }
}
