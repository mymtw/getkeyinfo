package p705wl;

import com.google.crypto.tink.proto.C16415a;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;

/* renamed from: wl.g */
public final class C18735g {

    /* renamed from: a */
    public final C16415a.C16417b f41507a;

    public C18735g(C16415a.C16417b bVar) {
        this.f41507a = bVar;
    }

    /* renamed from: d */
    public static int m31593d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized C18734f mo70225a() throws GeneralSecurityException {
        C16415a aVar;
        aVar = (C16415a) this.f41507a.mo58538l();
        if (aVar.mo58432x() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C18734f(aVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo70226b(int i) {
        for (T z : Collections.unmodifiableList(((C16415a) this.f41507a.f36539c).mo58433y())) {
            if (z.mo58439z() == i) {
                return true;
            }
        }
        return false;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public final synchronized com.google.crypto.tink.proto.C16415a.C16418c mo70227c(p551dm.C17589a0 r5) throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.crypto.tink.proto.KeyData r0 = p705wl.C18745o.m31614d(r5)     // Catch:{ all -> 0x0059 }
            monitor-enter(r4)     // Catch:{ all -> 0x0059 }
            int r1 = m31593d()     // Catch:{ all -> 0x0056 }
        L_0x000a:
            boolean r2 = r4.mo70226b(r1)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0015
            int r1 = m31593d()     // Catch:{ all -> 0x0056 }
            goto L_0x000a
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.OutputPrefixType r5 = r5.mo68914y()     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX     // Catch:{ all -> 0x0059 }
            if (r5 != r2) goto L_0x0020
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ all -> 0x0059 }
        L_0x0020:
            com.google.crypto.tink.proto.a$c$a r2 = com.google.crypto.tink.proto.C16415a.C16418c.m26545D()     // Catch:{ all -> 0x0059 }
            r2.mo58540o()     // Catch:{ all -> 0x0059 }
            MessageType r3 = r2.f36539c     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.a$c r3 = (com.google.crypto.tink.proto.C16415a.C16418c) r3     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.C16415a.C16418c.m26547u(r3, r0)     // Catch:{ all -> 0x0059 }
            r2.mo58540o()     // Catch:{ all -> 0x0059 }
            MessageType r0 = r2.f36539c     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.a$c r0 = (com.google.crypto.tink.proto.C16415a.C16418c) r0     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.C16415a.C16418c.m26550x(r0, r1)     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch:{ all -> 0x0059 }
            r2.mo58540o()     // Catch:{ all -> 0x0059 }
            MessageType r1 = r2.f36539c     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.a$c r1 = (com.google.crypto.tink.proto.C16415a.C16418c) r1     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.C16415a.C16418c.m26549w(r1, r0)     // Catch:{ all -> 0x0059 }
            r2.mo58540o()     // Catch:{ all -> 0x0059 }
            MessageType r0 = r2.f36539c     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.a$c r0 = (com.google.crypto.tink.proto.C16415a.C16418c) r0     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.C16415a.C16418c.m26548v(r0, r5)     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r2.mo58538l()     // Catch:{ all -> 0x0059 }
            com.google.crypto.tink.proto.a$c r5 = (com.google.crypto.tink.proto.C16415a.C16418c) r5     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)
            return r5
        L_0x0056:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r5     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p705wl.C18735g.mo70227c(dm.a0):com.google.crypto.tink.proto.a$c");
    }
}
