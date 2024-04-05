package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.flow.internal.C19624a;
import kotlinx.coroutines.flow.internal.C19625b;

/* renamed from: kotlinx.coroutines.flow.y1 */
public final class C19692y1 extends C19625b<StateFlowImpl<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43632a = AtomicReferenceFieldUpdater.newUpdater(C19692y1.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    /* renamed from: a */
    public final boolean mo72372a(C19624a aVar) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) aVar;
        if (this._state != null) {
            return false;
        }
        this._state = C19388s.f43279j;
        return true;
    }

    /* renamed from: b */
    public final C19340c[] mo72373b(C19624a aVar) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) aVar;
        this._state = null;
        return C19421p.f43321k;
    }
}
