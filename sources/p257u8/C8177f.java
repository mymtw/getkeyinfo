package p257u8;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import android.util.Base64;
import com.cardinalcommerce.shared.p065cs.p070f.C6292k;
import java.nio.charset.StandardCharsets;

/* renamed from: u8.f */
public final class C8177f {

    /* renamed from: b */
    public static C8177f f17951b;

    /* renamed from: c */
    public static C8172b f17952c;

    /* renamed from: a */
    public SharedPreferences f17953a;

    public C8177f(Context context) {
        this.f17953a = context.getSharedPreferences("com.cardinalcommerce.cardinalmobilesdkcmsdk", 0);
    }

    /* renamed from: a */
    public static synchronized C8177f m16444a(Context context) {
        C8177f fVar;
        synchronized (C8177f.class) {
            f17952c = C8172b.m16432f();
            if (f17951b == null) {
                f17951b = new C8177f(context);
            }
            fVar = f17951b;
        }
        return fVar;
    }

    /* renamed from: b */
    public final void mo20807b(long j) {
        mo20808c("LastUpdatedTime", Long.toString(j));
    }

    /* renamed from: c */
    public final void mo20808c(String str, String str2) {
        try {
            if (!C6292k.m12678a()) {
                this.f17953a.edit().putString(str, Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0)).apply();
                return;
            }
            f17952c.mo19175a("Cardinal Configure", "Device is jail broken cannot access preferences", (String) null);
        } catch (Exception e) {
            C8172b bVar = f17952c;
            String valueOf = String.valueOf(10703);
            StringBuilder h = C0072d.m201h("Error while saving/retrieving data from shared preferences \n");
            h.append(e.getLocalizedMessage());
            bVar.mo19177d(valueOf, h.toString(), (String) null);
        }
    }

    /* renamed from: d */
    public final long mo20809d() {
        try {
            return Long.parseLong(mo20810e("LastUpdatedTime", Long.toString(0)));
        } catch (NumberFormatException e) {
            C8172b bVar = f17952c;
            String valueOf = String.valueOf(10703);
            StringBuilder h = C0072d.m201h("Error while parsing retrieving data from shared preferences \n");
            h.append(e.getLocalizedMessage());
            bVar.mo19177d(valueOf, h.toString(), (String) null);
            return 0;
        }
    }

    /* renamed from: e */
    public final String mo20810e(String str, String str2) {
        try {
            if (!C6292k.m12678a()) {
                String string = this.f17953a.getString(str, str2);
                if (string != str2) {
                    return new String(Base64.decode(string, 0), StandardCharsets.UTF_8);
                }
            } else {
                f17952c.mo19175a("Cardinal Configure", "Device is jail broken cannot access preferences", (String) null);
            }
        } catch (Exception e) {
            C8172b bVar = f17952c;
            String valueOf = String.valueOf(10703);
            StringBuilder h = C0072d.m201h("Error while saving/retrieving data from shared preferences \n");
            h.append(e.getLocalizedMessage());
            bVar.mo19177d(valueOf, h.toString(), (String) null);
        }
        return str2;
    }
}
