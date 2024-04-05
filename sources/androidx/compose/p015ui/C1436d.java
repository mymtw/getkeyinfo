package androidx.compose.p015ui;

import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.d */
public interface C1436d {

    /* renamed from: a0 */
    public static final /* synthetic */ int f3124a0 = 0;

    /* renamed from: androidx.compose.ui.d$a */
    public static final class C1437a implements C1436d {

        /* renamed from: b */
        public static final /* synthetic */ C1437a f3125b = new C1437a();

        /* renamed from: c */
        public final boolean mo6116c(C19857l<? super C1438b, Boolean> lVar) {
            C19383o.m32797g(lVar, "predicate");
            return true;
        }

        /* renamed from: i */
        public final <R> R mo6119i(R r, C19861p<? super R, ? super C1438b, ? extends R> pVar) {
            C19383o.m32797g(pVar, "operation");
            return r;
        }

        /* renamed from: i0 */
        public final C1436d mo6148i0(C1436d dVar) {
            C19383o.m32797g(dVar, "other");
            return dVar;
        }

        /* renamed from: m */
        public final <R> R mo6120m(R r, C19861p<? super C1438b, ? super R, ? extends R> pVar) {
            return r;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    /* renamed from: androidx.compose.ui.d$b */
    public interface C1438b extends C1436d {
        /* renamed from: c */
        boolean mo6116c(C19857l<? super C1438b, Boolean> lVar) {
            C19383o.m32797g(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }

        /* renamed from: i */
        <R> R mo6119i(R r, C19861p<? super R, ? super C1438b, ? extends R> pVar) {
            C19383o.m32797g(pVar, "operation");
            return pVar.invoke(r, this);
        }

        /* renamed from: m */
        <R> R mo6120m(R r, C19861p<? super C1438b, ? super R, ? extends R> pVar) {
            return pVar.invoke(this, r);
        }
    }

    /* renamed from: c */
    boolean mo6116c(C19857l<? super C1438b, Boolean> lVar);

    /* renamed from: i */
    <R> R mo6119i(R r, C19861p<? super R, ? super C1438b, ? extends R> pVar);

    /* renamed from: i0 */
    C1436d mo6148i0(C1436d dVar) {
        C19383o.m32797g(dVar, "other");
        return dVar == C1437a.f3125b ? this : new CombinedModifier(this, dVar);
    }

    /* renamed from: m */
    <R> R mo6120m(R r, C19861p<? super C1438b, ? super R, ? extends R> pVar);
}
