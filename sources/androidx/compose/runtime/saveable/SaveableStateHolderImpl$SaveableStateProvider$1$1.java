package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p504ai.C13983i;
import p753kq.C19857l;

public final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ Object $key;
    public final /* synthetic */ SaveableStateHolderImpl.RegistryHolder $registryHolder;
    public final /* synthetic */ SaveableStateHolderImpl this$0;

    /* renamed from: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$a */
    public static final class C1364a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ SaveableStateHolderImpl.RegistryHolder f2967a;

        /* renamed from: b */
        public final /* synthetic */ SaveableStateHolderImpl f2968b;

        /* renamed from: c */
        public final /* synthetic */ Object f2969c;

        public C1364a(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
            this.f2967a = registryHolder;
            this.f2968b = saveableStateHolderImpl;
            this.f2969c = obj;
        }

        public final void dispose() {
            this.f2967a.mo5917a(this.f2968b.f2961a);
            this.f2968b.f2962b.remove(this.f2969c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
        this.$key = obj;
        this.$registryHolder = registryHolder;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        boolean z = !this.this$0.f2962b.containsKey(this.$key);
        Object obj = this.$key;
        if (z) {
            this.this$0.f2961a.remove(obj);
            this.this$0.f2962b.put(this.$key, this.$registryHolder);
            return new C1364a(this.this$0, this.$key, this.$registryHolder);
        }
        throw new IllegalArgumentException(C13983i.m21494m("Key ", obj, " was used multiple times ").toString());
    }
}
