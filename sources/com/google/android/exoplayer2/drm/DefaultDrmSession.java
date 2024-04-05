package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.core.widget.C2399d;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.C14431b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p513bj.C14049b0;
import p513bj.C14053e;
import p513bj.C14075p;
import p595ji.C17992d;
import p635oh.C18292b;

public final class DefaultDrmSession implements DrmSession {

    /* renamed from: a */
    public final List<DrmInitData.SchemeData> f31499a;

    /* renamed from: b */
    public final C14224f f31500b;

    /* renamed from: c */
    public final C14202a f31501c;

    /* renamed from: d */
    public final C14203b f31502d;

    /* renamed from: e */
    public final int f31503e;

    /* renamed from: f */
    public final boolean f31504f;

    /* renamed from: g */
    public final boolean f31505g;

    /* renamed from: h */
    public final HashMap<String, String> f31506h;

    /* renamed from: i */
    public final C14053e<C14216b.C14217a> f31507i;

    /* renamed from: j */
    public final C14431b f31508j;

    /* renamed from: k */
    public final C14231i f31509k;

    /* renamed from: l */
    public final UUID f31510l;

    /* renamed from: m */
    public final C14206e f31511m;

    /* renamed from: n */
    public int f31512n;

    /* renamed from: o */
    public int f31513o;

    /* renamed from: p */
    public HandlerThread f31514p;

    /* renamed from: q */
    public C14204c f31515q;

    /* renamed from: r */
    public C18292b f31516r;

    /* renamed from: s */
    public DrmSession.DrmSessionException f31517s;

    /* renamed from: t */
    public byte[] f31518t;

    /* renamed from: u */
    public byte[] f31519u;

    /* renamed from: v */
    public C14224f.C14225a f31520v;

    /* renamed from: w */
    public C14224f.C14228d f31521w;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$a */
    public interface C14202a {
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$b */
    public interface C14203b {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$c */
    public class C14204c extends Handler {

        /* renamed from: a */
        public boolean f31522a;

