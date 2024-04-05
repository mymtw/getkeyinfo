package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0837b;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class LazyGridItemsSnapshot$Item$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $index;
    public final /* synthetic */ C0810l $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemsSnapshot$Item$1(C0810l lVar, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = lVar;
        this.$index = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C0810l lVar = this.$tmp0_rcvr;
        int i2 = this.$index;
        lVar.getClass();
        dVar.mo5440h(-405085610);
        C0837b.C0838a<C0804f> aVar = lVar.f1707a.get(i2);
        int i3 = aVar.f1793a;
        ((C0804f) aVar.f1795c).getClass();
        throw null;
    }
}
