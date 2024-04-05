package p145io.branch.referral;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.C7055m;

/* renamed from: io.branch.referral.m */
public abstract class C7055m<T extends C7055m> {

    /* renamed from: a */
    public JSONObject f15692a;

    /* renamed from: b */
    public String f15693b;

    /* renamed from: c */
    public String f15694c;

    /* renamed from: d */
    public String f15695d;

    /* renamed from: e */
    public String f15696e;

    /* renamed from: f */
    public String f15697f;

    /* renamed from: g */
    public int f15698g = 0;

    /* renamed from: h */
    public ArrayList<String> f15699h;

    /* renamed from: i */
    public Branch f15700i = Branch.m13575j();

    /* renamed from: j */
    public boolean f15701j = true;

    /* renamed from: k */
    public final Context f15702k;

    public C7055m(Context context) {
        this.f15702k = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo19291a(Object obj, String str) {
        try {
            if (this.f15692a == null) {
                this.f15692a = new JSONObject();
            }
            this.f15692a.put(str, obj);
        } catch (JSONException unused) {
        }
    }
}
