package androidx.compose.runtime.internal;

import androidx.compose.p015ui.platform.C1830f0;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ComposableLambdaNImpl$invoke$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ Object[] $args;
    public final /* synthetic */ int $realParams;
    public final /* synthetic */ C1334a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableLambdaNImpl$invoke$1(Object[] objArr, int i, C1334a aVar) {
        super(2);
        this.$args = objArr;
        this.$realParams = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C19383o.m32797g(dVar, "nc");
        Object[] array = C19318k.m32618j1(this.$args, C19388s.m32816D0(0, this.$realParams)).toArray(new Object[0]);
        if (array != null) {
            Object obj = this.$args[this.$realParams + 1];
            if (obj != null) {
                int intValue = ((Integer) obj).intValue();
                Object[] objArr = this.$args;
                Object[] array2 = C19318k.m32618j1(objArr, C19388s.m32816D0(this.$realParams + 2, objArr.length)).toArray(new Object[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                C1830f0 f0Var = new C1830f0(4);
                f0Var.mo7210b(array);
                f0Var.mo7209a(dVar);
                f0Var.mo7209a(Integer.valueOf(intValue | 1));
                f0Var.mo7210b(array2);
                ((ArrayList) f0Var.f4088a).toArray(new Object[((ArrayList) f0Var.f4088a).size()]);
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
