package p257u8;

import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u8.d */
public final class C8175d {

    /* renamed from: a */
    public String f17943a;

    /* renamed from: b */
    public String f17944b;

    /* renamed from: c */
    public String f17945c;

    /* renamed from: d */
    public String f17946d;

    /* renamed from: e */
    public String f17947e;

    /* renamed from: f */
    public boolean f17948f;

    /* renamed from: a */
    public final JSONObject mo20804a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f17948f) {
                str = "error";
                str2 = this.f17947e;
            } else {
                str = "event";
                str2 = this.f17946d;
            }
            jSONObject.put(str, str2);
            jSONObject.put("detail", this.f17943a);
            jSONObject.put(ResponseConstants.TIMESTAMP, this.f17945c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
