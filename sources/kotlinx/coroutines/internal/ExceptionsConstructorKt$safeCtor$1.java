package kotlinx.coroutines.internal;

import androidx.compose.foundation.layout.C0761x;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements C19857l<Throwable, Throwable> {
    public final /* synthetic */ C19857l<Throwable, Throwable> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$safeCtor$1(C19857l<? super Throwable, ? extends Throwable> lVar) {
        super(1);
        this.$block = lVar;
    }

    public final Throwable invoke(Throwable th) {
        Object obj;
        try {
            obj = Result.m35480constructorimpl(this.$block.invoke(th));
        } catch (Throwable th2) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th2));
        }
        if (Result.m35485isFailureimpl(obj)) {
            obj = null;
        }
        return (Throwable) obj;
    }
}
