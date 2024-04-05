package p253u3;

import android.content.Context;
import android.location.Geocoder;
import java.util.Locale;

/* renamed from: u3.q */
public final class C8152q {

    /* renamed from: d */
    public static final /* synthetic */ int f17883d = 0;

    /* renamed from: a */
    public boolean f17884a;

    /* renamed from: b */
    public Context f17885b;

    /* renamed from: c */
    public C8153a f17886c;

    /* renamed from: u3.q$a */
    public class C8153a {

        /* renamed from: a */
        public String f17887a;

        /* renamed from: b */
        public String f17888b;

        /* renamed from: c */
        public String f17889c;

        /* renamed from: d */
        public String f17890d;

        /* renamed from: e */
        public String f17891e;

        /* renamed from: f */
        public String f17892f;

        /* renamed from: g */
        public String f17893g;

        /* renamed from: h */
        public String f17894h;

        /* renamed from: i */
        public String f17895i;

        /* renamed from: j */
        public String f17896j;

        /* renamed from: k */
        public boolean f17897k;

        /* renamed from: l */
        public boolean f17898l;

        /* renamed from: m */
        public String f17899m;

        /* JADX WARNING: Removed duplicated region for block: B:52:0x012b A[SYNTHETIC, Splitter:B:52:0x012b] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C8153a() {
            /*
                r13 = this;
                java.lang.String r0 = "phone"
                java.lang.String r1 = "u3.q"
                p253u3.C8152q.this = r14
                r13.<init>()
                java.lang.String r2 = android.os.Build.MANUFACTURER
                java.lang.String r3 = "Amazon"
                boolean r2 = r3.equals(r2)
                java.lang.String r3 = "getId"
                r4 = 1
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x0034
                android.content.Context r14 = r14.f17885b
                android.content.ContentResolver r14 = r14.getContentResolver()
                java.lang.String r2 = "limit_ad_tracking"
                int r2 = android.provider.Settings.Secure.getInt(r14, r2, r5)
                if (r2 != r4) goto L_0x0028
                r2 = r4
                goto L_0x0029
            L_0x0028:
                r2 = r5
            L_0x0029:
                r13.f17897k = r2
                java.lang.String r2 = "advertising_id"
                java.lang.String r14 = android.provider.Settings.Secure.getString(r14, r2)
                r13.f17887a = r14
                goto L_0x00a2
            L_0x0034:
                java.lang.Class<com.google.android.gms.ads.identifier.AdvertisingIdClient> r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.class
                java.lang.String r7 = "getAdvertisingIdInfo"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Class<android.content.Context> r9 = android.content.Context.class
                r8[r5] = r9     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.reflect.Method r2 = r2.getMethod(r7, r8)     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                android.content.Context r14 = r14.f17885b     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                r7[r5] = r14     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Object r14 = r2.invoke(r6, r7)     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Class r2 = r14.getClass()     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.String r7 = "isLimitAdTrackingEnabled"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.reflect.Method r2 = r2.getMethod(r7, r8)     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Object r2 = r2.invoke(r14, r7)     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                if (r2 == 0) goto L_0x006a
                boolean r2 = r2.booleanValue()     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                if (r2 == 0) goto L_0x006a
                r2 = r4
                goto L_0x006b
            L_0x006a:
                r2 = r5
            L_0x006b:
                r13.f17897k = r2     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Class r2 = r14.getClass()     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.reflect.Method r2 = r2.getMethod(r3, r7)     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.Object r14 = r2.invoke(r14, r7)     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                java.lang.String r14 = (java.lang.String) r14     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                r13.f17887a = r14     // Catch:{ ClassNotFoundException -> 0x0097, InvocationTargetException -> 0x008d, Exception -> 0x0082 }
                goto L_0x00a0
            L_0x0082:
                r14 = move-exception
                u3.n r2 = p253u3.C8149n.f17874c
                int r7 = p253u3.C8152q.f17883d
                java.lang.String r7 = "Encountered an error connecting to Google Play Services for advertising id"
                r2.mo20766b(r1, r7, r14)
                goto L_0x00a0
            L_0x008d:
                u3.n r14 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                java.lang.String r2 = "Google Play Services not available for advertising id"
                r14.mo20767c(r1, r2)
                goto L_0x00a0
            L_0x0097:
                u3.n r14 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                java.lang.String r2 = "Google Play Services SDK not found for advertising id!"
                r14.mo20767c(r1, r2)
            L_0x00a0:
                java.lang.String r14 = r13.f17887a
            L_0x00a2:
                r13.f17887a = r14
                u3.q r14 = p253u3.C8152q.this     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                android.content.Context r14 = r14.f17885b     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                android.content.pm.PackageManager r14 = r14.getPackageManager()     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                u3.q r2 = p253u3.C8152q.this     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                android.content.Context r2 = r2.f17885b     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                android.content.pm.PackageInfo r14 = r14.getPackageInfo(r2, r5)     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                java.lang.String r14 = r14.versionName     // Catch:{ NameNotFoundException | Exception -> 0x00bb }
                goto L_0x00bc
            L_0x00bb:
                r14 = r6
            L_0x00bc:
                r13.f17889c = r14
                java.lang.String r14 = "android"
                r13.f17890d = r14
                java.lang.String r14 = android.os.Build.VERSION.RELEASE
                r13.f17891e = r14
                java.lang.String r14 = android.os.Build.BRAND
                r13.f17892f = r14
                java.lang.String r14 = android.os.Build.MANUFACTURER
                r13.f17893g = r14
                java.lang.String r14 = android.os.Build.MODEL
                r13.f17894h = r14
                u3.q r14 = p253u3.C8152q.this     // Catch:{ Exception -> 0x00e1 }
                android.content.Context r14 = r14.f17885b     // Catch:{ Exception -> 0x00e1 }
                java.lang.Object r14 = r14.getSystemService(r0)     // Catch:{ Exception -> 0x00e1 }
                android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r14 = r14.getNetworkOperatorName()     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e2
            L_0x00e1:
                r14 = r6
            L_0x00e2:
                r13.f17895i = r14
                u3.q r14 = p253u3.C8152q.this
                boolean r2 = r14.f17884a
                if (r2 != 0) goto L_0x00eb
                goto L_0x0123
            L_0x00eb:
                android.location.Location r14 = r14.mo20789c()
                if (r14 == 0) goto L_0x0123
                boolean r2 = android.location.Geocoder.isPresent()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                if (r2 == 0) goto L_0x0123
                u3.q r2 = p253u3.C8152q.this     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                android.location.Geocoder r7 = r2.mo20788b()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                double r8 = r14.getLatitude()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                double r10 = r14.getLongitude()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                r12 = 1
                java.util.List r14 = r7.getFromLocation(r8, r10, r12)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                if (r14 == 0) goto L_0x0123
                java.util.Iterator r14 = r14.iterator()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
            L_0x0110:
                boolean r2 = r14.hasNext()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                if (r2 == 0) goto L_0x0123
                java.lang.Object r2 = r14.next()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                android.location.Address r2 = (android.location.Address) r2     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                if (r2 == 0) goto L_0x0110
                java.lang.String r14 = r2.getCountryCode()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException -> 0x0123 }
                goto L_0x0124
            L_0x0123:
                r14 = r6
            L_0x0124:
                boolean r2 = p253u3.C8156t.m16412c(r14)
                if (r2 != 0) goto L_0x012b
                goto L_0x0159
            L_0x012b:
                u3.q r14 = p253u3.C8152q.this     // Catch:{ Exception -> 0x0149 }
                android.content.Context r14 = r14.f17885b     // Catch:{ Exception -> 0x0149 }
                java.lang.Object r14 = r14.getSystemService(r0)     // Catch:{ Exception -> 0x0149 }
                android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14     // Catch:{ Exception -> 0x0149 }
                int r0 = r14.getPhoneType()     // Catch:{ Exception -> 0x0149 }
                r2 = 2
                if (r0 == r2) goto L_0x0149
                java.lang.String r14 = r14.getNetworkCountryIso()     // Catch:{ Exception -> 0x0149 }
                if (r14 == 0) goto L_0x0149
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0149 }
                java.lang.String r14 = r14.toUpperCase(r0)     // Catch:{ Exception -> 0x0149 }
                goto L_0x014a
            L_0x0149:
                r14 = r6
            L_0x014a:
                boolean r0 = p253u3.C8156t.m16412c(r14)
                if (r0 != 0) goto L_0x0151
                goto L_0x0159
            L_0x0151:
                java.util.Locale r14 = java.util.Locale.getDefault()
                java.lang.String r14 = r14.getCountry()
            L_0x0159:
                r13.f17888b = r14
                java.util.Locale r14 = java.util.Locale.getDefault()
                java.lang.String r14 = r14.getLanguage()
                r13.f17896j = r14
                java.lang.String r14 = "Google Play Services Util not found!"
                java.lang.String r0 = "Google Play Services not available"
                java.lang.Class<com.google.android.gms.common.GooglePlayServicesUtil> r2 = com.google.android.gms.common.GooglePlayServicesUtil.class
                java.lang.String r7 = com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                java.lang.String r7 = "isGooglePlayServicesAvailable"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                java.lang.Class<android.content.Context> r9 = android.content.Context.class
                r8[r5] = r9     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                java.lang.reflect.Method r2 = r2.getMethod(r7, r8)     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                u3.q r8 = p253u3.C8152q.this     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                android.content.Context r8 = r8.f17885b     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                r7[r5] = r8     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                java.lang.Object r2 = r2.invoke(r6, r7)     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                if (r2 == 0) goto L_0x01d2
                int r14 = r2.intValue()     // Catch:{ NoClassDefFoundError -> 0x01cb, ClassNotFoundException -> 0x01c3, NoSuchMethodException -> 0x01bb, InvocationTargetException -> 0x01b3, IllegalAccessException -> 0x01ab, Exception -> 0x0191 }
                if (r14 != 0) goto L_0x01d2
                r14 = r4
                goto L_0x01d3
            L_0x0191:
                r14 = move-exception
                u3.n r0 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "Error when checking for Google Play Services: "
                r2.append(r7)
                r2.append(r14)
                java.lang.String r14 = r2.toString()
                r0.mo20767c(r1, r14)
                goto L_0x01d2
            L_0x01ab:
                u3.n r14 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                r14.mo20767c(r1, r0)
                goto L_0x01d2
            L_0x01b3:
                u3.n r14 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                r14.mo20767c(r1, r0)
                goto L_0x01d2
            L_0x01bb:
                u3.n r14 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                r14.mo20767c(r1, r0)
                goto L_0x01d2
            L_0x01c3:
                u3.n r0 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                r0.mo20767c(r1, r14)
                goto L_0x01d2
            L_0x01cb:
                u3.n r0 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                r0.mo20767c(r1, r14)
            L_0x01d2:
                r14 = r5
            L_0x01d3:
                r13.f17898l = r14
                java.lang.String r14 = "com.google.android.gms.appset.AppSet"
                java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.String r0 = "getClient"
                java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Class<android.content.Context> r7 = android.content.Context.class
                r2[r5] = r7     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.reflect.Method r14 = r14.getMethod(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                u3.q r2 = p253u3.C8152q.this     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                android.content.Context r2 = r2.f17885b     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                r0[r5] = r2     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object r14 = r14.invoke(r6, r0)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Class r0 = r14.getClass()     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.String r2 = "getAppSetInfo"
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.reflect.Method r0 = r0.getMethod(r2, r7)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object r14 = r0.invoke(r14, r2)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Class<kk.j> r0 = p605kk.C18126j.class
                java.lang.String r2 = "a"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Class<kk.g> r8 = p605kk.C18123g.class
                r7[r5] = r8     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.reflect.Method r0 = r0.getMethod(r2, r7)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                r2[r5] = r14     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object r14 = r0.invoke(r6, r2)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Class r0 = r14.getClass()     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.Object r14 = r0.invoke(r14, r2)     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                java.lang.String r14 = (java.lang.String) r14     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                r13.f17899m = r14     // Catch:{ ClassNotFoundException -> 0x0245, InvocationTargetException -> 0x023b, Exception -> 0x0230 }
                goto L_0x024e
            L_0x0230:
                r14 = move-exception
                u3.n r0 = p253u3.C8149n.f17874c
                int r2 = p253u3.C8152q.f17883d
                java.lang.String r2 = "Encountered an error connecting to Google Play Services for app set id"
                r0.mo20766b(r1, r2, r14)
                goto L_0x024e
            L_0x023b:
                u3.n r14 = p253u3.C8149n.f17874c
                int r0 = p253u3.C8152q.f17883d
                java.lang.String r0 = "Google Play Services not available for app set id"
                r14.mo20767c(r1, r0)
                goto L_0x024e
            L_0x0245:
                u3.n r14 = p253u3.C8149n.f17874c
                int r0 = p253u3.C8152q.f17883d
                java.lang.String r0 = "Google Play Services SDK not found for app set id!"
                r14.mo20767c(r1, r0)
            L_0x024e:
                java.lang.String r14 = r13.f17899m
                r13.f17899m = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p253u3.C8152q.C8153a.<init>(u3.q):void");
        }
    }

    public C8152q(Context context, boolean z) {
        this.f17885b = context;
        this.f17884a = z;
    }

    /* renamed from: a */
    public final C8153a mo20787a() {
        if (this.f17886c == null) {
            this.f17886c = new C8153a();
        }
        return this.f17886c;
    }

