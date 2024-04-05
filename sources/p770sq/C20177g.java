package p770sq;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.p013v4.media.C0072d;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Base64;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.logging.type.LogSeverity;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0015b;
import p773uq.C20205a;
import p774vq.C20215j;

/* renamed from: sq.g */
public final class C20177g extends C20172e {

    /* renamed from: A */
    public String f44708A;

    /* renamed from: B */
    public String f44709B;

    /* renamed from: C */
    public String f44710C;

    /* renamed from: D */
    public String f44711D;

    /* renamed from: E */
    public String f44712E;

    /* renamed from: F */
    public String f44713F;

    /* renamed from: G */
    public String f44714G;

    /* renamed from: H */
    public ArrayList f44715H;

    /* renamed from: I */
    public ArrayList f44716I;

    /* renamed from: J */
    public ArrayList f44717J;

    /* renamed from: K */
    public long f44718K = -1;

    /* renamed from: L */
    public long f44719L = -1;

    /* renamed from: M */
    public boolean f44720M;

    /* renamed from: N */
    public boolean f44721N;

    /* renamed from: O */
    public boolean f44722O;

    /* renamed from: P */
    public boolean f44723P;

    /* renamed from: Q */
    public boolean f44724Q;

    /* renamed from: R */
    public boolean f44725R;

    /* renamed from: S */
    public boolean f44726S;

    /* renamed from: T */
    public boolean f44727T;

    /* renamed from: U */
    public boolean f44728U;

    /* renamed from: V */
    public HashMap f44729V;

    /* renamed from: W */
    public NetworkInfo f44730W;

    /* renamed from: X */
    public WifiInfo f44731X;

    /* renamed from: Y */
    public GsmCellLocation f44732Y;

    /* renamed from: Z */
    public CdmaCellLocation f44733Z;

    /* renamed from: a0 */
    public TelephonyManager f44734a0;

    /* renamed from: b0 */
    public WifiManager f44735b0;

    /* renamed from: c */
    public int f44736c = -1;

    /* renamed from: c0 */
    public ConnectivityManager f44737c0;

    /* renamed from: d */
    public int f44738d = -1;

    /* renamed from: d0 */
    public BatteryManager f44739d0;

    /* renamed from: e */
    public int f44740e = -1;

    /* renamed from: e0 */
    public LocationManager f44741e0;

    /* renamed from: f */
    public int f44742f = -1;

    /* renamed from: f0 */
    public PowerManager f44743f0;

    /* renamed from: g */
    public int f44744g = -1;

    /* renamed from: g0 */
    public PackageManager f44745g0;

    /* renamed from: h */
    public int f44746h = -1;

    /* renamed from: h0 */
    public Location f44747h0;

    /* renamed from: i */
    public String f44748i;

    /* renamed from: i0 */
    public JSONObject f44749i0;

    /* renamed from: j */
    public String f44750j;

    /* renamed from: j0 */
    public JSONObject f44751j0;

    /* renamed from: k */
    public String f44752k;

    /* renamed from: k0 */
    public JSONObject f44753k0;

    /* renamed from: l */
    public String f44754l;

    /* renamed from: l0 */
    public JSONObject f44755l0;

    /* renamed from: m */
    public String f44756m;

    /* renamed from: m0 */
    public JSONObject f44757m0;

    /* renamed from: n */
    public String f44758n;

    /* renamed from: n0 */
    public C20215j f44759n0;

    /* renamed from: o */
    public String f44760o;

    /* renamed from: p */
    public String f44761p;

    /* renamed from: q */
    public String f44762q;

    /* renamed from: r */
    public String f44763r;

    /* renamed from: s */
    public String f44764s;

    /* renamed from: t */
    public String f44765t;

    /* renamed from: u */
    public String f44766u;

    /* renamed from: v */
    public String f44767v;

    /* renamed from: w */
    public String f44768w;

    /* renamed from: x */
    public String f44769x;

    /* renamed from: y */
    public String f44770y;

    /* renamed from: z */
    public String f44771z;

