package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19747k;
import p753kq.C19857l;

public final class ProduceKt$awaitClose$4$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19747k<C19394m> $cont;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProduceKt$awaitClose$4$1(C19747k<? super C19394m> kVar) {
        super(1);
        this.$cont = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$cont.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
    }
}
