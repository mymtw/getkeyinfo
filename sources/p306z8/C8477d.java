package p306z8;

import android.database.Cursor;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6575k;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.Status;
import p120gh.C6898a;
import p605kk.C18122f;
import p605kk.C18123g;
import p605kk.C18126j;
import p641on.C18327e;

/* renamed from: z8.d */
public final /* synthetic */ class C8477d implements Preference.C3010d, C6898a.C6899a, C6599q.C6600a, C18122f, SDKInterceptFinishListener {

    /* renamed from: b */
    public final /* synthetic */ Object f18502b;

    public /* synthetic */ C8477d(Object obj) {
        this.f18502b = obj;
    }

    public final Object apply(Object obj) {
        C6599q qVar = (C6599q) this.f18502b;
        Cursor cursor = (Cursor) obj;
        C6493a aVar = C6599q.f14568g;
        qVar.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            qVar.mo18778d((long) i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: e */
    public final Object mo12018e() {
        C6575k kVar = (C6575k) this.f18502b;
        for (C6556p a : kVar.f14538b.mo18787y()) {
            kVar.f14539c.mo18752a(a, 1);
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34836addNativeConfigFlagsPreference$lambda17((FragmentManager) this.f18502b, preference);
    }

    public final void onSDKInterceptComplete(Status status) {
        MainPaysheetViewModel.lambda$new$0((Events) this.f18502b, status);
    }

    public final C18123g then(Object obj) {
        C18327e eVar = (C18327e) obj;
        int[] iArr = C16688a.f36900k;
        return C18126j.m30617e((C16688a.C16689a) this.f18502b);
    }
}
