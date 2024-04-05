package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ThreeLine$ListItem$1$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $overlineText;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $secondaryText;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$1$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3) {
        super(2);
        this.$overlineText = pVar;
        this.$$dirty = i;
        this.$text = pVar2;
        this.$secondaryText = pVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            dVar.mo5465u(-755940677);
            C19861p<C1302d, Integer, C19394m> pVar = this.$overlineText;
            if (pVar != null) {
                pVar.invoke(dVar, Integer.valueOf((this.$$dirty >> 12) & 14));
            }
            dVar.mo5406H();
            this.$text.invoke(dVar, Integer.valueOf((this.$$dirty >> 6) & 14));
            this.$secondaryText.invoke(dVar, Integer.valueOf((this.$$dirty >> 9) & 14));
            return;
        }
        dVar.mo5396C();
    }
}
