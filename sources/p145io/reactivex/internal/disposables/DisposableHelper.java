package p145io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.ProtocolViolationException;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.disposables.DisposableHelper */
public enum DisposableHelper implements Disposable {
    DISPOSED;

    public static boolean dispose(AtomicReference<Disposable> atomicReference) {
        Disposable andSet;
        Disposable disposable = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (disposable == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(Disposable disposable) {
        return disposable == DISPOSED;
    }

    public static boolean replace(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        boolean z;
        do {
            Disposable disposable2 = atomicReference.get();
            z = false;
            if (disposable2 != DISPOSED) {
                while (true) {
                    if (!atomicReference.compareAndSet(disposable2, disposable)) {
                        if (atomicReference.get() != disposable2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!z);
        return true;
    }

    public static void reportDisposableSet() {
        C18981a.m32123b(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        boolean z;
        do {
            disposable2 = atomicReference.get();
            z = false;
            if (disposable2 != DISPOSED) {
                while (true) {
                    if (!atomicReference.compareAndSet(disposable2, disposable)) {
                        if (atomicReference.get() != disposable2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!z);
        if (disposable2 != null) {
            disposable2.dispose();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        boolean z;
        if (disposable != null) {
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, disposable)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            disposable.dispose();
            if (atomicReference.get() != DISPOSED) {
                reportDisposableSet();
            }
            return false;
        }
        throw new NullPointerException("d is null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean trySet(java.util.concurrent.atomic.AtomicReference<p145io.reactivex.disposables.Disposable> r3, p145io.reactivex.disposables.Disposable r4) {
        /*
        L_0x0000:
            r0 = 0
            boolean r0 = r3.compareAndSet(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
            r0 = r2
            goto L_0x0012
        L_0x000b:
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0020
            java.lang.Object r3 = r3.get()
            io.reactivex.internal.disposables.DisposableHelper r0 = DISPOSED
            if (r3 != r0) goto L_0x001f
            r4.dispose()
        L_0x001f:
            return r1
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.disposables.DisposableHelper.trySet(java.util.concurrent.atomic.AtomicReference, io.reactivex.disposables.Disposable):boolean");
    }

    public static boolean validate(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            C18981a.m32123b(new NullPointerException("next is null"));
            return false;
        } else if (disposable == null) {
            return true;
        } else {
            disposable2.dispose();
            reportDisposableSet();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
