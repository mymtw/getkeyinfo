package p617lo;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.google.android.play.core.assetpacks.C15588c1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p577go.C17804b;
import p577go.C17805c;
import p577go.C17807e;
import p585ho.C17835a;
import p633no.C18283a;

/* renamed from: lo.b */
public final class C18210b implements C18213d {

    /* renamed from: a */
    public final List<C17835a> f39900a;

    /* renamed from: b */
    public double f39901b;

    /* renamed from: c */
    public int f39902c;

    /* renamed from: d */
    public int f39903d;

    /* renamed from: e */
    public int f39904e;

    /* renamed from: f */
    public int f39905f;

    /* renamed from: g */
    public double f39906g;

    /* renamed from: h */
    public final C18283a f39907h;

    /* renamed from: i */
    public final C15588c1 f39908i;

    /* renamed from: j */
    public C18209a f39909j;

    /* renamed from: k */
    public AtomicBoolean f39910k;

    /* renamed from: l */
    public final LinkedBlockingDeque<C17805c> f39911l;

    /* renamed from: m */
    public final C18211a f39912m;

    /* renamed from: n */
    public final C17804b f39913n;

    /* renamed from: lo.b$a */
    public final class C18211a extends Thread {
        public C18211a() {
        }

        public final void run() {
            ByteBuffer byteBuffer;
            boolean z;
            while (!C18210b.this.f39910k.get()) {
                C17805c peekFirst = C18210b.this.f39911l.peekFirst();
                if (peekFirst != null) {
                    int dequeueInputBuffer = ((C17807e) C18210b.this.f39913n).f38713a.dequeueInputBuffer(0);
                    if (dequeueInputBuffer >= 0) {
                        C17807e eVar = (C17807e) C18210b.this.f39913n;
                        C17805c cVar = null;
                        if (dequeueInputBuffer >= 0) {
                            cVar = new C17805c(dequeueInputBuffer, eVar.f38713a.getInputBuffer(dequeueInputBuffer), (MediaCodec.BufferInfo) null);
                        } else {
                            eVar.getClass();
                        }
                        if (!(cVar == null || cVar.f38707b == null || (byteBuffer = peekFirst.f38707b) == null)) {
                            MediaCodec.BufferInfo bufferInfo = cVar.f38708c;
                            bufferInfo.offset = 0;
                            MediaCodec.BufferInfo bufferInfo2 = peekFirst.f38708c;
                            bufferInfo.flags = bufferInfo2.flags;
                            long j = bufferInfo2.presentationTimeUs;
                            int position = byteBuffer.position();
                            C18210b bVar = C18210b.this;
                            bufferInfo.presentationTimeUs = j + ((long) (((double) (position / (bVar.f39903d * 2))) * bVar.f39901b));
                            if (cVar.f38707b.limit() >= peekFirst.f38707b.remaining()) {
                                cVar.f38708c.size = peekFirst.f38707b.remaining();
                                z = true;
                            } else {
                                cVar.f38708c.size = cVar.f38707b.limit();
                                cVar.f38708c.flags &= -5;
                                z = false;
                            }
                            int i = cVar.f38708c.size;
                            for (int i2 = 0; i2 < i; i2++) {
                                cVar.f38707b.put(peekFirst.f38707b.get());
                            }
                            if (z) {
                                C18210b.this.f39911l.removeFirst();
                                C18283a aVar = C18210b.this.f39907h;
                                ByteBuffer byteBuffer2 = peekFirst.f38707b;
                                aVar.getClass();
                                C19383o.m32797g(byteBuffer2, "byteBuffer");
                                byteBuffer2.clear();
                                aVar.f40133a.put(byteBuffer2);
                            }
                            MediaCodec mediaCodec = ((C17807e) C18210b.this.f39913n).f38713a;
                            int i3 = cVar.f38706a;
                            MediaCodec.BufferInfo bufferInfo3 = cVar.f38708c;
                            mediaCodec.queueInputBuffer(i3, bufferInfo3.offset, bufferInfo3.size, bufferInfo3.presentationTimeUs, bufferInfo3.flags);
                        }
                    } else if (dequeueInputBuffer != -1) {
                        Log.e("AudioRenderer", "Unhandled value " + dequeueInputBuffer + " when receiving decoded input frame");
                    }
                }
            }
            C18210b.this.f39911l.clear();
        }
    }

    public C18210b(C17804b bVar, List<C17835a> list) {
        C19383o.m32797g(bVar, "encoder");
        this.f39913n = bVar;
        this.f39900a = list == null ? EmptyList.INSTANCE : list;
        this.f39902c = -1;
        this.f39903d = -1;
        this.f39904e = -1;
        this.f39905f = -1;
        this.f39906g = 1.0d;
        this.f39907h = new C18283a();
        this.f39908i = new C15588c1();
        this.f39910k = new AtomicBoolean(false);
        this.f39911l = new LinkedBlockingDeque<>();
        this.f39912m = new C18211a();
    }

