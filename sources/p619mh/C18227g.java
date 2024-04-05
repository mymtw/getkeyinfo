package p619mh;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import p316be.C8549a;
import p513bj.C14075p;
import p619mh.C18225f;
import p636oi.C18298b;
import p636oi.C18299c;
import p636oi.C18304g;

/* renamed from: mh.g */
public abstract class C18227g<I extends DecoderInputBuffer, O extends C18225f, E extends DecoderException> implements C18222c<I, O, E> {

    /* renamed from: a */
    public final C18228a f39957a;

    /* renamed from: b */
    public final Object f39958b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f39959c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f39960d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f39961e;

    /* renamed from: f */
    public final O[] f39962f;

    /* renamed from: g */
    public int f39963g;

    /* renamed from: h */
    public int f39964h;

    /* renamed from: i */
    public I f39965i;

    /* renamed from: j */
    public SubtitleDecoderException f39966j;

    /* renamed from: k */
    public boolean f39967k;

    /* renamed from: l */
    public boolean f39968l;

    /* renamed from: mh.g$a */
    public class C18228a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ C18227g f39969b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18228a(C18298b bVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f39969b = bVar;
        }

        public final void run() {
            C18227g gVar = this.f39969b;
            gVar.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (gVar.mo69771f());
        }
    }

    public C18227g(I[] iArr, O[] oArr) {
        this.f39961e = iArr;
        this.f39963g = iArr.length;
        for (int i = 0; i < this.f39963g; i++) {
            this.f39961e[i] = new C18304g();
        }
        this.f39962f = oArr;
        this.f39964h = oArr.length;
        for (int i2 = 0; i2 < this.f39964h; i2++) {
            this.f39962f[i2] = new C18299c(new C8549a((C18298b) this));
        }
        C18228a aVar = new C18228a((C18298b) this);
        this.f39957a = aVar;
        aVar.start();
    }

    /* renamed from: b */
    public final Object mo69763b() throws DecoderException {
        C18225f fVar;
        synchronized (this.f39958b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f39966j;
                if (subtitleDecoderException == null) {
                    fVar = this.f39960d.isEmpty() ? null : (C18225f) this.f39960d.removeFirst();
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* renamed from: c */
    public final void mo69764c(C18304g gVar) throws DecoderException {
        synchronized (this.f39958b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f39966j;
                if (subtitleDecoderException == null) {
                    boolean z = true;
                    C14075p.m21691c(gVar == this.f39965i);
                    this.f39959c.addLast(gVar);
                    if (this.f39959c.isEmpty() || this.f39964h <= 0) {
                        z = false;
                    }
                    if (z) {
                        this.f39958b.notify();
                    }
                    this.f39965i = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final Object mo69765d() throws DecoderException {
        I i;
        synchronized (this.f39958b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f39966j;
                if (subtitleDecoderException == null) {
                    C14075p.m21694f(this.f39965i == null);
                    int i2 = this.f39963g;
                    if (i2 == 0) {
                        i = null;
                    } else {
                        I[] iArr = this.f39961e;
                        int i3 = i2 - 1;
                        this.f39963g = i3;
                        i = iArr[i3];
                    }
                    this.f39965i = i;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* renamed from: e */
    public abstract SubtitleDecoderException mo69770e(DecoderInputBuffer decoderInputBuffer, C18225f fVar, boolean z);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* renamed from: f */
    public final boolean mo69771f() throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f39958b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r7.f39968l     // Catch:{ all -> 0x0017 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque<I> r1 = r7.f39959c     // Catch:{ all -> 0x0017 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x001a
            int r1 = r7.f39964h     // Catch:{ all -> 0x0017 }
            if (r1 <= 0) goto L_0x001a
            r1 = r3
            goto L_0x001b
        L_0x0017:
            r1 = move-exception
            goto L_0x00a4
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r7.f39958b     // Catch:{ all -> 0x0017 }
            r1.wait()     // Catch:{ all -> 0x0017 }
            goto L_0x0003
        L_0x0023:
            boolean r1 = r7.f39968l     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r2
        L_0x0029:
            java.util.ArrayDeque<I> r1 = r7.f39959c     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0017 }
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch:{ all -> 0x0017 }
            O[] r4 = r7.f39962f     // Catch:{ all -> 0x0017 }
            int r5 = r7.f39964h     // Catch:{ all -> 0x0017 }
            int r5 = r5 - r3
            r7.f39964h = r5     // Catch:{ all -> 0x0017 }
            r4 = r4[r5]     // Catch:{ all -> 0x0017 }
            boolean r5 = r7.f39967k     // Catch:{ all -> 0x0017 }
            r7.f39967k = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r0 = 4
            boolean r6 = r1.mo69761h(r0)
            if (r6 == 0) goto L_0x004a
            r4.mo69760g(r0)
            goto L_0x0078
        L_0x004a:
            boolean r0 = r1.mo69762i()
            if (r0 == 0) goto L_0x0055
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.mo69760g(r0)
        L_0x0055:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r7.mo69770e(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0063, OutOfMemoryError -> 0x005a }
            goto L_0x006c
        L_0x005a:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x006b
        L_0x0063:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x006b:
            r0 = r5
        L_0x006c:
            if (r0 == 0) goto L_0x0078
            java.lang.Object r5 = r7.f39958b
            monitor-enter(r5)
            r7.f39966j = r0     // Catch:{ all -> 0x0075 }
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            return r2
        L_0x0075:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            throw r0
        L_0x0078:
            java.lang.Object r2 = r7.f39958b
            monitor-enter(r2)
            boolean r0 = r7.f39967k     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0083
            r4.mo47085j()     // Catch:{ all -> 0x00a1 }
            goto L_0x0092
        L_0x0083:
            boolean r0 = r4.mo69762i()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x008d
            r4.mo47085j()     // Catch:{ all -> 0x00a1 }
            goto L_0x0092
        L_0x008d:
            java.util.ArrayDeque<O> r0 = r7.f39960d     // Catch:{ all -> 0x00a1 }
            r0.addLast(r4)     // Catch:{ all -> 0x00a1 }
        L_0x0092:
            r1.mo46795j()     // Catch:{ all -> 0x00a1 }
            I[] r0 = r7.f39961e     // Catch:{ all -> 0x00a1 }
            int r4 = r7.f39963g     // Catch:{ all -> 0x00a1 }
            int r5 = r4 + 1
            r7.f39963g = r5     // Catch:{ all -> 0x00a1 }
            r0[r4] = r1     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            return r3
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r0
        L_0x00a4:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p619mh.C18227g.mo69771f():boolean");
    }

    public final void flush() {
        synchronized (this.f39958b) {
            this.f39967k = true;
            I i = this.f39965i;
            if (i != null) {
                i.mo46795j();
                I[] iArr = this.f39961e;
                int i2 = this.f39963g;
                this.f39963g = i2 + 1;
                iArr[i2] = i;
                this.f39965i = null;
            }
            while (!this.f39959c.isEmpty()) {
                I i3 = (DecoderInputBuffer) this.f39959c.removeFirst();
                i3.mo46795j();
                I[] iArr2 = this.f39961e;
                int i4 = this.f39963g;
                this.f39963g = i4 + 1;
                iArr2[i4] = i3;
            }
            while (!this.f39960d.isEmpty()) {
                ((C18225f) this.f39960d.removeFirst()).mo47085j();
            }
        }
    }

    public final void release() {
        synchronized (this.f39958b) {
            this.f39968l = true;
            this.f39958b.notify();
        }
        try {
            this.f39957a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
