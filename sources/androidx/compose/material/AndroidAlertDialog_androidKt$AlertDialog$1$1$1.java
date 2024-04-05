package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AndroidAlertDialog_androidKt$AlertDialog$1$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $confirmButton;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $dismissButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$1$1$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, C19861p<? super C1302d, ? super Integer, C19394m> pVar2) {
        super(2);
        this.$dismissButton = pVar;
        this.$$dirty = i;
        this.$confirmButton = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19861p<C1302d, Integer, C19394m> pVar = this.$dismissButton;
            dVar.mo5465u(-1046483318);
            if (pVar != null) {
                pVar.invoke(dVar, Integer.valueOf((this.$$dirty >> 9) & 14));
                C19394m mVar = C19394m.f43287a;
            }
            dVar.mo5406H();
            this.$confirmButton.invoke(dVar, Integer.valueOf((this.$$dirty >> 3) & 14));
            return;
        }
        dVar.mo5396C();
    }
}