    /* renamed from: a */
    public final void mo69738a(C17805c cVar, long j) {
        if (!this.f39910k.get()) {
            int ceil = ((int) Math.ceil(((double) (cVar.f38708c.size / (this.f39902c * 2))) * this.f39906g)) * this.f39903d * 2;
            C18283a aVar = this.f39907h;
            ByteBuffer poll = aVar.f40133a.poll();
            if (poll == null) {
                poll = aVar.mo69834a(ceil);
            } else if (poll.capacity() < ceil) {
                poll = aVar.mo69834a(ceil);
            }
            C17805c cVar2 = new C17805c(cVar.f38706a, poll, new MediaCodec.BufferInfo());
            C18209a aVar2 = this.f39909j;
            if (aVar2 != null) {
                aVar2.mo60324b(cVar, cVar2);
            }
            for (C17835a apply : this.f39900a) {
                apply.apply();
            }
            this.f39911l.add(cVar2);
        }
    }

    /* renamed from: b */
    public final boolean mo69739b() {
        return !this.f39900a.isEmpty();
    }

    /* renamed from: c */
    public final void mo69740c(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        mo69741d(mediaFormat, mediaFormat2);
        this.f39910k.set(false);
        this.f39912m.start();
        for (C17835a a : this.f39900a) {
            a.mo69067a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r6 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r4 != null) goto L_0x002d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69741d(android.media.MediaFormat r9, android.media.MediaFormat r10) {
        /*
            r8 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "channel-count"
            java.lang.String r2 = "defaultValue"
            if (r9 == 0) goto L_0x001a
            no.e$a r3 = p633no.C18287e.f40136a
            r3.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.Number r3 = p633no.C18287e.C18288a.m30913a(r9, r1)
            if (r3 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r3 = r0
        L_0x001b:
            if (r10 == 0) goto L_0x002c
            no.e$a r4 = p633no.C18287e.f40136a
            r4.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.Number r4 = p633no.C18287e.C18288a.m30913a(r10, r1)
            if (r4 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            java.lang.String r5 = "sample-rate"
            if (r9 == 0) goto L_0x0040
            no.e$a r6 = p633no.C18287e.f40136a
            r6.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.Number r6 = p633no.C18287e.C18288a.m30913a(r9, r5)
            if (r6 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r6 = r0
        L_0x0041:
            if (r10 == 0) goto L_0x0052
            no.e$a r7 = p633no.C18287e.f40136a
            r7.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.Number r2 = p633no.C18287e.C18288a.m30913a(r10, r5)
            if (r2 == 0) goto L_0x0052
            r0 = r2
        L_0x0052:
            int r2 = r8.f39902c
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 != 0) goto L_0x0059
            goto L_0x0092
        L_0x0059:
            r7 = r3
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r2 != r7) goto L_0x0092
            int r2 = r8.f39903d
            boolean r7 = r4 instanceof java.lang.Integer
            if (r7 != 0) goto L_0x0069
            goto L_0x0092
        L_0x0069:
            r7 = r4
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r2 != r7) goto L_0x0092
            int r2 = r8.f39904e
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 != 0) goto L_0x0079
            goto L_0x0092
        L_0x0079:
            r7 = r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r2 != r7) goto L_0x0092
            int r2 = r8.f39905f
            boolean r7 = r0 instanceof java.lang.Integer
            if (r7 != 0) goto L_0x0089
            goto L_0x0092
        L_0x0089:
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r2 == r7) goto L_0x011a
        L_0x0092:
            lo.a r2 = r8.f39909j
            if (r2 == 0) goto L_0x0099
            r2.release()
        L_0x0099:
            com.google.android.play.core.assetpacks.c1 r2 = r8.f39908i
            r2.getClass()
            if (r9 == 0) goto L_0x00e4
            if (r10 == 0) goto L_0x00e4
            boolean r2 = r9.containsKey(r5)
            if (r2 == 0) goto L_0x00e4
            boolean r2 = r10.containsKey(r5)
            if (r2 == 0) goto L_0x00e4
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x00e4
            boolean r2 = r10.containsKey(r1)
            if (r2 == 0) goto L_0x00e4
            int r2 = r9.getInteger(r5)
            int r7 = r10.getInteger(r5)
            if (r2 != r7) goto L_0x00ce
            int r2 = r9.getInteger(r1)
            int r7 = r10.getInteger(r1)
            if (r2 == r7) goto L_0x00e4
        L_0x00ce:
            com.linkedin.android.litr.render.OboeAudioProcessor r2 = new com.linkedin.android.litr.render.OboeAudioProcessor
            int r7 = r9.getInteger(r1)
            int r9 = r9.getInteger(r5)
            int r1 = r10.getInteger(r1)
            int r10 = r10.getInteger(r5)
            r2.<init>(r7, r9, r1, r10)
            goto L_0x00e9
        L_0x00e4:
            kp.c r2 = new kp.c
            r2.<init>()
        L_0x00e9:
            r8.f39909j = r2
            int r9 = r3.intValue()
            r8.f39902c = r9
            int r9 = r4.intValue()
            r8.f39903d = r9
            int r9 = r6.intValue()
            r8.f39904e = r9
            int r9 = r0.intValue()
            r8.f39905f = r9
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r1 = r0.doubleValue()
            double r9 = r9 / r1
            r8.f39901b = r9
            double r9 = r0.doubleValue()
            double r0 = r6.doubleValue()
            double r9 = r9 / r0
            r8.f39906g = r9
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p617lo.C18210b.mo69741d(android.media.MediaFormat, android.media.MediaFormat):void");
    }

    public final void release() {
        this.f39910k.set(true);
        C18209a aVar = this.f39909j;
        if (aVar != null) {
            aVar.release();
        }
        this.f39907h.f40133a.clear();
    }
}
