package androidx.compose.p015ui.platform;

import android.os.Bundle;
import androidx.compose.runtime.saveable.C1369e;
import androidx.compose.runtime.saveable.C1371f;
import androidx.savedstate.C3265b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.compose.ui.platform.j0 */
public final class C1842j0 implements C3265b.C3267b {

    /* renamed from: a */
    public final /* synthetic */ C1369e f4100a;

    public C1842j0(C1371f fVar) {
        this.f4100a = fVar;
    }

    /* renamed from: a */
    public final Bundle mo1115a() {
        Map<String, List<Object>> c = this.f4100a.mo5925c();
        Bundle bundle = new Bundle();
        for (Map.Entry next : c.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        return bundle;
    }
}
