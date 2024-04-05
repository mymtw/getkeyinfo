package p145io.reactivex.disposables;

import java.util.ArrayList;
import kotlin.reflect.C19421p;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.util.C19239b;
import p145io.reactivex.internal.util.ExceptionHelper;
import p494yp.C13940a;

/* renamed from: io.reactivex.disposables.a */
public final class C7091a implements Disposable, C13940a {

    /* renamed from: b */
    public C19239b<Disposable> f15780b;

    /* renamed from: c */
    public volatile boolean f15781c;

    /* renamed from: e */
    public static void m13744e(C19239b bVar) {
        if (bVar != null) {
            ArrayList arrayList = null;
            for (T t : bVar.f43039d) {
                if (t instanceof Disposable) {
                    try {
                        ((Disposable) t).dispose();
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw ExceptionHelper.m32485d((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo19402a(Disposable disposable) {
        if (!mo19404c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    /* renamed from: b */
    public final boolean mo19403b(Disposable disposable) {
        if (disposable != null) {
            if (!this.f15781c) {
                synchronized (this) {
                    if (!this.f15781c) {
                        C19239b<Disposable> bVar = this.f15780b;
                        if (bVar == null) {
                            bVar = new C19239b<>();
                            this.f15780b = bVar;
                        }
                        bVar.mo71361a(disposable);
                        return true;
                    }
                }
            }
            disposable.dispose();
            return false;
        }
        throw new NullPointerException("disposable is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004a A[DONT_GENERATE] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19404c(p145io.reactivex.disposables.Disposable r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            if (r8 == 0) goto L_0x0051
            boolean r0 = r7.f15781c
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            monitor-enter(r7)
            boolean r0 = r7.f15781c     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r1
        L_0x0011:
            io.reactivex.internal.util.b<io.reactivex.disposables.Disposable> r0 = r7.f15780b     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004c
            T[] r2 = r0.f43039d     // Catch:{ all -> 0x004e }
            int r3 = r0.f43036a     // Catch:{ all -> 0x004e }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004e }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004e }
            r6 = 1
            if (r5 != 0) goto L_0x002b
            goto L_0x003b
        L_0x002b:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0035
            r0.mo71362b(r4, r3, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0046
        L_0x0035:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004e }
            if (r5 != 0) goto L_0x003d
        L_0x003b:
            r8 = r1
            goto L_0x0047
        L_0x003d:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0035
            r0.mo71362b(r4, r3, r2)     // Catch:{ all -> 0x004e }
        L_0x0046:
            r8 = r6
        L_0x0047:
            if (r8 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r6
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            throw r8
        L_0x0051:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.disposables.C7091a.mo19404c(io.reactivex.disposables.Disposable):boolean");
    }

    /* renamed from: d */
    public final void mo19405d() {
        if (!this.f15781c) {
            synchronized (this) {
                if (!this.f15781c) {
                    C19239b<Disposable> bVar = this.f15780b;
                    this.f15780b = null;
                    m13744e(bVar);
                }
            }
        }
    }

    public final void dispose() {
        if (!this.f15781c) {
            synchronized (this) {
                if (!this.f15781c) {
                    this.f15781c = true;
                    C19239b<Disposable> bVar = this.f15780b;
                    this.f15780b = null;
                    m13744e(bVar);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        return r1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19406f() {
        /*
            r2 = this;
            boolean r0 = r2.f15781c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.f15781c     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x000d:
            io.reactivex.internal.util.b<io.reactivex.disposables.Disposable> r0 = r2.f15780b     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0013
            int r1 = r0.f43037b     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.disposables.C7091a.mo19406f():int");
    }

    public final boolean isDisposed() {
        return this.f15781c;
    }
}
