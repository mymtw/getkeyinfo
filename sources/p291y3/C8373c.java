package p291y3;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import p291y3.C8386j;

/* renamed from: y3.c */
public final class C8373c implements C8386j.C8387a {

    /* renamed from: a */
    public Context f18360a;

    /* renamed from: b */
    public C8374a f18361b;

    /* renamed from: c */
    public SharedPreferences f18362c;

    /* renamed from: y3.c$a */
    public interface C8374a {
    }

    public C8373c(Context context) {
        this.f18360a = context;
        this.f18362c = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: a */
    public final Uri mo20962a(String str, String str2) {
        Display defaultDisplay = ((WindowManager) this.f18360a.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        String[] split = Build.VERSION.RELEASE.split("\\.");
        String str3 = split[0];
        String str4 = "0";
        String str5 = split.length > 1 ? split[1] : str4;
        if (split.length > 2) {
            str4 = split[2];
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(C8371b.f18352i)) {
            C8371b.f18352i = "https://bit.ly/";
        }
        sb.append(C8371b.f18352i);
        sb.append("v3/mobile/register");
        Uri.Builder appendQueryParameter = Uri.parse(sb.toString()).buildUpon().appendQueryParameter("app_id", str).appendQueryParameter(EventsNameKt.DEVICE_ID, str2).appendQueryParameter("device_id_type", "android").appendQueryParameter("dsw", String.valueOf(i)).appendQueryParameter("dsh", String.valueOf(i2)).appendQueryParameter("dsos", "android").appendQueryParameter("dsosmaj", str3).appendQueryParameter("dsosmin", str5).appendQueryParameter("dsosp", str4).appendQueryParameter("dsb", Build.BRAND).appendQueryParameter("dsm", Build.MODEL).appendQueryParameter("dsd", String.valueOf(f));
        if (!this.f18362c.getBoolean("bitly.has.launched", false)) {
            appendQueryParameter.appendQueryParameter("il", "true");
            this.f18362c.edit().putBoolean("bitly.has.launched", true).apply();
        }
        return appendQueryParameter.build();
    }
}