    /* renamed from: b */
    public final Geocoder mo20788b() {
        return new Geocoder(this.f17885b, Locale.ENGLISH);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0043 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location mo20789c() {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to get most recent location"
            java.lang.String r1 = "u3.q"
            boolean r2 = r7.f17884a
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            android.content.Context r2 = r7.f17885b
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = p253u3.C8156t.m16410a(r2, r4)
            r5 = 1
            if (r4 != 0) goto L_0x0020
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = p253u3.C8156t.m16410a(r2, r4)
            if (r2 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = r5
        L_0x0021:
            if (r2 != 0) goto L_0x0024
            return r3
        L_0x0024:
            android.content.Context r2 = r7.f17885b
            java.lang.String r4 = "location"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            if (r2 != 0) goto L_0x0031
            return r3
        L_0x0031:
            java.util.List r4 = r2.getProviders(r5)     // Catch:{ Exception | SecurityException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r4 = r3
        L_0x0037:
            if (r4 != 0) goto L_0x003a
            return r3
        L_0x003a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0043:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0066
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            android.location.Location r6 = r2.getLastKnownLocation(r6)     // Catch:{ SecurityException -> 0x005a, Exception -> 0x0054 }
            goto L_0x0060
        L_0x0054:
            u3.n r6 = p253u3.C8149n.f17874c
            r6.mo20767c(r1, r0)
            goto L_0x005f
        L_0x005a:
            u3.n r6 = p253u3.C8149n.f17874c
            r6.mo20767c(r1, r0)
        L_0x005f:
            r6 = r3
        L_0x0060:
            if (r6 == 0) goto L_0x0043
            r5.add(r6)
            goto L_0x0043
        L_0x0066:
            r0 = -1
            java.util.Iterator r2 = r5.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r2.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x006c
            long r0 = r4.getTime()
            r3 = r4
            goto L_0x006c
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8152q.mo20789c():android.location.Location");
    }
}
