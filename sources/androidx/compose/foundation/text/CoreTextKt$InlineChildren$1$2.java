package androidx.compose.foundation.text;

import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

public final class CoreTextKt$InlineChildren$1$2 implements C1711v {

    /* renamed from: a */
    public static final CoreTextKt$InlineChildren$1$2 f1915a = new CoreTextKt$InlineChildren$1$2();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, ResponseConstants.CHILDREN);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C1710u) list.get(i)).mo6665J(j));
        }
        return xVar.mo4387Z(C7280a.m13963h(j), C7280a.m13962g(j), C19294b0.m32559p0(), new CoreTextKt$InlineChildren$1$2$measure$1(arrayList));
    }
}
