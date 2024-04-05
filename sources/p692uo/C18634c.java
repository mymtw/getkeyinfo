package p692uo;

import android.content.ComponentName;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import p156k.C7167d;
import p708wo.C18755a;

/* renamed from: uo.c */
public final class C18634c extends CustomTabsServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ C18635d f41149b;

    public C18634c(C18635d dVar) {
        this.f41149b = dVar;
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C7167d dVar) {
        C18755a.m31630a("CustomTabsService is connected", new Object[0]);
        dVar.getClass();
        try {
            dVar.f15934a.warmup(0);
        } catch (RemoteException unused) {
        }
        this.f41149b.f41151b.set(dVar);
        this.f41149b.f41152c.countDown();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C18755a.m31630a("CustomTabsService is disconnected", new Object[0]);
        this.f41149b.f41151b.set((Object) null);
        this.f41149b.f41152c.countDown();
    }
}
