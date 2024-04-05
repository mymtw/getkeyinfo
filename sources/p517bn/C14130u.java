package p517bn;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: bn.u */
public final class C14130u {

    /* renamed from: a */
    public final Bundle f31127a;

    public C14130u(Bundle bundle) {
        if (bundle != null) {
            this.f31127a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: k */
    public static boolean m21867k(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e")) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* renamed from: m */
    public static String m21868m(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public final boolean mo47014a(String str) {
        String i = mo47022i(str);
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(i) || Boolean.parseBoolean(i);
    }

    /* renamed from: b */
    public final Integer mo47015b(String str) {
        String i = mo47022i(str);
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(i));
        } catch (NumberFormatException unused) {
            String m = m21868m(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 38 + String.valueOf(i).length());
            C0391c.m1061h(sb, "Couldn't parse value of ", m, "(", i);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public final JSONArray mo47016c(String str) {
        String i = mo47022i(str);
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        try {
            return new JSONArray(i);
        } catch (JSONException unused) {
            String m = m21868m(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 50 + String.valueOf(i).length());
            C0391c.m1061h(sb, "Malformed JSON for key ", m, ": ", i);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: d */
    public final int[] mo47017d() {
        JSONArray c = mo47016c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                int parseColor = Color.parseColor(c.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = c.optInt(1);
                    iArr[2] = c.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String obj = c.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 58);
            sb.append("LightSettings is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (IllegalArgumentException e) {
            String obj2 = c.toString();
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(obj2.length() + 60 + String.valueOf(message).length());
            C0391c.m1061h(sb2, "LightSettings is invalid: ", obj2, ". ", message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: e */
    public final Uri mo47018e() {
        String i = mo47022i("gcm.n.link_android");
        if (TextUtils.isEmpty(i)) {
            i = mo47022i("gcm.n.link");
        }
        if (!TextUtils.isEmpty(i)) {
            return Uri.parse(i);
        }
        return null;
    }

    /* renamed from: f */
    public final Object[] mo47019f(String str) {
        JSONArray c = mo47016c(str.concat("_loc_args"));
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    /* renamed from: g */
    public final Long mo47020g() {
        String i = mo47022i("gcm.n.event_time");
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(i));
        } catch (NumberFormatException unused) {
            String m = m21868m("gcm.n.event_time");
            StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 38 + String.valueOf(i).length());
            C0391c.m1061h(sb, "Couldn't parse value of ", m, "(", i);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: h */
    public final String mo47021h(Resources resources, String str, String str2) {
        String i = mo47022i(str2);
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        String i2 = mo47022i(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(i2)) {
            return null;
        }
        int identifier = resources.getIdentifier(i2, "string", str);
        if (identifier == 0) {
            String m = m21868m(str2.concat("_loc_key"));
            Log.w("NotificationParams", C0073e.m210j(new StringBuilder(String.valueOf(m).length() + 49 + str2.length()), m, " resource not found: ", str2, " Default value will be used."));
            return null;
        }
        Object[] f = mo47019f(str2);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException e) {
            String m2 = m21868m(str2);
            String arrays = Arrays.toString(f);
            StringBuilder sb = new StringBuilder(String.valueOf(m2).length() + 58 + String.valueOf(arrays).length());
            C0391c.m1061h(sb, "Missing format argument for ", m2, ": ", arrays);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo47022i(String str) {
        Bundle bundle = this.f31127a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.f31127a.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: j */
    public final long[] mo47023j() {
        JSONArray c = mo47016c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String obj = c.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: l */
    public final Bundle mo47024l() {
        Bundle bundle = new Bundle(this.f31127a);
        for (String next : this.f31127a.keySet()) {
            if (!(next.startsWith("google.c.a.") || next.equals(ResponseConstants.FROM))) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
