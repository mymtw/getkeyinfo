package androidx.compose.p015ui.semantics;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1 */
public final class SemanticsProperties$ContentDescription$1 extends Lambda implements C19861p<List<? extends String>, List<? extends String>, List<? extends String>> {
    public static final SemanticsProperties$ContentDescription$1 INSTANCE = new SemanticsProperties$ContentDescription$1();

    public SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    public final List<String> invoke(List<String> list, List<String> list2) {
        C19383o.m32797g(list2, "childValue");
        if (list == null) {
            return list2;
        }
        ArrayList q1 = C19327t.m32661q1(list);
        q1.addAll(list2);
        return q1;
    }
}
