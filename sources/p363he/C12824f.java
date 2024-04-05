package p363he;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;

/* renamed from: he.f */
public final class C12824f {

    /* renamed from: a */
    public final LinkedHashMap f28304a = new LinkedHashMap();

    /* renamed from: a */
    public final Bundle mo45608a() {
        Set<String> keySet = this.f28304a.keySet();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(keySet));
        for (String str : keySet) {
            arrayList.add(new Pair(str, this.f28304a.get(str)));
        }
        Object[] array = arrayList.toArray(new Pair[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Pair[] pairArr = (Pair[]) array;
        return C19382n.m32717K((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
