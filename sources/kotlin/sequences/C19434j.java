package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p753kq.C19861p;

/* renamed from: kotlin.sequences.j */
public final class C19434j implements C19431g<Object> {

    /* renamed from: a */
    public final /* synthetic */ C19861p f43359a;

    public C19434j(C19861p pVar) {
        this.f43359a = pVar;
    }

    public final Iterator<Object> iterator() {
        C19861p pVar = this.f43359a;
        C19383o.m32797g(pVar, "block");
        C19432h hVar = new C19432h();
        hVar.f43358e = C19388s.m32843R(pVar, hVar, hVar);
        return hVar;
    }
}
