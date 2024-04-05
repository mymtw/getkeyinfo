package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19927a;
import okhttp3.C19940c0;
import okhttp3.C19989m;
import okhttp3.C19997p;
import okhttp3.internal.connection.C19980k;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: okhttp3.internal.connection.d */
public final class C19970d {

    /* renamed from: a */
    public C19980k.C19981a f44143a;

    /* renamed from: b */
    public C19980k f44144b;

    /* renamed from: c */
    public int f44145c;

    /* renamed from: d */
    public int f44146d;

    /* renamed from: e */
    public int f44147e;

    /* renamed from: f */
    public C19940c0 f44148f;

    /* renamed from: g */
    public final C19978i f44149g;

    /* renamed from: h */
    public final C19927a f44150h;

    /* renamed from: i */
    public final C19971e f44151i;

    /* renamed from: j */
    public final C19989m f44152j;

    public C19970d(C19978i iVar, C19927a aVar, C19971e eVar, C19989m mVar) {
        C19383o.m32797g(iVar, "connectionPool");
        C19383o.m32797g(mVar, "eventListener");
        this.f44149g = iVar;
        this.f44150h = aVar;
        this.f44151i = eVar;
        this.f44152j = mVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: okhttp3.c0} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0344 A[SYNTHETIC] */
    /* renamed from: a */
    public final okhttp3.internal.connection.C19976g mo72911a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) throws java.io.IOException {
        /*
            r15 = this;
            r1 = r15
        L_0x0001:
            okhttp3.internal.connection.e r0 = r1.f44151i
            boolean r0 = r0.f44165n
            if (r0 != 0) goto L_0x0390
            okhttp3.internal.connection.e r0 = r1.f44151i
            okhttp3.internal.connection.g r2 = r0.f44159h
            r3 = 0
            r0 = 0
            r4 = 1
            if (r2 == 0) goto L_0x005b
            monitor-enter(r2)
            boolean r5 = r2.f44184i     // Catch:{ all -> 0x0058 }
            if (r5 != 0) goto L_0x0024
            okhttp3.c0 r5 = r2.f44192q     // Catch:{ all -> 0x0058 }
            okhttp3.a r5 = r5.f43995a     // Catch:{ all -> 0x0058 }
            okhttp3.p r5 = r5.f43948a     // Catch:{ all -> 0x0058 }
            boolean r5 = r15.mo72912b(r5)     // Catch:{ all -> 0x0058 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            okhttp3.internal.connection.e r5 = r1.f44151i     // Catch:{ all -> 0x0058 }
            java.net.Socket r5 = r5.mo72921j()     // Catch:{ all -> 0x0058 }
        L_0x002a:
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)
            okhttp3.internal.connection.e r6 = r1.f44151i
            okhttp3.internal.connection.g r6 = r6.f44159h
            if (r6 == 0) goto L_0x0046
            if (r5 != 0) goto L_0x0036
            r0 = r4
        L_0x0036:
            if (r0 == 0) goto L_0x003a
            goto L_0x0310
        L_0x003a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0046:
            if (r5 == 0) goto L_0x004b
            p735br.C18980c.m32100d(r5)
        L_0x004b:
            okhttp3.m r2 = r1.f44152j
            okhttp3.internal.connection.e r5 = r1.f44151i
            r2.getClass()
            java.lang.String r2 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r5, r2)
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005b:
            r1.f44145c = r0
            r1.f44146d = r0
            r1.f44147e = r0
            okhttp3.internal.connection.i r2 = r1.f44149g
            okhttp3.a r5 = r1.f44150h
            okhttp3.internal.connection.e r6 = r1.f44151i
            boolean r2 = r2.mo72933a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x0082
            okhttp3.internal.connection.e r0 = r1.f44151i
            okhttp3.internal.connection.g r2 = r0.f44159h
            kotlin.jvm.internal.C19383o.m32794d(r2)
            okhttp3.m r0 = r1.f44152j
            okhttp3.internal.connection.e r3 = r1.f44151i
            r0.getClass()
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            goto L_0x0310
        L_0x0082:
            okhttp3.c0 r2 = r1.f44148f
            if (r2 == 0) goto L_0x0089
            r1.f44148f = r3
            goto L_0x00ad
        L_0x0089:
            okhttp3.internal.connection.k$a r2 = r1.f44143a
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r2.mo72936a()
            if (r2 == 0) goto L_0x00b6
            okhttp3.internal.connection.k$a r0 = r1.f44143a
            kotlin.jvm.internal.C19383o.m32794d(r0)
            boolean r2 = r0.mo72936a()
            if (r2 == 0) goto L_0x00b0
            java.util.List<okhttp3.c0> r2 = r0.f44209b
            int r5 = r0.f44208a
            int r6 = r5 + 1
            r0.f44208a = r6
            java.lang.Object r0 = r2.get(r5)
            r2 = r0
            okhttp3.c0 r2 = (okhttp3.C19940c0) r2
        L_0x00ad:
            r5 = r3
            goto L_0x02b1
        L_0x00b0:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00b6:
            okhttp3.internal.connection.k r2 = r1.f44144b
            if (r2 != 0) goto L_0x00cb
            okhttp3.internal.connection.k r2 = new okhttp3.internal.connection.k
            okhttp3.a r5 = r1.f44150h
            okhttp3.internal.connection.e r6 = r1.f44151i
            okhttp3.t r7 = r6.f44168q
            okhttp3.internal.connection.j r7 = r7.f44285E
            okhttp3.m r8 = r1.f44152j
            r2.<init>(r5, r7, r6, r8)
            r1.f44144b = r2
        L_0x00cb:
            boolean r5 = r2.mo72935a()
            if (r5 == 0) goto L_0x038a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00d6:
            int r6 = r2.f44201b
            java.util.List<? extends java.net.Proxy> r7 = r2.f44200a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00e2
            r6 = r4
            goto L_0x00e3
        L_0x00e2:
            r6 = r0
        L_0x00e3:
            if (r6 == 0) goto L_0x0260
            int r6 = r2.f44201b
            java.util.List<? extends java.net.Proxy> r7 = r2.f44200a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00f1
            r6 = r4
            goto L_0x00f2
        L_0x00f1:
            r6 = r0
        L_0x00f2:
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x023f
            java.util.List<? extends java.net.Proxy> r6 = r2.f44200a
            int r8 = r2.f44201b
            int r9 = r8 + 1
            r2.f44201b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.f44202c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x0164
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x011c
            goto L_0x0164
        L_0x011c:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0149
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            kotlin.jvm.internal.C19383o.m32797g(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L_0x013b
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            kotlin.jvm.internal.C19383o.m32796f(r10, r11)
            goto L_0x0144
        L_0x013b:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
            kotlin.jvm.internal.C19383o.m32796f(r10, r11)
        L_0x0144:
            int r9 = r9.getPort()
            goto L_0x016c
        L_0x0149:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0164:
            okhttp3.a r9 = r2.f44204e
            okhttp3.p r9 = r9.f43948a
            java.lang.String r10 = r9.f44243e
            int r9 = r9.f44244f
        L_0x016c:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L_0x021d
            if (r11 < r9) goto L_0x021d
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x0183
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x01c5
        L_0x0183:
            okhttp3.m r7 = r2.f44207h
            okhttp3.e r11 = r2.f44206g
            r7.getClass()
            java.lang.String r7 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r11, r7)
            java.lang.String r11 = "domainName"
            kotlin.jvm.internal.C19383o.m32797g(r10, r11)
            okhttp3.a r11 = r2.f44204e
            okhttp3.l r11 = r11.f43951d
            java.util.List r11 = r11.mo69706a(r10)
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x01ff
            okhttp3.m r10 = r2.f44207h
            okhttp3.e r12 = r2.f44206g
            r10.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r12, r7)
            java.util.Iterator r7 = r11.iterator()
        L_0x01b0:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01c5
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x01b0
        L_0x01c5:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f44202c
            java.util.Iterator r7 = r7.iterator()
        L_0x01cb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01f7
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            okhttp3.c0 r9 = new okhttp3.c0
            okhttp3.a r10 = r2.f44204e
            r9.<init>(r10, r6, r8)
            okhttp3.internal.connection.j r8 = r2.f44205f
            monitor-enter(r8)
            java.util.LinkedHashSet r10 = r8.f44199a     // Catch:{ all -> 0x01f4 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01f4 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01f0
            java.util.ArrayList r8 = r2.f44203d
            r8.add(r9)
            goto L_0x01cb
        L_0x01f0:
            r5.add(r9)
            goto L_0x01cb
        L_0x01f4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01f7:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00d6
            goto L_0x0260
        L_0x01ff:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            okhttp3.a r2 = r2.f44204e
            okhttp3.l r2 = r2.f43951d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x021d:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x023f:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r7)
            okhttp3.a r4 = r2.f44204e
            okhttp3.p r4 = r4.f43948a
            java.lang.String r4 = r4.f44243e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f44200a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0260:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0270
            java.util.ArrayList r6 = r2.f44203d
            kotlin.collections.C19324q.m32628J0(r6, r5)
            java.util.ArrayList r2 = r2.f44203d
            r2.clear()
        L_0x0270:
            okhttp3.internal.connection.k$a r2 = new okhttp3.internal.connection.k$a
            r2.<init>(r5)
            r1.f44143a = r2
            okhttp3.internal.connection.e r6 = r1.f44151i
            boolean r6 = r6.f44165n
            if (r6 != 0) goto L_0x0382
            okhttp3.internal.connection.i r6 = r1.f44149g
            okhttp3.a r7 = r1.f44150h
            okhttp3.internal.connection.e r8 = r1.f44151i
            boolean r0 = r6.mo72933a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x029e
            okhttp3.internal.connection.e r0 = r1.f44151i
            okhttp3.internal.connection.g r2 = r0.f44159h
            kotlin.jvm.internal.C19383o.m32794d(r2)
            okhttp3.m r0 = r1.f44152j
            okhttp3.internal.connection.e r3 = r1.f44151i
            r0.getClass()
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            goto L_0x0310
        L_0x029e:
            boolean r0 = r2.mo72936a()
            if (r0 == 0) goto L_0x037c
            int r0 = r2.f44208a
            int r6 = r0 + 1
            r2.f44208a = r6
            java.lang.Object r0 = r5.get(r0)
            r2 = r0
            okhttp3.c0 r2 = (okhttp3.C19940c0) r2
        L_0x02b1:
            okhttp3.internal.connection.g r14 = new okhttp3.internal.connection.g
            okhttp3.internal.connection.i r0 = r1.f44149g
            r14.<init>(r0, r2)
            okhttp3.internal.connection.e r0 = r1.f44151i
            r0.f44167p = r14
            okhttp3.internal.connection.e r12 = r1.f44151i     // Catch:{ all -> 0x0376 }
            okhttp3.m r13 = r1.f44152j     // Catch:{ all -> 0x0376 }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.mo72923c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0376 }
            okhttp3.internal.connection.e r0 = r1.f44151i
            r0.f44167p = r3
            okhttp3.internal.connection.e r0 = r1.f44151i
            okhttp3.t r0 = r0.f44168q
            okhttp3.internal.connection.j r3 = r0.f44285E
            okhttp3.c0 r0 = r14.f44192q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)     // Catch:{ all -> 0x0373 }
            java.util.LinkedHashSet r6 = r3.f44199a     // Catch:{ all -> 0x0373 }
            r6.remove(r0)     // Catch:{ all -> 0x0373 }
            monitor-exit(r3)
            okhttp3.internal.connection.i r0 = r1.f44149g
            okhttp3.a r3 = r1.f44150h
            okhttp3.internal.connection.e r6 = r1.f44151i
            boolean r0 = r0.mo72933a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x0314
            okhttp3.internal.connection.e r0 = r1.f44151i
            okhttp3.internal.connection.g r0 = r0.f44159h
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r1.f44148f = r2
            java.net.Socket r2 = r14.f44178c
            kotlin.jvm.internal.C19383o.m32794d(r2)
            p735br.C18980c.m32100d(r2)
            okhttp3.m r2 = r1.f44152j
            okhttp3.internal.connection.e r3 = r1.f44151i
            r2.getClass()
            java.lang.String r2 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            r2 = r0
        L_0x0310:
            r0 = r21
            r14 = r2
            goto L_0x033e
        L_0x0314:
            monitor-enter(r14)
            okhttp3.internal.connection.i r0 = r1.f44149g     // Catch:{ all -> 0x0370 }
            r0.getClass()     // Catch:{ all -> 0x0370 }
            byte[] r2 = p735br.C18980c.f42301a     // Catch:{ all -> 0x0370 }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.g> r2 = r0.f44197d     // Catch:{ all -> 0x0370 }
            r2.add(r14)     // Catch:{ all -> 0x0370 }
            cr.c r2 = r0.f44195b     // Catch:{ all -> 0x0370 }
            okhttp3.internal.connection.h r0 = r0.f44196c     // Catch:{ all -> 0x0370 }
            r2.mo70422c(r0, 0)     // Catch:{ all -> 0x0370 }
            okhttp3.internal.connection.e r0 = r1.f44151i     // Catch:{ all -> 0x0370 }
            r0.mo72914b(r14)     // Catch:{ all -> 0x0370 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0370 }
            monitor-exit(r14)
            okhttp3.m r0 = r1.f44152j
            okhttp3.internal.connection.e r2 = r1.f44151i
            r0.getClass()
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            r0 = r21
        L_0x033e:
            boolean r2 = r14.mo72928i(r0)
            if (r2 == 0) goto L_0x0345
            return r14
        L_0x0345:
            r14.mo72930k()
            okhttp3.c0 r2 = r1.f44148f
            if (r2 == 0) goto L_0x034e
            goto L_0x0001
        L_0x034e:
            okhttp3.internal.connection.k$a r2 = r1.f44143a
            if (r2 == 0) goto L_0x0357
            boolean r2 = r2.mo72936a()
            goto L_0x0358
        L_0x0357:
            r2 = r4
        L_0x0358:
            if (r2 == 0) goto L_0x035c
            goto L_0x0001
        L_0x035c:
            okhttp3.internal.connection.k r2 = r1.f44144b
            if (r2 == 0) goto L_0x0364
            boolean r4 = r2.mo72935a()
        L_0x0364:
            if (r4 == 0) goto L_0x0368
            goto L_0x0001
        L_0x0368:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0370:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0373:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0376:
            r0 = move-exception
            okhttp3.internal.connection.e r2 = r1.f44151i
            r2.f44167p = r3
            throw r0
        L_0x037c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0382:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x038a:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0390:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19970d.mo72911a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.g");
    }

    /* renamed from: b */
    public final boolean mo72912b(C19997p pVar) {
        C19383o.m32797g(pVar, "url");
        C19997p pVar2 = this.f44150h.f43948a;
        return pVar.f44244f == pVar2.f44244f && C19383o.m32792b(pVar.f44243e, pVar2.f44243e);
    }

    /* renamed from: c */
    public final void mo72913c(IOException iOException) {
        C19383o.m32797g(iOException, "e");
        this.f44148f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f44145c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f44146d++;
        } else {
            this.f44147e++;
        }
    }
}
