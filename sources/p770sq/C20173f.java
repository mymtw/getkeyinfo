package p770sq;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.QueryReformulation;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p772tq.C20204b;
import p773uq.C20205a;
import p774vq.C20213h;
import p774vq.C20215j;

/* renamed from: sq.f */
public final class C20173f extends C20172e {

    /* renamed from: A */
    public JSONObject f44680A;

    /* renamed from: B */
    public JSONArray f44681B;

    /* renamed from: C */
    public JSONObject f44682C;

    /* renamed from: D */
    public C20215j f44683D;

    /* renamed from: c */
    public String f44684c;

    /* renamed from: d */
    public String f44685d;

    /* renamed from: e */
    public String f44686e;

    /* renamed from: f */
    public String f44687f;

    /* renamed from: g */
    public String f44688g;

    /* renamed from: h */
    public String f44689h;

    /* renamed from: i */
    public String f44690i;

    /* renamed from: j */
    public String f44691j;

    /* renamed from: k */
    public String f44692k;

    /* renamed from: l */
    public String f44693l;

    /* renamed from: m */
    public String f44694m;

    /* renamed from: n */
    public String f44695n;

    /* renamed from: o */
    public String f44696o;

    /* renamed from: p */
    public int f44697p;

    /* renamed from: q */
    public boolean f44698q;

    /* renamed from: r */
    public boolean f44699r;

    /* renamed from: s */
    public boolean f44700s;

    /* renamed from: t */
    public long f44701t = -1;

    /* renamed from: u */
    public long f44702u = -1;

    /* renamed from: v */
    public long f44703v = -1;

    /* renamed from: w */
    public JSONObject f44704w;

    /* renamed from: x */
    public JSONObject f44705x;

    /* renamed from: y */
    public JSONObject f44706y;

    /* renamed from: z */
    public JSONObject f44707z;