    @SuppressLint({"MissingPermission"})
    /* renamed from: f */
    public static Location m34498f(LocationManager locationManager) {
        Location location = null;
        if (locationManager == null) {
            return null;
        }
        try {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
        }
        return location;
    }

    /* renamed from: g */
    public static String m34499g(long j, String str, String str2, String str3) throws Exception {
        String str4;
        String str5;
        StringBuilder sb;
        if (!C20171d.m34480d(str) || !C20171d.m34480d(str2) || !C20171d.m34480d(Long.valueOf(j))) {
            if (C20171d.m34480d(str)) {
                str = "";
            }
            if (C20171d.m34480d(str2)) {
                str2 = "";
            }
            if (C20171d.m34480d(Long.valueOf(j))) {
                sb = C0072d.m201h(str);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(j);
                sb = sb2;
            }
            sb.append(str2);
            str4 = sb.toString();
        } else {
            str4 = "invalid_input";
        }
        String str6 = new String(Base64.decode("SG1hY1NIQTI1Ng==", 2), "UTF-8");
        if (C20171d.m34480d(Long.valueOf(j))) {
            str5 = new String(Base64.decode(str3, 2), "UTF-8");
        } else {
            str5 = new String(Base64.decode(str3, 2), "UTF-8") + j;
        }
        Mac instance = Mac.getInstance(str6);
        instance.init(new SecretKeySpec(str5.getBytes(), str6));
        byte[] doFinal = instance.doFinal(str4.getBytes());
        StringBuilder sb3 = new StringBuilder();
        for (byte b : doFinal) {
            sb3.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb3.toString().substring(0, 32);
    }

    /* renamed from: h */
    public static String m34500h(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            str = "invalid input in dc method";
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(str.getBytes());
        byte[] digest = instance.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: i */
    public static ArrayList m34501i(WifiManager wifiManager) {
        int i;
        if (wifiManager == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (!(scanResults == null || scanResults.size() == 0)) {
            int i2 = Integer.MIN_VALUE;
            String bssid = wifiManager.getConnectionInfo().getBSSID();
            if (bssid != null && !bssid.equals("00:00:00:00:00:00")) {
                int i3 = -1;
                for (int i4 = 0; i4 < scanResults.size(); i4++) {
                    if (!bssid.equals(scanResults.get(i4).BSSID) && i2 < (i = scanResults.get(i4).level)) {
                        i3 = i4;
                        i2 = i;
                    }
                }
                arrayList.add(bssid);
                if (i3 != -1) {
                    arrayList.add(scanResults.get(i3).BSSID);
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static ArrayList m34502j(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!(nextElement instanceof Inet6Address) || z) {
                            arrayList.add(hostAddress);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: k */
    public static JSONObject m34503k(Context context, BatteryManager batteryManager, PowerManager powerManager) {
        int i;
        int i2;
        int i3;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        JSONObject jSONObject = new JSONObject();
        double d = 12345.0d;
        int i4 = 12345;
        if (registerReceiver != null) {
            double intExtra = (double) registerReceiver.getIntExtra("level", 12345);
            int intExtra2 = registerReceiver.getIntExtra(ResponseConstants.SCALE, 12345);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 12345);
            i3 = registerReceiver.getIntExtra("voltage", 12345);
            i2 = registerReceiver.getIntExtra(ResponseConstants.STATUS, 12345);
            i = registerReceiver.getIntExtra("plugged", 12345);
            if (!(intExtra == 12345.0d || intExtra2 == 12345)) {
                intExtra /= (double) intExtra2;
            }
            d = intExtra;
            i4 = intExtra3;
        } else {
            i = 12345;
            i3 = 12345;
            i2 = 12345;
        }
        int intProperty = batteryManager.getIntProperty(2);
        boolean isPowerSaveMode = powerManager.isPowerSaveMode();
        try {
            jSONObject.put("current", C20172e.m34482b(Integer.valueOf(intProperty)));
            jSONObject.put("powerSaveMode", C20172e.m34482b(Integer.valueOf(isPowerSaveMode ? 1 : 0)));
            jSONObject.put("temp", C20172e.m34482b(Integer.valueOf(i4)));
            jSONObject.put("voltage", C20172e.m34482b(Integer.valueOf(i3)));
            jSONObject.put("state", C20172e.m34482b(Integer.valueOf(i2)));
            jSONObject.put(ResponseConstants.METHOD, C20172e.m34482b(Integer.valueOf(i)));
            jSONObject.put("level", new DecimalFormat(".##").format(C20172e.m34482b(Double.valueOf(d))));
        } catch (JSONException e) {
            C20205a.m34555b(e, C20177g.class);
        }
        return jSONObject;
    }

    /* renamed from: l */
    public static JSONObject m34504l(Location location) {
        if (location == null) {
            return null;
        }
        try {
            return new JSONObject("{\"lat\":" + location.getLatitude() + ",\"lng\":" + location.getLongitude() + ",\"acc\":" + location.getAccuracy() + ",\"timestamp\":" + location.getTime() + "}");
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
            return null;
        }
    }

    /* renamed from: o */
    public static String m34505o(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getSimOperatorName();
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
            return null;
        }
    }

    /* renamed from: p */
    public static JSONObject m34506p(Context context) {
        boolean z;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        JSONObject jSONObject = new JSONObject();
        boolean z2 = false;
        if (sensorManager != null) {
            try {
                if (sensorManager.getDefaultSensor(1) != null) {
                    z = true;
                    jSONObject.put(Constants.APPBOY_PUSH_ACCENT_KEY, z);
                    if (!(sensorManager == null || sensorManager.getDefaultSensor(4) == null)) {
                        z2 = true;
                    }
                    jSONObject.put("gy", z2);
                    return jSONObject;
                }
            } catch (JSONException e) {
                C20205a.m34555b(e, C20177g.class);
            }
        }
        z = false;
        jSONObject.put(Constants.APPBOY_PUSH_ACCENT_KEY, z);
        z2 = true;
        jSONObject.put("gy", z2);
        return jSONObject;
    }

    /* renamed from: q */
    public static String m34507q() {
        String property;
        String property2 = System.getProperty("http.proxyHost");
        if (property2 == null || (property = System.getProperty("http.proxyPort")) == null) {
            return null;
        }
        return C0015b.m90i("host=", property2, ",port=", property);
    }

    /* renamed from: r */
    public static JSONObject m34508r(Context context) {
        int i;
        Class<C20177g> cls = C20177g.class;
        JSONObject jSONObject = new JSONObject();
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            C20205a.m34555b(e, cls);
            i = -403;
        }
        try {
            jSONObject.put(ResponseConstants.BRIGHTNESS, C20172e.m34482b(Integer.valueOf(i)));
        } catch (JSONException e2) {
            C20205a.m34555b(e2, cls);
        }
        return jSONObject;
    }

    /* renamed from: s */
    public static String m34509s() {
        try {
            Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp()) {
                    if (networkInterface.getInterfaceAddresses().size() != 0) {
                        String name = networkInterface.getName();
                        if (name.startsWith("ppp") || name.startsWith("tun") || name.startsWith("tap")) {
                            return name;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
            return null;
        }
    }

    /* renamed from: v */
    public static void m34510v(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerCT", 0);
        int i = sharedPreferences.getInt("RiskManagerCT", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i2 = 1;
        if (i > 0 && i < Integer.MAX_VALUE) {
            i2 = 1 + i;
        }
        edit.putInt("RiskManagerCT", i2);
        edit.apply();
    }

    /* renamed from: x */
    public static JSONObject m34511x(Context context) {
        long j;
        JSONObject jSONObject = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j2 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long j3 = 12345;
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j3 = memoryInfo.availMem;
            j = memoryInfo.totalMem;
        } else {
            j = 12345;
        }
        try {
            jSONObject.put("free", C20172e.m34482b(Long.valueOf(j3)));
            jSONObject.put(ResponseConstants.TOTAL, C20172e.m34482b(Long.valueOf(j)));
            jSONObject.put("max_runtime", C20172e.m34482b(Long.valueOf(maxMemory)));
            jSONObject.put("total_runtime", C20172e.m34482b(Long.valueOf(j2)));
            jSONObject.put("free_runtime", C20172e.m34482b(Long.valueOf(freeMemory)));
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
        }
        return jSONObject;
    }

    /* renamed from: y */
    public static JSONObject m34512y() {
        JSONObject jSONObject = new JSONObject();
        boolean z = Environment.isExternalStorageRemovable() && "mounted".equals(Environment.getExternalStorageState());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        long a = C20172e.m34481a(LogSeverity.CRITICAL_VALUE);
        try {
            jSONObject.put("mounted", z);
            jSONObject.put("free_ud", C20172e.m34482b(Long.valueOf(blockSize)));
            jSONObject.put("free_sd", C20172e.m34482b(Long.valueOf(a)));
        } catch (Exception e) {
            C20205a.m34555b(e, C20177g.class);
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.location.Location} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03e0, code lost:
        p773uq.C20205a.m34555b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        r7 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087 A[Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }, ExcHandler: AssertionError (e java.lang.AssertionError), Splitter:B:1:0x0002] */
    @android.annotation.SuppressLint({"MissingPermission,HardwareIds"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74422m(int r7, p770sq.C20169c r8) {
        /*
            r6 = this;
            java.lang.Class<sq.g> r0 = p770sq.C20177g.class
            android.content.Context r8 = r8.f44673b     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r1 = 4
            r2 = -1
            if (r7 == r1) goto L_0x03cc
            r1 = 5
            r3 = 0
            if (r7 == r1) goto L_0x03b8
            r1 = 6
            if (r7 == r1) goto L_0x03a4
            r1 = 42
            r4 = 1
            if (r7 == r1) goto L_0x0395
            r1 = 43
            if (r7 == r1) goto L_0x0381
            r1 = 45
            if (r7 == r1) goto L_0x036d
            r1 = 46
            r5 = 29
            if (r7 == r1) goto L_0x034d
            r1 = 48
            if (r7 == r1) goto L_0x0338
            r1 = 49
            if (r7 == r1) goto L_0x0318
            r1 = 71
            if (r7 == r1) goto L_0x0308
            r1 = 72
            if (r7 == r1) goto L_0x02f8
            r1 = 84
            if (r7 == r1) goto L_0x02e2
            r1 = 85
            if (r7 == r1) goto L_0x02ce
            switch(r7) {
                case 11: goto L_0x01d6;
                case 13: goto L_0x019e;
                case 16: goto L_0x018e;
                case 21: goto L_0x017e;
                case 23: goto L_0x0130;
                case 25: goto L_0x0120;
                case 27: goto L_0x010c;
                case 28: goto L_0x00f8;
                case 29: goto L_0x00e2;
                case 30: goto L_0x00cd;
                case 53: goto L_0x00aa;
                case 68: goto L_0x008a;
                case 75: goto L_0x0074;
                case 87: goto L_0x006c;
                case 89: goto L_0x0058;
                case 98: goto L_0x0048;
                default: goto L_0x003d;
            }     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x003d:
            switch(r7) {
                case 56: goto L_0x0215;
                case 57: goto L_0x0200;
                case 58: goto L_0x01eb;
                default: goto L_0x0040;
            }     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0040:
            switch(r7) {
                case 79: goto L_0x0285;
                case 80: goto L_0x0268;
                case 81: goto L_0x024d;
                case 82: goto L_0x022a;
                default: goto L_0x0043;
            }     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0043:
            switch(r7) {
                case 91: goto L_0x02be;
                case 92: goto L_0x02ae;
                case 93: goto L_0x029e;
                default: goto L_0x0046;
            }     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0046:
            goto L_0x03e3
        L_0x0048:
            vq.j r1 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r1.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            org.json.JSONObject r7 = m34506p(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44757m0 = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0058:
            vq.j r1 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r1.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.os.BatteryManager r7 = r6.f44739d0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            android.os.PowerManager r1 = r6.f44743f0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            org.json.JSONObject r7 = m34503k(r8, r7, r1)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44749i0 = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x006c:
            java.lang.String r7 = r6.mo74426w()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44713F = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0074:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.ArrayList r7 = m34502j(r4)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44715H = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0084:
            r7 = move-exception
            goto L_0x03e0
        L_0x0087:
            r7 = move-exception
            goto L_0x03e0
        L_0x008a:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            boolean r7 = r6.f44724Q     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 < r5) goto L_0x00a2
            boolean r7 = r6.f44722O     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
        L_0x00a2:
            java.lang.String r7 = android.os.Build.getSerial()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44754l = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x00aa:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.Date r1 = new java.util.Date     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r1.<init>()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r8 = r8.inDaylightTime(r1)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r7.getDisplayName(r8, r4, r1)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44765t = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x00cd:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.gsm.GsmCellLocation r7 = r6.f44732Y     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x00da
            goto L_0x00de
        L_0x00da:
            int r2 = r7.getLac()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x00de:
            r6.f44746h = r2     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x00e2:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            boolean r7 = r6.f44723P     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x00f4
            android.location.LocationManager r7 = r6.f44741e0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            android.location.Location r3 = m34498f(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x00f4:
            r6.f44747h0 = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x00f8:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r7.getLanguage()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44767v = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x010c:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r7.getCountry()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44766u = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0120:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.lang.String r7 = r6.mo74425u()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44711D = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0130:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r7.<init>()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 == 0) goto L_0x0172
            java.util.ArrayList r8 = r8.mo74464e()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
        L_0x0149:
            boolean r1 = r8.hasNext()     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            if (r1 == 0) goto L_0x0172
            java.lang.Object r1 = r8.next()     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            android.content.pm.PackageManager r2 = r6.f44745g0     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            r4.<init>()     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r1)     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            android.content.Intent r4 = r4.setComponent(r5)     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            boolean r2 = p770sq.C20171d.m34479c(r2, r4)     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            if (r2 == 0) goto L_0x0149
            r7.add(r1)     // Catch:{ Exception -> 0x016e, AssertionError -> 0x0087 }
            goto L_0x0149
        L_0x016e:
            r8 = move-exception
            p773uq.C20205a.m34555b(r8, r0)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0172:
            int r8 = r7.size()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 != 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r3 = r7
        L_0x017a:
            r6.f44716I = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x017e:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.lang.String r7 = r6.mo74423n()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44764s = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x018e:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44719L = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x019e:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            boolean r7 = r6.f44724Q     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 < r5) goto L_0x01b6
            boolean r8 = r6.f44722O     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 == 0) goto L_0x03e3
        L_0x01b6:
            int r7 = r7.getPhoneType()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != r4) goto L_0x01c3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r7.getImei()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x01d2
        L_0x01c3:
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            int r7 = r7.getPhoneType()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r8 = 2
            if (r7 != r8) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r7.getMeid()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x01d2:
            r6.f44763r = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x01d6:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.net.NetworkInfo r7 = r6.f44730W     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x01e3
            goto L_0x01e7
        L_0x01e3:
            java.lang.String r3 = r7.getTypeName()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x01e7:
            r6.f44762q = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x01eb:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.cdma.CdmaCellLocation r7 = r6.f44733Z     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x01f8
            goto L_0x01fc
        L_0x01f8:
            int r2 = r7.getSystemId()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x01fc:
            r6.f44742f = r2     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0200:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.cdma.CdmaCellLocation r7 = r6.f44733Z     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x020d
            goto L_0x0211
        L_0x020d:
            int r2 = r7.getNetworkId()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0211:
            r6.f44744g = r2     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0215:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x0222
            goto L_0x0226
        L_0x0222:
            java.lang.String r3 = r7.getNetworkOperator()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0226:
            r6.f44750j = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x022a:
            vq.j r1 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r1.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            sq.b r7 = p770sq.C20168b.m34473c()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            sq.c r7 = r7.f44667b     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            int r7 = r7.f44672a     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            lib.android.paypal.com.magnessdk.MagnesSource r1 = lib.android.paypal.com.magnessdk.MagnesSource.PAYPAL     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            int r1 = r1.getVersion()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != r1) goto L_0x03e3
            m34510v(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r6.mo74424t(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44760o = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x024d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r7.<init>()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r8 = r6.f44714G     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r7.append(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            long r1 = r6.f44718K     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r7.append(r1)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = r7.toString()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = m34500h(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44761p = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0268:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.Date r8 = new java.util.Date     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r8.<init>()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            long r1 = r8.getTime()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            int r7 = r7.getOffset(r1)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44740e = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0285:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.Date r8 = new java.util.Date     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r8.<init>()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r7.inDaylightTime(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44721N = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x029e:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            org.json.JSONObject r7 = m34512y()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44753k0 = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x02ae:
            vq.j r1 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r1.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            org.json.JSONObject r7 = m34511x(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44751j0 = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x02be:
            vq.j r1 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r1.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            org.json.JSONObject r7 = m34508r(r8)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44755l0 = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x02ce:
            java.lang.String r7 = r6.f44714G     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r8 = r6.f44752k     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            long r1 = r6.f44718K     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            vq.j r3 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r3 = r3.mo74465f()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.lang.String r7 = m34499g(r1, r7, r8, r3)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44710C = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x02e2:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            boolean r7 = r6.f44723P     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x02f4
            android.net.wifi.WifiManager r7 = r6.f44735b0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            java.util.ArrayList r3 = m34501i(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x02f4:
            r6.f44717J = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x02f8:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.lang.String r7 = m34507q()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44756m = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0308:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.lang.String r7 = m34509s()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44758n = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0318:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            boolean r7 = r6.f44724Q     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 < r5) goto L_0x0330
            boolean r8 = r6.f44722O     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 == 0) goto L_0x03e3
        L_0x0330:
            java.lang.String r7 = r7.getSubscriberId()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44708A = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0338:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.net.wifi.WifiInfo r7 = r6.f44731X     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x0345
            goto L_0x0349
        L_0x0345:
            java.lang.String r3 = r7.getSSID()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x0349:
            r6.f44771z = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x034d:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            boolean r7 = r6.f44724Q     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 < r5) goto L_0x0365
            boolean r8 = r6.f44722O     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r8 == 0) goto L_0x03e3
        L_0x0365:
            java.lang.String r7 = r7.getSimSerialNumber()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44770y = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x036d:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.TelephonyManager r7 = r6.f44734a0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x037a
            goto L_0x037e
        L_0x037a:
            java.lang.String r3 = m34505o(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x037e:
            r6.f44712E = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0381:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.ServiceState r7 = new android.telephony.ServiceState     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r7.<init>()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r7.getRoaming()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44720M = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x0395:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            java.lang.String r7 = p770sq.C20171d.m34477a(r4)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            r6.f44769x = r7     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x03a4:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.gsm.GsmCellLocation r7 = r6.f44732Y     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x03b1
            goto L_0x03b5
        L_0x03b1:
            int r2 = r7.getCid()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x03b5:
            r6.f44738d = r2     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x03b8:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.net.wifi.WifiInfo r7 = r6.f44731X     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x03c5
            goto L_0x03c9
        L_0x03c5:
            java.lang.String r3 = r7.getBSSID()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x03c9:
            r6.f44748i = r3     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x03cc:
            vq.j r8 = r6.f44759n0     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            boolean r7 = r8.mo74463c(r7)     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 == 0) goto L_0x03e3
            android.telephony.cdma.CdmaCellLocation r7 = r6.f44733Z     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            if (r7 != 0) goto L_0x03d9
            goto L_0x03dd
        L_0x03d9:
            int r2 = r7.getBaseStationId()     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
        L_0x03dd:
            r6.f44736c = r2     // Catch:{ AssertionError -> 0x0087, Exception -> 0x0084 }
            goto L_0x03e3
        L_0x03e0:
            p773uq.C20205a.m34555b(r7, r0)
        L_0x03e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p770sq.C20177g.mo74422m(int, sq.c):void");
    }

    /* renamed from: n */
    public final String mo74423n() {
        ArrayList j = m34502j(false);
        if (j == null) {
            return null;
        }
        return (String) j.get(0);
    }

    /* renamed from: t */
    public final String mo74424t(Context context) {
        int i = context.getSharedPreferences("RiskManagerCT", 0).getInt("RiskManagerCT", 0);
        return i + "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086, all -> 0x00be, all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo74425u() throws java.io.IOException {
        /*
            r15 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.Class<tq.a> r1 = p772tq.C20203a.class
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            r2.getClass()
            java.lang.String r3 = "mounted"
            boolean r3 = r2.equals(r3)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0022
            java.lang.String r3 = "mounted_ro"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001f
            r2 = r5
            goto L_0x0023
        L_0x001f:
            r3 = r4
            r2 = r5
            goto L_0x0024
        L_0x0022:
            r2 = r4
        L_0x0023:
            r3 = r2
        L_0x0024:
            android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = r7.getAbsolutePath()
            r6.append(r7)
            java.lang.String r7 = "/Android/data/com.ebay.lid/"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            java.lang.String r6 = "fb.bin"
            r8 = 0
            boolean r9 = r15.f44726S     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086 }
            if (r9 != 0) goto L_0x0050
            boolean r9 = r15.f44725R     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086 }
            if (r9 == 0) goto L_0x00c4
        L_0x0050:
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086 }
            if (r2 == 0) goto L_0x00c4
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0080 }
            r11.<init>(r7, r6)     // Catch:{ all -> 0x0080 }
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ all -> 0x0080 }
            r12.<init>(r11)     // Catch:{ all -> 0x0080 }
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x007e }
            r11.<init>()     // Catch:{ all -> 0x007e }
        L_0x0065:
            int r13 = r12.read(r10, r5, r9)     // Catch:{ all -> 0x007e }
            r14 = -1
            if (r13 == r14) goto L_0x0070
            r11.write(r10, r5, r13)     // Catch:{ all -> 0x007e }
            goto L_0x0065
        L_0x0070:
            byte[] r5 = r11.toByteArray()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x007e }
            r9.<init>(r5, r0)     // Catch:{ all -> 0x007e }
            p770sq.C20171d.m34478b(r1, r12)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086 }
            r8 = r9
            goto L_0x00c4
        L_0x007e:
            r5 = move-exception
            goto L_0x0082
        L_0x0080:
            r5 = move-exception
            r12 = r8
        L_0x0082:
            p770sq.C20171d.m34478b(r1, r12)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086 }
            throw r5     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            java.lang.Class<sq.g> r1 = p770sq.C20177g.class
            p773uq.C20205a.m34555b(r0, r1)
            goto L_0x00c4
        L_0x008d:
            boolean r5 = r15.f44726S
            if (r5 == 0) goto L_0x00c4
            java.lang.String r4 = p770sq.C20171d.m34477a(r4)
            byte[] r0 = r4.getBytes(r0)
            if (r3 == 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c3
            boolean r2 = r7.mkdirs()     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x00a9
            boolean r2 = r7.isDirectory()     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x00b7
        L_0x00a9:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00be }
            r2.<init>(r7, r6)     // Catch:{ all -> 0x00be }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00be }
            r3.<init>(r2)     // Catch:{ all -> 0x00be }
            r3.write(r0)     // Catch:{ all -> 0x00bb }
            r8 = r3
        L_0x00b7:
            p770sq.C20171d.m34478b(r1, r8)
            goto L_0x00c3
        L_0x00bb:
            r0 = move-exception
            r8 = r3
            goto L_0x00bf
        L_0x00be:
            r0 = move-exception
        L_0x00bf:
            p770sq.C20171d.m34478b(r1, r8)
            throw r0
        L_0x00c3:
            r8 = r4
        L_0x00c4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p770sq.C20177g.mo74425u():java.lang.String");
    }

    /* renamed from: w */
    public final String mo74426w() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44723P ? 1 : 0);
        sb.append(this.f44724Q ? 1 : 0);
        sb.append(this.f44727T ? 1 : 0);
        sb.append(this.f44728U ? 1 : 0);
        sb.append(this.f44725R ? 1 : 0);
        sb.append(this.f44726S ? 1 : 0);
        return sb.toString();
    }
}
