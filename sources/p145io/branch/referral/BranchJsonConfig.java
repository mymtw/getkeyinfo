package p145io.branch.referral;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.BranchJsonConfig */
public final class BranchJsonConfig {

    /* renamed from: b */
    public static BranchJsonConfig f15607b;

    /* renamed from: a */
    public JSONObject f15608a = null;

    /* renamed from: io.branch.referral.BranchJsonConfig$BranchJsonKey */
    public enum BranchJsonKey {
        branchKey,
        testKey,
        liveKey,
        useTestInstance,
        enableFacebookLinkCheck,
        enableLogging
    }

    public BranchJsonConfig(Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("branch.json")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        this.f15608a = new JSONObject(sb.toString());
                        return;
                    }
                }
            } catch (IOException e) {
                StringBuilder h = C0072d.m201h("Error loading branch.json: ");
                h.append(e.getMessage());
                Log.e("BranchJsonConfig", h.toString());
            } catch (JSONException e2) {
                StringBuilder h2 = C0072d.m201h("Error parsing branch.json: ");
                h2.append(e2.getMessage());
                Log.e("BranchJsonConfig", h2.toString());
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final Boolean mo19220a() {
        BranchJsonKey branchJsonKey = BranchJsonKey.useTestInstance;
        if (!mo19221b(branchJsonKey)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.f15608a.getBoolean(branchJsonKey.toString()));
        } catch (JSONException e) {
            StringBuilder h = C0072d.m201h("Error parsing branch.json: ");
            h.append(e.getMessage());
            Log.e("BranchJsonConfig", h.toString());
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public final boolean mo19221b(BranchJsonKey branchJsonKey) {
        JSONObject jSONObject = this.f15608a;
        return jSONObject != null && jSONObject.has(branchJsonKey.toString());
    }
}
