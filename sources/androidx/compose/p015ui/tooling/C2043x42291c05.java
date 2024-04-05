package androidx.compose.p015ui.tooling;

import androidx.compose.p015ui.tooling.data.C2060c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackTransitions$findTransitionObjects$rememberCalls$1$1 */
public final class C2043x42291c05 extends Lambda implements C19857l<C2060c, Boolean> {
    public static final C2043x42291c05 INSTANCE = new C2043x42291c05();

    public C2043x42291c05() {
        super(1);
    }

    public final Boolean invoke(C2060c cVar) {
        C19383o.m32797g(cVar, "call");
        return Boolean.valueOf(C19383o.m32792b(cVar.f4654b, "remember"));
    }
}
