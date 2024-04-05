package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import p156k.C7167d;

public abstract class CustomTabsServiceConnection implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$a */
    public class C0367a extends C7167d {
        public C0367a(ICustomTabsService iCustomTabsService, ComponentName componentName) {
            super(iCustomTabsService, componentName);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C7167d dVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new C0367a(ICustomTabsService.Stub.asInterface(iBinder), componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
