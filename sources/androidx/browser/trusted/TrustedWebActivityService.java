package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;
import kotlin.jvm.internal.C19388s;
import p164l.C7209a;
import p164l.C7210b;

public abstract class TrustedWebActivityService extends Service {
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private final ITrustedWebActivityService.Stub mBinder = new C0369a();
    private NotificationManager mNotificationManager;
    public int mVerifiedUid = -1;

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    public class C0369a extends ITrustedWebActivityService.Stub {
        public C0369a() {
        }

        public final Bundle areNotificationsEnabled(Bundle bundle) {
            mo3221b();
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            boolean onAreNotificationsEnabled = TrustedWebActivityService.this.onAreNotificationsEnabled(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", onAreNotificationsEnabled);
            return bundle2;
        }

        /* renamed from: b */
        public final void mo3221b() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.mVerifiedUid == -1) {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.getTokenStore().mo19496a();
                TrustedWebActivityService.this.getPackageManager();
            }
            if (TrustedWebActivityService.this.mVerifiedUid != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        public final void cancelNotification(Bundle bundle) {
            mo3221b();
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityService.this.onCancelNotification(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }

        public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            mo3221b();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            C7210b bVar = null;
            ITrustedWebActivityCallback asInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
            if (asInterface != null) {
                bVar = new C7210b(asInterface);
            }
            return trustedWebActivityService.onExtraCommand(str, bundle, bVar);
        }

        public final Bundle getActiveNotifications() {
            mo3221b();
            Parcelable[] onGetActiveNotifications = TrustedWebActivityService.this.onGetActiveNotifications();
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", onGetActiveNotifications);
            return bundle;
        }

        public final Bundle getSmallIconBitmap() {
            mo3221b();
            return TrustedWebActivityService.this.onGetSmallIconBitmap();
        }

        public final int getSmallIconId() {
            mo3221b();
            return TrustedWebActivityService.this.onGetSmallIconId();
        }

        public final Bundle notifyNotificationWithChannel(Bundle bundle) {
            mo3221b();
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            C19388s.m32850V(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            String string = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
            boolean onNotifyNotificationWithChannel = TrustedWebActivityService.this.onNotifyNotificationWithChannel(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), string);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", onNotifyNotificationWithChannel);
            return bundle2;
        }
    }

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void ensureOnCreateCalled() {
        if (this.mNotificationManager == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract C7209a getTokenStore();

    public boolean onAreNotificationsEnabled(String str) {
        ensureOnCreateCalled();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannel = this.mNotificationManager.getNotificationChannel(channelNameToId(str));
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    public final IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public void onCancelNotification(String str, int i) {
        ensureOnCreateCalled();
        this.mNotificationManager.cancel(str, i);
    }

    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
    }

    public Bundle onExtraCommand(String str, Bundle bundle, C7210b bVar) {
        return null;
    }

    public Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return this.mNotificationManager.getActiveNotifications();
    }

    public Bundle onGetSmallIconBitmap() {
        int onGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (onGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, BitmapFactory.decodeResource(getResources(), onGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean onNotifyNotificationWithChannel(String str, int i, Notification notification, String str2) {
        Notification notification2;
        ensureOnCreateCalled();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        String channelNameToId = channelNameToId(str2);
        NotificationManager notificationManager = this.mNotificationManager;
        notificationManager.createNotificationChannel(new NotificationChannel(channelNameToId, str2, 3));
        if (notificationManager.getNotificationChannel(channelNameToId).getImportance() == 0) {
            notification2 = null;
        } else {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, notification);
            recoverBuilder.setChannelId(channelNameToId);
            notification2 = recoverBuilder.build();
        }
        NotificationChannel notificationChannel = this.mNotificationManager.getNotificationChannel(channelNameToId);
        if (!(notificationChannel == null || notificationChannel.getImportance() != 0)) {
            return false;
        }
        this.mNotificationManager.notify(str, i, notification2);
        return true;
    }

    public final boolean onUnbind(Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }
}