    /* renamed from: sq.f$a */
    public class C20174a implements FileFilter {
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    /* renamed from: sq.f$b */
    public static final class C20175b {
        /* renamed from: a */
        public static boolean m34495a() {
            String str = Build.MANUFACTURER;
            if (!(str.equals("unknown") || str.equals("Genymotion") || str.contains("AndyOS"))) {
                String str2 = Build.BRAND;
                if (!(str2.equals("generic") || str2.equals("generic_x86") || str2.equals("Android") || str2.equals("AndyOS"))) {
                    String str3 = Build.DEVICE;
                    if (!(str3.equals("AndyOSX") || str3.equals("Droid4X") || str3.equals("generic") || str3.equals("generic_x86") || str3.equals("vbox86p"))) {
                        String str4 = Build.HARDWARE;
                        if (!(str4.equals("goldfish") || str4.equals("vbox86") || str4.equals("andy"))) {
                            String str5 = Build.MODEL;
                            if (!(str5.equals("sdk") || str5.equals("google_sdk") || str5.equals("Android SDK built for x86")) && !Build.FINGERPRINT.startsWith("generic")) {
                                String str6 = Build.PRODUCT;
                                if (!(str6.matches(".*_?sdk_?.*") || str6.equals("vbox86p") || str6.equals("Genymotion") || str6.equals("Driod4X") || str6.equals("AndyOSX"))) {
                                    if (!new File(Environment.getExternalStorageDirectory().toString() + File.separatorChar + "windows" + File.separatorChar + "BstSharedFolder").exists()) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: sq.f$c */
    public static final class C20176c {
        /* renamed from: a */
        public static String m34496a(String str) throws IOException {
            Properties properties = new Properties();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("suFileName=/system/xbin/su\nsuperUserApk=/system/app/Superuser.apk\nemptyIp=0.0.0.0".getBytes("UTF-8"));
            try {
                properties.load(byteArrayInputStream);
            } catch (Exception e) {
                C20205a.m34555b(e, C20176c.class);
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
            byteArrayInputStream.close();
            return properties.getProperty(str);
        }

        /* renamed from: b */
        public static boolean m34497b() {
            boolean z;
            boolean z2;
            Class<C20176c> cls = C20176c.class;
            String str = Build.TAGS;
            if (str != null && str.contains("test-keys")) {
                return true;
            }
            try {
                z = new File(m34496a("suFileName")).exists();
            } catch (Exception e) {
                C20205a.m34555b(e, cls);
                z = false;
            }
            if (z) {
                return true;
            }
            try {
                z2 = new File(m34496a("superUserApk")).exists();
            } catch (Exception e2) {
                C20205a.m34555b(e2, cls);
                z2 = false;
            }
            return z2;
        }
    }

    /* renamed from: i */
    public static int m34486i(int i) {
        int i2;
        int i3;
        File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C20174a());
        if (i == 3) {
            i2 = listFiles.length;
        } else {
            int i4 = 0;
            if (i == 2) {
                int length = listFiles.length;
                i3 = Integer.MAX_VALUE;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    File file = listFiles[i4];
                    String c = C20204b.m34553c(new File(file.getPath() + "/cpufreq/cpuinfo_min_freq"));
                    if (c == null || c.equals("-403")) {
                        break;
                    }
                    int parseInt = Integer.parseInt(c);
                    if (parseInt < i3) {
                        i3 = parseInt;
                    }
                    i4++;
                }
                i2 = -403;
            } else if (i == 1) {
                int length2 = listFiles.length;
                i3 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    File file2 = listFiles[i4];
                    File file3 = new File(file2.getPath() + "/cpufreq/cpuinfo_max_freq");
                    String c2 = C20204b.m34553c(file3);
                    if (c2 == null || c2.equals("-403")) {
                        break;
                    }
                    int parseInt2 = Integer.parseInt(C20204b.m34553c(file3));
                    if (parseInt2 > i3) {
                        i3 = parseInt2;
                    }
                    i4++;
                }
            } else {
                i2 = 12345;
            }
            i2 = i3;
        }
        if (i2 == 0 || i2 == Integer.MAX_VALUE) {
            return 12345;
        }
        return i2;
    }

    /* renamed from: k */
    public static JSONObject m34487k() {
        JSONObject jSONObject = new JSONObject();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        try {
            jSONObject.put("total_sd", C20172e.m34482b(Long.valueOf(C20172e.m34481a(601))));
            jSONObject.put("total_ud", C20172e.m34482b(Long.valueOf(blockSize)));
        } catch (JSONException e) {
            C20205a.m34555b(e, C20173f.class);
        }
        return jSONObject;
    }

    /* renamed from: l */
    public static JSONObject m34488l() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = m34486i(3);
            int i2 = m34486i(2);
            int i3 = m34486i(1);
            jSONObject.put("minFreq", C20172e.m34482b(Integer.valueOf(i2)));
            jSONObject.put("maxFreq", C20172e.m34482b(Integer.valueOf(i3)));
            jSONObject.put("cores", C20172e.m34482b(Integer.valueOf(i)));
        } catch (JSONException e) {
            C20205a.m34555b(e, C20173f.class);
        }
        return jSONObject;
    }

    /* renamed from: m */
    public static JSONObject m34489m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ResponseConstants.VERSION, C20172e.m34482b(C20204b.m34553c(new File("proc/version"))));
            jSONObject.put("board", C20172e.m34482b(Build.BOARD));
            jSONObject.put("bootloader", C20172e.m34482b(Build.BOOTLOADER));
            jSONObject.put("cpu_abi1", C20172e.m34482b(Build.CPU_ABI));
            jSONObject.put(QueryReformulation.DISPLAY, C20172e.m34482b(Build.DISPLAY));
            jSONObject.put("radio", C20172e.m34482b(Build.getRadioVersion()));
            jSONObject.put("fingerprint", C20172e.m34482b(Build.FINGERPRINT));
            jSONObject.put("hardware", C20172e.m34482b(Build.HARDWARE));
            jSONObject.put("manufacturer", C20172e.m34482b(Build.MANUFACTURER));
            jSONObject.put("product", C20172e.m34482b(Build.PRODUCT));
            jSONObject.put("time", C20172e.m34482b(Long.valueOf(Build.TIME)));
        } catch (JSONException e) {
            C20205a.m34555b(e, C20173f.class);
        }
        return jSONObject;
    }

