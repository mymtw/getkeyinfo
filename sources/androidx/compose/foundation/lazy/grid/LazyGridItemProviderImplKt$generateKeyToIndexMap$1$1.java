package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0837b;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1 extends Lambda implements C19857l<C0837b.C0838a<C0804f>, C19394m> {
    public final /* synthetic */ int $first;
    public final /* synthetic */ int $last;
    public final /* synthetic */ HashMap<Object, Integer> $map;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1(int i, int i2, HashMap<Object, Integer> hashMap) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = hashMap;
    }

    public final void invoke(C0837b.C0838a<C0804f> aVar) {
        C19383o.m32797g(aVar, "it");
        ((C0804f) aVar.f1795c).getClass();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0837b.C0838a<C0804f>) (C0837b.C0838a) obj);
        return C19394m.f43287a;
    }
}
