package p156k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* renamed from: k.d */
public class C7167d {

    /* renamed from: a */
    public final ICustomTabsService f15934a;

    /* renamed from: b */
    public final ComponentName f15935b;

    public C7167d(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.f15934a = iCustomTabsService;
        this.f15935b = componentName;
    }

    /* renamed from: a */
    public static boolean m13828a(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    /* renamed from: b */
    public final C7171g mo19457b() {
        C7161c cVar = new C7161c();
        try {
            if (this.f15934a.newSession(cVar)) {
                return new C7171g(this.f15934a, cVar, this.f15935b);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }
}
