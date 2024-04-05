package p508am;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: am.e */
public final class C14036e {

    /* renamed from: a */
    public final SharedPreferences.Editor f30893a;

    /* renamed from: b */
    public final String f30894b;

    public C14036e(Context context, String str, String str2) {
        this.f30894b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f30893a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f30893a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }
}
