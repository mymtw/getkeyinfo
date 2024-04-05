package p312ag;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.FetchedAppSettingsManager;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p365hg.C12876l;
import p365hg.C12879l0;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;
import p461uf.C13519m;
import p492yf.C13933e;

/* renamed from: ag.e */
public final class C8528e {

    /* renamed from: a */
    public static final String f18570a = C8528e.class.getCanonicalName();

    /* renamed from: b */
    public static final C13519m f18571b = new C13519m(C13418j.m21106b());

    /* renamed from: c */
    public static final C8528e f18572c = new C8528e();

    /* renamed from: ag.e$a */
    public static final class C8529a {

        /* renamed from: a */
        public BigDecimal f18573a;

        /* renamed from: b */
        public Currency f18574b;

        /* renamed from: c */
        public Bundle f18575c;

        public C8529a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f18573a = bigDecimal;
            this.f18574b = currency;
            this.f18575c = bundle;
        }
    }

    /* renamed from: a */
    public static final boolean m16933a() {
        C12882n b = FetchedAppSettingsManager.m20104b(C13418j.m21107c());
        return b != null && C13442y.m21140c() && b.f28405i;
    }

    /* renamed from: b */
    public static final void m16934b(long j, String str) {
        Context b = C13418j.m21106b();
        String c = C13418j.m21107c();
        C12879l0.m20601e(b, ResponseConstants.CONTEXT);
        C12882n f = FetchedAppSettingsManager.m20107f(c, false);
        if (f != null && f.f28403g && j > 0) {
            C13511h hVar = new C13511h(b, (String) null);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            double d = (double) j;
            if (C13442y.m21140c() && !C13080a.m20762b(hVar)) {
                try {
                    hVar.mo46169e("fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, ActivityLifecycleTracker.m20067a());
                } catch (Throwable th) {
                    C13080a.m20761a(hVar, th);
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m16935c(String str, String str2, boolean z) {
        C8529a aVar;
        C19383o.m32797g(str2, "skuDetails");
        if (m16933a()) {
            f18572c.getClass();
            HashMap hashMap = new HashMap();
            boolean z2 = false;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(str2);
                Bundle bundle = new Bundle(1);
                bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
                bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
                bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
                bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
                String optString = jSONObject2.optString("type");
                bundle.putCharSequence("fb_iap_product_type", optString);
                if (C19383o.m32792b(optString, "subs")) {
                    bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                    bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                    bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                    String optString2 = jSONObject2.optString("introductoryPriceCycles");
                    C19383o.m32796f(optString2, "introductoryPriceCycles");
                    if (!(optString2.length() == 0)) {
                        bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", optString2);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
                }
                BigDecimal bigDecimal = new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d);
                Currency instance = Currency.getInstance(jSONObject2.getString("price_currency_code"));
                C19383o.m32796f(instance, "Currency.getInstance(sku…g(\"price_currency_code\"))");
                aVar = new C8529a(bigDecimal, instance, bundle);
            } catch (JSONException e) {
                Log.e(f18570a, "Error parsing in-app subscription data.", e);
                aVar = null;
            }
            if (aVar != null) {
                if (z && C12876l.m20592b("app_events_if_auto_log_subs", C13418j.m21107c(), false)) {
                    C13933e eVar = C13933e.f30637f;
                    eVar.getClass();
                    if (!C13080a.m20762b(eVar)) {
                        try {
                            String optString3 = new JSONObject(str2).optString("freeTrialPeriod");
                            if (optString3 != null) {
                                if (optString3.length() > 0) {
                                    z2 = true;
                                }
                            }
                        } catch (JSONException unused) {
                        } catch (Throwable th) {
                            C13080a.m20761a(eVar, th);
                        }
                    }
                    String str3 = z2 ? "StartTrial" : "Subscribe";
                    C13519m mVar = f18571b;
                    BigDecimal bigDecimal2 = aVar.f18573a;
                    Currency currency = aVar.f18574b;
                    Bundle bundle2 = aVar.f18575c;
                    mVar.getClass();
                    String str4 = C13418j.f29381a;
                    if (C13442y.m21140c()) {
                        C13511h hVar = mVar.f29576a;
                        hVar.getClass();
                        if (!C13080a.m20762b(hVar)) {
                            if (bigDecimal2 == null || currency == null) {
                                C12869i0.m20551G(C13511h.f29561c, "purchaseAmount and currency cannot be null");
                                return;
                            }
                            if (bundle2 == null) {
                                try {
                                    bundle2 = new Bundle();
                                } catch (Throwable th2) {
                                    C13080a.m20761a(hVar, th2);
                                    return;
                                }
                            }
                            Bundle bundle3 = bundle2;
                            bundle3.putString("fb_currency", currency.getCurrencyCode());
                            hVar.mo46169e(str3, Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, ActivityLifecycleTracker.m20067a());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C13519m mVar2 = f18571b;
                BigDecimal bigDecimal3 = aVar.f18573a;
                Currency currency2 = aVar.f18574b;
                Bundle bundle4 = aVar.f18575c;
                mVar2.getClass();
                String str5 = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    C13511h hVar2 = mVar2.f29576a;
                    hVar2.getClass();
                    if (!C13080a.m20762b(hVar2)) {
                        try {
                            hVar2.mo46171g(bigDecimal3, currency2, bundle4, true);
                        } catch (Throwable th3) {
                            C13080a.m20761a(hVar2, th3);
                        }
                    }
                }
            }
        }
    }
}
