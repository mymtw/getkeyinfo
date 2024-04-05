package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.text.C1913a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$Text$1 */
public final class SemanticsProperties$Text$1 extends Lambda implements C19861p<List<? extends C1913a>, List<? extends C1913a>, List<? extends C1913a>> {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    public SemanticsProperties$Text$1() {
        super(2);
    }

    public final List<C1913a> invoke(List<C1913a> list, List<C1913a> list2) {
        C19383o.m32797g(list2, "childValue");
        if (list == null) {
            return list2;
        }
        ArrayList q1 = C19327t.m32661q1(list);
        q1.addAll(list2);
        return q1;
    }
}
