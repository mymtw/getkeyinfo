package p145io.branch.referral;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.BranchJsonConfig;

/* renamed from: io.branch.referral.n */
public final class C7058n {

    /* renamed from: a */
    public static boolean f15709a = false;

    /* renamed from: b */
    public static Boolean f15710b;

    /* renamed from: io.branch.referral.n$a */
    public static class C7059a {

        /* renamed from: a */
        public final JSONObject f15711a;

        public C7059a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f15711a = jSONObject2;
        }

        /* renamed from: a */
        public final Double mo19292a(String str) {
            if (!this.f15711a.has(str)) {
                return null;
            }
            Double valueOf = Double.valueOf(this.f15711a.optDouble(str));
            this.f15711a.remove(str);
            return valueOf;
        }

        /* renamed from: b */
        public final String mo19293b(String str) {
            String optString = this.f15711a.optString(str);
            this.f15711a.remove(str);
            return optString;
        }
    }

    /* renamed from: a */
    public static boolean m13647a(Context context) {
        boolean parseBoolean;
        if (!f15709a && f15710b == null) {
            if (BranchJsonConfig.f15607b == null) {
                BranchJsonConfig.f15607b = new BranchJsonConfig(context);
            }
            BranchJsonConfig branchJsonConfig = BranchJsonConfig.f15607b;
            boolean z = false;
            if (branchJsonConfig.mo19221b(BranchJsonConfig.BranchJsonKey.useTestInstance)) {
                Boolean a = branchJsonConfig.mo19220a();
                if (a != null) {
                    z = a.booleanValue();
                }
                f15709a = z;
            } else {
                boolean z2 = f15709a;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        if (bundle.containsKey("io.branch.sdk.TestMode")) {
                            parseBoolean = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                            z2 = parseBoolean;
                            f15709a = z2;
                        }
                    }
                    Resources resources = context.getResources();
                    parseBoolean = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                    z2 = parseBoolean;
                } catch (Exception unused) {
                }
                f15709a = z2;
            }
            f15710b = Boolean.valueOf(f15709a);
        }
        return f15709a;
    }

    /* renamed from: b */
    public static String m13648b(Context context) {
        if (BranchJsonConfig.f15607b == null) {
            BranchJsonConfig.f15607b = new BranchJsonConfig(context);
        }
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.f15607b;
        String str = null;
        if (branchJsonConfig.f15608a != null) {
            BranchJsonConfig.BranchJsonKey branchJsonKey = BranchJsonConfig.BranchJsonKey.branchKey;
            if (branchJsonConfig.mo19221b(branchJsonKey) || (branchJsonConfig.mo19221b(BranchJsonConfig.BranchJsonKey.liveKey) && branchJsonConfig.mo19221b(BranchJsonConfig.BranchJsonKey.testKey) && branchJsonConfig.mo19221b(BranchJsonConfig.BranchJsonKey.useTestInstance))) {
                try {
                    if (branchJsonConfig.mo19221b(branchJsonKey)) {
                        str = branchJsonConfig.f15608a.getString(branchJsonKey.toString());
                    } else if (branchJsonConfig.mo19220a().booleanValue()) {
                        JSONObject jSONObject = branchJsonConfig.f15608a;
                        if (jSONObject != null) {
                            try {
                                if (jSONObject.has("testKey")) {
                                    str = branchJsonConfig.f15608a.getString("testKey");
                                }
                            } catch (JSONException e) {
                                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
                            }
                        }
                    } else {
                        BranchJsonConfig.BranchJsonKey branchJsonKey2 = BranchJsonConfig.BranchJsonKey.liveKey;
                        if (branchJsonConfig.mo19221b(branchJsonKey2)) {
                            try {
                                str = branchJsonConfig.f15608a.getString(branchJsonKey2.toString());
                            } catch (JSONException e2) {
                                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e2.getMessage());
                            }
                        }
                    }
                } catch (JSONException e3) {
                    StringBuilder h = C0072d.m201h("Error parsing branch.json: ");
                    h.append(e3.getMessage());
                    Log.e("BranchJsonConfig", h.toString());
                }
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = f15709a ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (str = bundle.getString(str2)) == null && f15709a) {
                str = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str != null) {
            return str;
        }
        Resources resources = context.getResources();
        return resources.getString(resources.getIdentifier(str2, "string", context.getPackageName()));
    }
}
