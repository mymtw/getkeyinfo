package androidx.work;

import androidx.work.C3380e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class OverwritingInputMerger extends C3384h {
    /* renamed from: a */
    public final C3380e mo12810a(ArrayList arrayList) {
        C3380e.C3381a aVar = new C3380e.C3381a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((C3380e) it.next()).f7899a));
        }
        aVar.mo12848c(hashMap);
        return aVar.mo12846a();
    }
}
