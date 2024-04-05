package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SaveableStateHolderImpl$SaveableStateProvider$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ Object $key;
    public final /* synthetic */ SaveableStateHolderImpl $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$tmp0_rcvr = saveableStateHolderImpl;
        this.$key = obj;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo5916a(this.$key, this.$content, dVar, this.$$changed | 1);
    }
}
