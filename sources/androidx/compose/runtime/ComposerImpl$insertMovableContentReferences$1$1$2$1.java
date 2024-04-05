package androidx.compose.runtime;

import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

final class ComposerImpl$insertMovableContentReferences$1$1$2$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> $offsetChanges;
    public final /* synthetic */ C1298b1 $reader;
    public final /* synthetic */ C1332i0 $to;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$2$1(ComposerImpl composerImpl, List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list, C1298b1 b1Var, C1332i0 i0Var) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = list;
        this.$reader = b1Var;
        this.$to = i0Var;
    }

    public final void invoke() {
        C1298b1 b1Var;
        int[] iArr;
        ComposerImpl composerImpl = this.this$0;
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list = this.$offsetChanges;
        C1298b1 b1Var2 = this.$reader;
        C1332i0 i0Var = this.$to;
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list2 = composerImpl.f2719e;
        try {
            composerImpl.f2719e = list;
            b1Var = composerImpl.f2695D;
            iArr = composerImpl.f2728n;
            composerImpl.f2728n = null;
            composerImpl.f2695D = b1Var2;
            composerImpl.mo5429b0(i0Var.f2915a, i0Var.f2921g, i0Var.f2916b, true);
            C19394m mVar = C19394m.f43287a;
            composerImpl.f2695D = b1Var;
            composerImpl.f2728n = iArr;
            composerImpl.f2719e = list2;
        } catch (Throwable th) {
            composerImpl.f2719e = list2;
            throw th;
        }
    }
}
