package p743fr;

import android.support.p013v4.media.C0073e;
import android.support.p013v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19994o;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p003a2.C0023f;
import p735br.C18980c;
import p756lr.C19882a0;
import p756lr.C19883b;
import p756lr.C19888c0;
import p756lr.C19890d0;
import p756lr.C19893f;

/* renamed from: fr.p */
public final class C19049p {

    /* renamed from: a */
    public long f42514a;

    /* renamed from: b */
    public long f42515b;

    /* renamed from: c */
    public long f42516c;

    /* renamed from: d */
    public long f42517d;

    /* renamed from: e */
    public final ArrayDeque<C19994o> f42518e;

    /* renamed from: f */
    public boolean f42519f;

    /* renamed from: g */
    public final C19051b f42520g;

    /* renamed from: h */
    public final C19050a f42521h;

    /* renamed from: i */
    public final C19052c f42522i = new C19052c();

    /* renamed from: j */
    public final C19052c f42523j = new C19052c();

    /* renamed from: k */
    public ErrorCode f42524k;

    /* renamed from: l */
    public IOException f42525l;

    /* renamed from: m */
    public final int f42526m;

    /* renamed from: n */
    public final C19027d f42527n;

    /* renamed from: fr.p$a */
    public final class C19050a implements C19882a0 {

        /* renamed from: b */
        public final C19893f f42528b = new C19893f();

        /* renamed from: c */
        public boolean f42529c;

        /* renamed from: d */
        public boolean f42530d;

        public C19050a(boolean z) {
            this.f42530d = z;
        }

