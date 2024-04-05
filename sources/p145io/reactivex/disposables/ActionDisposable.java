package p145io.reactivex.disposables;

import p145io.reactivex.internal.util.ExceptionHelper;
import p287xp.C8333a;

/* renamed from: io.reactivex.disposables.ActionDisposable */
final class ActionDisposable extends ReferenceDisposable<C8333a> {
    private static final long serialVersionUID = -8219729196779211169L;

    public ActionDisposable(C8333a aVar) {
        super(aVar);
    }

    public void onDisposed(C8333a aVar) {
        try {
            aVar.run();
        } catch (Throwable th) {
            throw ExceptionHelper.m32485d(th);
        }
    }
}
