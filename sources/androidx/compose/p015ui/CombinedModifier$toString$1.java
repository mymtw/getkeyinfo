package androidx.compose.p015ui;

import androidx.compose.p015ui.C1436d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.CombinedModifier$toString$1 */
public final class CombinedModifier$toString$1 extends Lambda implements C19861p<String, C1436d.C1438b, String> {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    public CombinedModifier$toString$1() {
        super(2);
    }

    public final String invoke(String str, C1436d.C1438b bVar) {
        C19383o.m32797g(str, "acc");
        C19383o.m32797g(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }
}
