package kotlin.sequences;

import androidx.compose.foundation.layout.C0761x;
import java.util.Iterator;
import kotlin.collections.C19317j;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlin.sequences.k */
public class C19435k extends C0761x {

    /* renamed from: kotlin.sequences.k$a */
    public static final class C19436a implements C19431g<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f43360a;

        public C19436a(Iterator it) {
            this.f43360a = it;
        }

        public final Iterator<T> iterator() {
            return this.f43360a;
        }
    }

    /* renamed from: j1 */
    public static final <T> C19431g<T> m33000j1(Iterator<? extends T> it) {
        C19383o.m32797g(it, "<this>");
        C19436a aVar = new C19436a(it);
        return aVar instanceof C19422a ? aVar : new C19422a(aVar);
    }

    /* renamed from: k1 */
    public static final C19431g m33001k1(C19857l lVar, Object obj) {
        C19383o.m32797g(lVar, "nextFunction");
        return obj == null ? C19426d.f43342a : new C19429f(new SequencesKt__SequencesKt$generateSequence$2(obj), lVar);
    }

    /* renamed from: l1 */
    public static final <T> C19431g<T> m33002l1(T... tArr) {
        boolean z = true;
        if (tArr.length == 0) {
            return C19426d.f43342a;
        }
        if (tArr.length != 0) {
            z = false;
        }
        return z ? C19426d.f43342a : new C19317j(tArr);
    }
}
