package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14766p2;
import com.google.android.gms.internal.measurement.C14779q2;
import com.google.android.gms.internal.measurement.C14816t2;
import com.google.android.gms.internal.measurement.C14828u2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzgn extends zzea {
    /* access modifiers changed from: private */
    public final C14973f7 zza;
    private Boolean zzb;
    private String zzc = null;

    public zzgn(C14973f7 f7Var, String str) {
        Preconditions.checkNotNull(f7Var);
        this.zza = f7Var;
    }

    private final void zzA(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.f33497m.f33872b, Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.getInstance(this.zza.f33497m.f33872b).isUidGoogleSigned(Binder.getCallingUid())) {
                                z2 = false;
                                this.zzb = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.zzb = Boolean.valueOf(z2);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.zza.mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.f33497m.f33872b, Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (!str.equals(this.zzc)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.zza.mo52016b().f33724g.mo52237a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* access modifiers changed from: private */
    public final void zzB(zzat zzat, zzp zzp) {
        this.zza.mo52019e();
        this.zza.mo52023i(zzat, zzp);
    }

    private final void zzz(zzp zzp, boolean z) {
        Preconditions.checkNotNull(zzp);
        Preconditions.checkNotEmpty(zzp.zza);
        zzA(zzp.zza, false);
        this.zza.mo52013Q().mo52192F(zzp.zzb, zzp.zzq, zzp.zzu);
    }

    @VisibleForTesting
    public final zzat zzb(zzat zzat, zzp zzp) {
        zzar zzar;
        if (!(!"_cmp".equals(zzat.zza) || (zzar = zzat.zzb) == null || zzar.zza() == 0)) {
            String zzg = zzat.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.mo52016b().f33730m.mo52238b(zzat.toString(), "Event has been filtered ");
                return new zzat("_cmpx", zzat.zzb, zzat.zzc, zzat.zzd);
            }
        }
        return zzat;
    }

    public final String zzd(zzp zzp) {
        zzz(zzp, false);
        C14973f7 f7Var = this.zza;
        try {
            return (String) f7Var.mo52015a().mo52306m(new C14946c7(f7Var, zzp)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f7Var.mo52016b().f33724g.mo52239c(C15049o2.m24575p(zzp.zza), "Failed to get app instance id. appId", e);
            return null;
        }
    }

    public final List<zzkv> zze(zzp zzp, boolean z) {
        zzz(zzp, false);
        String str = zzp.zza;
        Preconditions.checkNotNull(str);
        try {
            List<C15000i7> list = (List) this.zza.mo52015a().mo52306m(new C15006j4(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C15000i7 i7Var : list) {
                if (z || !C15018k7.m24469R(i7Var.f33582c)) {
                    arrayList.add(new zzkv(i7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.mo52016b().f33724g.mo52239c(C15049o2.m24575p(zzp.zza), "Failed to get user properties. appId", e);
            return null;
        }
    }

    public final List<zzab> zzf(String str, String str2, zzp zzp) {
        zzz(zzp, false);
        String str3 = zzp.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.mo52015a().mo52306m(new C14934b4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.mo52016b().f33724g.mo52238b(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    public final List<zzab> zzg(String str, String str2, String str3) {
        zzA(str, true);
        try {
            return (List) this.zza.mo52015a().mo52306m(new C14943c4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.mo52016b().f33724g.mo52238b(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    public final List<zzkv> zzh(String str, String str2, boolean z, zzp zzp) {
        zzz(zzp, false);
        String str3 = zzp.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<C15000i7> list = (List) this.zza.mo52015a().mo52306m(new C15135y3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C15000i7 i7Var : list) {
                if (z || !C15018k7.m24469R(i7Var.f33582c)) {
                    arrayList.add(new zzkv(i7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.mo52016b().f33724g.mo52239c(C15049o2.m24575p(zzp.zza), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        }
    }

    public final List<zzkv> zzi(String str, String str2, String str3, boolean z) {
        zzA(str, true);
        try {
            List<C15000i7> list = (List) this.zza.mo52015a().mo52306m(new C14925a4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C15000i7 i7Var : list) {
                if (z || !C15018k7.m24469R(i7Var.f33582c)) {
                    arrayList.add(new zzkv(i7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        }
    }

    public final void zzj(zzp zzp) {
        zzz(zzp, false);
        zzy(new C15015k4(0, this, zzp));
    }

    public final void zzk(zzat zzat, zzp zzp) {
        Preconditions.checkNotNull(zzat);
        zzz(zzp, false);
        zzy(new C14970f4(this, zzat, zzp));
    }

    public final void zzl(zzat zzat, String str, String str2) {
        Preconditions.checkNotNull(zzat);
        Preconditions.checkNotEmpty(str);
        zzA(str, true);
        zzy(new C14979g4(this, zzat, str));
    }

    public final void zzm(zzp zzp) {
        Preconditions.checkNotEmpty(zzp.zza);
        zzA(zzp.zza, false);
        zzy(new C15001j(1, this, zzp));
    }

    public final void zzn(zzab zzab, zzp zzp) {
        Preconditions.checkNotNull(zzab);
        Preconditions.checkNotNull(zzab.zzc);
        zzz(zzp, false);
        zzab zzab2 = new zzab(zzab);
        zzab2.zza = zzp.zza;
        zzy(new C15119w3(this, zzab2, zzp));
    }

    public final void zzo(zzab zzab) {
        Preconditions.checkNotNull(zzab);
        Preconditions.checkNotNull(zzab.zzc);
        Preconditions.checkNotEmpty(zzab.zza);
        zzA(zzab.zza, true);
        zzy(new C15127x3(0, this, new zzab(zzab)));
    }

    public final void zzp(zzp zzp) {
        Preconditions.checkNotEmpty(zzp.zza);
        Preconditions.checkNotNull(zzp.zzv);
        C14961e4 e4Var = new C14961e4(this, zzp);
        Preconditions.checkNotNull(e4Var);
        if (this.zza.mo52015a().mo52310q()) {
            e4Var.run();
        } else {
            this.zza.mo52015a().mo52309p(e4Var);
        }
    }

    public final void zzq(long j, String str, String str2, String str3) {
        zzy(new C15024l4(this, str2, str3, str, j));
    }

    public final void zzr(Bundle bundle, zzp zzp) {
        zzz(zzp, false);
        String str = zzp.zza;
        Preconditions.checkNotNull(str);
        zzy(new C15111v3(this, 0, str, bundle));
    }

    public final void zzs(zzp zzp) {
        zzz(zzp, false);
        zzy(new C14952d4(0, this, zzp));
    }

    public final void zzt(zzkv zzkv, zzp zzp) {
        Preconditions.checkNotNull(zzkv);
        zzz(zzp, false);
        zzy(new C14997i4(this, zzkv, zzp));
    }

    public final byte[] zzu(zzat zzat, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzat);
        zzA(str, true);
        this.zza.mo52016b().f33731n.mo52238b(this.zza.f33497m.f33884n.mo52142d(zzat.zza), "Log and bundle. event");
        long nanoTime = this.zza.mo52017c().nanoTime() / 1000000;
        C15086s3 a = this.zza.mo52015a();
        C14988h4 h4Var = new C14988h4(this, zzat, str);
        a.mo52264i();
        Preconditions.checkNotNull(h4Var);
        C15068q3 q3Var = new C15068q3(a, h4Var, true);
        if (Thread.currentThread() == a.f33827d) {
            q3Var.run();
        } else {
            a.mo52311r(q3Var);
        }
        try {
            byte[] bArr = (byte[]) q3Var.get();
            if (bArr == null) {
                this.zza.mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            this.zza.mo52016b().f33731n.mo52240d(this.zza.f33497m.f33884n.mo52142d(zzat.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.mo52017c().nanoTime() / 1000000) - nanoTime), "Log and bundle processed. event, size, time_ms");
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.mo52016b().f33724g.mo52240d(C15049o2.m24575p(str), this.zza.f33497m.f33884n.mo52142d(zzat.zza), e, "Failed to log and bundle. appId, event, error");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.gms.internal.measurement.k0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzw(com.google.android.gms.measurement.internal.zzat r8, com.google.android.gms.measurement.internal.zzp r9) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.n3 r0 = r0.f33486b
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)
            java.lang.String r1 = r9.zza
            boolean r0 = r0.mo52256m(r1)
            if (r0 != 0) goto L_0x0013
            r7.zzB(r8, r9)
            return
        L_0x0013:
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r1 = r9.zza
            java.lang.String r2 = "EES config found for"
            r0.mo52238b(r1, r2)
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.n3 r0 = r0.f33486b
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)
            java.lang.String r1 = r9.zza
            com.google.android.gms.internal.measurement.C14722la.m23700b()
            com.google.android.gms.measurement.internal.o4 r2 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.d r2 = r2.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C14959e2.f33426q0
            r4 = 0
            boolean r2 = r2.mo51973p(r4, r3)
            if (r2 == 0) goto L_0x004d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            com.google.android.gms.measurement.internal.l3 r0 = r0.f33705j
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            com.google.android.gms.internal.measurement.k0 r4 = (com.google.android.gms.internal.measurement.C14699k0) r4
        L_0x004d:
            if (r4 == 0) goto L_0x0112
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza     // Catch:{ zzd -> 0x00ee }
            com.google.android.gms.measurement.internal.h7 r0 = r0.f33492h     // Catch:{ zzd -> 0x00ee }
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)     // Catch:{ zzd -> 0x00ee }
            com.google.android.gms.measurement.internal.zzar r1 = r8.zzb     // Catch:{ zzd -> 0x00ee }
            android.os.Bundle r1 = r1.zzc()     // Catch:{ zzd -> 0x00ee }
            r2 = 1
            java.util.HashMap r0 = r0.mo52108F(r1, r2)     // Catch:{ zzd -> 0x00ee }
            java.lang.String r1 = r8.zza     // Catch:{ zzd -> 0x00ee }
            java.lang.String[] r3 = p568fn.C17782b.f38640k     // Catch:{ zzd -> 0x00ee }
            java.lang.String[] r5 = p568fn.C17782b.f38638i     // Catch:{ zzd -> 0x00ee }
            java.lang.String r1 = p514bk.C14088a.m21797z(r1, r3, r5)     // Catch:{ zzd -> 0x00ee }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = r8.zza     // Catch:{ zzd -> 0x00ee }
        L_0x006f:
            com.google.android.gms.internal.measurement.b r3 = new com.google.android.gms.internal.measurement.b     // Catch:{ zzd -> 0x00ee }
            long r5 = r8.zzd     // Catch:{ zzd -> 0x00ee }
            r3.<init>(r1, r5, r0)     // Catch:{ zzd -> 0x00ee }
            boolean r0 = r4.mo50621b(r3)     // Catch:{ zzd -> 0x00ee }
            if (r0 != 0) goto L_0x007e
            goto L_0x00ff
        L_0x007e:
            com.google.android.gms.internal.measurement.c r0 = r4.f32903c
            com.google.android.gms.internal.measurement.b r1 = r0.f32769b
            com.google.android.gms.internal.measurement.b r0 = r0.f32768a
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r8 = r8.zza
            java.lang.String r1 = "EES edited event"
            r0.mo52238b(r8, r1)
            com.google.android.gms.measurement.internal.f7 r8 = r7.zza
            com.google.android.gms.measurement.internal.h7 r8 = r8.f33492h
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r8)
            com.google.android.gms.internal.measurement.c r0 = r4.f32903c
            com.google.android.gms.internal.measurement.b r0 = r0.f32769b
            com.google.android.gms.measurement.internal.zzat r8 = r8.mo52117y(r0)
            r7.zzB(r8, r9)
            goto L_0x00b0
        L_0x00ad:
            r7.zzB(r8, r9)
        L_0x00b0:
            com.google.android.gms.internal.measurement.c r8 = r4.f32903c
            java.util.ArrayList r8 = r8.f32770c
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.c r8 = r4.f32903c
            java.util.ArrayList r8 = r8.f32770c
            java.util.Iterator r8 = r8.iterator()
        L_0x00c3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r8.next()
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.C14581b) r0
            com.google.android.gms.measurement.internal.f7 r1 = r7.zza
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            java.lang.String r2 = r0.f32751a
            java.lang.String r3 = "EES logging created event"
            r1.mo52238b(r2, r3)
            com.google.android.gms.measurement.internal.f7 r1 = r7.zza
            com.google.android.gms.measurement.internal.h7 r1 = r1.f33492h
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r1)
            com.google.android.gms.measurement.internal.zzat r0 = r1.mo52117y(r0)
            r7.zzB(r0, r9)
            goto L_0x00c3
        L_0x00ed:
            return
        L_0x00ee:
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.String r1 = r9.zzb
            java.lang.String r2 = r8.zza
            java.lang.String r3 = "EES error. appId, eventName"
            r0.mo52239c(r1, r3, r2)
        L_0x00ff:
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r1 = r8.zza
            java.lang.String r2 = "EES was not applied to event"
            r0.mo52238b(r1, r2)
            r7.zzB(r8, r9)
            return
        L_0x0112:
            com.google.android.gms.measurement.internal.f7 r0 = r7.zza
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r1 = r9.zza
            java.lang.String r2 = "EES not loaded for"
            r0.mo52238b(r1, r2)
            r7.zzB(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgn.zzw(com.google.android.gms.measurement.internal.zzat, com.google.android.gms.measurement.internal.zzp):void");
    }

    public final void zzx(String str, Bundle bundle) {
        zzar zzar;
        C14983h hVar = this.zza.f33488d;
        C14973f7.m24287I(hVar);
        hVar.mo51995g();
        hVar.mo51942h();
        C15103u3 u3Var = (C15103u3) hVar.f33681b;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            zzar = new zzar(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    u3Var.mo52016b().f33724g.mo52237a("Param name can't be null");
                    it.remove();
                } else {
                    Object k = u3Var.mo52335w().mo52213k(bundle2.get(next), next);
                    if (k == null) {
                        u3Var.mo52016b().f33727j.mo52238b(u3Var.f33884n.mo52143e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        u3Var.mo52335w().mo52223w(bundle2, k, next);
                    }
                }
            }
            zzar = new zzar(bundle2);
        }
        C14991h7 h7Var = hVar.f34048c.f33492h;
        C14973f7.m24287I(h7Var);
        C14766p2 v = C14779q2.m23880v();
        if (v.f33059d) {
            v.mo50809j();
            v.f33059d = false;
        }
        C14779q2.m23879H(0, (C14779q2) v.f33058c);
        for (String next2 : zzar.zza.keySet()) {
            C14816t2 v2 = C14828u2.m23989v();
            v2.mo50855q(next2);
            Object zzf = zzar.zzf(next2);
            Preconditions.checkNotNull(zzf);
            h7Var.mo52109G(v2, zzf);
            v.mo50768q(v2);
        }
        byte[] i = ((C14779q2) v.mo50807h()).mo50868i();
        ((C15103u3) hVar.f33681b).mo52016b().f33732o.mo52239c(((C15103u3) hVar.f33681b).f33884n.mo52142d(str), "Saving default event parameters, appId, data size", Integer.valueOf(i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", i);
        try {
            if (hVar.mo52052B().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error storing default event parameters. appId", e);
        }
    }

    @VisibleForTesting
    public final void zzy(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.mo52015a().mo52310q()) {
            runnable.run();
        } else {
            this.zza.mo52015a().mo52308o(runnable);
        }
    }
}
