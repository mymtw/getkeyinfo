package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.R;
import com.google.android.gms.common.C14451R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p002a1.C0010d;
import p002a1.C0012f;
import p193o.C7506i;

public final class zac {
    private static final C7506i<String, String> zaa = new C7506i<>();
    private static Locale zab;

    public static String zaa(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zaa(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zaa(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zaa(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zaa(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    public static String zab(Context context, int i) {
        String str;
        if (i == 6) {
            str = zaa(context, "common_google_play_services_resolution_required_title");
        } else {
            str = zaa(context, i);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        String zab2 = zab(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{zab2});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{zab2});
            } else if (i == 5) {
                return zaa(context, "common_google_play_services_invalid_account_text", zab2);
            } else {
                if (i == 7) {
                    return zaa(context, "common_google_play_services_network_error_text", zab2);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{zab2});
                } else if (i == 20) {
                    return zaa(context, "common_google_play_services_restricted_profile_text", zab2);
                } else {
                    switch (i) {
                        case 16:
                            return zaa(context, "common_google_play_services_api_unavailable_text", zab2);
                        case 17:
                            return zaa(context, "common_google_play_services_sign_in_failed_text", zab2);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{zab2});
                        default:
                            return resources.getString(C14451R.string.common_google_play_services_unknown_issue, new Object[]{zab2});
                    }
                }
            }
        } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{zab2});
        }
    }

    public static String zad(Context context, int i) {
        return (i == 6 || i == 19) ? zaa(context, "common_google_play_services_resolution_required_text", zab(context)) : zac(context, i);
    }

    public static String zae(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(17039370) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
    }

    private static String zab(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String zaa(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context, str);
        if (zaa2 == null) {
            zaa2 = resources.getString(C14451R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zaa2, new Object[]{str2});
    }

    private static String zaa(Context context, String str) {
        C7506i<String, String> iVar = zaa;
        synchronized (iVar) {
            Locale locale = new C0010d(new C0012f(context.getResources().getConfiguration().getLocales())).f22a.get();
            if (!locale.equals(zab)) {
                iVar.clear();
                zab = locale;
            }
            String orDefault = iVar.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            iVar.put(str, string);
            return string;
        }
    }

    public static String zaa(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }
}
