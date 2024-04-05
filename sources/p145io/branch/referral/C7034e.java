package p145io.branch.referral;

import android.annotation.SuppressLint;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: io.branch.referral.e */
public final class C7034e extends JSONObject {

    /* renamed from: a */
    public Collection<String> f15643a;

    /* renamed from: b */
    public String f15644b;

    /* renamed from: c */
    public String f15645c;

    /* renamed from: d */
    public String f15646d;

    /* renamed from: e */
    public String f15647e;

    /* renamed from: f */
    public String f15648f;

    /* renamed from: g */
    public JSONObject f15649g;

    /* renamed from: h */
    public int f15650h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7034e.class != obj.getClass()) {
            return false;
        }
        C7034e eVar = (C7034e) obj;
        String str = this.f15644b;
        if (str == null) {
            if (eVar.f15644b != null) {
                return false;
            }
        } else if (!str.equals(eVar.f15644b)) {
            return false;
        }
        String str2 = this.f15645c;
        if (str2 == null) {
            if (eVar.f15645c != null) {
                return false;
            }
        } else if (!str2.equals(eVar.f15645c)) {
            return false;
        }
        String str3 = this.f15646d;
        if (str3 == null) {
            if (eVar.f15646d != null) {
                return false;
            }
        } else if (!str3.equals(eVar.f15646d)) {
            return false;
        }
        String str4 = this.f15647e;
        if (str4 == null) {
            if (eVar.f15647e != null) {
                return false;
            }
        } else if (!str4.equals(eVar.f15647e)) {
            return false;
        }
        String str5 = this.f15648f;
        if (str5 == null) {
            if (eVar.f15648f != null) {
                return false;
            }
        } else if (!str5.equals(eVar.f15648f)) {
            return false;
        }
        eVar.getClass();
        if (this.f15650h != eVar.f15650h) {
            return false;
        }
        Collection<String> collection = this.f15643a;
        String str6 = null;
        if (collection != null) {
            String obj2 = collection.toString();
            Collection<String> collection2 = eVar.f15643a;
            if (!obj2.equals(collection2 != null ? collection2.toString() : null)) {
                return false;
            }
        } else if (eVar.f15643a != null) {
            return false;
        }
        JSONObject jSONObject = this.f15649g;
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            JSONObject jSONObject3 = eVar.f15649g;
            if (jSONObject3 != null) {
                str6 = jSONObject3.toString();
            }
            if (!jSONObject2.equals(str6)) {
                return false;
            }
        } else if (eVar.f15649g != null) {
            return false;
        }
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    public final int hashCode() {
        int i = (0 + 19) * 19;
        String str = this.f15644b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.toLowerCase().hashCode())) * 19;
        String str2 = this.f15645c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.toLowerCase().hashCode())) * 19;
        String str3 = this.f15646d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.toLowerCase().hashCode())) * 19;
        String str4 = this.f15647e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.toLowerCase().hashCode())) * 19;
        String str5 = this.f15648f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.toLowerCase().hashCode())) * 19;
        JSONObject jSONObject = this.f15649g;
        if (jSONObject != null) {
            i2 = jSONObject.toString().toLowerCase().hashCode();
        }
        int i3 = ((hashCode5 + i2) * 19) + this.f15650h;
        Collection<String> collection = this.f15643a;
        if (collection != null) {
            for (String lowerCase : collection) {
                i3 = (i3 * 19) + lowerCase.toLowerCase().hashCode();
            }
        }
        return i3;
    }
}
