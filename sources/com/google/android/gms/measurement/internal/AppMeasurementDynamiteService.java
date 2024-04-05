package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.compose.runtime.C1339j1;
import androidx.work.C3421k;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.C14617d9;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p193o.C7494b;
import p514bk.C14088a;
import p604kj.C18104i;
import p604kj.C18105j;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    @VisibleForTesting
    public C15103u3 zza = null;
    private final Map<Integer, C15060p4> zzb = new C7494b();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(zzcf zzcf, String str) {
        zzb();
        this.zza.mo52335w().mo52190D(zzcf, str);
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.mo52324k().mo52084h(j, str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.zza.mo52331s().mo52148C(str, bundle, str2);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        s.mo51946h();
        ((C15103u3) s.f33681b).mo52015a().mo52308o(new C18105j((Object) s, (Object) null, 2));
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.mo52324k().mo52085i(j, str);
    }

    public void generateEventId(zzcf zzcf) throws RemoteException {
        zzb();
        long i0 = this.zza.mo52335w().mo52211i0();
        zzb();
        this.zza.mo52335w().mo52189C(zzcf, i0);
    }

    public void getAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.mo52015a().mo52308o(new C18104i(1, this, zzcf));
    }

    public void getCachedAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.mo52331s().mo52164z());
    }

    public void getConditionalUserProperties(String str, String str2, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.mo52015a().mo52308o(new C14936b6(this, zzcf, str, str2));
    }

    public void getCurrentScreenClass(zzcf zzcf) throws RemoteException {
        zzb();
        C15061p5 p5Var = ((C15103u3) this.zza.mo52331s().f33681b).mo52332t().f33922d;
        zzc(zzcf, p5Var != null ? p5Var.f33750b : null);
    }

    public void getCurrentScreenName(zzcf zzcf) throws RemoteException {
        zzb();
        C15061p5 p5Var = ((C15103u3) this.zza.mo52331s().f33681b).mo52332t().f33922d;
        zzc(zzcf, p5Var != null ? p5Var.f33749a : null);
    }

    public void getGmpAppId(zzcf zzcf) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        C15051o4 o4Var = s.f33681b;
        String str = ((C15103u3) o4Var).f33873c;
        if (str == null) {
            try {
                str = C14088a.m21778A(((C15103u3) o4Var).f33872b, ((C15103u3) o4Var).f33890t);
            } catch (IllegalStateException e) {
                ((C15103u3) s.f33681b).mo52016b().f33724g.mo52238b(e, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        zzc(zzcf, str);
    }

    public void getMaxUserProperties(String str, zzcf zzcf) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        s.getClass();
        Preconditions.checkNotEmpty(str);
        ((C15103u3) s.f33681b).getClass();
        zzb();
        this.zza.mo52335w().mo52188B(zzcf, 25);
    }

    public void getTestFlag(zzcf zzcf, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            C15018k7 w = this.zza.mo52335w();
            C15007j5 s = this.zza.mo52331s();
            s.getClass();
            AtomicReference atomicReference = new AtomicReference();
            w.mo52190D(zzcf, (String) ((C15103u3) s.f33681b).mo52015a().mo52305l(atomicReference, 15000, "String test flag value", new C3421k((Object) s, (Object) atomicReference, 1)));
        } else if (i == 1) {
            C15018k7 w2 = this.zza.mo52335w();
            C15007j5 s2 = this.zza.mo52331s();
            s2.getClass();
            AtomicReference atomicReference2 = new AtomicReference();
            w2.mo52189C(zzcf, ((Long) ((C15103u3) s2.f33681b).mo52015a().mo52305l(atomicReference2, 15000, "long test flag value", new C15127x3(1, s2, atomicReference2))).longValue());
        } else if (i == 2) {
            C15018k7 w3 = this.zza.mo52335w();
            C15007j5 s3 = this.zza.mo52331s();
            s3.getClass();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) ((C15103u3) s3.f33681b).mo52015a().mo52305l(atomicReference3, 15000, "double test flag value", new C18104i(2, s3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcf.zzd(bundle);
            } catch (RemoteException e) {
                ((C15103u3) w3.f33681b).mo52016b().f33727j.mo52238b(e, "Error returning double value to wrapper");
            }
        } else if (i == 3) {
            C15018k7 w4 = this.zza.mo52335w();
            C15007j5 s4 = this.zza.mo52331s();
            s4.getClass();
            AtomicReference atomicReference4 = new AtomicReference();
            w4.mo52188B(zzcf, ((Integer) ((C15103u3) s4.f33681b).mo52015a().mo52305l(atomicReference4, 15000, "int test flag value", new C14944c5(0, (Object) s4, (Object) atomicReference4))).intValue());
        } else if (i == 4) {
            C15018k7 w5 = this.zza.mo52335w();
            C15007j5 s5 = this.zza.mo52331s();
            s5.getClass();
            AtomicReference atomicReference5 = new AtomicReference();
            w5.mo52224x(zzcf, ((Boolean) ((C15103u3) s5.f33681b).mo52015a().mo52305l(atomicReference5, 15000, "boolean test flag value", new C15144z4(s5, atomicReference5, 0))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.mo52015a().mo52308o(new C14945c6(this, zzcf, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzcl zzcl, long j) throws RemoteException {
        C15103u3 u3Var = this.zza;
        if (u3Var == null) {
            this.zza = C15103u3.m24641r((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzcl, Long.valueOf(j));
        } else {
            u3Var.mo52016b().f33727j.mo52237a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.mo52015a().mo52308o(new C15128x4(1, (Object) this, (Object) zzcf));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.mo52331s().mo52150l(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.mo52015a().mo52308o(new C14998i5(this, zzcf, new zzat(str2, new zzar(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        Object obj = null;
        Object unwrap = iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper);
        Object unwrap2 = iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2);
        if (iObjectWrapper3 != null) {
            obj = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.mo52016b().mo52280t(i, true, false, str, unwrap, unwrap2, obj);
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zzb();
        C14989h5 h5Var = this.zza.mo52331s().f33598d;
        if (h5Var != null) {
            this.zza.mo52331s().mo52149k();
            h5Var.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        C14989h5 h5Var = this.zza.mo52331s().f33598d;
        if (h5Var != null) {
            this.zza.mo52331s().mo52149k();
            h5Var.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        C14989h5 h5Var = this.zza.mo52331s().f33598d;
        if (h5Var != null) {
            this.zza.mo52331s().mo52149k();
            h5Var.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        C14989h5 h5Var = this.zza.mo52331s().f33598d;
        if (h5Var != null) {
            this.zza.mo52331s().mo52149k();
            h5Var.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcf, long j) throws RemoteException {
        zzb();
        C14989h5 h5Var = this.zza.mo52331s().f33598d;
        Bundle bundle = new Bundle();
        if (h5Var != null) {
            this.zza.mo52331s().mo52149k();
            h5Var.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            this.zza.mo52016b().f33727j.mo52238b(e, "Error returning bundle value to wrapper");
        }
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.mo52331s().f33598d != null) {
            this.zza.mo52331s().mo52149k();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.mo52331s().f33598d != null) {
            this.zza.mo52331s().mo52149k();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void performAction(Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzcf.zzd((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzci zzci) throws RemoteException {
        Object obj;
        zzb();
        synchronized (this.zzb) {
            obj = this.zzb.get(Integer.valueOf(zzci.zzd()));
            if (obj == null) {
                obj = new C15027l7(this, zzci);
                this.zzb.put(Integer.valueOf(zzci.zzd()), obj);
            }
        }
        C15007j5 s = this.zza.mo52331s();
        s.mo51946h();
        Preconditions.checkNotNull(obj);
        if (!s.f33600f.add(obj)) {
            ((C15103u3) s.f33681b).mo52016b().f33727j.mo52237a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        s.f33602h.set((Object) null);
        ((C15103u3) s.f33681b).mo52015a().mo52308o(new C14975g0(s, j, 1));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.zza.mo52016b().f33724g.mo52237a("Conditional user property must not be null");
        } else {
            this.zza.mo52331s().mo52155q(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        s.getClass();
        C14617d9.f32811c.f32812b.zza().zza();
        if (((C15103u3) s.f33681b).f33878h.mo51973p((String) null, C14959e2.f33424p0)) {
            ((C15103u3) s.f33681b).mo52015a().mo52309p(new C15078r4(s, bundle, j));
        } else {
            s.mo52161w(bundle, j);
        }
    }

    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.mo52331s().mo52156r(bundle, -20, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        if (r4.length() <= 100) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        if (r5.length() <= 100) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper r3, java.lang.String r4, java.lang.String r5, long r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.u3 r6 = r2.zza
            com.google.android.gms.measurement.internal.v5 r6 = r6.mo52332t()
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            com.google.android.gms.measurement.internal.o4 r7 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.d r7 = r7.f33878h
            boolean r7 = r7.mo51974q()
            if (r7 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33729l
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.mo52237a(r4)
            goto L_0x0113
        L_0x002c:
            com.google.android.gms.measurement.internal.p5 r7 = r6.f33922d
            if (r7 != 0) goto L_0x0041
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33729l
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.mo52237a(r4)
            goto L_0x0113
        L_0x0041:
            java.util.concurrent.ConcurrentHashMap r0 = r6.f33925g
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33729l
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.mo52237a(r4)
            goto L_0x0113
        L_0x005a:
            if (r5 != 0) goto L_0x0064
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.mo52349o(r5)
        L_0x0064:
            java.lang.String r0 = r7.f33750b
            boolean r0 = com.google.android.gms.measurement.internal.C15018k7.m24472U(r0, r5)
            java.lang.String r7 = r7.f33749a
            boolean r7 = com.google.android.gms.measurement.internal.C15018k7.m24472U(r7, r4)
            if (r0 == 0) goto L_0x0086
            if (r7 != 0) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33729l
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.mo52237a(r4)
            goto L_0x0113
        L_0x0086:
            r7 = 100
            if (r4 == 0) goto L_0x00b6
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x009e
            com.google.android.gms.measurement.internal.o4 r0 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            int r0 = r4.length()
            if (r0 > r7) goto L_0x009e
            goto L_0x00b6
        L_0x009e:
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33729l
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.mo52238b(r4, r5)
            goto L_0x0113
        L_0x00b6:
            if (r5 == 0) goto L_0x00e4
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00cc
            com.google.android.gms.measurement.internal.o4 r0 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            int r0 = r5.length()
            if (r0 > r7) goto L_0x00cc
            goto L_0x00e4
        L_0x00cc:
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33729l
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.mo52238b(r4, r5)
            goto L_0x0113
        L_0x00e4:
            com.google.android.gms.measurement.internal.o4 r7 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33732o
            if (r4 != 0) goto L_0x00f3
            java.lang.String r0 = "null"
            goto L_0x00f4
        L_0x00f3:
            r0 = r4
        L_0x00f4:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.mo52239c(r0, r1, r5)
            com.google.android.gms.measurement.internal.p5 r7 = new com.google.android.gms.measurement.internal.p5
            com.google.android.gms.measurement.internal.o4 r0 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.k7 r0 = r0.mo52335w()
            long r0 = r0.mo52211i0()
            r7.<init>(r4, r5, r0)
            java.util.concurrent.ConcurrentHashMap r4 = r6.f33925g
            r4.put(r3, r7)
            r4 = 1
            r6.mo52345k(r3, r7, r4)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        s.mo51946h();
        ((C15103u3) s.f33681b).mo52015a().mo52308o(new C15087s4(s, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        ((C15103u3) s.f33681b).mo52015a().mo52308o(new C18105j(1, (Object) s, (Object) bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(zzci zzci) throws RemoteException {
        zzb();
        boolean z = false;
        C1339j1 j1Var = new C1339j1(this, zzci, 0);
        if (this.zza.mo52015a().mo52310q()) {
            C15007j5 s = this.zza.mo52331s();
            s.mo51995g();
            s.mo51946h();
            C1339j1 j1Var2 = s.f33599e;
            if (j1Var != j1Var2) {
                if (j1Var2 == null) {
                    z = true;
                }
                Preconditions.checkState(z, "EventInterceptor already set.");
            }
            s.f33599e = j1Var;
            return;
        }
        this.zza.mo52015a().mo52308o(new C15015k4(2, this, j1Var));
    }

    public void setInstanceIdProvider(zzck zzck) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        Boolean valueOf = Boolean.valueOf(z);
        s.mo51946h();
        ((C15103u3) s.f33681b).mo52015a().mo52308o(new C18105j((Object) s, (Object) valueOf, 2));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        C15007j5 s = this.zza.mo52331s();
        ((C15103u3) s.f33681b).mo52015a().mo52308o(new C15104u4(s, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        if (str == null || str.length() != 0) {
            this.zza.mo52331s().mo52159u((String) null, AnalyticsLogDatabaseHelper.f19040ID, str, true, j);
        } else {
            this.zza.mo52016b().f33727j.mo52237a("User ID must be non-empty");
        }
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.mo52331s().mo52159u(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    public void unregisterOnMeasurementEventListener(zzci zzci) throws RemoteException {
        Object remove;
        zzb();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzci.zzd()));
        }
        if (remove == null) {
            remove = new C15027l7(this, zzci);
        }
        C15007j5 s = this.zza.mo52331s();
        s.mo51946h();
        Preconditions.checkNotNull(remove);
        if (!s.f33600f.remove(remove)) {
            ((C15103u3) s.f33681b).mo52016b().f33727j.mo52237a("OnEventListener had not been registered");
        }
    }
}
