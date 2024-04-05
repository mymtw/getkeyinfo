package p291y3;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.util.List;
import p156k.C7167d;
import p156k.C7171g;
import p291y3.C8373c;
import p291y3.C8386j;

/* renamed from: y3.i */
public final class C8384i extends CustomTabsServiceConnection {

    /* renamed from: b */
    public C7167d f18384b;

    /* renamed from: c */
    public final /* synthetic */ Uri f18385c;

    /* renamed from: d */
    public final /* synthetic */ C8386j.C8387a f18386d;

    /* renamed from: y3.i$a */
    public class C8385a implements Runnable {
        public C8385a() {
        }

        public final void run() {
            C8373c cVar = (C8373c) C8384i.this.f18386d;
            cVar.getClass();
            Log.d("BitlySDK", "Bitly SDK correlator completed");
            C8373c.C8374a aVar = cVar.f18361b;
            if (aVar != null) {
                Context context = ((C8370a) aVar).f18350a;
                PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("bitly.should.check.deeplink", true).apply();
                C8375d.m16722a(context, 0, true);
            }
            C8384i.this.f18384b = null;
        }
    }

    public C8384i(Uri uri, C8386j.C8387a aVar) {
        this.f18385c = uri;
        this.f18386d = aVar;
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C7167d dVar) {
        this.f18384b = dVar;
        dVar.getClass();
        try {
            dVar.f15934a.warmup(0);
        } catch (RemoteException unused) {
        }
        C7171g b = this.f18384b.mo19457b();
        if (b != null) {
            b.mo19460a(this.f18385c, (List) null);
            new Handler().postDelayed(new C8385a(), 1000);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f18384b = null;
    }
}