        /* renamed from: O */
        public final void mo68512O(C19893f fVar, long j) throws IOException {
            C19383o.m32797g(fVar, "source");
            byte[] bArr = C18980c.f42301a;
            this.f42528b.mo68512O(fVar, j);
            while (this.f42528b.f43876c >= PlaybackStateCompat.ACTION_PREPARE) {
                mo70521a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
            r13 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r12.f42531e.f42523j.mo70525l();
            r12.f42531e.mo70512b();
            r1 = r12.f42531e;
            r10 = java.lang.Math.min(r1.f42517d - r1.f42516c, r12.f42528b.f43876c);
            r1 = r12.f42531e;
            r1.f42516c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
            if (r13 == false) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
            if (r10 != r12.f42528b.f43876c) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r13 = r1.f42524k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
            if (r13 != null) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
            r8 = r13;
            r13 = kotlin.C19394m.f43287a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r12.f42531e.f42523j.mo70525l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
            throw r13;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70521a(boolean r13) throws java.io.IOException {
            /*
                r12 = this;
                fr.p r0 = p743fr.C19049p.this
                monitor-enter(r0)
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0094 }
                fr.p$c r1 = r1.f42523j     // Catch:{ all -> 0x0094 }
                r1.mo72694h()     // Catch:{ all -> 0x0094 }
            L_0x000a:
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x002b }
                long r2 = r1.f42516c     // Catch:{ all -> 0x002b }
                long r4 = r1.f42517d     // Catch:{ all -> 0x002b }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x002d
                boolean r2 = r12.f42530d     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x002d
                boolean r2 = r12.f42529c     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x002d
                monitor-enter(r1)     // Catch:{ all -> 0x002b }
                okhttp3.internal.http2.ErrorCode r2 = r1.f42524k     // Catch:{ all -> 0x0028 }
                monitor-exit(r1)     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x002d
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x002b }
                r1.mo70520j()     // Catch:{ all -> 0x002b }
                goto L_0x000a
            L_0x0028:
                r13 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002b }
                throw r13     // Catch:{ all -> 0x002b }
            L_0x002b:
                r13 = move-exception
                goto L_0x008c
            L_0x002d:
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0094 }
                fr.p$c r1 = r1.f42523j     // Catch:{ all -> 0x0094 }
                r1.mo70525l()     // Catch:{ all -> 0x0094 }
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0094 }
                r1.mo70512b()     // Catch:{ all -> 0x0094 }
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0094 }
                long r2 = r1.f42517d     // Catch:{ all -> 0x0094 }
                long r4 = r1.f42516c     // Catch:{ all -> 0x0094 }
                long r2 = r2 - r4
                lr.f r1 = r12.f42528b     // Catch:{ all -> 0x0094 }
                long r4 = r1.f43876c     // Catch:{ all -> 0x0094 }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0094 }
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0094 }
                long r2 = r1.f42516c     // Catch:{ all -> 0x0094 }
                long r2 = r2 + r10
                r1.f42516c = r2     // Catch:{ all -> 0x0094 }
                if (r13 == 0) goto L_0x0064
                lr.f r13 = r12.f42528b     // Catch:{ all -> 0x0094 }
                long r2 = r13.f43876c     // Catch:{ all -> 0x0094 }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x0064
                monitor-enter(r1)     // Catch:{ all -> 0x0094 }
                okhttp3.internal.http2.ErrorCode r13 = r1.f42524k     // Catch:{ all -> 0x0061 }
                monitor-exit(r1)     // Catch:{ all -> 0x0094 }
                if (r13 != 0) goto L_0x0064
                r13 = 1
                goto L_0x0065
            L_0x0061:
                r13 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0094 }
                throw r13     // Catch:{ all -> 0x0094 }
            L_0x0064:
                r13 = 0
            L_0x0065:
                r8 = r13
                kotlin.m r13 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0094 }
                monitor-exit(r0)
                fr.p r13 = p743fr.C19049p.this
                fr.p$c r13 = r13.f42523j
                r13.mo72694h()
                fr.p r13 = p743fr.C19049p.this     // Catch:{ all -> 0x0083 }
                fr.d r6 = r13.f42527n     // Catch:{ all -> 0x0083 }
                int r7 = r13.f42526m     // Catch:{ all -> 0x0083 }
                lr.f r9 = r12.f42528b     // Catch:{ all -> 0x0083 }
                r6.mo70491h(r7, r8, r9, r10)     // Catch:{ all -> 0x0083 }
                fr.p r13 = p743fr.C19049p.this
                fr.p$c r13 = r13.f42523j
                r13.mo70525l()
                return
            L_0x0083:
                r13 = move-exception
                fr.p r0 = p743fr.C19049p.this
                fr.p$c r0 = r0.f42523j
                r0.mo70525l()
                throw r13
            L_0x008c:
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0094 }
                fr.p$c r1 = r1.f42523j     // Catch:{ all -> 0x0094 }
                r1.mo70525l()     // Catch:{ all -> 0x0094 }
                throw r13     // Catch:{ all -> 0x0094 }
            L_0x0094:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p743fr.C19049p.C19050a.mo70521a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001b, code lost:
            r0 = r14.f42531e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0021, code lost:
            if (r0.f42521h.f42530d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            if (r14.f42528b.f43876c <= 0) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
            if (r1 == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
            if (r14.f42528b.f43876c <= 0) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
            mo70521a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
            if (r2 == false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
            r0.f42527n.mo70491h(r0.f42526m, true, (p756lr.C19893f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
            r0 = r14.f42531e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r14.f42529c = true;
            r1 = kotlin.C19394m.f43287a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0050, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
            r14.f42531e.f42527n.flush();
            r14.f42531e.mo70511a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r14 = this;
                fr.p r0 = p743fr.C19049p.this
                byte[] r1 = p735br.C18980c.f42301a
                monitor-enter(r0)
                boolean r1 = r14.f42529c     // Catch:{ all -> 0x0064 }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                fr.p r1 = p743fr.C19049p.this     // Catch:{ all -> 0x0064 }
                monitor-enter(r1)     // Catch:{ all -> 0x0064 }
                okhttp3.internal.http2.ErrorCode r2 = r1.f42524k     // Catch:{ all -> 0x0061 }
                monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                r1 = 0
                r3 = 1
                if (r2 != 0) goto L_0x0017
                r2 = r3
                goto L_0x0018
            L_0x0017:
                r2 = r1
            L_0x0018:
                kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                fr.p r0 = p743fr.C19049p.this
                fr.p$a r4 = r0.f42521h
                boolean r4 = r4.f42530d
                if (r4 != 0) goto L_0x0049
                lr.f r4 = r14.f42528b
                long r4 = r4.f43876c
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002e
                r1 = r3
            L_0x002e:
                if (r1 == 0) goto L_0x003c
            L_0x0030:
                lr.f r0 = r14.f42528b
                long r0 = r0.f43876c
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0049
                r14.mo70521a(r3)
                goto L_0x0030
            L_0x003c:
                if (r2 == 0) goto L_0x0049
                fr.d r8 = r0.f42527n
                int r9 = r0.f42526m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.mo70491h(r9, r10, r11, r12)
            L_0x0049:
                fr.p r0 = p743fr.C19049p.this
                monitor-enter(r0)
                r14.f42529c = r3     // Catch:{ all -> 0x005e }
                kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x005e }
                monitor-exit(r0)
                fr.p r0 = p743fr.C19049p.this
                fr.d r0 = r0.f42527n
                r0.flush()
                fr.p r0 = p743fr.C19049p.this
                r0.mo70511a()
                return
            L_0x005e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0061:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                throw r2     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p743fr.C19049p.C19050a.close():void");
        }

        public final void flush() throws IOException {
            C19049p pVar = C19049p.this;
            byte[] bArr = C18980c.f42301a;
            synchronized (pVar) {
                C19049p.this.mo70512b();
                C19394m mVar = C19394m.f43287a;
            }
            while (this.f42528b.f43876c > 0) {
                mo70521a(false);
                C19049p.this.f42527n.flush();
            }
        }

        /* renamed from: m */
        public final C19890d0 mo68515m() {
            return C19049p.this.f42523j;
        }
    }

    /* renamed from: fr.p$b */
    public final class C19051b implements C19888c0 {

        /* renamed from: b */
        public final C19893f f42532b = new C19893f();

        /* renamed from: c */
        public final C19893f f42533c = new C19893f();

        /* renamed from: d */
        public boolean f42534d;

        /* renamed from: e */
        public final long f42535e;

        /* renamed from: f */
        public boolean f42536f;

        public C19051b(long j, boolean z) {
            this.f42535e = j;
            this.f42536f = z;
        }

        /* renamed from: J */
        public final long mo68544J(C19893f fVar, long j) throws IOException {
            ErrorCode errorCode;
            long j2;
            boolean z;
            long j3;
            ErrorCode errorCode2;
            C19893f fVar2 = fVar;
            long j4 = j;
            C19383o.m32797g(fVar2, "sink");
            long j5 = 0;
            if (j4 >= 0) {
                while (true) {
                    Throwable th = null;
                    synchronized (C19049p.this) {
                        C19049p.this.f42522i.mo72694h();
                        try {
                            C19049p pVar = C19049p.this;
                            synchronized (pVar) {
                                errorCode = pVar.f42524k;
                            }
                            if (errorCode != null) {
                                th = C19049p.this.f42525l;
                                if (th == null) {
                                    C19049p pVar2 = C19049p.this;
                                    synchronized (pVar2) {
                                        errorCode2 = pVar2.f42524k;
                                    }
                                    C19383o.m32794d(errorCode2);
                                    th = new StreamResetException(errorCode2);
                                }
                            }
                            if (!this.f42534d) {
                                C19893f fVar3 = this.f42533c;
                                long j6 = fVar3.f43876c;
                                if (j6 > j5) {
                                    j3 = fVar3.mo68544J(fVar2, Math.min(j4, j6));
                                    C19049p pVar3 = C19049p.this;
                                    long j7 = pVar3.f42514a + j3;
                                    pVar3.f42514a = j7;
                                    long j8 = j7 - pVar3.f42515b;
                                    if (th == null && j8 >= ((long) (pVar3.f42527n.f42442s.mo70535a() / 2))) {
                                        C19049p pVar4 = C19049p.this;
                                        pVar4.f42527n.mo70493j(pVar4.f42526m, j8);
                                        C19049p pVar5 = C19049p.this;
                                        pVar5.f42515b = pVar5.f42514a;
                                    }
                                } else if (this.f42536f || th != null) {
                                    j3 = -1;
                                } else {
                                    C19049p.this.mo70520j();
                                    z = true;
                                    j2 = -1;
                                    C19049p.this.f42522i.mo70525l();
                                    C19394m mVar = C19394m.f43287a;
                                }
                                long j9 = j3;
                                z = false;
                                j2 = j9;
                                C19049p.this.f42522i.mo70525l();
                                C19394m mVar2 = C19394m.f43287a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            C19049p.this.f42522i.mo70525l();
                            throw th2;
                        }
                    }
                    if (z) {
                        j5 = 0;
                    } else if (j2 != -1) {
                        mo70522a(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j4).toString());
            }
        }

        /* renamed from: a */
        public final void mo70522a(long j) {
            C19049p pVar = C19049p.this;
            byte[] bArr = C18980c.f42301a;
            pVar.f42527n.mo70490g(j);
        }

        public final void close() throws IOException {
            long j;
            synchronized (C19049p.this) {
                this.f42534d = true;
                C19893f fVar = this.f42533c;
                j = fVar.f43876c;
                fVar.mo72726a();
                C19049p pVar = C19049p.this;
                if (pVar != null) {
                    pVar.notifyAll();
                    C19394m mVar = C19394m.f43287a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                mo70522a(j);
            }
            C19049p.this.mo70511a();
        }

        /* renamed from: m */
        public final C19890d0 mo68547m() {
            return C19049p.this.f42522i;
        }
    }

    /* renamed from: fr.p$c */
    public final class C19052c extends C19883b {
        public C19052c() {
        }

        /* renamed from: j */
        public final IOException mo70523j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: k */
        public final void mo70524k() {
            C19049p.this.mo70515e(ErrorCode.CANCEL);
            C19027d dVar = C19049p.this.f42527n;
            synchronized (dVar) {
                long j = dVar.f42440q;
                long j2 = dVar.f42439p;
                if (j >= j2) {
                    dVar.f42439p = j2 + 1;
                    dVar.f42441r = System.nanoTime() + ((long) 1000000000);
                    C19394m mVar = C19394m.f43287a;
                    dVar.f42433j.mo70422c(new C19043m(C0023f.m110k(new StringBuilder(), dVar.f42428e, " ping"), dVar), 0);
                }
            }
        }

        /* renamed from: l */
        public final void mo70525l() throws IOException {
            if (mo72695i()) {
                throw mo70523j((IOException) null);
            }
        }
    }

    public C19049p(int i, C19027d dVar, boolean z, boolean z2, C19994o oVar) {
        C19383o.m32797g(dVar, "connection");
        this.f42526m = i;
        this.f42527n = dVar;
        this.f42517d = (long) dVar.f42443t.mo70535a();
        ArrayDeque<C19994o> arrayDeque = new ArrayDeque<>();
        this.f42518e = arrayDeque;
        this.f42520g = new C19051b((long) dVar.f42442s.mo70535a(), z2);
        this.f42521h = new C19050a(z);
        if (oVar != null) {
            if (!mo70517g()) {
                arrayDeque.add(oVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo70517g()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: a */
    public final void mo70511a() throws IOException {
        boolean z;
        boolean h;
        byte[] bArr = C18980c.f42301a;
        synchronized (this) {
            C19051b bVar = this.f42520g;
            if (!bVar.f42536f && bVar.f42534d) {
                C19050a aVar = this.f42521h;
                if (aVar.f42530d || aVar.f42529c) {
                    z = true;
                    h = mo70518h();
                    C19394m mVar = C19394m.f43287a;
                }
            }
            z = false;
            h = mo70518h();
            C19394m mVar2 = C19394m.f43287a;
        }
        if (z) {
            mo70513c(ErrorCode.CANCEL, (IOException) null);
        } else if (!h) {
            this.f42527n.mo70487e(this.f42526m);
        }
    }

    /* renamed from: b */
    public final void mo70512b() throws IOException {
        C19050a aVar = this.f42521h;
        if (aVar.f42529c) {
            throw new IOException("stream closed");
        } else if (aVar.f42530d) {
            throw new IOException("stream finished");
        } else if (this.f42524k != null) {
            Throwable th = this.f42525l;
            if (th == null) {
                ErrorCode errorCode = this.f42524k;
                C19383o.m32794d(errorCode);
                th = new StreamResetException(errorCode);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo70513c(ErrorCode errorCode, IOException iOException) throws IOException {
        C19383o.m32797g(errorCode, "rstStatusCode");
        if (mo70514d(errorCode, iOException)) {
            C19027d dVar = this.f42527n;
            int i = this.f42526m;
            dVar.getClass();
            dVar.f42449z.mo70532g(i, errorCode);
        }
    }

    /* renamed from: d */
    public final boolean mo70514d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = C18980c.f42301a;
        synchronized (this) {
            if (this.f42524k != null) {
                return false;
            }
            if (this.f42520g.f42536f && this.f42521h.f42530d) {
                return false;
            }
            this.f42524k = errorCode;
            this.f42525l = iOException;
            notifyAll();
            C19394m mVar = C19394m.f43287a;
            this.f42527n.mo70487e(this.f42526m);
            return true;
        }
    }

    /* renamed from: e */
    public final void mo70515e(ErrorCode errorCode) {
        C19383o.m32797g(errorCode, "errorCode");
        if (mo70514d(errorCode, (IOException) null)) {
            this.f42527n.mo70492i(this.f42526m, errorCode);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p743fr.C19049p.C19050a mo70516f() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f42519f     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo70517g()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            fr.p$a r0 = r2.f42521h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19049p.mo70516f():fr.p$a");
    }

    /* renamed from: g */
    public final boolean mo70517g() {
        return this.f42527n.f42425b == ((this.f42526m & 1) == 1);
    }

    /* renamed from: h */
    public final synchronized boolean mo70518h() {
        if (this.f42524k != null) {
            return false;
        }
        C19051b bVar = this.f42520g;
        if (bVar.f42536f || bVar.f42534d) {
            C19050a aVar = this.f42521h;
            if ((aVar.f42530d || aVar.f42529c) && this.f42519f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70519i(okhttp3.C19994o r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            byte[] r0 = p735br.C18980c.f42301a
            monitor-enter(r2)
            boolean r0 = r2.f42519f     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            fr.p$b r3 = r2.f42520g     // Catch:{ all -> 0x0037 }
            r3.getClass()     // Catch:{ all -> 0x0037 }
            goto L_0x001d
        L_0x0016:
            r2.f42519f = r1     // Catch:{ all -> 0x0037 }
            java.util.ArrayDeque<okhttp3.o> r0 = r2.f42518e     // Catch:{ all -> 0x0037 }
            r0.add(r3)     // Catch:{ all -> 0x0037 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            fr.p$b r3 = r2.f42520g     // Catch:{ all -> 0x0037 }
            r3.f42536f = r1     // Catch:{ all -> 0x0037 }
        L_0x0023:
            boolean r3 = r2.mo70518h()     // Catch:{ all -> 0x0037 }
            r2.notifyAll()     // Catch:{ all -> 0x0037 }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0036
            fr.d r3 = r2.f42527n
            int r4 = r2.f42526m
            r3.mo70487e(r4)
        L_0x0036:
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19049p.mo70519i(okhttp3.o, boolean):void");
    }

    /* renamed from: j */
    public final void mo70520j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
