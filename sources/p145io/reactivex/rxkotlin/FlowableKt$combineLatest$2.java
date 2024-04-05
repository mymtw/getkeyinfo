package p145io.reactivex.rxkotlin;

import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.C19401d;
import p753kq.C19861p;

/* renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$2 */
final /* synthetic */ class FlowableKt$combineLatest$2 extends FunctionReference implements C19861p<Object, Object, Pair<Object, Object>> {
    public static final FlowableKt$combineLatest$2 INSTANCE = new FlowableKt$combineLatest$2();

    public FlowableKt$combineLatest$2() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final C19401d getOwner() {
        return C19386q.m32807a(Pair.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    public final Pair<Object, Object> invoke(Object obj, Object obj2) {
        C19383o.m32798h(obj, "p1");
        C19383o.m32798h(obj2, "p2");
        return new Pair<>(obj, obj2);
    }
}
