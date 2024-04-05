package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SaveableStateHolderImpl$Companion$Saver$2 extends Lambda implements C19857l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {
    public static final SaveableStateHolderImpl$Companion$Saver$2 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$2();

    public SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    public final SaveableStateHolderImpl invoke(Map<Object, Map<String, List<Object>>> map) {
        C19383o.m32797g(map, "it");
        return new SaveableStateHolderImpl(map);
    }
}
