package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
public final class C15008j6 extends C14928a7 {

    /* renamed from: e */
    public String f33612e;

    /* renamed from: f */
    public boolean f33613f;

    /* renamed from: g */
    public long f33614g;

    /* renamed from: h */
    public final C15134y2 f33615h;

    /* renamed from: i */
    public final C15134y2 f33616i;

    /* renamed from: j */
    public final C15134y2 f33617j;

    /* renamed from: k */
    public final C15134y2 f33618k;

    /* renamed from: l */
    public final C15134y2 f33619l;

    public C15008j6(C14973f7 f7Var) {
        super(f7Var);
        C14942c3 q = ((C15103u3) this.f33681b).mo52330q();
        q.getClass();
        this.f33615h = new C15134y2(q, "last_delete_stale", 0);
        C14942c3 q2 = ((C15103u3) this.f33681b).mo52330q();
        q2.getClass();
        this.f33616i = new C15134y2(q2, "backoff", 0);
        C14942c3 q3 = ((C15103u3) this.f33681b).mo52330q();
        q3.getClass();
        this.f33617j = new C15134y2(q3, "last_upload", 0);
        C14942c3 q4 = ((C15103u3) this.f33681b).mo52330q();
        q4.getClass();
        this.f33618k = new C15134y2(q4, "last_upload_attempt", 0);
        C14942c3 q5 = ((C15103u3) this.f33681b).mo52330q();
        q5.getClass();
        this.f33619l = new C15134y2(q5, "midnight_offset", 0);
    }

    /* renamed from: j */
    public final void mo51944j() {
    }

    @Deprecated
    /* renamed from: k */
    public final Pair<String, Boolean> mo52165k(String str) {
        mo51995g();
        long elapsedRealtime = ((C15103u3) this.f33681b).f33885o.elapsedRealtime();
        String str2 = this.f33612e;
        if (str2 != null && elapsedRealtime < this.f33614g) {
            return new Pair<>(str2, Boolean.valueOf(this.f33613f));
        }
        this.f33614g = ((C15103u3) this.f33681b).f33878h.mo51970m(str, C14959e2.f33397c) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(((C15103u3) this.f33681b).f33872b);
            this.f33612e = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f33612e = id;
            }
            this.f33613f = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            ((C15103u3) this.f33681b).mo52016b().f33731n.mo52238b(e, "Unable to get advertising id");
            this.f33612e = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f33612e, Boolean.valueOf(this.f33613f));
    }

    /* renamed from: l */
    public final Pair<String, Boolean> mo52166l(String str, C14956e eVar) {
        return eVar.mo51985e() ? mo52165k(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    /* renamed from: m */
    public final String mo52167m(String str) {
        mo51995g();
        String str2 = (String) mo52165k(str).first;
        MessageDigest n = C15018k7.m24479n();
        if (n == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, n.digest(str2.getBytes()))});
    }
}
