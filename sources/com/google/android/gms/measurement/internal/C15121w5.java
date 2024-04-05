package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
public final class C15121w5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33953b = 0;

    /* renamed from: c */
    public final /* synthetic */ String f33954c;

    /* renamed from: d */
    public final /* synthetic */ String f33955d;

    /* renamed from: e */
    public final /* synthetic */ zzp f33956e;

    /* renamed from: f */
    public final /* synthetic */ boolean f33957f;

    /* renamed from: g */
    public final /* synthetic */ C14999i6 f33958g;

    /* renamed from: h */
    public final /* synthetic */ Object f33959h;

    public C15121w5(C14999i6 i6Var, String str, String str2, zzp zzp, boolean z, zzcf zzcf) {
        this.f33958g = i6Var;
        this.f33954c = str;
        this.f33955d = str2;
        this.f33956e = zzp;
        this.f33957f = z;
        this.f33959h = zzcf;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f33953b
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00d4
        L_0x0007:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.i6 r1 = r8.f33958g     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.zzeb r2 = r1.f33574e     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            if (r2 != 0) goto L_0x0038
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            java.lang.String r2 = "Failed to get user properties; not connected to service"
            java.lang.String r3 = r8.f33954c     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            java.lang.String r4 = r8.f33955d     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            r1.mo52239c(r3, r2, r4)     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.i6 r1 = r8.f33958g
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()
            java.lang.Object r2 = r8.f33959h
            com.google.android.gms.internal.measurement.zzcf r2 = (com.google.android.gms.internal.measurement.zzcf) r2
            r1.mo52226z(r2, r0)
            goto L_0x00be
        L_0x0038:
            com.google.android.gms.measurement.internal.zzp r1 = r8.f33956e     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            java.lang.String r1 = r8.f33954c     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = r8.f33955d     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            boolean r4 = r8.f33957f     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.zzp r5 = r8.f33956e     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            java.util.List r1 = r2.zzh(r1, r3, r4, r5)     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            if (r1 != 0) goto L_0x0051
            goto L_0x0087
        L_0x0051:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
        L_0x0055:
            boolean r3 = r1.hasNext()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r1.next()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            com.google.android.gms.measurement.internal.zzkv r3 = (com.google.android.gms.measurement.internal.zzkv) r3     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            java.lang.String r4 = r3.zze     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            if (r4 == 0) goto L_0x006b
            java.lang.String r3 = r3.zzb     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            r2.putString(r3, r4)     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            goto L_0x0055
        L_0x006b:
            java.lang.Long r4 = r3.zzd     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            if (r4 == 0) goto L_0x0079
            java.lang.String r3 = r3.zzb     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            long r4 = r4.longValue()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            r2.putLong(r3, r4)     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            goto L_0x0055
        L_0x0079:
            java.lang.Double r4 = r3.zzg     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            if (r4 == 0) goto L_0x0055
            java.lang.String r3 = r3.zzb     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            double r4 = r4.doubleValue()     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            r2.putDouble(r3, r4)     // Catch:{ RemoteException -> 0x0097, all -> 0x0095 }
            goto L_0x0055
        L_0x0087:
            com.google.android.gms.measurement.internal.i6 r0 = r8.f33958g     // Catch:{ RemoteException -> 0x0093 }
            r0.mo52132r()     // Catch:{ RemoteException -> 0x0093 }
            com.google.android.gms.measurement.internal.i6 r0 = r8.f33958g
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            goto L_0x00b3
        L_0x0093:
            r0 = move-exception
            goto L_0x009a
        L_0x0095:
            r1 = move-exception
            goto L_0x00c2
        L_0x0097:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x009a:
            com.google.android.gms.measurement.internal.i6 r1 = r8.f33958g     // Catch:{ all -> 0x00bf }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ all -> 0x00bf }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ all -> 0x00bf }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ all -> 0x00bf }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = "Failed to get user properties; remote exception"
            java.lang.String r4 = r8.f33954c     // Catch:{ all -> 0x00bf }
            r1.mo52239c(r4, r3, r0)     // Catch:{ all -> 0x00bf }
            com.google.android.gms.measurement.internal.i6 r0 = r8.f33958g
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
        L_0x00b3:
            com.google.android.gms.measurement.internal.k7 r0 = r0.mo52335w()
            java.lang.Object r1 = r8.f33959h
            com.google.android.gms.internal.measurement.zzcf r1 = (com.google.android.gms.internal.measurement.zzcf) r1
            r0.mo52226z(r1, r2)
        L_0x00be:
            return
        L_0x00bf:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x00c2:
            com.google.android.gms.measurement.internal.i6 r2 = r8.f33958g
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.k7 r2 = r2.mo52335w()
            java.lang.Object r3 = r8.f33959h
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            r2.mo52226z(r3, r0)
            throw r1
        L_0x00d4:
            java.lang.Object r0 = r8.f33959h
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.i6 r2 = r8.f33958g     // Catch:{ RemoteException -> 0x0143 }
            com.google.android.gms.measurement.internal.zzeb r3 = r2.f33574e     // Catch:{ RemoteException -> 0x0143 }
            if (r3 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ RemoteException -> 0x0143 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ RemoteException -> 0x0143 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ RemoteException -> 0x0143 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ RemoteException -> 0x0143 }
            java.lang.String r3 = "(legacy) Failed to get user properties; not connected to service"
            java.lang.String r4 = r8.f33954c     // Catch:{ RemoteException -> 0x0143 }
            java.lang.String r5 = r8.f33955d     // Catch:{ RemoteException -> 0x0143 }
            r2.mo52240d(r1, r4, r5, r3)     // Catch:{ RemoteException -> 0x0143 }
            java.lang.Object r2 = r8.f33959h     // Catch:{ RemoteException -> 0x0143 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0143 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ RemoteException -> 0x0143 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0143 }
            java.lang.Object r1 = r8.f33959h     // Catch:{ all -> 0x0173 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0173 }
            r1.notify()     // Catch:{ all -> 0x0173 }
            monitor-exit(r0)     // Catch:{ all -> 0x0173 }
            goto L_0x016a
        L_0x0107:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RemoteException -> 0x0143 }
            if (r2 == 0) goto L_0x0126
            com.google.android.gms.measurement.internal.zzp r2 = r8.f33956e     // Catch:{ RemoteException -> 0x0143 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ RemoteException -> 0x0143 }
            java.lang.Object r2 = r8.f33959h     // Catch:{ RemoteException -> 0x0143 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0143 }
            java.lang.String r4 = r8.f33954c     // Catch:{ RemoteException -> 0x0143 }
            java.lang.String r5 = r8.f33955d     // Catch:{ RemoteException -> 0x0143 }
            boolean r6 = r8.f33957f     // Catch:{ RemoteException -> 0x0143 }
            com.google.android.gms.measurement.internal.zzp r7 = r8.f33956e     // Catch:{ RemoteException -> 0x0143 }
            java.util.List r3 = r3.zzh(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0143 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0143 }
            goto L_0x0137
        L_0x0126:
            java.lang.Object r2 = r8.f33959h     // Catch:{ RemoteException -> 0x0143 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0143 }
            java.lang.String r4 = r8.f33954c     // Catch:{ RemoteException -> 0x0143 }
            java.lang.String r5 = r8.f33955d     // Catch:{ RemoteException -> 0x0143 }
            boolean r6 = r8.f33957f     // Catch:{ RemoteException -> 0x0143 }
            java.util.List r3 = r3.zzi(r1, r4, r5, r6)     // Catch:{ RemoteException -> 0x0143 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0143 }
        L_0x0137:
            com.google.android.gms.measurement.internal.i6 r2 = r8.f33958g     // Catch:{ RemoteException -> 0x0143 }
            r2.mo52132r()     // Catch:{ RemoteException -> 0x0143 }
            java.lang.Object r1 = r8.f33959h     // Catch:{ all -> 0x0173 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0173 }
            goto L_0x0166
        L_0x0141:
            r1 = move-exception
            goto L_0x016b
        L_0x0143:
            r2 = move-exception
            com.google.android.gms.measurement.internal.i6 r3 = r8.f33958g     // Catch:{ all -> 0x0141 }
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ all -> 0x0141 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x0141 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x0141 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "(legacy) Failed to get user properties; remote exception"
            java.lang.String r5 = r8.f33954c     // Catch:{ all -> 0x0141 }
            r3.mo52240d(r1, r5, r2, r4)     // Catch:{ all -> 0x0141 }
            java.lang.Object r1 = r8.f33959h     // Catch:{ all -> 0x0141 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0141 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0141 }
            r1.set(r2)     // Catch:{ all -> 0x0141 }
            java.lang.Object r1 = r8.f33959h     // Catch:{ all -> 0x0173 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0173 }
        L_0x0166:
            r1.notify()     // Catch:{ all -> 0x0173 }
            monitor-exit(r0)     // Catch:{ all -> 0x0173 }
        L_0x016a:
            return
        L_0x016b:
            java.lang.Object r2 = r8.f33959h     // Catch:{ all -> 0x0173 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x0173 }
            r2.notify()     // Catch:{ all -> 0x0173 }
            throw r1     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0173 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15121w5.run():void");
    }

    public C15121w5(C14999i6 i6Var, AtomicReference atomicReference, String str, String str2, zzp zzp, boolean z) {
        this.f33958g = i6Var;
        this.f33959h = atomicReference;
        this.f33954c = str;
        this.f33955d = str2;
        this.f33956e = zzp;
        this.f33957f = z;
    }
}
