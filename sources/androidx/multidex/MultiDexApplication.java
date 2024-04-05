package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.io.File;
import java.util.HashSet;

public class MultiDexApplication extends Application {
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        HashSet hashSet = C2941a.f6655a;
        Log.i("MultiDex", "Installing application");
        if (C2941a.f6656b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            applicationInfo = getApplicationInfo();
        } catch (RuntimeException e) {
            try {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                applicationInfo = null;
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                StringBuilder h = C0072d.m201h("MultiDex installation failed (");
                h.append(e2.getMessage());
                h.append(").");
                throw new RuntimeException(h.toString());
            }
        }
        if (applicationInfo == null) {
            Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            return;
        }
        C2941a.m6875b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
        Log.i("MultiDex", "install done");
    }
}
