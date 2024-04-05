package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.CompositionLocalKt;
import java.util.Map;

public final class SelectionRegistrarKt {

    /* renamed from: a */
    public static final C1411t f2081a = CompositionLocalKt.m2531b(SelectionRegistrarKt$LocalSelectionRegistrar$1.INSTANCE);

    /* renamed from: a */
    public static final boolean m2033a(C1018l lVar, long j) {
        Map<Long, C1011g> b;
        if (lVar == null || (b = lVar.mo4713b()) == null) {
            return false;
        }
        return b.containsKey(Long.valueOf(j));
    }
}