    /* renamed from: n */
    public static JSONObject m34490n(Context context) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        int i2;
        JSONObject jSONObject = new JSONObject();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int i3 = 12345;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i4 = point.x;
            i2 = point.y;
            f4 = displayMetrics.density;
            i = displayMetrics.densityDpi;
            f3 = displayMetrics.scaledDensity;
            f2 = displayMetrics.xdpi;
            float f5 = displayMetrics.ydpi;
            i3 = i4;
            f = f5;
        } else {
            i = 12345;
            f = 12345.0f;
            f4 = 12345.0f;
            f3 = 12345.0f;
            f2 = 12345.0f;
            i2 = 12345;
        }
        try {
            jSONObject.put(ResponseConstants.WIDTH, C20172e.m34482b(Integer.valueOf(i3)));
            jSONObject.put(ResponseConstants.HEIGHT, C20172e.m34482b(Integer.valueOf(i2)));
            jSONObject.put("density", C20172e.m34482b(Float.valueOf(f4)));
            jSONObject.put("densityDpi", C20172e.m34482b(Integer.valueOf(i)));
            jSONObject.put(ResponseConstants.SCALE, C20172e.m34482b(Float.valueOf(f3)));
            jSONObject.put("xdpi", C20172e.m34482b(Float.valueOf(f2)));
            jSONObject.put("ydpi", C20172e.m34482b(Float.valueOf(f)));
        } catch (Exception e) {
            C20205a.m34555b(e, C20173f.class);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final JSONObject mo74417f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(EventsNameKt.APP_GUID, this.f44684c);
            jSONObject.put("app_id", this.f44685d);
            jSONObject.put("android_id", this.f44690i);
            jSONObject.put("app_version", this.f44686e);
            long j = this.f44702u;
            Long l = null;
            jSONObject.put("app_first_install_time", j == -1 ? null : Long.valueOf(j));
            long j2 = this.f44703v;
            jSONObject.put("app_last_update_time", j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put("conf_url", this.f44695n);
            jSONObject.put("comp_version", this.f44696o);
            jSONObject.put("device_model", this.f44687f);
            jSONObject.put("device_name", this.f44688g);
            jSONObject.put("gsf_id", this.f44691j);
            jSONObject.put("is_emulator", this.f44699r);
            jSONObject.put("is_rooted", this.f44700s);
            jSONObject.put("os_type", "Android");
            jSONObject.put("os_version", this.f44689h);
            jSONObject.put("payload_type", this.f44693l);
            jSONObject.put("sms_enabled", this.f44698q);
            jSONObject.put("mac_addrs", this.f44692k);
            jSONObject.put("magnes_guid", this.f44704w);
            int i = this.f44697p;
            jSONObject.put("magnes_source", i == 0 ? null : Integer.valueOf(i));
            jSONObject.put("notif_token", (Object) null);
            jSONObject.put("source_app_version", this.f44694m);
            long j3 = this.f44701t;
            if (j3 != -1) {
                l = Long.valueOf(j3);
            }
            jSONObject.put("total_storage_space", l);
            jSONObject.put("nc", this.f44681B);
            jSONObject.put("screen", this.f44705x);
            jSONObject.put("cpu", this.f44706y);
            jSONObject.put("disk", this.f44707z);
            jSONObject.put("system", this.f44680A);
            jSONObject.put("user_agent", this.f44682C);
            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, C20172e.f44678a);
            return jSONObject;
        } catch (JSONException e) {
            C20205a.m34555b(e, C20173f.class);
            return jSONObject;
        }
    }

