package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.Result;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8073u;

/* renamed from: kotlinx.coroutines.rx2.a */
public final class C19788a implements C8073u<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19747k<Object> f43757b;

    public C19788a(C19753l lVar) {
        this.f43757b = lVar;
    }

    public final void onError(Throwable th) {
        this.f43757b.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
    }

    public final void onSubscribe(Disposable disposable) {
        this.f43757b.mo72497O(new RxAwaitKt$disposeOnCancellation$1(disposable));
    }

    public final void onSuccess(Object obj) {
        this.f43757b.resumeWith(Result.m35480constructorimpl(obj));
    }
}
