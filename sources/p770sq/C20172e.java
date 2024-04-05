package p770sq;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p773uq.C20205a;
import p774vq.C20213h;

/* renamed from: sq.e */
public abstract class C20172e {

    /* renamed from: a */
    public static boolean f44678a;

    /* renamed from: b */
    public static String f44679b;

    /* renamed from: a */
    public static long m34481a(int i) {
        String str;
        int i2;
        long j;
        File file = new File("/storage");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                File file2 = listFiles[i3];
                if (file2.exists()) {
                    try {
                        if (Environment.isExternalStorageRemovable(file2)) {
                            str = file2.getAbsolutePath();
                            break;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
                i3++;
            }
        }
        str = "";
        if (!str.isEmpty()) {
            File file3 = new File(str);
            if (file3.exists()) {
                StatFs statFs = new StatFs(file3.getPath());
                if (i == 600) {
                    j = (long) statFs.getBlockSize();
                    i2 = statFs.getAvailableBlocks();
                } else if (i == 601) {
                    j = (long) statFs.getBlockSize();
                    i2 = statFs.getBlockCount();
                }
                return j * ((long) i2);
            }
        }
        return 12345;
    }

    /* renamed from: b */
    public static Object m34482b(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 12345) {
                return -400;
            }
            return obj;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 12345.0d) {
                return -400;
            }
            return obj;
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 12345) {
                return -400;
            }
            return obj;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 12345.0f) {
                return -400;
            }
            return obj;
        } else if (obj instanceof String) {
            return obj.equals("default") ? "-400" : obj;
        } else {
            return -400;
        }
    }

    /* renamed from: c */
    public static JSONObject m34483c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerMG", 0);
        f44679b = sharedPreferences.getString("RiskManagerMG", "");
        long j = sharedPreferences.getLong("RiskManagerMGTIMESTAMP", 0);
        if (f44679b.equals("") && j == 0) {
            f44679b = C20171d.m34477a(true);
            j = System.currentTimeMillis();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("RiskManagerMG", f44679b);
            edit.putLong("RiskManagerMGTIMESTAMP", j);
            edit.apply();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", f44679b);
        hashMap.put("created_at", j + "");
        try {
            return new JSONObject("{\"id\":" + ((String) hashMap.get("id")) + ",\"created_at\":" + ((String) hashMap.get("created_at")) + "}");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m34484e(C20213h hVar, String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        int optInt = hVar.f44822d.optInt("hw", 0);
        int abs = Math.abs(lowerCase.hashCode());
        if (abs <= 0) {
            return false;
        }
        int i = (abs / 100) % 100;
        if (i < optInt) {
            f44678a = true;
        }
        return i < optInt;
    }

    /* renamed from: d */
    public final boolean mo74416d(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            C20205a.m34555b(e, getClass());
            return false;
        }
    }
}
