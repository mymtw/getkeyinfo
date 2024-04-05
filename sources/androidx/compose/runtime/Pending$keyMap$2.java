package androidx.compose.runtime;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

final class Pending$keyMap$2 extends Lambda implements C19846a<HashMap<Object, LinkedHashSet<C1297b0>>> {
    public final /* synthetic */ C1350n0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(C1350n0 n0Var) {
        super(0);
        this.this$0 = n0Var;
    }

    public final HashMap<Object, LinkedHashSet<C1297b0>> invoke() {
        Object obj;
        C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
        HashMap<Object, LinkedHashSet<C1297b0>> hashMap = new HashMap<>();
        C1350n0 n0Var = this.this$0;
        int size = n0Var.f2942a.size();
        for (int i = 0; i < size; i++) {
            C1297b0 b0Var = n0Var.f2942a.get(i);
            if (b0Var.f2802b != null) {
                obj = new C1294a0(Integer.valueOf(b0Var.f2801a), b0Var.f2802b);
            } else {
                obj = Integer.valueOf(b0Var.f2801a);
            }
            LinkedHashSet<C1297b0> linkedHashSet = hashMap.get(obj);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                hashMap.put(obj, linkedHashSet);
            }
            linkedHashSet.add(b0Var);
        }
        return hashMap;
    }
}
