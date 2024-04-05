package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends Lambda implements C19857l<Object, Boolean> {
    public final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
    }

    public final Boolean invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        C1369e eVar = this.this$0.f2963c;
        return Boolean.valueOf(eVar != null ? eVar.mo5923a(obj) : true);
    }
}
