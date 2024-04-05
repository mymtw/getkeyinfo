package p743fr;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.Protocol;
import okhttp3.internal.connection.C19976g;
import okhttp3.internal.http2.ErrorCode;
import p735br.C18980c;
import p739dr.C19004d;
import p739dr.C19005e;
import p739dr.C19006f;
import p756lr.C19882a0;
import p756lr.C19888c0;

/* renamed from: fr.n */
public final class C19044n implements C19004d {

    /* renamed from: g */
    public static final List<String> f42495g = C18980c.m32107k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f42496h = C18980c.m32107k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public volatile C19049p f42497a;

    /* renamed from: b */
    public final Protocol f42498b;

    /* renamed from: c */
    public volatile boolean f42499c;

    /* renamed from: d */
    public final C19976g f42500d;

    /* renamed from: e */
    public final C19006f f42501e;

    /* renamed from: f */
    public final C19027d f42502f;

    public C19044n(C20009t tVar, C19976g gVar, C19006f fVar, C19027d dVar) {
        C19383o.m32797g(gVar, "connection");
        this.f42500d = gVar;
        this.f42501e = fVar;
        this.f42502f = dVar;
        List<Protocol> list = tVar.f44305u;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f42498b = !list.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    /* renamed from: a */
    public final void mo70444a() {
        C19049p pVar = this.f42497a;
        C19383o.m32794d(pVar);
        pVar.mo70516f().close();
    }

    /* renamed from: b */
    public final C19888c0 mo70445b(C20018z zVar) {
        C19049p pVar = this.f42497a;
        C19383o.m32794d(pVar);
        return pVar.f42520g;
    }

    /* renamed from: c */
    public final C19976g mo70446c() {
        return this.f42500d;
    }

    public final void cancel() {
        this.f42499c = true;
        C19049p pVar = this.f42497a;
        if (pVar != null) {
            pVar.mo70515e(ErrorCode.CANCEL);
        }
    }

    /* renamed from: d */
    public final long mo70448d(C20018z zVar) {
        if (!C19005e.m32152a(zVar)) {
            return 0;
        }
        return C18980c.m32106j(zVar);
    }

    /* renamed from: e */
    public final C19882a0 mo70449e(C20011u uVar, long j) {
        C19049p pVar = this.f42497a;
        C19383o.m32794d(pVar);
        return pVar.mo70516f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0119  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70450f(okhttp3.C20011u r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            fr.p r2 = r1.f42497a
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            okhttp3.y r2 = r0.f44345e
            r4 = 1
            if (r2 == 0) goto L_0x0010
            r2 = r4
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            okhttp3.o r5 = r0.f44344d
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.String[] r7 = r5.f44235b
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r6.<init>(r7)
            fr.a r7 = new fr.a
            okio.ByteString r9 = p743fr.C19022a.f42391f
            java.lang.String r10 = r0.f44343c
            r7.<init>((java.lang.String) r10, (okio.ByteString) r9)
            r6.add(r7)
            fr.a r7 = new fr.a
            okio.ByteString r9 = p743fr.C19022a.f42392g
            okhttp3.p r10 = r0.f44342b
            java.lang.String r11 = "url"
            kotlin.jvm.internal.C19383o.m32797g(r10, r11)
            java.lang.String r11 = r10.mo72965b()
            java.lang.String r10 = r10.mo72967d()
            if (r10 == 0) goto L_0x0054
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r11 = 63
            r12.append(r11)
            r12.append(r10)
            java.lang.String r11 = r12.toString()
        L_0x0054:
            r7.<init>((java.lang.String) r11, (okio.ByteString) r9)
            r6.add(r7)
            java.lang.String r7 = "Host"
            okhttp3.o r9 = r0.f44344d
            java.lang.String r7 = r9.mo72948a(r7)
            if (r7 == 0) goto L_0x006e
            fr.a r9 = new fr.a
            okio.ByteString r10 = p743fr.C19022a.f42394i
            r9.<init>((java.lang.String) r7, (okio.ByteString) r10)
            r6.add(r9)
        L_0x006e:
            fr.a r7 = new fr.a
            okio.ByteString r9 = p743fr.C19022a.f42393h
            okhttp3.p r0 = r0.f44342b
            java.lang.String r0 = r0.f44240b
            r7.<init>((java.lang.String) r0, (okio.ByteString) r9)
            r6.add(r7)
            java.lang.String[] r0 = r5.f44235b
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = 0
        L_0x0082:
            if (r7 >= r0) goto L_0x00cd
            java.lang.String r9 = r5.mo72949c(r7)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "Locale.US"
            kotlin.jvm.internal.C19383o.m32796f(r10, r11)
            if (r9 == 0) goto L_0x00c5
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r10 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            java.util.List<java.lang.String> r10 = f42495g
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x00b6
            java.lang.String r10 = "te"
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = r5.mo72955m(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r11)
            if (r10 == 0) goto L_0x00c2
        L_0x00b6:
            fr.a r10 = new fr.a
            java.lang.String r11 = r5.mo72955m(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r6.add(r10)
        L_0x00c2:
            int r7 = r7 + 1
            goto L_0x0082
        L_0x00c5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r2)
            throw r0
        L_0x00cd:
            fr.d r5 = r1.f42502f
            r5.getClass()
            r0 = r2 ^ 1
            r13 = 0
            fr.q r7 = r5.f42449z
            monitor-enter(r7)
            monitor-enter(r5)     // Catch:{ all -> 0x01c6 }
            int r9 = r5.f42430g     // Catch:{ all -> 0x01c3 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00e5
            okhttp3.internal.http2.ErrorCode r9 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x01c3 }
            r5.mo70488f(r9)     // Catch:{ all -> 0x01c3 }
        L_0x00e5:
            boolean r9 = r5.f42431h     // Catch:{ all -> 0x01c3 }
            if (r9 != 0) goto L_0x01bd
            int r15 = r5.f42430g     // Catch:{ all -> 0x01c3 }
            int r9 = r15 + 2
            r5.f42430g = r9     // Catch:{ all -> 0x01c3 }
            fr.p r14 = new fr.p     // Catch:{ all -> 0x01c3 }
            r16 = 0
            r9 = r14
            r10 = r15
            r11 = r5
            r12 = r0
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x0112
            long r9 = r5.f42446w     // Catch:{ all -> 0x01c3 }
            long r11 = r5.f42447x     // Catch:{ all -> 0x01c3 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0112
            long r9 = r3.f42516c     // Catch:{ all -> 0x01c3 }
            long r11 = r3.f42517d     // Catch:{ all -> 0x01c3 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r2 = 0
            goto L_0x0113
        L_0x0112:
            r2 = r4
        L_0x0113:
            boolean r9 = r3.mo70518h()     // Catch:{ all -> 0x01c3 }
            if (r9 == 0) goto L_0x0122
            java.util.LinkedHashMap r9 = r5.f42427d     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x01c3 }
            r9.put(r10, r3)     // Catch:{ all -> 0x01c3 }
        L_0x0122:
            kotlin.m r9 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x01c3 }
            monitor-exit(r5)     // Catch:{ all -> 0x01c6 }
            fr.q r9 = r5.f42449z     // Catch:{ all -> 0x01c6 }
            monitor-enter(r9)     // Catch:{ all -> 0x01c6 }
            boolean r10 = r9.f42542d     // Catch:{ all -> 0x01ba }
            if (r10 != 0) goto L_0x01b2
            fr.b$b r10 = r9.f42543e     // Catch:{ all -> 0x01ba }
            r10.mo70481d(r6)     // Catch:{ all -> 0x01ba }
            lr.f r6 = r9.f42540b     // Catch:{ all -> 0x01ba }
            long r10 = r6.f43876c     // Catch:{ all -> 0x01ba }
            int r6 = r9.f42541c     // Catch:{ all -> 0x01ba }
            long r12 = (long) r6     // Catch:{ all -> 0x01ba }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x01ba }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0143
            r17 = r8
            goto L_0x0145
        L_0x0143:
            r17 = 0
        L_0x0145:
            if (r0 == 0) goto L_0x0149
            r17 = r17 | 1
        L_0x0149:
            r0 = r17
            int r8 = (int) r12     // Catch:{ all -> 0x01ba }
            r9.mo70529d(r15, r8, r4, r0)     // Catch:{ all -> 0x01ba }
            lr.h r0 = r9.f42544f     // Catch:{ all -> 0x01ba }
            lr.f r4 = r9.f42540b     // Catch:{ all -> 0x01ba }
            r0.mo68512O(r4, r12)     // Catch:{ all -> 0x01ba }
            if (r6 <= 0) goto L_0x015c
            long r10 = r10 - r12
            r9.mo70534i(r15, r10)     // Catch:{ all -> 0x01ba }
        L_0x015c:
            monitor-exit(r9)     // Catch:{ all -> 0x01c6 }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x0179
            fr.q r2 = r5.f42449z
            monitor-enter(r2)
            boolean r0 = r2.f42542d     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x016e
            lr.h r0 = r2.f42544f     // Catch:{ all -> 0x0176 }
            r0.flush()     // Catch:{ all -> 0x0176 }
            monitor-exit(r2)
            goto L_0x0179
        L_0x016e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x0176 }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x0176:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0179:
            r1.f42497a = r3
            boolean r0 = r1.f42499c
            if (r0 != 0) goto L_0x01a0
            fr.p r0 = r1.f42497a
            kotlin.jvm.internal.C19383o.m32794d(r0)
            fr.p$c r0 = r0.f42522i
            dr.f r2 = r1.f42501e
            int r2 = r2.f42353h
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.mo72705g(r2, r4)
            fr.p r0 = r1.f42497a
            kotlin.jvm.internal.C19383o.m32794d(r0)
            fr.p$c r0 = r0.f42523j
            dr.f r2 = r1.f42501e
            int r2 = r2.f42354i
            long r2 = (long) r2
            r0.mo72705g(r2, r4)
            return
        L_0x01a0:
            fr.p r0 = r1.f42497a
            kotlin.jvm.internal.C19383o.m32794d(r0)
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.mo70515e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x01b2:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01c6 }
            throw r0     // Catch:{ all -> 0x01c6 }
        L_0x01bd:
            okhttp3.internal.http2.ConnectionShutdownException r0 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x01c3 }
            r0.<init>()     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01c6 }
            throw r0     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19044n.mo70450f(okhttp3.u):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r0.f42522i.mo70525l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C20018z.C20019a mo70451g(boolean r11) {
        /*
            r10 = this;
            fr.p r0 = r10.f42497a
            kotlin.jvm.internal.C19383o.m32794d(r0)
            monitor-enter(r0)
            fr.p$c r1 = r0.f42522i     // Catch:{ all -> 0x00c9 }
            r1.mo72694h()     // Catch:{ all -> 0x00c9 }
        L_0x000b:
            java.util.ArrayDeque<okhttp3.o> r1 = r0.f42518e     // Catch:{ all -> 0x00c2 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x001b
            okhttp3.internal.http2.ErrorCode r1 = r0.f42524k     // Catch:{ all -> 0x00c2 }
            if (r1 != 0) goto L_0x001b
            r0.mo70520j()     // Catch:{ all -> 0x00c2 }
            goto L_0x000b
        L_0x001b:
            fr.p$c r1 = r0.f42522i     // Catch:{ all -> 0x00c9 }
            r1.mo70525l()     // Catch:{ all -> 0x00c9 }
            java.util.ArrayDeque<okhttp3.o> r1 = r0.f42518e     // Catch:{ all -> 0x00c9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c9 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00b2
            java.util.ArrayDeque<okhttp3.o> r1 = r0.f42518e     // Catch:{ all -> 0x00c9 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)     // Catch:{ all -> 0x00c9 }
            okhttp3.o r1 = (okhttp3.C19994o) r1     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)
            okhttp3.Protocol r0 = r10.f42498b
            java.lang.String r2 = "protocol"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            okhttp3.o$a r2 = new okhttp3.o$a
            r2.<init>()
            java.lang.String[] r3 = r1.f44235b
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
            r5 = 0
            r6 = r5
        L_0x004c:
            if (r4 >= r3) goto L_0x0082
            java.lang.String r7 = r1.mo72949c(r4)
            java.lang.String r8 = r1.mo72955m(r4)
            java.lang.String r9 = ":status"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r7, r9)
            if (r9 == 0) goto L_0x0074
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP/1.1 "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            dr.i r6 = p739dr.C19009i.C19010a.m32164a(r6)
            goto L_0x007f
        L_0x0074:
            java.util.List<java.lang.String> r9 = f42496h
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x007f
            r2.mo72960c(r7, r8)
        L_0x007f:
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0082:
            if (r6 == 0) goto L_0x00aa
            okhttp3.z$a r1 = new okhttp3.z$a
            r1.<init>()
            r1.f44376b = r0
            int r0 = r6.f42360b
            r1.f44377c = r0
            java.lang.String r0 = r6.f42361c
            java.lang.String r3 = "message"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            r1.f44378d = r0
            okhttp3.o r0 = r2.mo72961d()
            r1.mo73009c(r0)
            if (r11 == 0) goto L_0x00a8
            int r11 = r1.f44377c
            r0 = 100
            if (r11 != r0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r5 = r1
        L_0x00a9:
            return r5
        L_0x00aa:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00b2:
            java.io.IOException r11 = r0.f42525l     // Catch:{ all -> 0x00c9 }
            if (r11 == 0) goto L_0x00b7
            goto L_0x00c1
        L_0x00b7:
            okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x00c9 }
            okhttp3.internal.http2.ErrorCode r1 = r0.f42524k     // Catch:{ all -> 0x00c9 }
            kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ all -> 0x00c9 }
            r11.<init>(r1)     // Catch:{ all -> 0x00c9 }
        L_0x00c1:
            throw r11     // Catch:{ all -> 0x00c9 }
        L_0x00c2:
            r11 = move-exception
            fr.p$c r1 = r0.f42522i     // Catch:{ all -> 0x00c9 }
            r1.mo70525l()     // Catch:{ all -> 0x00c9 }
            throw r11     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19044n.mo70451g(boolean):okhttp3.z$a");
    }

    /* renamed from: h */
    public final void mo70452h() {
        this.f42502f.flush();
    }
}