    /* renamed from: g */
    public final void mo74418g(int i, C20169c cVar) {
        Class<C20173f> cls = C20173f.class;
        try {
            Context context = cVar.f44673b;
            if (i == 1) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerAG", 0);
                String string = sharedPreferences.getString("RiskManagerAG", "");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (string.equals("")) {
                    string = C20171d.m34477a(true);
                    edit.putString("RiskManagerAG", string);
                    edit.apply();
                }
                this.f44684c = string;
            } else if (i == 2) {
                this.f44685d = context.getPackageName();
            } else if (i != 3) {
                String str = null;
                if (i != 32) {
                    if (i == 34) {
                        this.f44683D.mo74463c(i);
                    } else if (i != 47) {
                        if (i != 52) {
                            if (i == 86) {
                                JSONObject c = C20172e.m34483c(context);
                                this.f44704w = c;
                                C20172e.f44679b = c.optString("id");
                            } else if (i == 88) {
                                C20215j jVar = this.f44683D;
                                if (jVar.f44831e) {
                                    this.f44681B = jVar.f44832f;
                                }
                            } else if (i == 8) {
                                this.f44696o = "4.1.2.release";
                            } else if (i != 9) {
                                if (i != 14) {
                                    if (i != 15) {
                                        if (i != 37) {
                                            if (i != 38) {
                                                if (i != 59) {
                                                    if (i != 60) {
                                                        if (i != 62) {
                                                            if (i != 63) {
                                                                if (i != 65) {
                                                                    if (i != 66) {
                                                                        if (i != 69) {
                                                                            if (i != 70) {
                                                                                if (i != 90) {
                                                                                    if (i != 91) {
                                                                                        switch (i) {
                                                                                            case 93:
                                                                                                if (this.f44683D.mo74463c(i)) {
                                                                                                    this.f44707z = m34487k();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 94:
                                                                                                if (this.f44683D.mo74463c(i)) {
                                                                                                    this.f44680A = m34489m();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 95:
                                                                                                if (this.f44683D.mo74463c(i)) {
                                                                                                    JSONObject jSONObject = new JSONObject();
                                                                                                    try {
                                                                                                        jSONObject.put("dua", C20172e.m34482b(WebSettings.getDefaultUserAgent(context)));
                                                                                                    } catch (Exception e) {
                                                                                                        C20205a.m34555b(e, cls);
                                                                                                    }
                                                                                                    this.f44682C = jSONObject;
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            default:
                                                                                                return;
                                                                                        }
                                                                                        C20205a.m34555b(e, cls);
                                                                                    } else if (this.f44683D.mo74463c(i)) {
                                                                                        this.f44705x = m34490n(context);
                                                                                    }
                                                                                } else if (this.f44683D.mo74463c(i)) {
                                                                                    this.f44706y = m34488l();
                                                                                }
                                                                            } else if (this.f44683D.mo74463c(i)) {
                                                                                this.f44691j = mo74420j(context);
                                                                            }
                                                                        } else if (this.f44683D.mo74463c(i)) {
                                                                            this.f44690i = Settings.Secure.getString(context.getContentResolver(), "android_id");
                                                                        }
                                                                    } else if (this.f44683D.mo74463c(i)) {
                                                                        this.f44703v = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
                                                                    }
                                                                } else if (this.f44683D.mo74463c(i)) {
                                                                    this.f44702u = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                                                                }
                                                            } else if (this.f44683D.mo74463c(i)) {
                                                                this.f44694m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                                                            }
                                                        } else if (this.f44683D.mo74463c(i)) {
                                                            this.f44697p = cVar.f44672a;
                                                        }
                                                    } else if (this.f44683D.mo74463c(i)) {
                                                        this.f44700s = C20176c.m34497b();
                                                    }
                                                } else if (this.f44683D.mo74463c(i)) {
                                                    this.f44699r = C20175b.m34495a();
                                                }
                                            } else if (this.f44683D.mo74463c(i)) {
                                                this.f44693l = "full";
                                            }
                                        } else if (this.f44683D.mo74463c(i)) {
                                            this.f44689h = Build.VERSION.RELEASE;
                                        }
                                    } else if (this.f44683D.mo74463c(i)) {
                                        this.f44688g = Build.DEVICE;
                                    }
                                } else if (this.f44683D.mo74463c(i)) {
                                    this.f44687f = Build.MODEL;
                                }
                            } else if (this.f44683D.mo74463c(i)) {
                                this.f44695n = "https://www.paypalobjects.com/digitalassets/c/rda-magnes/magnes_config_android_v4.json";
                            }
                        } else if (this.f44683D.mo74463c(i)) {
                            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                            this.f44701t = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
                        }
                    } else if (this.f44683D.mo74463c(i)) {
                        this.f44698q = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
                    }
                } else if (this.f44683D.mo74463c(i)) {
                    WifiInfo connectionInfo = mo74416d(context, "android.permission.ACCESS_WIFI_STATE") ? ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo() : null;
                    if (connectionInfo != null) {
                        str = connectionInfo.getMacAddress();
                    }
                    this.f44692k = str;
                }
            } else if (this.f44683D.mo74463c(i)) {
                this.f44686e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            }
        } catch (Exception e2) {
            C20205a.m34555b(e2, cls);
        }
    }

    /* renamed from: h */
    public final void mo74419h(C20169c cVar, C20213h hVar, C20215j jVar) {
        this.f44683D = jVar;
        C20205a.m34554a("collecting RiskBlobCoreData", 0, C20173f.class);
        mo74418g(1, cVar);
        mo74418g(2, cVar);
        mo74418g(3, cVar);
        mo74418g(65, cVar);
        mo74418g(66, cVar);
        mo74418g(69, cVar);
        mo74418g(8, cVar);
        mo74418g(9, cVar);
        mo74418g(14, cVar);
        mo74418g(15, cVar);
        mo74418g(70, cVar);
        mo74418g(59, cVar);
        mo74418g(60, cVar);
        mo74418g(32, cVar);
        mo74418g(86, cVar);
        mo74418g(62, cVar);
        mo74418g(34, cVar);
        mo74418g(37, cVar);
        mo74418g(38, cVar);
        mo74418g(63, cVar);
        mo74418g(47, cVar);
        mo74418g(52, cVar);
        mo74418g(88, cVar);
        C20172e.f44678a = false;
        if (C20172e.m34484e(hVar, C20172e.f44679b)) {
            mo74418g(91, cVar);
            mo74418g(90, cVar);
            mo74418g(93, cVar);
            mo74418g(94, cVar);
            mo74418g(95, cVar);
        }
        mo74417f();
    }

    /* renamed from: j */
    public final String mo74420j(Context context) {
        Uri uri;
        Cursor query;
        try {
            uri = Uri.parse("content://com.google.android.gsf.gservices");
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null || !mo74416d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") || (query = context.getContentResolver().query(uri, (String[]) null, (String) null, new String[]{"android_id"}, (String) null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                if (query.getColumnCount() >= 2) {
                    String hexString = Long.toHexString(Long.parseLong(query.getString(1)));
                    query.close();
                    return hexString;
                }
            }
            return null;
        } catch (NumberFormatException e) {
            C20205a.m34555b(e, C20173f.class);
            return null;
        } finally {
            query.close();
        }
    }
}
