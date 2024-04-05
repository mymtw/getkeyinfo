package p156k;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

/* renamed from: k.g */
public final class C7171g {

    /* renamed from: a */
    public final ICustomTabsService f15943a;

    /* renamed from: b */
    public final ICustomTabsCallback f15944b;

    /* renamed from: c */
    public final ComponentName f15945c;

    /* renamed from: d */
    public final PendingIntent f15946d = null;

    public C7171g(ICustomTabsService iCustomTabsService, C7161c cVar, ComponentName componentName) {
        this.f15943a = iCustomTabsService;
        this.f15944b = cVar;
        this.f15945c = componentName;
    }

    /* renamed from: a */
    public final void mo19460a(Uri uri, List list) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.f15946d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            this.f15943a.mayLaunchUrl(this.f15944b, uri, bundle, list);
        } catch (RemoteException unused) {
        }
    }
}
