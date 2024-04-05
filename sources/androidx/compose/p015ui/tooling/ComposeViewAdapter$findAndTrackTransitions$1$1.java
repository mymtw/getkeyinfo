package androidx.compose.p015ui.tooling;

import androidx.compose.p015ui.tooling.data.C2060c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackTransitions$1$1 */
public final class ComposeViewAdapter$findAndTrackTransitions$1$1 extends Lambda implements C19857l<C2060c, Boolean> {
    public static final ComposeViewAdapter$findAndTrackTransitions$1$1 INSTANCE = new ComposeViewAdapter$findAndTrackTransitions$1$1();

    public ComposeViewAdapter$findAndTrackTransitions$1$1() {
        super(1);
    }

    public final Boolean invoke(C2060c cVar) {
        C19383o.m32797g(cVar, "it");
        return Boolean.valueOf(C19383o.m32792b(cVar.f4654b, "updateTransition") && cVar.f4655c != null);
    }
}
