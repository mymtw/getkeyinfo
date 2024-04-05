package p030bo.app;

import android.database.sqlite.SQLiteDatabase;
import androidx.activity.result.C0118a;
import androidx.preference.Preference;
import com.braze.p044ui.inappmessage.listeners.C5674d;
import com.braze.support.BrazeLogger;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.config.PrefsFragment;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6579a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.firebase.perf.config.RemoteConfigManager;
import kotlin.jvm.internal.C19383o;
import p114g4.C6861b;
import p120gh.C6898a;
import p466vc.C13597g;
import p605kk.C18121e;

/* renamed from: bo.app.e7 */
public final /* synthetic */ class C3653e7 implements C18121e, C5674d, Preference.C3009c, Preference.C3010d, StructuredShopPoliciesView.C11957b, CurrencySelectFragment.C11332a, C6898a.C6899a, C6599q.C6600a, C0118a {

    /* renamed from: b */
    public final /* synthetic */ int f8383b;

    /* renamed from: c */
    public final /* synthetic */ Object f8384c;

    public /* synthetic */ C3653e7(Object obj, int i) {
        this.f8383b = i;
        this.f8384c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.common.api.ApiException] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r6 = r2.f38725c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo413a(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f8383b
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00c9
        L_0x0007:
            java.lang.Object r0 = r5.f8384c
            tp.t r0 = (p248tp.C8072t) r0
            androidx.activity.result.ActivityResult r6 = (androidx.activity.result.ActivityResult) r6
            java.lang.String r1 = "$emitter"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.String r1 = "activityResult"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            android.content.Intent r6 = r6.getData()
            com.google.android.gms.common.logging.Logger r1 = p588ij.C17846e.f38760a
            r1 = 0
            if (r6 == 0) goto L_0x0047
            java.lang.String r2 = "googleSignInStatus"
            boolean r3 = r6.hasExtra(r2)
            java.lang.String r4 = "googleSignInAccount"
            if (r3 != 0) goto L_0x0031
            boolean r3 = r6.hasExtra(r4)
            if (r3 != 0) goto L_0x0031
            goto L_0x0047
        L_0x0031:
            android.os.Parcelable r3 = r6.getParcelableExtra(r4)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            android.os.Parcelable r6 = r6.getParcelableExtra(r2)
            com.google.android.gms.common.api.Status r6 = (com.google.android.gms.common.api.Status) r6
            if (r3 == 0) goto L_0x0041
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
        L_0x0041:
            hj.c r2 = new hj.c
            r2.<init>(r3, r6)
            goto L_0x0048
        L_0x0047:
            r2 = r1
        L_0x0048:
            if (r2 != 0) goto L_0x0055
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            com.google.android.gms.common.api.ApiException r6 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r6)
            kk.a0 r6 = p605kk.C18126j.m30616d(r6)
            goto L_0x0071
        L_0x0055:
            com.google.android.gms.common.api.Status r6 = r2.f38724b
            boolean r6 = r6.isSuccess()
            if (r6 == 0) goto L_0x0067
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r6 = r2.f38725c
            if (r6 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            kk.a0 r6 = p605kk.C18126j.m30617e(r6)
            goto L_0x0071
        L_0x0067:
            com.google.android.gms.common.api.Status r6 = r2.f38724b
            com.google.android.gms.common.api.ApiException r6 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r6)
            kk.a0 r6 = p605kk.C18126j.m30616d(r6)
        L_0x0071:
            boolean r2 = r6.mo69668o()
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r2 = r6.mo69664k()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r2
            if (r2 == 0) goto L_0x0084
            java.lang.String r2 = r2.getEmail()
            goto L_0x0085
        L_0x0084:
            r2 = r1
        L_0x0085:
            java.lang.Object r6 = r6.mo69664k()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r6 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r6
            if (r6 == 0) goto L_0x0091
            java.lang.String r1 = r6.getIdToken()
        L_0x0091:
            if (r2 == 0) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            com.etsy.android.lib.network.oauth2.signin.a r6 = new com.etsy.android.lib.network.oauth2.signin.a
            r6.<init>(r2, r1)
            r0.onSuccess(r6)
            goto L_0x00c8
        L_0x009e:
            com.etsy.android.lib.network.oauth2.SignInError$GoogleError r6 = com.etsy.android.lib.network.oauth2.SignInError.GoogleError.INSTANCE
            r0.tryOnError(r6)
            goto L_0x00c8
        L_0x00a4:
            java.lang.Exception r6 = r6.mo69663j()
            boolean r2 = r6 instanceof com.google.android.gms.common.api.ApiException
            if (r2 == 0) goto L_0x00af
            r1 = r6
            com.google.android.gms.common.api.ApiException r1 = (com.google.android.gms.common.api.ApiException) r1
        L_0x00af:
            r6 = 0
            if (r1 == 0) goto L_0x00bb
            int r1 = r1.getStatusCode()
            r2 = 12501(0x30d5, float:1.7518E-41)
            if (r1 != r2) goto L_0x00bb
            r6 = 1
        L_0x00bb:
            if (r6 == 0) goto L_0x00c3
            com.etsy.android.lib.network.oauth2.SignInError$UserCancel r6 = com.etsy.android.lib.network.oauth2.SignInError.UserCancel.INSTANCE
            r0.tryOnError(r6)
            goto L_0x00c8
        L_0x00c3:
            com.etsy.android.lib.network.oauth2.SignInError$GoogleError r6 = com.etsy.android.lib.network.oauth2.SignInError.GoogleError.INSTANCE
            r0.tryOnError(r6)
        L_0x00c8:
            return
        L_0x00c9:
            java.lang.Object r0 = r5.f8384c
            com.etsy.android.ui.shop.ShopHomeFragment r0 = (com.etsy.android.p327ui.shop.ShopHomeFragment) r0
            de.a r6 = (p337de.C12647a) r6
            r0.lambda$new$8(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3653e7.mo413a(java.lang.Object):void");
    }

    public Object apply(Object obj) {
        C6599q qVar = (C6599q) this.f8384c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C6493a aVar = C6599q.f14568g;
        qVar.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + qVar.f14570c.mo19124a()).execute();
        return null;
    }

    /* renamed from: b */
    public void mo12056b() {
        ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder = (ShippingAndPoliciesPanelViewHolder) this.f8384c;
        int i = ShippingAndPoliciesPanelViewHolder.f23196x;
        C19383o.m32797g(shippingAndPoliciesPanelViewHolder, "this$0");
        shippingAndPoliciesPanelViewHolder.f23197b.mo38043a(C13597g.C13657i2.f30149a);
    }

    /* renamed from: e */
    public Object mo12018e() {
        return ((C6579a) this.f8384c).mo18777b();
    }

    /* renamed from: g */
    public boolean mo412g(Preference preference) {
        return PrefsFragment.m34854addPushOptInPrefs$lambda10$lambda9((PrefsFragment) this.f8384c, preference);
    }

    public void onPageFinished() {
        C6861b bVar = (C6861b) this.f8384c;
        String str = C6861b.f15173y;
        bVar.getClass();
        try {
            if (bVar.f15183v != null && bVar.f15220b != null) {
                BrazeLogger.m11285g(C6861b.f15173y, "Page has finished loading. Opening in-app message view wrapper.");
                bVar.f15183v.open(bVar.f15220b);
            }
        } catch (Exception e) {
            BrazeLogger.m11286h(C6861b.f15173y, "Failed to open view wrapper in page finished listener", e);
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        return ConfigPreferencesHelper.m34851setUpXDebugParamOverridePreference$lambda6((Preference) this.f8384c, preference, obj);
    }

    public void onSuccess(Object obj) {
        switch (this.f8383b) {
            case 0:
                C3977n1.m9201a((C4243v1) this.f8384c, (Void) obj);
                return;
            default:
                ((RemoteConfigManager) this.f8384c).m27421xc904e813((Boolean) obj);
                return;
        }
    }
}
