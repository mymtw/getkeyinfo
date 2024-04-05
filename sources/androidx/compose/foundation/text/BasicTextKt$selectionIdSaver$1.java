package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C1018l;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class BasicTextKt$selectionIdSaver$1 extends Lambda implements C19861p<C1375i, Long, Long> {
    public final /* synthetic */ C1018l $selectionRegistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(C1018l lVar) {
        super(2);
        this.$selectionRegistrar = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((C1375i) obj, ((Number) obj2).longValue());
    }

    public final Long invoke(C1375i iVar, long j) {
        C19383o.m32797g(iVar, "$this$Saver");
        if (SelectionRegistrarKt.m2033a(this.$selectionRegistrar, j)) {
            return Long.valueOf(j);
        }
        return null;
    }
}
