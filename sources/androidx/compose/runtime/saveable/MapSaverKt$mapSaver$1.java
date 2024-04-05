package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class MapSaverKt$mapSaver$1 extends Lambda implements C19861p<C1375i, Object, List<? extends Object>> {
    public final /* synthetic */ C19861p<C1375i, Object, Map<String, Object>> $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$1(C19861p<? super C1375i, Object, ? extends Map<String, ? extends Object>> pVar) {
        super(2);
        this.$save = pVar;
    }

    public final List<Object> invoke(C1375i iVar, Object obj) {
        C19383o.m32797g(iVar, "$this$listSaver");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.$save.invoke(iVar, obj).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
