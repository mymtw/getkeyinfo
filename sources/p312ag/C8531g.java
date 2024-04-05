package p312ag;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: ag.g */
public final class C8531g {

    /* renamed from: a */
    public static final String f18580a = C8531g.class.getSimpleName();

    /* renamed from: b */
    public static final String[] f18581b = {"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"};

    /* renamed from: c */
    public static final C8531g f18582c = new C8531g();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        kotlin.reflect.C19421p.m32917E(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m16936a(java.lang.String r4) throws java.lang.Exception {
        /*
            ag.g r0 = f18582c
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            r0.getClass()
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            r1 = 1024(0x400, float:1.435E-42)
            r4.<init>(r0, r1)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x0045 }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0045 }
        L_0x001e:
            int r2 = r4.read(r1)     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0028
            r3 = 0
            r0.update(r1, r3, r2)     // Catch:{ all -> 0x0045 }
        L_0x0028:
            r3 = -1
            if (r2 != r3) goto L_0x001e
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ all -> 0x0045 }
            r2 = 1
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0045 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0045 }
            r0 = 16
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "BigInteger(1, md.digest()).toString(16)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)     // Catch:{ all -> 0x0045 }
            r1 = 0
            kotlin.reflect.C19421p.m32917E(r4, r1)
            return r0
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ag.C8531g.m16936a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static final String m16937b(Context context) {
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        String[] strArr = f18581b;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String decode : strArr) {
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(Base64.decode(decode, 0))));
        }
        ArrayList q1 = C19327t.m32661q1(arrayList);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Field field = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            C19383o.m32796f(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get((Object) null);
            Class<?> cls = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Object newProxyInstance = Proxy.newProxyInstance(C8531g.class.getClassLoader(), new Class[]{cls}, new C8530f(obj, ref$ObjectRef, reentrantLock, newCondition));
            C19383o.m32796f(newProxyInstance, "Proxy.newProxyInstance(\n…       }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", new Class[]{String.class, Boolean.TYPE, Integer.TYPE, List.class, cls});
            C19383o.m32796f(method, "PackageManager::class.ja…ecksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), new Object[]{context.getPackageName(), Boolean.FALSE, obj, C19327t.m32661q1(q1), newProxyInstance});
            newCondition.await();
            String str = (String) ref$ObjectRef.element;
            reentrantLock.unlock();
            return str;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }
}
