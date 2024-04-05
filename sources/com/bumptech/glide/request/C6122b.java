package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.b */
public final class C6122b implements RequestCoordinator, C6124d {

    /* renamed from: a */
    public final Object f13221a;

    /* renamed from: b */
    public final RequestCoordinator f13222b;

    /* renamed from: c */
    public volatile C6124d f13223c;

    /* renamed from: d */
    public volatile C6124d f13224d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f13225e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f13226f;

    public C6122b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f13225e = requestState;
        this.f13226f = requestState;
        this.f13221a = obj;
        this.f13222b = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean mo17113a() {
        boolean z;
        synchronized (this.f13221a) {
            if (!this.f13223c.mo17121a()) {
                if (!this.f13224d.mo17121a()) {
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
        synchronized (this.f13221a) {
            RequestCoordinator requestCoordinator = this.f13222b;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo17114b(this)) {
                    z2 = false;
                    if (z2 && mo17167k(dVar)) {
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
        synchronized (this.f13221a) {
            RequestCoordinator.RequestState requestState = this.f13225e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f13226f == requestState2;
        }
        return z;
    }

    public final void clear() {
        synchronized (this.f13221a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f13225e = requestState;
            this.f13223c.clear();
            if (this.f13226f != requestState) {
                this.f13226f = requestState;
                this.f13224d.clear();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo17115d(C6124d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f13221a) {
            RequestCoordinator requestCoordinator = this.f13222b;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo17115d(this)) {
                    z2 = false;
                    if (z2 && mo17167k(dVar)) {
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
        synchronized (this.f13221a) {
            RequestCoordinator.RequestState requestState = this.f13225e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2) {
                if (this.f13226f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17116f(com.bumptech.glide.request.C6124d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13221a
            monitor-enter(r0)
            com.bumptech.glide.request.d r1 = r2.f13224d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f13225e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f13226f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f13226f = r1     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.d r3 = r2.f13224d     // Catch:{ all -> 0x002b }
            r3.mo17129h()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f13226f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f13222b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo17116f(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6122b.mo17116f(com.bumptech.glide.request.d):void");
    }

    /* renamed from: g */
    public final boolean mo17128g(C6124d dVar) {
        if (!(dVar instanceof C6122b)) {
            return false;
        }
        C6122b bVar = (C6122b) dVar;
        return this.f13223c.mo17128g(bVar.f13223c) && this.f13224d.mo17128g(bVar.f13224d);
    }

    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f13221a) {
            RequestCoordinator requestCoordinator = this.f13222b;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    /* renamed from: h */
    public final void mo17129h() {
        synchronized (this.f13221a) {
            RequestCoordinator.RequestState requestState = this.f13225e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f13225e = requestState2;
                this.f13223c.mo17129h();
            }
        }
    }

    /* renamed from: i */
    public final void mo17118i(C6124d dVar) {
        synchronized (this.f13221a) {
            if (dVar.equals(this.f13223c)) {
                this.f13225e = RequestCoordinator.RequestState.SUCCESS;
            } else if (dVar.equals(this.f13224d)) {
                this.f13226f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f13222b;
            if (requestCoordinator != null) {
                requestCoordinator.mo17118i(this);
            }
        }
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13221a) {
            RequestCoordinator.RequestState requestState = this.f13225e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                if (this.f13226f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo17119j(C6124d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f13221a) {
            RequestCoordinator requestCoordinator = this.f13222b;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo17119j(this)) {
                    z2 = false;
                    if (z2 && mo17167k(dVar)) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo17167k(C6124d dVar) {
        return dVar.equals(this.f13223c) || (this.f13225e == RequestCoordinator.RequestState.FAILED && dVar.equals(this.f13224d));
    }

    public final void pause() {
        synchronized (this.f13221a) {
            RequestCoordinator.RequestState requestState = this.f13225e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f13225e = RequestCoordinator.RequestState.PAUSED;
                this.f13223c.pause();
            }
            if (this.f13226f == requestState2) {
                this.f13226f = RequestCoordinator.RequestState.PAUSED;
                this.f13224d.pause();
            }
        }
    }
}
