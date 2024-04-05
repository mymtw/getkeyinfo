package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.etsy.android.push.CartRefreshDelegate;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.C15016k5;
import com.google.android.gms.measurement.internal.C15103u3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.C19421p;
import p557ek.C17711a;
import p557ek.C17712b;
import p557ek.C17713c;

@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f33253b;

    /* renamed from: a */
    public final C17713c f33254a;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
            throw null;
        }

        @VisibleForTesting
        public ConditionalUserProperty(Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) C19421p.m32946m0(bundle, "app_id", cls2, (Object) null);
            this.mOrigin = (String) C19421p.m32946m0(bundle, CartRefreshDelegate.ARG_ORIGIN, cls2, (Object) null);
            this.mName = (String) C19421p.m32946m0(bundle, "name", cls2, (Object) null);
            this.mValue = C19421p.m32946m0(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C19421p.m32946m0(bundle, "trigger_event_name", cls2, (Object) null);
            this.mTriggerTimeout = ((Long) C19421p.m32946m0(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C19421p.m32946m0(bundle, "timed_out_event_name", cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) C19421p.m32946m0(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) C19421p.m32946m0(bundle, "triggered_event_name", cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) C19421p.m32946m0(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) C19421p.m32946m0(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C19421p.m32946m0(bundle, "expired_event_name", cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) C19421p.m32946m0(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) C19421p.m32946m0(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C19421p.m32946m0(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C19421p.m32946m0(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    public AppMeasurement(C15103u3 u3Var) {
        this.f33254a = new C17711a(u3Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f33253b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f33253b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            com.google.android.gms.measurement.internal.k5 r2 = (com.google.android.gms.measurement.internal.C15016k5) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((com.google.android.gms.measurement.internal.C15016k5) r2)     // Catch:{ all -> 0x0056 }
            f33253b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.u3 r14 = com.google.android.gms.measurement.internal.C15103u3.m24641r(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.C15103u3) r14)     // Catch:{ all -> 0x0056 }
            f33253b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f33253b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f33254a.mo52173a(str);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f33254a.mo52174b(str, bundle, str2);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f33254a.mo52175c(str);
    }

    @Keep
    public long generateEventId() {
        return this.f33254a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f33254a.zzh();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> e = this.f33254a.mo52177e(str, str2);
        ArrayList arrayList = new ArrayList(e == null ? 0 : e.size());
        for (Bundle conditionalUserProperty : e) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f33254a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f33254a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f33254a.zzk();
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public int getMaxUserProperties(String str) {
        return this.f33254a.zza(str);
    }

    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f33254a.mo52178f(str, str2, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f33254a.mo52176d(str, bundle, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        C17713c cVar = this.f33254a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(CartRefreshDelegate.ARG_ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C19421p.m32950o0(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.mo52179g(bundle);
    }

    public AppMeasurement(C15016k5 k5Var) {
        this.f33254a = new C17712b(k5Var);
    }
}
