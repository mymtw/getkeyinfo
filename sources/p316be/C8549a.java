package p316be;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C2801z;
import com.appsflyer.AppsFlyerLib;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.p327ui.nav.NotificationActivity;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.util.C12042e;
import com.etsy.android.util.C12043f;
import com.etsy.android.util.C12051k;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.source.C14353l;
import com.google.firebase.abt.AbtException;
import com.paypal.pyplcheckout.home.view.interfaces.UpdateClientConfigListener;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.utils.DialogMaker;
import com.paypal.pyplcheckout.utils.DialogPresets;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p120gh.C6898a;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7032d;
import p248tp.C8049b;
import p248tp.C8051d;
import p513bj.C14052d;
import p605kk.C18116a;
import p605kk.C18123g;
import p605kk.C18126j;
import p619mh.C18225f;
import p632nn.C18276b;
import p636oi.C18298b;
import p636oi.C18305h;
import p641on.C18325d;
import p641on.C18327e;
import p641on.C18331i;
import p753kq.C19846a;

/* renamed from: be.a */
public final /* synthetic */ class C8549a implements Branch.C7016e, UpdateClientConfigListener, C2801z, C8051d, C6898a.C6899a, C6599q.C6600a, C14052d, C14353l.C14354a, C18225f.C18226a, C18116a, DialogMaker.PositiveClickListener {

    /* renamed from: b */
    public final /* synthetic */ Object f18618b;

    public /* synthetic */ C8549a(Object obj) {
        this.f18618b = obj;
    }

    /* renamed from: a */
    public void mo19214a(JSONObject jSONObject, C7032d dVar) {
        NotificationActivity.m35027onStart$lambda2((NotificationActivity) this.f18618b, jSONObject, dVar);
    }

    public void accept(Object obj) {
        ((C14216b.C14217a) obj).mo47333e((Exception) this.f18618b);
    }

    public Object apply(Object obj) {
        C6599q qVar = (C6599q) this.f18618b;
        Cursor cursor = (Cursor) obj;
        C6493a aVar = C6599q.f14568g;
        qVar.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            qVar.mo18778d((long) i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: b */
    public void mo21075b(C18225f fVar) {
        C18298b bVar = (C18298b) this.f18618b;
        O o = (C18305h) fVar;
        synchronized (bVar.f39958b) {
            boolean z = false;
            o.f39937b = 0;
            o.f40184d = null;
            O[] oArr = bVar.f39962f;
            int i = bVar.f39964h;
            bVar.f39964h = i + 1;
            oArr[i] = o;
            if (!bVar.f39959c.isEmpty() && bVar.f39964h > 0) {
                z = true;
            }
            if (z) {
                bVar.f39958b.notify();
            }
        }
    }

    /* renamed from: c */
    public void mo10428c(Bundle bundle, String str) {
        ((ShopHomeFragment) this.f18618b).lambda$onViewCreated$1(str, bundle);
    }

    /* renamed from: d */
    public void mo10586d(C8049b bVar) {
        C12043f fVar = (C12043f) this.f18618b;
        C19383o.m32797g(fVar, "this$0");
        fVar.f26852j.getAndSet(true);
        try {
            AppsFlyerLib d = C12043f.m19857d();
            d.init(C12051k.f26873g, new C12042e(fVar), fVar.f26845c);
            if (fVar.f26846d.mo21132b(C8592b.f18792g0)) {
                String appsFlyerUID = d.getAppsFlyerUID(fVar.f26845c);
                String str = fVar.f26851i.f28898d;
                C19383o.m32796f(str, "installInfo.advertisingId");
                Boolean bool = fVar.f26851i.f28899e;
                C19383o.m32796f(bool, "installInfo.adIdentifierEnabled");
                fVar.mo38933g(appsFlyerUID, str, bool.booleanValue());
            }
            fVar.f26853k.getAndSet(true);
        } catch (Exception e) {
            fVar.f26844b.mo45474a("appsflyer.start_failure");
            fVar.f26843a.error(e);
            fVar.f26853k.getAndSet(false);
        } catch (Throwable th) {
            fVar.f26852j.getAndSet(false);
            throw th;
        }
        fVar.f26852j.getAndSet(false);
        bVar.onComplete();
    }

    /* renamed from: e */
    public Object mo12018e() {
        return Integer.valueOf(((C6580b) this.f18618b).cleanUp());
    }

    public void onPositiveClick(DialogMaker dialogMaker) {
        DialogPresets.m35463showExitSurveyDialog$lambda0((C19846a) this.f18618b, dialogMaker);
    }

    public void onUpdateClientConfig() {
        ((MainPaysheetViewModel) this.f18618b).logInUser();
    }

    public Object then(C18123g gVar) {
        boolean z;
        C18276b bVar = (C18276b) this.f18618b;
        bVar.getClass();
        if (gVar.mo69668o()) {
            C18325d dVar = bVar.f40114c;
            synchronized (dVar) {
                dVar.f40229c = C18126j.m30617e((Object) null);
            }
            C18331i iVar = dVar.f40228b;
            synchronized (iVar) {
                iVar.f40250a.deleteFile(iVar.f40251b);
            }
            if (gVar.mo69664k() != null) {
                JSONArray jSONArray = ((C18327e) gVar.mo69664k()).f40235d;
                if (bVar.f40112a != null) {
                    try {
                        bVar.f40112a.mo69065b(C18276b.m30897b(jSONArray));
                    } catch (JSONException e) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                    } catch (AbtException e2) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
