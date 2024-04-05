package p156k;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* renamed from: k.b */
public final class C7160b extends CustomTabsServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ Context f15926b;

    public C7160b(Context context) {
        this.f15926b = context;
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C7167d dVar) {
        dVar.getClass();
        try {
            dVar.f15934a.warmup(0);
        } catch (RemoteException unused) {
        }
        this.f15926b.unbindService(this);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
