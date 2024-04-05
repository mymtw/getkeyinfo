package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.C2493b;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MutablePreferences$toString$1 extends Lambda implements C19857l<Map.Entry<C2493b.C2494a<?>, Object>, CharSequence> {
    public static final MutablePreferences$toString$1 INSTANCE = new MutablePreferences$toString$1();

    public MutablePreferences$toString$1() {
        super(1);
    }

    public final CharSequence invoke(Map.Entry<C2493b.C2494a<?>, Object> entry) {
        C19383o.m32797g(entry, "entry");
        return "  " + entry.getKey().f5764a + " = " + entry.getValue();
    }
}
