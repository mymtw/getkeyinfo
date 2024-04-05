package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p003a2.C0015b;
import p260v0.C8184a;

public final class DeviceInfo {
    private final String TAG = "DeviceInfo";
    private final int apiLevel = Build.VERSION.SDK_INT;
    private final String brand = Build.BRAND;
    private String cachedDeviceCountry;
    private final Context context;
    private final String deviceManufacturer = Build.MANUFACTURER;
    private final String deviceModel = Build.MODEL;
    private final String osName = "android";
    private final String osVersion = Build.VERSION.RELEASE;
    private final String platform = "Android";
    private final Repository repository;

    public DeviceInfo(Repository repository2, Context context2) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.repository = repository2;
        this.context = context2;
    }

    private final boolean checkLocationPermissionAllowed(Context context2) {
        return checkPermissionAllowed(context2, "android.permission.ACCESS_COARSE_LOCATION") || checkPermissionAllowed(context2, "android.permission.ACCESS_FINE_LOCATION");
    }

    private final boolean checkPermissionAllowed(Context context2, String str) {
        try {
            return C8184a.m16458a(context2, str) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private final String fetchDeviceCountry() {
        String countryFromLocation = getCountryFromLocation();
        boolean z = false;
        if (countryFromLocation != null && (C19457k.m33020X0(countryFromLocation) ^ true)) {
            return countryFromLocation;
        }
        String countryFromNetwork = getCountryFromNetwork();
        if (countryFromNetwork != null && (!C19457k.m33020X0(countryFromNetwork))) {
            z = true;
        }
        return z ? countryFromNetwork : getCountryFromLocale();
    }

    private final String getCountryFromLocale() {
        return Locale.getDefault().getCountry();
    }

    private final String getCountryFromLocation() {
        List<Address> fromLocation;
        Location mostRecentLocation = getMostRecentLocation();
        if (mostRecentLocation == null) {
            return null;
        }
        try {
            if (!Geocoder.isPresent() || (fromLocation = new Geocoder(this.context, Locale.ENGLISH).getFromLocation(mostRecentLocation.getLatitude(), mostRecentLocation.getLongitude(), 1)) == null) {
                return null;
            }
            for (Address next : fromLocation) {
                if (next != null) {
                    return next.getCountryCode();
                }
            }
            return null;
        } catch (IOException e) {
            String str = this.TAG;
            C19383o.m32796f(str, "TAG");
            PLog.e$default(str, C0015b.m90i("Error fetching location ", e.getClass().getSimpleName(), ": ", e.getMessage()), (Throwable) null, 0, 12, (Object) null);
            return null;
        } catch (NullPointerException e2) {
            String str2 = this.TAG;
            C19383o.m32796f(str2, "TAG");
            PLog.e$default(str2, C0015b.m90i("Error fetching location ", e2.getClass().getSimpleName(), ": ", e2.getMessage()), (Throwable) null, 0, 12, (Object) null);
            return null;
        } catch (NoSuchMethodError e3) {
            String str3 = this.TAG;
            C19383o.m32796f(str3, "TAG");
            PLog.e$default(str3, C0015b.m90i("Error fetching location ", e3.getClass().getSimpleName(), ": ", e3.getMessage()), (Throwable) null, 0, 12, (Object) null);
            return null;
        } catch (IllegalArgumentException e4) {
            String str4 = this.TAG;
            C19383o.m32796f(str4, "TAG");
            PLog.e$default(str4, C0015b.m90i("Error fetching location ", e4.getClass().getSimpleName(), ": ", e4.getMessage()), (Throwable) null, 0, 12, (Object) null);
            return null;
        } catch (IllegalStateException e5) {
            String str5 = this.TAG;
            C19383o.m32796f(str5, "TAG");
            PLog.e$default(str5, C0015b.m90i("Error fetching location ", e5.getClass().getSimpleName(), ": ", e5.getMessage()), (Throwable) null, 0, 12, (Object) null);
            return null;
        } catch (Exception e6) {
            String str6 = this.TAG;
            C19383o.m32796f(str6, "TAG");
            PLog.e$default(str6, C0015b.m90i("Error fetching location ", e6.getClass().getSimpleName(), ": ", e6.getMessage()), (Throwable) null, 0, 12, (Object) null);
            return null;
        }
    }

    private final String getCountryFromNetwork() {
        String networkCountryIso;
        try {
            Object systemService = this.context.getSystemService(ResponseConstants.PHONE);
            if (systemService != null) {
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                Locale locale = Locale.US;
                C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                String upperCase = networkCountryIso.toUpperCase(locale);
                C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return upperCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0034 A[SYNTHETIC] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.location.Location getMostRecentLocation() {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get most recent location"
            java.lang.String r1 = "AmplitudeApi.TAG"
            android.content.Context r2 = r9.context
            boolean r2 = r9.checkLocationPermissionAllowed(r2)
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            android.content.Context r2 = r9.context
            java.lang.String r4 = "location"
            java.lang.Object r2 = r2.getSystemService(r4)
            boolean r4 = r2 instanceof android.location.LocationManager
            if (r4 == 0) goto L_0x001d
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            goto L_0x001e
        L_0x001d:
            r2 = r3
        L_0x001e:
            if (r2 != 0) goto L_0x0021
            return r3
        L_0x0021:
            r4 = 1
            java.util.List r4 = r2.getProviders(r4)     // Catch:{ Exception | SecurityException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r4 = r3
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r3
        L_0x002b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0034:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r7 = 4
            r8 = 0
            android.location.Location r6 = r2.getLastKnownLocation(r6)     // Catch:{ SecurityException -> 0x0054, Exception -> 0x0047 }
            goto L_0x0061
        L_0x0047:
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$Companion r6 = com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi.Companion
            java.lang.String r6 = r6.getTAG()
            kotlin.jvm.internal.C19383o.m32796f(r6, r1)
            com.paypal.pyplcheckout.common.instrumentation.PLog.w$default(r6, r0, r8, r7, r3)
            goto L_0x0060
        L_0x0054:
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$Companion r6 = com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi.Companion
            java.lang.String r6 = r6.getTAG()
            kotlin.jvm.internal.C19383o.m32796f(r6, r1)
            com.paypal.pyplcheckout.common.instrumentation.PLog.w$default(r6, r0, r8, r7, r3)
        L_0x0060:
            r6 = r3
        L_0x0061:
            if (r6 != 0) goto L_0x0064
            goto L_0x0034
        L_0x0064:
            r5.add(r6)
            goto L_0x0034
        L_0x0068:
            r0 = -1
            java.util.Iterator r2 = r5.iterator()
        L_0x006e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r2.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x006e
            long r0 = r4.getTime()
            r3 = r4
            goto L_0x006e
        L_0x0088:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo.getMostRecentLocation():android.location.Location");
    }

    public final int getApiLevel() {
        return this.apiLevel;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCarrier() {
        try {
            Object systemService = this.context.getSystemService(ResponseConstants.PHONE);
            if (systemService != null) {
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getCountry() {
        String ipCountry = getIpCountry();
        return ipCountry == null ? getDeviceCountry() : ipCountry;
    }

    public final String getDeviceCountry() {
        String str = this.cachedDeviceCountry;
        if (str != null) {
            return str;
        }
        String fetchDeviceCountry = fetchDeviceCountry();
        this.cachedDeviceCountry = fetchDeviceCountry;
        return fetchDeviceCountry;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getIpCountry() {
        return this.repository.getBuyerIPCountry();
    }

    public final String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersionName() {
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return null;
        }
    }
}
