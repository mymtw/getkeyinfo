package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;
import java.util.NoSuchElementException;
import p156k.C7170f;
import p156k.C7172h;
import p193o.C7506i;

public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    private ICustomTabsService.Stub mBinder = new C0366a();
    public final C7506i<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new C7506i<>();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class C0366a extends ICustomTabsService.Stub {
        public C0366a() {
        }

        /* renamed from: a */
        public static PendingIntent m1004a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* renamed from: b */
        public final boolean mo3190b(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
            C7172h hVar = new C7172h(iCustomTabsCallback, pendingIntent);
            try {
                C7170f fVar = new C7170f(this, hVar);
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    iCustomTabsCallback.asBinder().linkToDeath(fVar, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(iCustomTabsCallback.asBinder(), fVar);
                }
                return CustomTabsService.this.newSession(hVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public final Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new C7172h(iCustomTabsCallback, m1004a(bundle)), uri, bundle, list);
        }

        public final boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return mo3190b(iCustomTabsCallback, (PendingIntent) null);
        }

        public final boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return mo3190b(iCustomTabsCallback, m1004a(bundle));
        }

        public final int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return CustomTabsService.this.postMessage(new C7172h(iCustomTabsCallback, m1004a(bundle)), str, bundle);
        }

        public final boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.receiveFile(new C7172h(iCustomTabsCallback, m1004a(bundle)), uri, i, bundle);
        }

        public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new C7172h(iCustomTabsCallback, (PendingIntent) null), uri);
        }

        public final boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new C7172h(iCustomTabsCallback, m1004a(bundle)), uri);
        }

        public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new C7172h(iCustomTabsCallback, m1004a(bundle)), bundle);
        }

        public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new C7172h(iCustomTabsCallback, m1004a(bundle)), i, uri, bundle);
        }

        public final boolean warmup(long j) {
            return CustomTabsService.this.warmup(j);
        }
    }

    public boolean cleanUpSession(C7172h hVar) {
        try {
            synchronized (this.mDeathRecipientMap) {
                ICustomTabsCallback iCustomTabsCallback = hVar.f15947a;
                IBinder asBinder = iCustomTabsCallback == null ? null : iCustomTabsCallback.asBinder();
                if (asBinder == null) {
                    return false;
                }
                asBinder.unlinkToDeath(this.mDeathRecipientMap.getOrDefault(asBinder, null), 0);
                this.mDeathRecipientMap.remove(asBinder);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle extraCommand(String str, Bundle bundle);

    public abstract boolean mayLaunchUrl(C7172h hVar, Uri uri, Bundle bundle, List<Bundle> list);

    public abstract boolean newSession(C7172h hVar);

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(C7172h hVar, String str, Bundle bundle);

    public abstract boolean receiveFile(C7172h hVar, Uri uri, int i, Bundle bundle);

    public abstract boolean requestPostMessageChannel(C7172h hVar, Uri uri);

    public abstract boolean updateVisuals(C7172h hVar, Bundle bundle);

    public abstract boolean validateRelationship(C7172h hVar, int i, Uri uri, Bundle bundle);

    public abstract boolean warmup(long j);
}
