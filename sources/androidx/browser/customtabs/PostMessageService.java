package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

public class PostMessageService extends Service {
    private IPostMessageService.Stub mBinder = new C0368a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class C0368a extends IPostMessageService.Stub {
        public final void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        public final void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
