package p030bo.app;

import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.C2801z;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.config.PrefsFragment;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.Status;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p248tp.C8055h;
import p605kk.C18119c;
import p605kk.C18123g;

/* renamed from: bo.app.u6 */
public final /* synthetic */ class C4237u6 implements C18119c, Preference.C3010d, C2801z, C6599q.C6600a, SDKInterceptFinishListener {

    /* renamed from: b */
    public final /* synthetic */ int f9384b;

    /* renamed from: c */
    public final /* synthetic */ Object f9385c;

    public /* synthetic */ C4237u6(Object obj, int i) {
        this.f9384b = i;
        this.f9385c = obj;
    }

    public final Object apply(Object obj) {
        Map map = (Map) this.f9385c;
        Cursor cursor = (Cursor) obj;
        C6493a aVar = C6599q.f14568g;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C6599q.C6601b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: c */
    public final void mo10428c(Bundle bundle, String str) {
        MultiShopCartFragment.m34916onViewCreated$lambda0((MultiShopCartFragment) this.f9385c, str, bundle);
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        switch (this.f9384b) {
            case 1:
                return ConfigPreferencesHelper.m34848setUpWipeLogsPreference$lambda10((ConfigPreferencesHelper) this.f9385c, preference);
            default:
                return PrefsFragment.m34853addOnboardingPrefs$lambda16$lambda15((PrefsFragment) this.f9385c, preference);
        }
    }

    public final void onComplete(C18123g gVar) {
        switch (this.f9384b) {
            case 0:
                C3677g1.m8661a((C3677g1) this.f9385c, gVar);
                return;
            default:
                C8055h hVar = (C8055h) this.f9385c;
                C19383o.m32797g(hVar, "$emitter");
                C19383o.m32797g(gVar, "task");
                if (gVar.mo69668o()) {
                    String str = (String) gVar.mo69664k();
                    if (str == null) {
                        str = "";
                    }
                    hVar.onNext(str);
                    return;
                }
                hVar.tryOnError(new Throwable(gVar.mo69663j()));
                return;
        }
    }

    public final void onSDKInterceptComplete(Status status) {
        MainPaysheetViewModel.lambda$new$2((Events) this.f9385c, status);
    }
}
