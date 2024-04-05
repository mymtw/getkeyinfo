package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.l5 */
public final /* synthetic */ class C15025l5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15034m5 f33658b;

    /* renamed from: c */
    public final /* synthetic */ int f33659c;

    /* renamed from: d */
    public final /* synthetic */ Exception f33660d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f33661e;

    /* renamed from: f */
    public final /* synthetic */ Map f33662f;

    public /* synthetic */ C15025l5(C15034m5 m5Var, int i, IOException iOException, byte[] bArr, Map map) {
        this.f33658b = m5Var;
        this.f33659c = i;
        this.f33660d = iOException;
        this.f33661e = bArr;
        this.f33662f = map;
    }

    public final void run() {
        C15034m5 m5Var = this.f33658b;
        int i = this.f33659c;
        Exception exc = this.f33660d;
        byte[] bArr = this.f33661e;
        C15103u3 u3Var = (C15103u3) m5Var.f33684d.f398b;
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            u3Var.mo52016b().f33727j.mo52239c(Integer.valueOf(i), "Network Request for Deferred Deep Link failed. response, exception", exc);
        }
        if (exc == null) {
            u3Var.mo52330q().f33313r.mo52353a(true);
            if (bArr == null || bArr.length == 0) {
                u3Var.mo52016b().f33731n.mo52237a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble(ResponseConstants.TIMESTAMP, ShadowDrawableWrapper.COS_45);
                if (TextUtils.isEmpty(optString)) {
                    u3Var.mo52016b().f33731n.mo52237a("Deferred Deep Link is empty.");
                    return;
                }
                C15018k7 w = u3Var.mo52335w();
                C15051o4 o4Var = w.f33681b;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = ((C15103u3) w.f33681b).f33872b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        u3Var.f33887q.mo52151m("auto", bundle, "_cmp");
                        C15018k7 w2 = u3Var.mo52335w();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = ((C15103u3) w2.f33681b).f33872b.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(ResponseConstants.TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    ((C15103u3) w2.f33681b).f33872b.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                ((C15103u3) w2.f33681b).mo52016b().f33724g.mo52238b(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                u3Var.mo52016b().f33727j.mo52239c(optString2, "Deferred Deep Link validation failed. gclid, deep link", optString);
                return;
            } catch (JSONException e2) {
                u3Var.mo52016b().f33724g.mo52238b(e2, "Failed to parse the Deferred Deep Link response. exception");
                return;
            }
        }
        u3Var.mo52016b().f33727j.mo52239c(Integer.valueOf(i), "Network Request for Deferred Deep Link failed. response, exception", exc);
    }
}