        public C14204c(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Throwable, java.lang.Exception] */
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        public final void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r10.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.C14205d) r0
                r1 = 1
                int r2 = r10.what     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                if (r2 == 0) goto L_0x0023
                if (r2 != r1) goto L_0x001d
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.i r3 = r2.f31509k     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                java.util.UUID r2 = r2.f31510l     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                java.lang.Object r4 = r0.f31526c     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.f$a r4 = (com.google.android.exoplayer2.drm.C14224f.C14225a) r4     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.h r3 = (com.google.android.exoplayer2.drm.C14230h) r3     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                byte[] r1 = r3.mo47347a(r2, r4)     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                goto L_0x00c3
            L_0x001d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                r2.<init>()     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                throw r2     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
            L_0x0023:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.i r2 = r2.f31509k     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                java.lang.Object r3 = r0.f31526c     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.f$d r3 = (com.google.android.exoplayer2.drm.C14224f.C14228d) r3     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.h r2 = (com.google.android.exoplayer2.drm.C14230h) r2     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                byte[] r1 = r2.mo47348c(r3)     // Catch:{ MediaDrmCallbackException -> 0x003d, Exception -> 0x0033 }
                goto L_0x00c3
            L_0x0033:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p513bj.C14075p.m21700l(r2, r3, r1)
                goto L_0x00c3
            L_0x003d:
                r2 = move-exception
                java.lang.Object r3 = r10.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r3 = (com.google.android.exoplayer2.drm.DefaultDrmSession.C14205d) r3
                boolean r4 = r3.f31525b
                r5 = 0
                if (r4 != 0) goto L_0x0049
                goto L_0x00be
            L_0x0049:
                int r4 = r3.f31527d
                int r4 = r4 + r1
                r3.f31527d = r4
                com.google.android.exoplayer2.drm.DefaultDrmSession r6 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.b r6 = r6.f31508j
                com.google.android.exoplayer2.upstream.a r6 = (com.google.android.exoplayer2.upstream.C14430a) r6
                r7 = 3
                int r6 = r6.mo48173b(r7)
                if (r4 <= r6) goto L_0x005c
                goto L_0x00be
            L_0x005c:
                ji.d r4 = new ji.d
                android.os.SystemClock.elapsedRealtime()
                android.os.SystemClock.elapsedRealtime()
                java.lang.Throwable r4 = r2.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L_0x0073
                java.lang.Throwable r4 = r2.getCause()
                java.io.IOException r4 = (java.io.IOException) r4
                goto L_0x007c
            L_0x0073:
                com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException r4 = new com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
                java.lang.Throwable r6 = r2.getCause()
                r4.<init>(r6)
            L_0x007c:
                com.google.android.exoplayer2.drm.DefaultDrmSession r6 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.b r6 = r6.f31508j
                int r3 = r3.f31527d
                com.google.android.exoplayer2.upstream.a r6 = (com.google.android.exoplayer2.upstream.C14430a) r6
                r6.getClass()
                boolean r6 = r4 instanceof com.google.android.exoplayer2.ParserException
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r6 != 0) goto L_0x00a9
                boolean r6 = r4 instanceof java.io.FileNotFoundException
                if (r6 != 0) goto L_0x00a9
                boolean r6 = r4 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
                if (r6 != 0) goto L_0x00a9
                boolean r4 = r4 instanceof com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException
                if (r4 == 0) goto L_0x009d
                goto L_0x00a9
            L_0x009d:
                int r3 = r3 + -1
                int r3 = r3 * 1000
                r4 = 5000(0x1388, float:7.006E-42)
                int r3 = java.lang.Math.min(r3, r4)
                long r3 = (long) r3
                goto L_0x00aa
            L_0x00a9:
                r3 = r7
            L_0x00aa:
                int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r6 != 0) goto L_0x00af
                goto L_0x00be
            L_0x00af:
                monitor-enter(r9)
                boolean r6 = r9.f31522a     // Catch:{ all -> 0x00e9 }
                if (r6 != 0) goto L_0x00bd
                android.os.Message r5 = android.os.Message.obtain(r10)     // Catch:{ all -> 0x00e9 }
                r9.sendMessageDelayed(r5, r3)     // Catch:{ all -> 0x00e9 }
                monitor-exit(r9)     // Catch:{ all -> 0x00e9 }
                goto L_0x00bf
            L_0x00bd:
                monitor-exit(r9)     // Catch:{ all -> 0x00e9 }
            L_0x00be:
                r1 = r5
            L_0x00bf:
                if (r1 == 0) goto L_0x00c2
                return
            L_0x00c2:
                r1 = r2
            L_0x00c3:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                com.google.android.exoplayer2.upstream.b r2 = r2.f31508j
                long r3 = r0.f31524a
                r2.getClass()
                monitor-enter(r9)
                boolean r2 = r9.f31522a     // Catch:{ all -> 0x00e6 }
                if (r2 != 0) goto L_0x00e4
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ all -> 0x00e6 }
                com.google.android.exoplayer2.drm.DefaultDrmSession$e r2 = r2.f31511m     // Catch:{ all -> 0x00e6 }
                int r10 = r10.what     // Catch:{ all -> 0x00e6 }
                java.lang.Object r0 = r0.f31526c     // Catch:{ all -> 0x00e6 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x00e6 }
                android.os.Message r10 = r2.obtainMessage(r10, r0)     // Catch:{ all -> 0x00e6 }
                r10.sendToTarget()     // Catch:{ all -> 0x00e6 }
            L_0x00e4:
                monitor-exit(r9)     // Catch:{ all -> 0x00e6 }
                return
            L_0x00e6:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00e6 }
                throw r10
            L_0x00e9:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00e9 }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.C14204c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$d */
    public static final class C14205d {

        /* renamed from: a */
        public final long f31524a;

        /* renamed from: b */
        public final boolean f31525b;

        /* renamed from: c */
        public final Object f31526c;

        /* renamed from: d */
        public int f31527d;

        public C14205d(long j, boolean z, long j2, Object obj) {
            this.f31524a = j;
            this.f31525b = z;
            this.f31526c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$e */
    public class C14206e extends Handler {
        public C14206e(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Set<E> set;
            Set<E> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj != defaultDrmSession.f31521w) {
                    return;
                }
                if (defaultDrmSession.f31512n == 2 || defaultDrmSession.mo47281i()) {
                    defaultDrmSession.f31521w = null;
                    if (obj2 instanceof Exception) {
                        ((DefaultDrmSessionManager.C14211e) defaultDrmSession.f31501c).mo47299a((Exception) obj2);
                        return;
                    }
                    try {
                        defaultDrmSession.f31500b.mo47341g((byte[]) obj2);
                        DefaultDrmSessionManager.C14211e eVar = (DefaultDrmSessionManager.C14211e) defaultDrmSession.f31501c;
                        Iterator it = DefaultDrmSessionManager.this.f31541n.iterator();
                        while (it.hasNext()) {
                            DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) it.next();
                            if (defaultDrmSession2.mo47283k(false)) {
                                defaultDrmSession2.mo47280h(true);
                            }
                        }
                        DefaultDrmSessionManager.this.f31541n.clear();
                    } catch (Exception e) {
                        ((DefaultDrmSessionManager.C14211e) defaultDrmSession.f31501c).mo47299a(e);
                    }
                }
            } else if (i == 1) {
                DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
                if (obj == defaultDrmSession3.f31520v && defaultDrmSession3.mo47281i()) {
                    defaultDrmSession3.f31520v = null;
                    if (obj2 instanceof Exception) {
                        Exception exc = (Exception) obj2;
                        if (exc instanceof NotProvisionedException) {
                            ((DefaultDrmSessionManager.C14211e) defaultDrmSession3.f31501c).mo47300b(defaultDrmSession3);
                        } else {
                            defaultDrmSession3.mo47282j(exc);
                        }
                    } else {
                        try {
                            byte[] bArr = (byte[]) obj2;
                            if (defaultDrmSession3.f31503e == 3) {
                                C14224f fVar = defaultDrmSession3.f31500b;
                                byte[] bArr2 = defaultDrmSession3.f31519u;
                                int i2 = C14049b0.f30913a;
                                fVar.mo47344j(bArr2, bArr);
                                C14053e<C14216b.C14217a> eVar2 = defaultDrmSession3.f31507i;
                                synchronized (eVar2.f30927b) {
                                    set2 = eVar2.f30929d;
                                }
                                for (E b : set2) {
                                    b.mo47330b();
                                }
                                return;
                            }
                            byte[] j = defaultDrmSession3.f31500b.mo47344j(defaultDrmSession3.f31518t, bArr);
                            int i3 = defaultDrmSession3.f31503e;
                            if (!((i3 != 2 && (i3 != 0 || defaultDrmSession3.f31519u == null)) || j == null || j.length == 0)) {
                                defaultDrmSession3.f31519u = j;
                            }
                            defaultDrmSession3.f31512n = 4;
                            C14053e<C14216b.C14217a> eVar3 = defaultDrmSession3.f31507i;
                            synchronized (eVar3.f30927b) {
                                set = eVar3.f30929d;
                            }
                            for (E a : set) {
                                a.mo47329a();
                            }
                        } catch (Exception e2) {
                            if (e2 instanceof NotProvisionedException) {
                                ((DefaultDrmSessionManager.C14211e) defaultDrmSession3.f31501c).mo47300b(defaultDrmSession3);
                            } else {
                                defaultDrmSession3.mo47282j(e2);
                            }
                        }
                    }
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, C14224f fVar, DefaultDrmSessionManager.C14211e eVar, DefaultDrmSessionManager.C14212f fVar2, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, C14231i iVar, Looper looper, C14431b bVar) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.f31510l = uuid;
        this.f31501c = eVar;
        this.f31502d = fVar2;
        this.f31500b = fVar;
        this.f31503e = i;
        this.f31504f = z;
        this.f31505g = z2;
        if (bArr != null) {
            this.f31519u = bArr;
            this.f31499a = null;
        } else {
            list.getClass();
            this.f31499a = Collections.unmodifiableList(list);
        }
        this.f31506h = hashMap;
        this.f31509k = iVar;
        this.f31507i = new C14053e<>();
        this.f31508j = bVar;
        this.f31512n = 2;
        this.f31511m = new C14206e(looper);
    }

    /* renamed from: a */
    public final void mo47273a(C14216b.C14217a aVar) {
        boolean z = false;
        C14075p.m21694f(this.f31513o >= 0);
        if (aVar != null) {
            C14053e<C14216b.C14217a> eVar = this.f31507i;
            synchronized (eVar.f30927b) {
                ArrayList arrayList = new ArrayList(eVar.f30930e);
                arrayList.add(aVar);
                eVar.f30930e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) eVar.f30928c.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(eVar.f30929d);
                    hashSet.add(aVar);
                    eVar.f30929d = Collections.unmodifiableSet(hashSet);
                }
                eVar.f30928c.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.f31513o + 1;
        this.f31513o = i;
        if (i == 1) {
            if (this.f31512n == 2) {
                z = true;
            }
            C14075p.m21694f(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f31514p = handlerThread;
            handlerThread.start();
            this.f31515q = new C14204c(this.f31514p.getLooper());
            if (mo47283k(true)) {
                mo47280h(true);
            }
        } else if (aVar != null && mo47281i() && this.f31507i.count(aVar) == 1) {
            aVar.mo47332d(this.f31512n);
        }
        DefaultDrmSessionManager.C14212f fVar = (DefaultDrmSessionManager.C14212f) this.f31502d;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f31539l != -9223372036854775807L) {
            defaultDrmSessionManager.f31543p.remove(this);
            Handler handler = DefaultDrmSessionManager.this.f31549v;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: b */
    public final void mo47274b(C14216b.C14217a aVar) {
        C14075p.m21694f(this.f31513o > 0);
        int i = this.f31513o - 1;
        this.f31513o = i;
        if (i == 0) {
            this.f31512n = 0;
            C14206e eVar = this.f31511m;
            int i2 = C14049b0.f30913a;
            eVar.removeCallbacksAndMessages((Object) null);
            C14204c cVar = this.f31515q;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages((Object) null);
                cVar.f31522a = true;
            }
            this.f31515q = null;
            this.f31514p.quit();
            this.f31514p = null;
            this.f31516r = null;
            this.f31517s = null;
            this.f31520v = null;
            this.f31521w = null;
            byte[] bArr = this.f31518t;
            if (bArr != null) {
                this.f31500b.mo47343i(bArr);
                this.f31518t = null;
            }
        }
        if (aVar != null) {
            C14053e<C14216b.C14217a> eVar2 = this.f31507i;
            synchronized (eVar2.f30927b) {
                Integer num = (Integer) eVar2.f30928c.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(eVar2.f30930e);
                    arrayList.remove(aVar);
                    eVar2.f30930e = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        eVar2.f30928c.remove(aVar);
                        HashSet hashSet = new HashSet(eVar2.f30929d);
                        hashSet.remove(aVar);
                        eVar2.f30929d = Collections.unmodifiableSet(hashSet);
                    } else {
                        eVar2.f30928c.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f31507i.count(aVar) == 0) {
                aVar.mo47334f();
            }
        }
        C14203b bVar = this.f31502d;
        int i3 = this.f31513o;
        DefaultDrmSessionManager.C14212f fVar = (DefaultDrmSessionManager.C14212f) bVar;
        if (i3 == 1) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f31539l != -9223372036854775807L) {
                defaultDrmSessionManager.f31543p.add(this);
                Handler handler = DefaultDrmSessionManager.this.f31549v;
                handler.getClass();
                handler.postAtTime(new C2399d(this, 6), this, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f31539l);
                DefaultDrmSessionManager.this.mo47295j();
            }
        }
        if (i3 == 0) {
            DefaultDrmSessionManager.this.f31540m.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager2 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager2.f31546s == this) {
                defaultDrmSessionManager2.f31546s = null;
            }
            if (defaultDrmSessionManager2.f31547t == this) {
                defaultDrmSessionManager2.f31547t = null;
            }
            if (defaultDrmSessionManager2.f31541n.size() > 1 && DefaultDrmSessionManager.this.f31541n.get(0) == this) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) DefaultDrmSessionManager.this.f31541n.get(1);
                C14224f.C14228d d = defaultDrmSession.f31500b.mo47338d();
                defaultDrmSession.f31521w = d;
                C14204c cVar2 = defaultDrmSession.f31515q;
                int i4 = C14049b0.f30913a;
                d.getClass();
                cVar2.getClass();
                cVar2.obtainMessage(0, new C14205d(C17992d.f39337b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
            }
            DefaultDrmSessionManager.this.f31541n.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager3 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager3.f31539l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager3.f31549v;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                DefaultDrmSessionManager.this.f31543p.remove(this);
            }
        }
        DefaultDrmSessionManager.this.mo47295j();
    }

    /* renamed from: c */
    public final UUID mo47275c() {
        return this.f31510l;
    }

    /* renamed from: d */
    public final boolean mo47276d() {
        return this.f31504f;
    }

    /* renamed from: e */
    public final C18292b mo47277e() {
        return this.f31516r;
    }

    /* renamed from: f */
    public final DrmSession.DrmSessionException mo47278f() {
        if (this.f31512n == 1) {
            return this.f31517s;
        }
        return null;
    }

    public final int getState() {
        return this.f31512n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098 A[Catch:{ NumberFormatException -> 0x009c }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47280h(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.f31505g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r9.f31518t
            int r1 = p513bj.C14049b0.f30913a
            int r1 = r9.f31503e
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r4) goto L_0x0040
            if (r1 == r2) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x0019
            goto L_0x010e
        L_0x0019:
            byte[] r1 = r9.f31519u
            r1.getClass()
            byte[] r1 = r9.f31518t
            r1.getClass()
            byte[] r1 = r9.f31519u
            r9.mo47284l(r0, r10, r1)
            goto L_0x010e
        L_0x002a:
            byte[] r1 = r9.f31519u
            if (r1 == 0) goto L_0x003b
            com.google.android.exoplayer2.drm.f r5 = r9.f31500b     // Catch:{ Exception -> 0x0035 }
            r5.mo47340f(r0, r1)     // Catch:{ Exception -> 0x0035 }
            r3 = r4
            goto L_0x0039
        L_0x0035:
            r1 = move-exception
            r9.mo47282j(r1)
        L_0x0039:
            if (r3 == 0) goto L_0x010e
        L_0x003b:
            r9.mo47284l(r2, r10, r0)
            goto L_0x010e
        L_0x0040:
            byte[] r1 = r9.f31519u
            if (r1 != 0) goto L_0x0049
            r9.mo47284l(r4, r10, r0)
            goto L_0x010e
        L_0x0049:
            int r5 = r9.f31512n
            r6 = 4
            if (r5 == r6) goto L_0x005b
            com.google.android.exoplayer2.drm.f r5 = r9.f31500b     // Catch:{ Exception -> 0x0055 }
            r5.mo47340f(r0, r1)     // Catch:{ Exception -> 0x0055 }
            r3 = r4
            goto L_0x0059
        L_0x0055:
            r1 = move-exception
            r9.mo47282j(r1)
        L_0x0059:
            if (r3 == 0) goto L_0x010e
        L_0x005b:
            java.util.UUID r1 = p594jh.C17912g.f38900d
            java.util.UUID r3 = r9.f31510l
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00bb
        L_0x006b:
            java.util.Map r1 = r9.mo47285m()
            if (r1 != 0) goto L_0x0073
            r1 = 0
            goto L_0x00a4
        L_0x0073:
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x0089 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x0089 }
            if (r4 == 0) goto L_0x0089
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0089 }
            goto L_0x008a
        L_0x0089:
            r4 = r7
        L_0x008a:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x009c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x009c }
            if (r1 == 0) goto L_0x009c
            long r7 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x009c }
        L_0x009c:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r3.<init>(r4, r1)
            r1 = r3
        L_0x00a4:
            r1.getClass()
            java.lang.Object r3 = r1.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r3 = java.lang.Math.min(r3, r7)
        L_0x00bb:
            int r1 = r9.f31503e
            if (r1 != 0) goto L_0x00e1
            r7 = 60
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x00e1
            java.lang.String r1 = "DefaultDrmSession"
            r5 = 88
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Offline license has expired or will expire soon. Remaining seconds: "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.d(r1, r3)
            r9.mo47284l(r2, r10, r0)
            goto L_0x010e
        L_0x00e1:
            r0 = 0
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00f0
            com.google.android.exoplayer2.drm.KeysExpiredException r10 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r10.<init>()
            r9.mo47282j(r10)
            goto L_0x010e
        L_0x00f0:
            r9.f31512n = r6
            bj.e<com.google.android.exoplayer2.drm.b$a> r10 = r9.f31507i
            java.lang.Object r0 = r10.f30927b
            monitor-enter(r0)
            java.util.Set<E> r10 = r10.f30929d     // Catch:{ all -> 0x010f }
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            java.util.Iterator r10 = r10.iterator()
        L_0x00fe:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r10.next()
            com.google.android.exoplayer2.drm.b$a r0 = (com.google.android.exoplayer2.drm.C14216b.C14217a) r0
            r0.mo47331c()
            goto L_0x00fe
        L_0x010e:
            return
        L_0x010f:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.mo47280h(boolean):void");
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: i */
    public final boolean mo47281i() {
        int i = this.f31512n;
        return i == 3 || i == 4;
    }

    /* renamed from: j */
    public final void mo47282j(Exception exc) {
        Set<E> set;
        this.f31517s = new DrmSession.DrmSessionException(exc);
        C14075p.m21698j("DefaultDrmSession", "DRM session error", exc);
        C14053e<C14216b.C14217a> eVar = this.f31507i;
        synchronized (eVar.f30927b) {
            set = eVar.f30929d;
        }
        for (E e : set) {
            e.mo47333e(exc);
        }
        if (this.f31512n != 4) {
            this.f31512n = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: k */
    public final boolean mo47283k(boolean z) {
        Set<E> set;
        if (mo47281i()) {
            return true;
        }
        try {
            byte[] e = this.f31500b.mo47339e();
            this.f31518t = e;
            this.f31516r = this.f31500b.mo47337c(e);
            this.f31512n = 3;
            C14053e<C14216b.C14217a> eVar = this.f31507i;
            synchronized (eVar.f30927b) {
                set = eVar.f30929d;
            }
            for (E d : set) {
                d.mo47332d(3);
            }
            this.f31518t.getClass();
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                ((DefaultDrmSessionManager.C14211e) this.f31501c).mo47300b(this);
                return false;
            }
            mo47282j(e2);
            return false;
        } catch (Exception e3) {
            mo47282j(e3);
            return false;
        }
    }

    /* renamed from: l */
    public final void mo47284l(int i, boolean z, byte[] bArr) {
        try {
            C14224f.C14225a k = this.f31500b.mo47345k(bArr, this.f31499a, i, this.f31506h);
            this.f31520v = k;
            C14204c cVar = this.f31515q;
            int i2 = C14049b0.f30913a;
            k.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new C14205d(C17992d.f39337b.getAndIncrement(), z, SystemClock.elapsedRealtime(), k)).sendToTarget();
        } catch (Exception e) {
            if (e instanceof NotProvisionedException) {
                ((DefaultDrmSessionManager.C14211e) this.f31501c).mo47300b(this);
            } else {
                mo47282j(e);
            }
        }
    }

    /* renamed from: m */
    public final Map<String, String> mo47285m() {
        byte[] bArr = this.f31518t;
        if (bArr == null) {
            return null;
        }
        return this.f31500b.mo47336b(bArr);
    }
}
