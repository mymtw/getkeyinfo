package p447t9;

import com.etsy.android.lib.logger.C8694h;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import p425q9.C13255g;

@Deprecated
/* renamed from: t9.a */
public class C13384a {

    /* renamed from: a */
    public Exception f29313a;

    /* renamed from: b */
    public C13255g f29314b;

    public C13384a(Exception exc) {
        this.f29313a = exc;
        C8694h.f19097a.mo21309d("Network error : parseError", exc);
    }

    /* renamed from: a */
    public final byte[] mo46068a() {
        C13255g gVar = this.f29314b;
        if (gVar != null) {
            return gVar.f29118a;
        }
        return null;
    }

    /* renamed from: b */
    public final String mo46069b(String str) {
        C13255g gVar = this.f29314b;
        if (gVar == null || gVar.f29120c == null) {
            return null;
        }
        return (String) this.f29314b.f29120c.get(str.toLowerCase(Locale.getDefault()));
    }

    /* renamed from: c */
    public final Boolean mo46070c(String str) {
        C13255g gVar = this.f29314b;
        if (gVar == null || gVar.f29120c == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.f29314b.f29120c.containsKey(str.toLowerCase(Locale.getDefault())));
    }

    /* renamed from: d */
    public final boolean mo46071d() {
        C13255g gVar = this.f29314b;
        int i = -1;
        if ((gVar != null ? gVar.f29119b : -1) >= 200) {
            if (gVar != null) {
                i = gVar.f29119b;
            }
            if (i < 300) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final String mo46072e() {
        String b = mo46069b("Content-Type");
        if (b == null) {
            b = mo46069b("content-type");
        }
        if (b == null) {
            return "ISO-8859-1";
        }
        String[] split = b.split(";");
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=");
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public final String toString() {
        HashMap hashMap;
        if (mo46068a() != null) {
            C13255g gVar = this.f29314b;
            if (gVar == null || gVar.f29120c == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                this.f29314b.f29120c.putAll(hashMap);
            }
            if (hashMap != null) {
                try {
                    return new String(mo46068a(), mo46072e());
                } catch (UnsupportedEncodingException e) {
                    C8694h.f19097a.mo21309d("Error parsing network response", e);
                }
            }
        }
        return "";
    }

    public C13384a(C13255g gVar) {
        this.f29314b = gVar;
    }
}
