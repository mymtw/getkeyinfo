package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import p260v0.C8191b;

public abstract class UnusedAppRestrictionsBackportService extends Service {
    @SuppressLint({"ActionValue"})
    public static final String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private IUnusedAppRestrictionsBackportService.Stub mBinder = new C2269a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class C2269a extends IUnusedAppRestrictionsBackportService.Stub {
        public C2269a() {
        }

        public final void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
            if (iUnusedAppRestrictionsBackportCallback != null) {
                UnusedAppRestrictionsBackportService.this.isPermissionRevocationEnabled(new C8191b(iUnusedAppRestrictionsBackportCallback));
            }
        }
    }

    public abstract void isPermissionRevocationEnabled(C8191b bVar);

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
