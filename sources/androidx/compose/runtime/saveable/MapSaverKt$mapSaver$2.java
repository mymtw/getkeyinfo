package androidx.compose.runtime.saveable;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class MapSaverKt$mapSaver$2 extends Lambda implements C19857l<List<? extends Object>, Object> {
    public final /* synthetic */ C19857l<Map<String, ? extends Object>, Object> $restore;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$2(C19857l<? super Map<String, ? extends Object>, Object> lVar) {
        super(1);
        this.$restore = lVar;
    }

    public final Object invoke(List<? extends Object> list) {
        C19383o.m32797g(list, ResponseConstants.LIST);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        if (list.size() % 2 == 0) {
            while (i < list.size()) {
                Object obj = list.get(i);
                if (obj != null) {
                    linkedHashMap.put((String) obj, list.get(i + 1));
                    i += 2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return this.$restore.invoke(linkedHashMap);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
