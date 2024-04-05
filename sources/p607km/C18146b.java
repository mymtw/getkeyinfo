package p607km;

import android.os.Bundle;
import com.etsy.android.push.CartRefreshDelegate;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14609d1;
import com.google.android.gms.internal.measurement.C14622e1;
import com.google.android.gms.internal.measurement.C14725m0;
import com.google.android.gms.internal.measurement.C14726m1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.C19421p;
import p565fk.C17745a;
import p607km.C18144a;
import p615lm.C18201a;

/* renamed from: km.b */
public final class C18146b implements C18144a {

    /* renamed from: b */
    public static volatile C18146b f39625b;
    @VisibleForTesting

    /* renamed from: a */
    public final C17745a f39626a;

    public C18146b(C17745a aVar) {
        Preconditions.checkNotNull(aVar);
        this.f39626a = aVar;
        new ConcurrentHashMap();
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo69689a(String str) {
        C14726m1 m1Var = this.f39626a.f38573a;
        m1Var.getClass();
        m1Var.mo50666b(new C14725m0(m1Var, str, (String) null, (Bundle) null));
    }

    @KeepForSdk
    /* renamed from: b */
    public final void mo69690b(String str, Bundle bundle, String str2) {
        if ((!C18201a.f39848b.contains(str)) && C18201a.m30701b(bundle, str2) && C18201a.m30700a(str, bundle, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            C14726m1 m1Var = this.f39626a.f38573a;
            m1Var.getClass();
            m1Var.mo50666b(new C14609d1(m1Var, str, str2, bundle, true));
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public final ArrayList mo69691c(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f39626a.f38573a.mo50668e(str, "")) {
            List<String> list = C18201a.f39847a;
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            Preconditions.checkNotNull(next);
            C18144a.C18145a aVar = new C18144a.C18145a();
            aVar.f39610a = (String) Preconditions.checkNotNull((String) C19421p.m32946m0(next, CartRefreshDelegate.ARG_ORIGIN, cls2, (Object) null));
            aVar.f39611b = (String) Preconditions.checkNotNull((String) C19421p.m32946m0(next, "name", cls2, (Object) null));
            aVar.f39612c = C19421p.m32946m0(next, "value", Object.class, (Object) null);
            aVar.f39613d = (String) C19421p.m32946m0(next, "trigger_event_name", cls2, (Object) null);
            aVar.f39614e = ((Long) C19421p.m32946m0(next, "trigger_timeout", cls, 0L)).longValue();
            aVar.f39615f = (String) C19421p.m32946m0(next, "timed_out_event_name", cls2, (Object) null);
            aVar.f39616g = (Bundle) C19421p.m32946m0(next, "timed_out_event_params", Bundle.class, (Object) null);
            aVar.f39617h = (String) C19421p.m32946m0(next, "triggered_event_name", cls2, (Object) null);
            aVar.f39618i = (Bundle) C19421p.m32946m0(next, "triggered_event_params", Bundle.class, (Object) null);
            aVar.f39619j = ((Long) C19421p.m32946m0(next, "time_to_live", cls, 0L)).longValue();
            aVar.f39620k = (String) C19421p.m32946m0(next, "expired_event_name", cls2, (Object) null);
            aVar.f39621l = (Bundle) C19421p.m32946m0(next, "expired_event_params", Bundle.class, (Object) null);
            aVar.f39623n = ((Boolean) C19421p.m32946m0(next, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f39622m = ((Long) C19421p.m32946m0(next, "creation_timestamp", cls, 0L)).longValue();
            aVar.f39624o = ((Long) C19421p.m32946m0(next, "triggered_timestamp", cls, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r3 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (p615lm.C18201a.m30700a(r0, r8.f39621l, r8.f39620k) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if (p615lm.C18201a.m30700a(r0, r8.f39618i, r8.f39617h) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if (p615lm.C18201a.m30700a(r0, r8.f39616g, r8.f39615f) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[Catch:{ IOException | ClassNotFoundException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ IOException | ClassNotFoundException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b1  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69692d(p607km.C18144a.C18145a r8) {
        /*
            r7 = this;
            java.util.List<java.lang.String> r0 = p615lm.C18201a.f39847a
            java.lang.String r0 = r8.f39610a
            r1 = 1
            if (r0 == 0) goto L_0x00ad
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x000f
            goto L_0x00ad
        L_0x000f:
            java.lang.Object r2 = r8.f39612c
            if (r2 == 0) goto L_0x0055
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0044 }
            r4.<init>()     // Catch:{ all -> 0x0044 }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0044 }
            r5.<init>(r4)     // Catch:{ all -> 0x0044 }
            r5.writeObject(r2)     // Catch:{ all -> 0x0040 }
            r5.flush()     // Catch:{ all -> 0x0040 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0040 }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0040 }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x0040 }
            r6.<init>(r4)     // Catch:{ all -> 0x0040 }
            r2.<init>(r6)     // Catch:{ all -> 0x0040 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ all -> 0x003e }
            r5.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
            r3 = r4
            goto L_0x0053
        L_0x003e:
            r4 = move-exception
            goto L_0x0048
        L_0x0040:
            r2 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x0048
        L_0x0044:
            r2 = move-exception
            r4 = r2
            r2 = r3
            r5 = r2
        L_0x0048:
            if (r5 == 0) goto L_0x004d
            r5.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
        L_0x0052:
            throw r4     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
        L_0x0053:
            if (r3 == 0) goto L_0x00ad
        L_0x0055:
            java.util.List<java.lang.String> r2 = p615lm.C18201a.f39848b
            boolean r2 = r2.contains(r0)
            r2 = r2 ^ r1
            if (r2 != 0) goto L_0x005f
            goto L_0x00ad
        L_0x005f:
            java.lang.String r2 = r8.f39611b
            boolean r2 = p615lm.C18201a.m30702c(r0, r2)
            if (r2 != 0) goto L_0x0068
            goto L_0x00ad
        L_0x0068:
            java.lang.String r2 = r8.f39620k
            if (r2 == 0) goto L_0x007f
            android.os.Bundle r3 = r8.f39621l
            boolean r2 = p615lm.C18201a.m30701b(r3, r2)
            if (r2 != 0) goto L_0x0075
            goto L_0x00ad
        L_0x0075:
            java.lang.String r2 = r8.f39620k
            android.os.Bundle r3 = r8.f39621l
            boolean r2 = p615lm.C18201a.m30700a(r0, r3, r2)
            if (r2 == 0) goto L_0x00ad
        L_0x007f:
            java.lang.String r2 = r8.f39617h
            if (r2 == 0) goto L_0x0096
            android.os.Bundle r3 = r8.f39618i
            boolean r2 = p615lm.C18201a.m30701b(r3, r2)
            if (r2 != 0) goto L_0x008c
            goto L_0x00ad
        L_0x008c:
            java.lang.String r2 = r8.f39617h
            android.os.Bundle r3 = r8.f39618i
            boolean r2 = p615lm.C18201a.m30700a(r0, r3, r2)
            if (r2 == 0) goto L_0x00ad
        L_0x0096:
            java.lang.String r2 = r8.f39615f
            if (r2 == 0) goto L_0x00ae
            android.os.Bundle r3 = r8.f39616g
            boolean r2 = p615lm.C18201a.m30701b(r3, r2)
            if (r2 != 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r2 = r8.f39615f
            android.os.Bundle r3 = r8.f39616g
            boolean r0 = p615lm.C18201a.m30700a(r0, r3, r2)
            if (r0 != 0) goto L_0x00ae
        L_0x00ad:
            r1 = 0
        L_0x00ae:
            if (r1 != 0) goto L_0x00b1
            return
        L_0x00b1:
            fk.a r0 = r7.f39626a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r8.f39610a
            if (r2 == 0) goto L_0x00c1
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        L_0x00c1:
            java.lang.String r2 = r8.f39611b
            if (r2 == 0) goto L_0x00ca
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        L_0x00ca:
            java.lang.Object r2 = r8.f39612c
            if (r2 == 0) goto L_0x00d1
            kotlin.reflect.C19421p.m32950o0(r1, r2)
        L_0x00d1:
            java.lang.String r2 = r8.f39613d
            if (r2 == 0) goto L_0x00da
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        L_0x00da:
            long r2 = r8.f39614e
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r8.f39615f
            if (r2 == 0) goto L_0x00ea
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        L_0x00ea:
            android.os.Bundle r2 = r8.f39616g
            if (r2 == 0) goto L_0x00f3
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        L_0x00f3:
            java.lang.String r2 = r8.f39617h
            if (r2 == 0) goto L_0x00fc
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L_0x00fc:
            android.os.Bundle r2 = r8.f39618i
            if (r2 == 0) goto L_0x0105
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L_0x0105:
            long r2 = r8.f39619j
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r8.f39620k
            if (r2 == 0) goto L_0x0115
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L_0x0115:
            android.os.Bundle r2 = r8.f39621l
            if (r2 == 0) goto L_0x011e
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L_0x011e:
            long r2 = r8.f39622m
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r8.f39623n
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r8.f39624o
            java.lang.String r8 = "triggered_timestamp"
            r1.putLong(r8, r2)
            com.google.android.gms.internal.measurement.m1 r8 = r0.f38573a
            r8.getClass()
            com.google.android.gms.internal.measurement.l0 r0 = new com.google.android.gms.internal.measurement.l0
            r0.<init>(r8, r1)
            r8.mo50666b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p607km.C18146b.mo69692d(km.a$a):void");
    }

    @KeepForSdk
    /* renamed from: e */
    public final Map mo69693e() {
        return this.f39626a.f38573a.mo50669f((String) null, (String) null, false);
    }

    @KeepForSdk
    /* renamed from: f */
    public final int mo69694f(String str) {
        return this.f39626a.f38573a.mo50667c(str);
    }

    @KeepForSdk
    /* renamed from: g */
    public final void mo69695g(String str) {
        if ((!C18201a.f39848b.contains("fcm")) && C18201a.m30702c("fcm", "_ln")) {
            C14726m1 m1Var = this.f39626a.f38573a;
            m1Var.getClass();
            m1Var.mo50666b(new C14622e1(m1Var, "fcm", "_ln", str, true));
        }
    }
}
