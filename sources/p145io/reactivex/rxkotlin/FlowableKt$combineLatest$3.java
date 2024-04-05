package p145io.reactivex.rxkotlin;

import kotlin.Triple;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.C19401d;
import p753kq.C19862q;

/* renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$3 */
final /* synthetic */ class FlowableKt$combineLatest$3 extends FunctionReference implements C19862q<Object, Object, Object, Triple<Object, Object, Object>> {
    public static final FlowableKt$combineLatest$3 INSTANCE = new FlowableKt$combineLatest$3();

    public FlowableKt$combineLatest$3() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final C19401d getOwner() {
        return C19386q.m32807a(Triple.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    public final Triple<Object, Object, Object> invoke(Object obj, Object obj2, Object obj3) {
        C19383o.m32798h(obj, "p1");
        C19383o.m32798h(obj2, "p2");
        C19383o.m32798h(obj3, "p3");
        return new Triple<>(obj, obj2, obj3);
    }
}
