package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C0837b;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyListItemProviderImplKt$generateKeyToIndexMap$1$1 extends Lambda implements C19857l<C0837b.C0838a<C0826i>, C19394m> {
    public final /* synthetic */ int $first;
    public final /* synthetic */ int $last;
    public final /* synthetic */ HashMap<Object, Integer> $map;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(int i, int i2, HashMap<Object, Integer> hashMap) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = hashMap;
    }

    public final void invoke(C0837b.C0838a<C0826i> aVar) {
        C19383o.m32797g(aVar, "it");
        T t = aVar.f1795c;
        if (((C0826i) t).f1781a != null) {
            C19857l<Integer, Object> lVar = ((C0826i) t).f1781a;
            if (lVar != null) {
                int max = Math.max(this.$first, aVar.f1793a);
                int min = Math.min(this.$last, (aVar.f1793a + aVar.f1794b) - 1);
                if (max <= min) {
                    while (true) {
                        this.$map.put(lVar.invoke(Integer.valueOf(max - aVar.f1793a)), Integer.valueOf(max));
                        if (max != min) {
                            max++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0837b.C0838a<C0826i>) (C0837b.C0838a) obj);
        return C19394m.f43287a;
    }
}
