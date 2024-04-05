package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zabm;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p003a2.C0023f;
import p250u0.C8099l;
import p250u0.C8100m;
import p605kk.C18123g;
import p605kk.C18126j;

public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    private String zac;

    @SuppressLint({"HandlerLeak"})
    public class zaa extends zas {
        private final Context zaa;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zaa(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.zaa = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                C0023f.m112m(50, "Don't know how to handle this message: ", i, "GoogleApiAvailability");
                return;
            }
            int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.zaa);
            if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                GoogleApiAvailability.this.showErrorNotification(this.zaa, isGooglePlayServicesAvailable);
            }
        }
    }

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public C18123g<Void> checkApiAvailability(@RecentlyNonNull HasApiKey<?> hasApiKey, @RecentlyNonNull HasApiKey<?>... hasApiKeyArr) {
        return zaa(hasApiKey, hasApiKeyArr).mo69670q(zaa.zaa);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@RecentlyNonNull Context context) {
        return super.getClientVersion(context);
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @RecentlyNullable
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @HideFirstParty
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public C18123g<Void> makeGooglePlayServicesAvailable(@RecentlyNonNull Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (isGooglePlayServicesAvailable == 0) {
            return C18126j.m30617e((Object) null);
        }
        zabp zaa2 = zabp.zaa(activity);
        zaa2.zab(new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null), 0);
        return zaa2.zac();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(@RecentlyNonNull Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(@RecentlyNonNull Context context, int i) {
        zaa(context, i, (String) null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public final boolean zaa(@RecentlyNonNull Activity activity, @RecentlyNonNull LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa((Context) activity, i, zab.zaa(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zaa(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public boolean showErrorDialogFragment(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public C18123g<Void> checkApiAvailability(@RecentlyNonNull GoogleApi<?> googleApi, @RecentlyNonNull GoogleApi<?>... googleApiArr) {
        return zaa((HasApiKey<?>) googleApi, (HasApiKey<?>[]) googleApiArr).mo69670q(zab.zaa);
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa((Context) activity, i, zab.zaa(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener);
    }

    public void showErrorNotification(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult) {
        zaa(context, connectionResult.getErrorCode(), (String) null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    @TargetApi(20)
    private final void zaa(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            zaa(context);
        } else if (pendingIntent != null) {
            String zab2 = zac.zab(context, i);
            String zad = zac.zad(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
            C8100m mVar = new C8100m(context, (String) null);
            mVar.f17674r = true;
            mVar.mo20693g(16, true);
            mVar.mo20691e(zab2);
            C8099l lVar = new C8099l();
            lVar.mo20687h(zad);
            mVar.mo20696j(lVar);
            if (DeviceProperties.isWearable(context)) {
                Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                mVar.f17655C.icon = context.getApplicationInfo().icon;
                mVar.f17666j = 2;
                if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                    mVar.mo20688a(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    mVar.f17663g = pendingIntent;
                }
            } else {
                mVar.f17655C.icon = 17301642;
                String string = resources.getString(R.string.common_google_play_services_notification_ticker);
                mVar.f17655C.tickerText = C8100m.m16287c(string);
                mVar.f17655C.when = System.currentTimeMillis();
                mVar.f17663g = pendingIntent;
                mVar.mo20690d(zad);
            }
            if (PlatformVersion.isAtLeastO()) {
                Preconditions.checkState(PlatformVersion.isAtLeastO());
                String zaa2 = zaa();
                if (zaa2 == null) {
                    zaa2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(zaa2);
                    String zaa3 = zac.zaa(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(zaa2, zaa3, 4));
                    } else if (!zaa3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(zaa3);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                mVar.f17682z = zaa2;
            }
            Notification b = mVar.mo20689b();
            if (i == 1 || i == 2 || i == 3) {
                i2 = GooglePlayServicesUtilLight.GMS_AVAILABILITY_NOTIFICATION_ID;
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = GooglePlayServicesUtilLight.GMS_GENERAL_ERROR_NOTIFICATION_ID;
            }
            notificationManager.notify(i2, b);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Fragment fragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, zab.zaa(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener);
    }

    public final boolean zaa(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.getErrorCode(), (String) null, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i));
        return true;
    }

    @RecentlyNonNull
    public static Dialog zaa(@RecentlyNonNull Activity activity, @RecentlyNonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zaa(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabk zaa(Context context, zabm zabm) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabk zabk = new zabk(zabm);
        context.registerReceiver(zabk, intentFilter);
        zabk.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabk;
        }
        zabm.zaa();
        zabk.zaa();
        return null;
    }

    private static C18123g<Map<ApiKey<?>, String>> zaa(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey<?> checkNotNull : hasApiKeyArr) {
            Preconditions.checkNotNull(checkNotNull, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaa().zaa((Iterable<? extends HasApiKey<?>>) arrayList);
    }

    private final String zaa() {
        String str;
        synchronized (zaa) {
            str = this.zac;
        }
        return str;
    }

    public static Dialog zaa(Context context, int i, zab zab2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(zac.zac(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zae = zac.zae(context, i);
        if (zae != null) {
            builder.setPositiveButton(zae, zab2);
        }
        String zaa2 = zac.zaa(context, i);
        if (zaa2 != null) {
            builder.setTitle(zaa2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    public static void zaa(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zaa(Context context) {
        new zaa(context).sendEmptyMessageDelayed(1, 120000);
    }
}
