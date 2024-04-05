package p365hg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.etsy.android.lib.network.oauth2.signin.C8779h;
import com.facebook.AccessToken;
import com.facebook.C12243b;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: hg.i0 */
public final class C12869i0 {

    /* renamed from: a */
    public static int f28368a;

    /* renamed from: b */
    public static long f28369b = -1;

    /* renamed from: c */
    public static long f28370c = -1;

    /* renamed from: d */
    public static long f28371d = -1;

    /* renamed from: e */
    public static String f28372e = "";

    /* renamed from: f */
    public static String f28373f = "";

    /* renamed from: g */
    public static String f28374g = "NoCarrier";

    /* renamed from: h */
    public static final C12869i0 f28375h = new C12869i0();

    /* renamed from: hg.i0$a */
    public interface C12870a {
        /* renamed from: a */
        void mo39272a(JSONObject jSONObject);

        /* renamed from: b */
        void mo39273b(FacebookException facebookException);
    }

    /* renamed from: hg.i0$b */
    public static final class C12871b {

        /* renamed from: a */
        public List<String> f28376a;

        /* renamed from: b */
        public List<String> f28377b;

        /* renamed from: c */
        public List<String> f28378c;

        public C12871b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f28376a = arrayList;
            this.f28377b = arrayList2;
            this.f28378c = arrayList3;
        }
    }

    /* renamed from: A */
    public static boolean m20545A(Context context) {
        Method s = m20580s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (s == null) {
            return false;
        }
        Object w = m20584w((Object) null, s, context);
        return (w instanceof Integer) && !(C19383o.m32792b(w, 0) ^ true);
    }

    /* renamed from: B */
    public static final boolean m20546B(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static final boolean m20547C(Uri uri) {
        return uri != null && (C19457k.m33019W0("http", uri.getScheme(), true) || C19457k.m33019W0("https", uri.getScheme(), true) || C19457k.m33019W0("fbstaging", uri.getScheme(), true));
    }

    /* renamed from: D */
    public static final ArrayList m20548D(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: E */
    public static final HashMap m20549E(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C19383o.m32796f(next, "key");
                String string = jSONObject.getString(next);
                C19383o.m32796f(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: F */
    public static final void m20550F(String str, Exception exc) {
        if (C13418j.f29389i && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    /* renamed from: G */
    public static final void m20551G(String str, String str2) {
        if (C13418j.f29389i && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: H */
    public static final String m20552H(Map<String, String> map) {
        C19383o.m32797g(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), (String) next.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C19383o.m32796f(str, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        }
        return str;
    }

    /* renamed from: I */
    public static final String m20553I(String str) {
        C19383o.m32797g(str, "key");
        f28375h.getClass();
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
        return m20583v("MD5", bytes);
    }

    /* renamed from: J */
    public static final Bundle m20554J(String str) {
        Bundle bundle = new Bundle();
        if (!m20546B(str)) {
            if (str != null) {
                Object[] array = C19459m.m33056y1(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        Object[] array2 = C19459m.m33056y1(strArr[i], new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException e) {
                                m20550F("FacebookSDK", e);
                            }
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    /* renamed from: K */
    public static final void m20555K(Bundle bundle, JSONArray jSONArray) {
        C19383o.m32797g(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean(ResponseConstants.MEDIA, ((Boolean) jSONArray).booleanValue());
        } else if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray(ResponseConstants.MEDIA, (boolean[]) jSONArray);
        } else if (jSONArray instanceof Double) {
            bundle.putDouble(ResponseConstants.MEDIA, ((Number) jSONArray).doubleValue());
        } else if (jSONArray instanceof double[]) {
            bundle.putDoubleArray(ResponseConstants.MEDIA, (double[]) jSONArray);
        } else if (jSONArray instanceof Integer) {
            bundle.putInt(ResponseConstants.MEDIA, ((Number) jSONArray).intValue());
        } else if (jSONArray instanceof int[]) {
            bundle.putIntArray(ResponseConstants.MEDIA, (int[]) jSONArray);
        } else if (jSONArray instanceof Long) {
            bundle.putLong(ResponseConstants.MEDIA, ((Number) jSONArray).longValue());
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray(ResponseConstants.MEDIA, (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString(ResponseConstants.MEDIA, (String) jSONArray);
        } else {
            bundle.putString(ResponseConstants.MEDIA, jSONArray.toString());
        }
    }

    /* renamed from: L */
    public static final void m20556L(String str, Bundle bundle, String str2) {
        if (!m20546B(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: M */
    public static final String m20557M(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[RecyclerView.C3084b0.FLAG_MOVED];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            C19383o.m32796f(sb2, "stringBuilder.toString()");
                            m20566e(bufferedInputStream);
                            m20566e(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m20566e(bufferedInputStream);
                    m20566e(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m20566e(bufferedInputStream);
                m20566e(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m20566e(bufferedInputStream);
            m20566e(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: N */
    public static final HashMap m20558N(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|6|7|(4:10|11|12|(1:14)(2:15|16))|17|19|20|(1:22)|23|24|25|(1:27)|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b4 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00be A[Catch:{ Exception -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019a A[SYNTHETIC, Splitter:B:62:0x019a] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20559O(android.content.Context r12, org.json.JSONObject r13) throws org.json.JSONException {
        /*
            java.lang.String r0 = "mounted"
            java.lang.String r1 = "appContext"
            kotlin.jvm.internal.C19383o.m32797g(r12, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "a2"
            r1.put(r2)
            hg.i0 r2 = f28375h
            r2.getClass()
            java.lang.String r2 = "path"
            long r3 = f28369b
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L_0x0030
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = f28369b
            long r5 = r5 - r7
            r3 = 1800000(0x1b7740, float:2.522337E-39)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x00e5
        L_0x0030:
            long r5 = java.lang.System.currentTimeMillis()
            f28369b = r5
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError | Exception -> 0x0059 }
            java.util.Date r5 = new java.util.Date     // Catch:{ AssertionError | Exception -> 0x0059 }
            r5.<init>()     // Catch:{ AssertionError | Exception -> 0x0059 }
            boolean r5 = r3.inDaylightTime(r5)     // Catch:{ AssertionError | Exception -> 0x0059 }
            java.lang.String r5 = r3.getDisplayName(r5, r4)     // Catch:{ AssertionError | Exception -> 0x0059 }
            java.lang.String r6 = "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)     // Catch:{ AssertionError | Exception -> 0x0059 }
            f28372e = r5     // Catch:{ AssertionError | Exception -> 0x0059 }
            java.lang.String r3 = r3.getID()     // Catch:{ AssertionError | Exception -> 0x0059 }
            java.lang.String r5 = "tz.id"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)     // Catch:{ AssertionError | Exception -> 0x0059 }
            f28373f = r3     // Catch:{ AssertionError | Exception -> 0x0059 }
        L_0x0059:
            java.lang.String r3 = f28374g
            java.lang.String r5 = "NoCarrier"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r5)
            if (r3 == 0) goto L_0x0081
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r12.getSystemService(r3)     // Catch:{ Exception -> 0x0081 }
            if (r3 == 0) goto L_0x0079
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x0081 }
            java.lang.String r3 = r3.getNetworkOperatorName()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r5 = "telephonyManager.networkOperatorName"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)     // Catch:{ Exception -> 0x0081 }
            f28374g = r3     // Catch:{ Exception -> 0x0081 }
            goto L_0x0081
        L_0x0079:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0081 }
            java.lang.String r5 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r3.<init>(r5)     // Catch:{ Exception -> 0x0081 }
            throw r3     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            r5 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            java.lang.String r3 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x00b4 }
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)     // Catch:{ Exception -> 0x00b4 }
            if (r3 == 0) goto L_0x00aa
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00b4 }
            android.os.StatFs r7 = new android.os.StatFs     // Catch:{ Exception -> 0x00b4 }
            kotlin.jvm.internal.C19383o.m32796f(r3, r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x00b4 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x00b4 }
            int r3 = r7.getBlockCount()     // Catch:{ Exception -> 0x00b4 }
            long r8 = (long) r3     // Catch:{ Exception -> 0x00b4 }
            int r3 = r7.getBlockSize()     // Catch:{ Exception -> 0x00b4 }
            long r10 = (long) r3     // Catch:{ Exception -> 0x00b4 }
            long r8 = r8 * r10
            f28370c = r8     // Catch:{ Exception -> 0x00b4 }
        L_0x00aa:
            long r7 = f28370c     // Catch:{ Exception -> 0x00b4 }
            double r7 = (double) r7     // Catch:{ Exception -> 0x00b4 }
            double r7 = r7 / r5
            long r7 = java.lang.Math.round(r7)     // Catch:{ Exception -> 0x00b4 }
            f28370c = r7     // Catch:{ Exception -> 0x00b4 }
        L_0x00b4:
            java.lang.String r3 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x00e5 }
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)     // Catch:{ Exception -> 0x00e5 }
            if (r0 == 0) goto L_0x00db
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00e5 }
            android.os.StatFs r3 = new android.os.StatFs     // Catch:{ Exception -> 0x00e5 }
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x00e5 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00e5 }
            int r0 = r3.getAvailableBlocks()     // Catch:{ Exception -> 0x00e5 }
            long r7 = (long) r0     // Catch:{ Exception -> 0x00e5 }
            int r0 = r3.getBlockSize()     // Catch:{ Exception -> 0x00e5 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x00e5 }
            long r7 = r7 * r2
            f28371d = r7     // Catch:{ Exception -> 0x00e5 }
        L_0x00db:
            long r2 = f28371d     // Catch:{ Exception -> 0x00e5 }
            double r2 = (double) r2     // Catch:{ Exception -> 0x00e5 }
            double r2 = r2 / r5
            long r2 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x00e5 }
            f28371d = r2     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            java.lang.String r0 = r12.getPackageName()
            r2 = -1
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fa }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x00fa }
            if (r3 == 0) goto L_0x00f9
            int r2 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x00fa }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x00fa }
            goto L_0x00fc
        L_0x00f9:
            return
        L_0x00fa:
            java.lang.String r3 = ""
        L_0x00fc:
            r1.put(r0)
            r1.put(r2)
            r1.put(r3)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1.put(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.put(r0)
            android.content.res.Resources r0 = r12.getResources()     // Catch:{ Exception -> 0x011f }
            java.lang.String r2 = "appContext.resources"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)     // Catch:{ Exception -> 0x011f }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x011f }
            java.util.Locale r0 = r0.locale     // Catch:{ Exception -> 0x011f }
            goto L_0x0123
        L_0x011f:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L_0x0123:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "locale"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            java.lang.String r3 = r0.getLanguage()
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            java.lang.String r0 = r0.getCountry()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.put(r0)
            java.lang.String r0 = f28372e
            r1.put(r0)
            java.lang.String r0 = f28374g
            r1.put(r0)
            r2 = 0
            java.lang.String r0 = "display"
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch:{ Exception -> 0x017b }
            boolean r0 = r12 instanceof android.hardware.display.DisplayManager     // Catch:{ Exception -> 0x017b }
            r5 = 0
            if (r0 != 0) goto L_0x015f
            r12 = r5
        L_0x015f:
            android.hardware.display.DisplayManager r12 = (android.hardware.display.DisplayManager) r12     // Catch:{ Exception -> 0x017b }
            if (r12 == 0) goto L_0x0167
            android.view.Display r5 = r12.getDisplay(r4)     // Catch:{ Exception -> 0x017b }
        L_0x0167:
            if (r5 == 0) goto L_0x017b
            android.util.DisplayMetrics r12 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x017b }
            r12.<init>()     // Catch:{ Exception -> 0x017b }
            r5.getMetrics(r12)     // Catch:{ Exception -> 0x017b }
            int r0 = r12.widthPixels     // Catch:{ Exception -> 0x017b }
            int r4 = r12.heightPixels     // Catch:{ Exception -> 0x0178 }
            float r12 = r12.density     // Catch:{ Exception -> 0x0178 }
            double r2 = (double) r12
        L_0x0178:
            r12 = r4
            r4 = r0
            goto L_0x017c
        L_0x017b:
            r12 = r4
        L_0x017c:
            r1.put(r4)
            r1.put(r12)
            java.text.DecimalFormat r12 = new java.text.DecimalFormat
            java.lang.String r0 = "#.##"
            r12.<init>(r0)
            java.lang.String r12 = r12.format(r2)
            r1.put(r12)
            hg.i0 r12 = f28375h
            r12.getClass()
            int r12 = f28368a
            if (r12 <= 0) goto L_0x019a
            goto L_0x01c1
        L_0x019a:
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x01ac }
            java.lang.String r0 = "/sys/devices/system/cpu/"
            r12.<init>(r0)     // Catch:{ Exception -> 0x01ac }
            hg.k0 r0 = p365hg.C12875k0.f28384a     // Catch:{ Exception -> 0x01ac }
            java.io.File[] r12 = r12.listFiles(r0)     // Catch:{ Exception -> 0x01ac }
            if (r12 == 0) goto L_0x01ac
            int r12 = r12.length     // Catch:{ Exception -> 0x01ac }
            f28368a = r12     // Catch:{ Exception -> 0x01ac }
        L_0x01ac:
            int r12 = f28368a
            if (r12 > 0) goto L_0x01bf
            java.lang.Runtime r12 = java.lang.Runtime.getRuntime()
            int r12 = r12.availableProcessors()
            r0 = 1
            int r12 = java.lang.Math.max(r12, r0)
            f28368a = r12
        L_0x01bf:
            int r12 = f28368a
        L_0x01c1:
            r1.put(r12)
            long r2 = f28370c
            r1.put(r2)
            long r2 = f28371d
            r1.put(r2)
            java.lang.String r12 = f28373f
            r1.put(r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r0 = "extinfo"
            r13.put(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12869i0.m20559O(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: P */
    public static final String m20560P(String str) {
        if (str == null) {
            return null;
        }
        f28375h.getClass();
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
        return m20583v("SHA-256", bytes);
    }

    /* renamed from: Q */
    public static final void m20561Q(Parcel parcel, Map<String, String> map) {
        C19383o.m32797g(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* renamed from: a */
    public static final <T> boolean m20562a(T t, T t2) {
        return t == null ? t2 == null : C19383o.m32792b(t, t2);
    }

    /* renamed from: b */
    public static final Uri m20563b(String str, Bundle bundle, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    builder.appendQueryParameter(next, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C19383o.m32796f(build, "builder.build()");
        return build;
    }

    /* renamed from: c */
    public static void m20564c(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            Object[] array = C19459m.m33056y1(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    Object[] array2 = C19459m.m33056y1(strArr[i], new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr2 = (String[]) array2;
                        if (strArr2.length > 0) {
                            StringBuilder sb = new StringBuilder();
                            String str2 = strArr2[0];
                            int length2 = str2.length() - 1;
                            int i2 = 0;
                            boolean z = false;
                            while (i2 <= length2) {
                                boolean z2 = C19383o.m32799i(str2.charAt(!z ? i2 : length2), 32) <= 0;
                                if (!z) {
                                    if (!z2) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                } else if (!z2) {
                                    break;
                                } else {
                                    length2--;
                                }
                            }
                            sb.append(str2.subSequence(i2, length2 + 1).toString());
                            sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                            instance.setCookie(str, sb.toString());
                        }
                        i++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                instance.removeExpiredCookie();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: d */
    public static final void m20565d(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        f28375h.getClass();
        m20564c(context, "facebook.com");
        m20564c(context, ".facebook.com");
        m20564c(context, "https://facebook.com");
        m20564c(context, "https://.facebook.com");
    }

    /* renamed from: e */
    public static final void m20566e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    public static final String m20567f(String str, String str2) {
        return m20546B(str) ? str2 : str;
    }

    /* renamed from: g */
    public static final ArrayList m20568g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                C19383o.m32796f(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: h */
    public static final HashMap m20569h(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names != null) {
            int length = names.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = names.getString(i);
                    C19383o.m32796f(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = m20569h((JSONObject) obj);
                    }
                    C19383o.m32796f(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    public static final HashMap m20570i(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                C19383o.m32796f(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m20571j(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            java.lang.String r0 = "outputStream"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0029 }
            r1.<init>(r6)     // Catch:{ all -> 0x0029 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0026 }
            r2 = 0
            r3 = r2
        L_0x0011:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0026 }
            r5 = -1
            if (r4 == r5) goto L_0x001d
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0026 }
            int r3 = r3 + r4
            goto L_0x0011
        L_0x001d:
            r1.close()
            if (r6 == 0) goto L_0x0025
            r6.close()
        L_0x0025:
            return r3
        L_0x0026:
            r7 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()
        L_0x002f:
            if (r6 == 0) goto L_0x0034
            r6.close()
        L_0x0034:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12869i0.m20571j(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: k */
    public static final void m20572k(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: l */
    public static final String m20573l(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* renamed from: m */
    public static final String m20574m(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            String str = C13418j.f29381a;
            C12879l0.m20603g();
            String str2 = C13418j.f29385e;
            if (str2 != null) {
                return str2;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            C19383o.m32796f(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: n */
    public static final Date m20575n(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((j * 1000) + date.getTime());
    }

    /* renamed from: o */
    public static final JSONObject m20576o() {
        Class<C12869i0> cls = C12869i0.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            String string = C13418j.m21106b().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: p */
    public static GraphRequest m20577p(String str) {
        Bundle bundle = new Bundle();
        AccessToken.Companion.getClass();
        AccessToken d = AccessToken.C12174c.m19981d();
        bundle.putString("fields", C19383o.m32792b((d == null || d.getGraphDomain() == null) ? "facebook" : d.getGraphDomain(), ShopRelatedLink.INSTAGRAM_TITLE) ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString(AccessToken.ACCESS_TOKEN_KEY, str);
        GraphRequest.f27224o.getClass();
        GraphRequest graphRequest = new GraphRequest((AccessToken) null, "me", (Bundle) null, (HttpMethod) null, new C12243b((C8779h.C8780a) null), 32);
        graphRequest.f27228d = bundle;
        graphRequest.f27232h = HttpMethod.GET;
        return graphRequest;
    }

    /* renamed from: q */
    public static final void m20578q(C12870a aVar, String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = C12863f0.f28358a;
        JSONObject jSONObject = C12863f0.f28358a.get(str);
        if (jSONObject != null) {
            aVar.mo39272a(jSONObject);
            return;
        }
        C12873j0 j0Var = new C12873j0(aVar, str);
        f28375h.getClass();
        GraphRequest p = m20577p(str);
        p.mo39232j(j0Var);
        p.mo39227d();
    }

    /* renamed from: r */
    public static final Method m20579r(Class<?> cls, String str, Class<?>... clsArr) {
        C19383o.m32797g(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static final Method m20580s(String str, String str2, Class<?>... clsArr) {
        try {
            return m20579r(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static final Object m20581t(String str, String str2, JSONObject jSONObject) throws JSONException {
        C19383o.m32797g(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: u */
    public static final C12871b m20582u(JSONObject jSONObject) throws JSONException {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || C19383o.m32792b(optString2, "installed") || (optString = optJSONObject.optString(ResponseConstants.STATUS)) == null)) {
                if (C19383o.m32792b(optString, "granted")) {
                    arrayList.add(optString2);
                } else if (C19383o.m32792b(optString, "declined")) {
                    arrayList2.add(optString2);
                } else if (C19383o.m32792b(optString, Listing.EXPIRED_STATE)) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new C12871b(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: v */
    public static String m20583v(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            C19383o.m32796f(instance, "hash");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString((b >> 0) & 15));
            }
            String sb2 = sb.toString();
            C19383o.m32796f(sb2, "builder.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: w */
    public static final Object m20584w(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static final boolean m20585x() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C13418j.m21107c()}, 1));
            C19383o.m32796f(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context b = C13418j.m21106b();
            PackageManager packageManager = b.getPackageManager();
            String packageName = b.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (C19383o.m32792b(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: y */
    public static final boolean m20586y(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            C19383o.m32796f(str, "Build.DEVICE");
            if (new Regex(".+_cheets|cheets_.+").matches(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public static final boolean m20587z() {
        Class<C12869i0> cls = C12869i0.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            JSONObject o = m20576o();
            if (o != null) {
                try {
                    JSONArray jSONArray = o.getJSONArray("data_processing_options");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        C19383o.m32796f(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (C19383o.m32792b(lowerCase, "ldu")) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }
}
