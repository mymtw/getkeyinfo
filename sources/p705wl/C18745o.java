package p705wl;

import android.support.p013v4.media.C0072d;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import p551dm.C17589a0;

/* renamed from: wl.o */
public final class C18745o {

    /* renamed from: a */
    public static final Logger f41518a = Logger.getLogger(C18745o.class.getName());

    /* renamed from: b */
    public static final ConcurrentHashMap f41519b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentHashMap f41520c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentHashMap f41521d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentHashMap f41522e = new ConcurrentHashMap();

    /* renamed from: wl.o$a */
    public interface C18746a {
        /* renamed from: a */
        Class<?> mo70234a();

        /* renamed from: b */
        Set<Class<?>> mo70235b();

        /* renamed from: c */
        C18730d mo70236c(Class cls) throws GeneralSecurityException;

        /* renamed from: d */
        C18730d mo70237d();
    }

    static {
        new ConcurrentHashMap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m31611a(java.lang.Class r5, java.lang.String r6, boolean r7) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<wl.o> r0 = p705wl.C18745o.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap r1 = f41519b     // Catch:{ all -> 0x0081 }
            boolean r2 = r1.containsKey(r6)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0081 }
            wl.o$a r1 = (p705wl.C18745o.C18746a) r1     // Catch:{ all -> 0x0081 }
            java.lang.Class r2 = r1.mo70234a()     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0047
            if (r7 == 0) goto L_0x0045
            java.util.concurrent.ConcurrentHashMap r5 = f41521d     // Catch:{ all -> 0x0081 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0081 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0081 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r7.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0081 }
            r7.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0081 }
            r5.<init>(r6)     // Catch:{ all -> 0x0081 }
            throw r5     // Catch:{ all -> 0x0081 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            java.util.logging.Logger r7 = f41518a     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0081 }
            r7.warning(r2)     // Catch:{ all -> 0x0081 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0081 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0081 }
            r6 = 1
            java.lang.Class r1 = r1.mo70234a()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0081 }
            r3[r6] = r1     // Catch:{ all -> 0x0081 }
            r6 = 2
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0081 }
            r3[r6] = r5     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0081 }
            r7.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r7     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p705wl.C18745o.m31611a(java.lang.Class, java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public static synchronized C18746a m31612b(String str) throws GeneralSecurityException {
        C18746a aVar;
        synchronized (C18745o.class) {
            ConcurrentHashMap concurrentHashMap = f41519b;
            if (concurrentHashMap.containsKey(str)) {
                aVar = (C18746a) concurrentHashMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public static <P> P m31613c(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        C18746a b = m31612b(str);
        if (b.mo70235b().contains(cls)) {
            return b.mo70236c(cls).mo70219a(byteString);
        }
        StringBuilder h = C0072d.m201h("Primitive type ");
        h.append(cls.getName());
        h.append(" not supported by key manager of type ");
        h.append(b.mo70234a());
        h.append(", supported primitives: ");
        Set<Class<?>> b2 = b.mo70235b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : b2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        h.append(sb.toString());
        throw new GeneralSecurityException(h.toString());
    }

    /* renamed from: d */
    public static synchronized KeyData m31614d(C17589a0 a0Var) throws GeneralSecurityException {
        KeyData c;
        synchronized (C18745o.class) {
            C18730d d = m31612b(a0Var.mo68915z()).mo70237d();
            if (((Boolean) f41521d.get(a0Var.mo68915z())).booleanValue()) {
                c = d.mo70221c(a0Var.mo68913A());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.mo68915z());
            }
        }
        return c;
    }

    /* renamed from: e */
    public static synchronized <KeyProtoT extends C16503j0> void m31615e(C18731e<KeyProtoT> eVar, boolean z) throws GeneralSecurityException {
        synchronized (C18745o.class) {
            String a = eVar.mo46962a();
            m31611a(eVar.getClass(), a, z);
            ConcurrentHashMap concurrentHashMap = f41519b;
            if (!concurrentHashMap.containsKey(a)) {
                concurrentHashMap.put(a, new C18743m(eVar));
                f41520c.put(a, new C18744n());
            }
            f41521d.put(a, Boolean.valueOf(z));
        }
    }

    /* renamed from: f */
    public static synchronized <B, P> void m31616f(C18742l<B, P> lVar) throws GeneralSecurityException {
        synchronized (C18745o.class) {
            Class<P> c = lVar.mo46973c();
            ConcurrentHashMap concurrentHashMap = f41522e;
            if (concurrentHashMap.containsKey(c)) {
                C18742l lVar2 = (C18742l) concurrentHashMap.get(c);
                if (!lVar.getClass().equals(lVar2.getClass())) {
                    Logger logger = f41518a;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + c);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{c.getName(), lVar2.getClass().getName(), lVar.getClass().getName()}));
                }
            }
            concurrentHashMap.put(c, lVar);
        }
    }
}
