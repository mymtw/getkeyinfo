package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import p098f0.C6765c;
import p098f0.C6767e;
import p288y.C8345d;

public final class BringIntoViewResponderModifier extends C0880b implements C6765c<C0881c>, C0881c {

    /* renamed from: e */
    public C0884f f1887e;

    /* renamed from: f */
    public Pair<C8345d, ? extends C19699g1> f1888f;

    /* renamed from: g */
    public Pair<C8345d, ? extends C19699g1> f1889g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(C0879a aVar) {
        super(aVar);
        C19383o.m32797g(aVar, "defaultParent");
    }

    /* renamed from: b */
    public static final Object m1933b(BringIntoViewResponderModifier bringIntoViewResponderModifier, Pair pair, C1689j jVar, C19340c cVar) {
        bringIntoViewResponderModifier.f1889g = pair;
        C8345d dVar = (C8345d) pair.getFirst();
        C0884f fVar = bringIntoViewResponderModifier.f1887e;
        if (fVar != null) {
            Object d = C19697g.m33466d(new BringIntoViewResponderModifier$dispatchRequest$2(bringIntoViewResponderModifier, fVar.mo3727b(dVar), jVar, dVar, (C19340c<? super BringIntoViewResponderModifier$dispatchRequest$2>) null), cVar);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
        }
        C19383o.m32805o("responder");
        throw null;
    }

    /* renamed from: a */
    public final Object mo4409a(C8345d dVar, C1689j jVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new BringIntoViewResponderModifier$bringChildIntoView$2(this, jVar, dVar, (C19340c<? super BringIntoViewResponderModifier$bringChildIntoView$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }

    public final C6767e<C0881c> getKey() {
        return BringIntoViewKt.f1883a;
    }

    public final Object getValue() {
        return this;
    }
}
