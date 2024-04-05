package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import android.util.Base64;
import android.util.Log;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6239d;
import com.etsy.android.lib.conversation.MessageDraft;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import com.google.android.exoplayer2.source.C14372q;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15583b0;
import com.google.android.play.core.assetpacks.C15656t1;
import com.google.android.play.core.internal.C15686c0;
import com.paypal.openid.ClientAuthentication;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.C19383o;
import p365hg.C12831b;
import p453tf.C13418j;
import p461uf.C13521n;
import p517bn.C14125p;
import p605kk.C18116a;
import p605kk.C18119c;
import p605kk.C18123g;

/* renamed from: androidx.appcompat.app.l */
public final class C0164l implements C18116a, C14372q, C15686c0, C18119c, ClientAuthentication {

    /* renamed from: b */
    public Object f398b;

    public /* synthetic */ C0164l() {
        this.f398b = Collections.emptySet();
    }

    public /* synthetic */ C0164l(Object obj) {
        this.f398b = obj;
    }

    /* renamed from: a */
    public boolean mo1409a() {
        for (C14372q a : (C14372q[]) this.f398b) {
            if (a.mo1409a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public long mo1410b() {
        long j = Long.MAX_VALUE;
        for (C14372q b : (C14372q[]) this.f398b) {
            long b2 = b.mo1410b();
            if (b2 != Long.MIN_VALUE) {
                j = Math.min(j, b2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: c */
    public boolean mo1411c(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long b = mo1410b();
            if (b != Long.MIN_VALUE) {
                boolean z2 = false;
                for (C14372q qVar : (C14372q[]) this.f398b) {
                    long b2 = qVar.mo1410b();
                    boolean z3 = b2 != Long.MIN_VALUE && b2 <= j2;
                    if (b2 == b || z3) {
                        z2 |= qVar.mo1411c(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: d */
    public long mo1412d() {
        long j = Long.MAX_VALUE;
        for (C14372q d : (C14372q[]) this.f398b) {
            long d2 = d.mo1412d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: e */
    public void mo1413e(long j) {
        for (C14372q e : (C14372q[]) this.f398b) {
            e.mo1413e(j);
        }
    }

    /* renamed from: g */
    public Map mo1132g(String str) {
        StringBuilder k = C0073e.m211k(str, MessageDraft.IMAGE_DELIMITER);
        k.append((String) this.f398b);
        String encodeToString = Base64.encodeToString(k.toString().getBytes(), 2);
        return Collections.singletonMap("Authorization", "Basic " + encodeToString);
    }

    /* renamed from: h */
    public boolean mo1414h(C6239d dVar) {
        if (dVar.mo17709d() == null) {
            return true;
        }
        for (String next : dVar.mo17709d()) {
            if (!Collections.singleton("b64").contains(next) && !Collections.unmodifiableSet((Set) this.f398b).contains(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public Map mo1136l(String str) {
        return null;
    }

    /* renamed from: m */
    public synchronized void mo1415m(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair next : persistedEvents.keySet()) {
                C13521n p = mo1418p(next);
                if (p != null) {
                    List<AppEvent> list = persistedEvents.get(next);
                    if (list != null) {
                        for (AppEvent a : list) {
                            p.mo46176a(a);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
            }
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: n */
    public synchronized int mo1416n() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.f398b     // Catch:{ all -> 0x0039 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0039 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
            r1 = 0
            r2 = r1
        L_0x000f:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0039 }
            uf.n r3 = (p461uf.C13521n) r3     // Catch:{ all -> 0x0039 }
            monitor-enter(r3)     // Catch:{ all -> 0x0039 }
            boolean r4 = p401mg.C13080a.m20762b(r3)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x0024
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0031
        L_0x0024:
            java.util.ArrayList r4 = r3.f29577a     // Catch:{ all -> 0x002c }
            int r4 = r4.size()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0032
        L_0x002c:
            r4 = move-exception
            p401mg.C13080a.m20761a(r3, r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
        L_0x0031:
            r4 = r1
        L_0x0032:
            int r2 = r2 + r4
            goto L_0x000f
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r5)
            return r2
        L_0x0039:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0164l.mo1416n():int");
    }

    public void onComplete(C18123g gVar) {
        ((ScheduledFuture) this.f398b).cancel(false);
    }

    /* renamed from: p */
    public synchronized C13521n mo1418p(AccessTokenAppIdPair accessTokenAppIdPair) {
        C13521n nVar = (C13521n) ((HashMap) this.f398b).get(accessTokenAppIdPair);
        if (nVar == null) {
            Context b = C13418j.m21106b();
            C12831b.f28321h.getClass();
            C12831b a = C12831b.C12832a.m20469a(b);
            nVar = a != null ? new C13521n(a, C15562d.m25173K(b)) : null;
        }
        if (nVar == null) {
            return null;
        }
        ((HashMap) this.f398b).put(accessTokenAppIdPair, nVar);
        return nVar;
    }

    /* renamed from: r */
    public synchronized Set mo1419r() {
        Set keySet;
        keySet = ((HashMap) this.f398b).keySet();
        C19383o.m32796f(keySet, "stateMap.keys");
        return keySet;
    }

    public Object then(C18123g gVar) {
        ((C14125p) this.f398b).getClass();
        Bundle bundle = (Bundle) gVar.mo69665l(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String obj = bundle.toString();
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(obj), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public /* bridge */ /* synthetic */ Object zza() {
        return new C15656t1((C15583b0) ((C15686c0) this.f398b).zza());
    }

    public /* synthetic */ C0164l(int i) {
        if (i == 1) {
            this.f398b = new HashMap();
        } else if (i != 2) {
            this.f398b = new ArrayDeque();
        } else {
            this.f398b = new HashMap();
        }
    }
}
