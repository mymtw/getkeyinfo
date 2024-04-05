package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SaveableStateHolderImpl$Companion$Saver$1 extends Lambda implements C19861p<C1375i, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {
    public static final SaveableStateHolderImpl$Companion$Saver$1 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$1();

    public SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    public final Map<Object, Map<String, List<Object>>> invoke(C1375i iVar, SaveableStateHolderImpl saveableStateHolderImpl) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(saveableStateHolderImpl, "it");
        LinkedHashMap A0 = C19294b0.m32558A0(saveableStateHolderImpl.f2961a);
        for (SaveableStateHolderImpl.RegistryHolder a : saveableStateHolderImpl.f2962b.values()) {
            a.mo5917a(A0);
        }
        if (A0.isEmpty()) {
            return null;
        }
        return A0;
    }
}
