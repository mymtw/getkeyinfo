package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AbstractMap$toString$1 extends Lambda implements C19857l<Map.Entry<? extends K, ? extends V>, CharSequence> {
    public final /* synthetic */ AbstractMap<K, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractMap$toString$1(AbstractMap<K, ? extends V> abstractMap) {
        super(1);
        this.this$0 = abstractMap;
    }

    public final CharSequence invoke(Map.Entry<? extends K, ? extends V> entry) {
        String str;
        C19383o.m32797g(entry, "it");
        AbstractMap<K, V> abstractMap = this.this$0;
        abstractMap.getClass();
        StringBuilder sb = new StringBuilder();
        Object key = entry.getKey();
        String str2 = "(this Map)";
        if (key == abstractMap) {
            str = str2;
        } else {
            str = String.valueOf(key);
        }
        sb.append(str);
        sb.append('=');
        Object value = entry.getValue();
        if (value != abstractMap) {
            str2 = String.valueOf(value);
        }
        sb.append(str2);
        return sb.toString();
    }
}
