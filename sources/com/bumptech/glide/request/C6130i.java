package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.i */
public final class C6130i implements RequestCoordinator, C6124d {

    /* renamed from: a */
    public final RequestCoordinator f13237a;

    /* renamed from: b */
    public final Object f13238b;

    /* renamed from: c */
    public volatile C6124d f13239c;

    /* renamed from: d */
    public volatile C6124d f13240d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f13241e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f13242f;

    /* renamed from: g */
    public boolean f13243g;

    public C6130i(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f13241e = requestState;
        this.f13242f = requestState;
        this.f13238b = obj;
        this.f13237a = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean mo17113a() {
        boolean z;
        synchronized (this.f13238b) {
            if (!this.f13240d.mo17121a()) {
                if (!this.f13239c.mo17121a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo17114b(C6124d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f13238b) {
            RequestCoordinator requestCoordinator = this.f13237a;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo17114b(this)) {
                    z2 = false;
                    if (z2 && dVar.equals(this.f13239c) && !mo17113a()) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo17123c() {
        boolean z;
        synchronized (this.f13238b) {
            z = this.f13241e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    public final void clear() {
        synchronized (this.f13238b) {
            this.f13243g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f13241e = requestState;
            this.f13242f = requestState;
            this.f13240d.clear();
            this.f13239c.clear();
        }
    }

    /* renamed from: d */
    public final boolean mo17115d(C6124d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f13238b) {
            RequestCoordinator requestCoordinator = this.f13237a;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo17115d(this)) {
                    z2 = false;
                    if (z2 && (dVar.equals(this.f13239c) || this.f13241e != RequestCoordinator.RequestState.SUCCESS)) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo17126e() {
        boolean z;
        synchronized (this.f13238b) {
            z = this.f13241e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17116f(com.bumptech.glide.request.C6124d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13238b
            monitor-enter(r0)
            com.bumptech.glide.request.d r1 = r2.f13239c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f13242f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f13241e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f13237a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo17116f(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6130i.mo17116f(com.bumptech.glide.request.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17128g(com.bumptech.glide.request.C6124d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.C6130i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.i r4 = (com.bumptech.glide.request.C6130i) r4
            com.bumptech.glide.request.d r0 = r3.f13239c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.request.d r0 = r4.f13239c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.request.d r0 = r3.f13239c
            com.bumptech.glide.request.d r2 = r4.f13239c
            boolean r0 = r0.mo17128g(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.request.d r0 = r3.f13240d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.request.d r4 = r4.f13240d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.request.d r0 = r3.f13240d
            com.bumptech.glide.request.d r4 = r4.f13240d
            boolean r4 = r0.mo17128g(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6130i.mo17128g(com.bumptech.glide.request.d):boolean");
    }

    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f13238b) {
            RequestCoordinator requestCoordinator = this.f13237a;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    /* renamed from: h */
    public final void mo17129h() {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2;
        synchronized (this.f13238b) {
            this.f13243g = true;
            try {
                if (!(this.f13241e == RequestCoordinator.RequestState.SUCCESS || this.f13242f == (requestState2 = RequestCoordinator.RequestState.RUNNING))) {
                    this.f13242f = requestState2;
                    this.f13240d.mo17129h();
                }
                if (this.f13243g && this.f13241e != (requestState = RequestCoordinator.RequestState.RUNNING)) {
                    this.f13241e = requestState;
                    this.f13239c.mo17129h();
                }
            } finally {
                this.f13243g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17118i(com.bumptech.glide.request.C6124d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13238b
            monitor-enter(r0)
            com.bumptech.glide.request.d r1 = r2.f13240d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f13242f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f13241e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f13237a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo17118i(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f13242f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            com.bumptech.glide.request.d r3 = r2.f13240d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6130i.mo17118i(com.bumptech.glide.request.d):void");
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13238b) {
            z = this.f13241e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo17119j(C6124d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f13238b) {
            RequestCoordinator requestCoordinator = this.f13237a;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo17119j(this)) {
                    z2 = false;
                    if (z2 && dVar.equals(this.f13239c) && this.f13241e != RequestCoordinator.RequestState.PAUSED) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    public final void pause() {
        synchronized (this.f13238b) {
            if (!this.f13242f.isComplete()) {
                this.f13242f = RequestCoordinator.RequestState.PAUSED;
                this.f13240d.pause();
            }
            if (!this.f13241e.isComplete()) {
                this.f13241e = RequestCoordinator.RequestState.PAUSED;
                this.f13239c.pause();
            }
        }
    }
}
