package p145io.branch.referral;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.t */
public final class C7082t extends ServerRequest {

    /* renamed from: j */
    public C7034e f15769j;

    /* renamed from: k */
    public boolean f15770k;

    /* renamed from: l */
    public boolean f15771l;

    public C7082t(Context context, String str, int i, ArrayList arrayList, String str2, String str3, String str4, String str5, JSONObject jSONObject, Branch.C7012b bVar, boolean z, boolean z2) {
        super(context, Defines$RequestPath.GetURL);
        this.f15770k = z;
        this.f15771l = z2;
        C7034e eVar = new C7034e();
        this.f15769j = eVar;
        try {
            eVar.put(Defines$Jsonkey.RandomizedBundleToken.getKey(), this.f15617c.mo19322l());
            this.f15769j.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), this.f15617c.mo19323m());
            this.f15769j.put(Defines$Jsonkey.SessionID.getKey(), this.f15617c.mo19327q());
            if (!this.f15617c.mo19320j().equals("bnc_no_value")) {
                this.f15769j.put(Defines$Jsonkey.LinkClickID.getKey(), this.f15617c.mo19320j());
            }
            this.f15769j.getClass();
            C7034e eVar2 = this.f15769j;
            if (i > 0) {
                eVar2.f15650h = i;
                eVar2.put(Defines$LinkParam.Duration.getKey(), i);
            } else {
                eVar2.getClass();
            }
            C7034e eVar3 = this.f15769j;
            if (arrayList != null) {
                eVar3.f15643a = arrayList;
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                eVar3.put(Defines$LinkParam.Tags.getKey(), jSONArray);
            } else {
                eVar3.getClass();
            }
            C7034e eVar4 = this.f15769j;
            if (str != null) {
                eVar4.f15644b = str;
                eVar4.put(Defines$LinkParam.Alias.getKey(), str);
            } else {
                eVar4.getClass();
            }
            C7034e eVar5 = this.f15769j;
            if (str2 != null) {
                eVar5.f15645c = str2;
                eVar5.put(Defines$LinkParam.Channel.getKey(), str2);
            } else {
                eVar5.getClass();
            }
            C7034e eVar6 = this.f15769j;
            if (str3 != null) {
                eVar6.f15646d = str3;
                eVar6.put(Defines$LinkParam.Feature.getKey(), str3);
            } else {
                eVar6.getClass();
            }
            C7034e eVar7 = this.f15769j;
            if (str4 != null) {
                eVar7.f15647e = str4;
                eVar7.put(Defines$LinkParam.Stage.getKey(), str4);
            } else {
                eVar7.getClass();
            }
            C7034e eVar8 = this.f15769j;
            if (str5 != null) {
                eVar8.f15648f = str5;
                eVar8.put(Defines$LinkParam.Campaign.getKey(), str5);
            } else {
                eVar8.getClass();
            }
            C7034e eVar9 = this.f15769j;
            eVar9.f15649g = jSONObject;
            eVar9.put(Defines$LinkParam.Data.getKey(), jSONObject);
            mo19254n(this.f15769j);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f15621g = true;
        }
    }

    /* renamed from: b */
    public final void mo19245b() {
    }

    /* renamed from: g */
    public final void mo19248g(int i, String str) {
    }

    /* renamed from: h */
    public final void mo19249h() {
    }

    /* renamed from: k */
    public final void mo19252k(C7031c0 c0Var, Branch branch) {
        try {
            c0Var.mo19274a().getString("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    public final String mo19339s(String str) {
        try {
            String str2 = "";
            if (Branch.m13575j().f15596v.f15762a) {
                if (!str.contains("https://bnc.lt/a/")) {
                    str = str.replace(new URL(str).getQuery(), str2);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("?") ? str2 : "?");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (!sb2.endsWith("?")) {
                str2 = "&";
            }
            sb3.append(str2);
            String sb4 = sb3.toString();
            Collection<String> collection = this.f15769j.f15643a;
            if (collection != null) {
                for (String next : collection) {
                    if (next != null && next.length() > 0) {
                        sb4 = sb4 + Defines$LinkParam.Tags + "=" + URLEncoder.encode(next, "UTF8") + "&";
                    }
                }
            }
            String str3 = this.f15769j.f15644b;
            if (str3 != null && str3.length() > 0) {
                sb4 = sb4 + Defines$LinkParam.Alias + "=" + URLEncoder.encode(str3, "UTF8") + "&";
            }
            String str4 = this.f15769j.f15645c;
            if (str4 != null && str4.length() > 0) {
                sb4 = sb4 + Defines$LinkParam.Channel + "=" + URLEncoder.encode(str4, "UTF8") + "&";
            }
            String str5 = this.f15769j.f15646d;
            if (str5 != null && str5.length() > 0) {
                sb4 = sb4 + Defines$LinkParam.Feature + "=" + URLEncoder.encode(str5, "UTF8") + "&";
            }
            String str6 = this.f15769j.f15647e;
            if (str6 != null && str6.length() > 0) {
                sb4 = sb4 + Defines$LinkParam.Stage + "=" + URLEncoder.encode(str6, "UTF8") + "&";
            }
            String str7 = this.f15769j.f15648f;
            if (str7 != null && str7.length() > 0) {
                sb4 = sb4 + Defines$LinkParam.Campaign + "=" + URLEncoder.encode(str7, "UTF8") + "&";
            }
            this.f15769j.getClass();
            String str8 = (sb4 + Defines$LinkParam.Type + "=" + ((long) 0) + "&") + Defines$LinkParam.Duration + "=" + ((long) this.f15769j.f15650h);
            String jSONObject = this.f15769j.f15649g.toString();
            if (jSONObject == null || jSONObject.length() <= 0) {
                return str8;
            }
            return str8 + "&source=android&data=" + URLEncoder.encode(new String(C7023a.m13619a(jSONObject.getBytes()), "US-ASCII"), "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        } catch (Exception unused) {
            new C7032d("Trouble creating a URL.", -116);
            throw null;
        }
    }

    /* renamed from: t */
    public final String mo19340t() {
        if (!this.f15617c.mo19328r("bnc_user_url").equals("bnc_no_value")) {
            return mo19339s(this.f15617c.mo19328r("bnc_user_url"));
        }
        StringBuilder h = C0072d.m201h("https://bnc.lt/a/");
        h.append(this.f15617c.mo19317f());
        return mo19339s(h.toString());
    }

    public C7082t(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context) {
        super(defines$RequestPath, jSONObject, context);
        this.f15770k = true;
        this.f15771l = true;
    }
}
