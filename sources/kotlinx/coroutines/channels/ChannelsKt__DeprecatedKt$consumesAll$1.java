package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

final class ChannelsKt__DeprecatedKt$consumesAll$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19515q<?>[] $channels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$consumesAll$1(C19515q<?>[] qVarArr) {
        super(1);
        this.$channels = qVarArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19515q<?>[] qVarArr = this.$channels;
        int length = qVarArr.length;
        Throwable th2 = null;
        int i = 0;
        while (i < length) {
            C19515q<?> qVar = qVarArr[i];
            i++;
            try {
                C19388s.m32827J(qVar, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    C17782b.m29886t(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
