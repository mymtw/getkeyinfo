package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ListSaverKt$listSaver$1 extends Lambda implements C19861p<C1375i, Object, Object> {
    public final /* synthetic */ C19861p<C1375i, Object, List<Object>> $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListSaverKt$listSaver$1(C19861p<? super C1375i, Object, ? extends List<Object>> pVar) {
        super(2);
        this.$save = pVar;
    }

    public final Object invoke(C1375i iVar, Object obj) {
        C19383o.m32797g(iVar, "$this$Saver");
        List invoke = this.$save.invoke(iVar, obj);
        int size = invoke.size();
        int i = 0;
        while (i < size) {
            Object obj2 = invoke.get(i);
            if (obj2 == null || iVar.mo5915a(obj2)) {
                i++;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        if (!invoke.isEmpty()) {
            return new ArrayList(invoke);
        }
        return null;
    }
}
