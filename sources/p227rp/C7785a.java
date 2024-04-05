package p227rp;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.indexing.BranchUniversalObject;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7031c0;
import p145io.branch.referral.Defines$Jsonkey;
import p145io.branch.referral.Defines$RequestPath;
import p145io.branch.referral.ServerRequest;
import p145io.branch.referral.util.BRANCH_STANDARD_EVENT;

/* renamed from: rp.a */
public final class C7785a {

    /* renamed from: a */
    public final String f17222a;

    /* renamed from: b */
    public final boolean f17223b;

    /* renamed from: c */
    public final HashMap<String, Object> f17224c = new HashMap<>();

    /* renamed from: d */
    public final JSONObject f17225d = new JSONObject();

    /* renamed from: e */
    public final JSONObject f17226e = new JSONObject();

    /* renamed from: f */
    public final ArrayList f17227f;

    /* renamed from: rp.a$a */
    public class C7786a extends ServerRequest {
        public C7786a(C7785a aVar, Context context, Defines$RequestPath defines$RequestPath) {
            super(context, defines$RequestPath);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Defines$Jsonkey.Name.getKey(), aVar.f17222a);
                if (aVar.f17226e.length() > 0) {
                    jSONObject.put(Defines$Jsonkey.CustomData.getKey(), aVar.f17226e);
                }
                if (aVar.f17225d.length() > 0) {
                    jSONObject.put(Defines$Jsonkey.EventData.getKey(), aVar.f17225d);
                }
                if (aVar.f17224c.size() > 0) {
                    for (Map.Entry next : aVar.f17224c.entrySet()) {
                        jSONObject.put((String) next.getKey(), next.getValue());
                    }
                }
                if (aVar.f17227f.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put(Defines$Jsonkey.ContentItems.getKey(), jSONArray);
                    Iterator it = aVar.f17227f.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((BranchUniversalObject) it.next()).convertToJson());
                    }
                }
                mo19254n(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo19258r(jSONObject);
        }

        /* renamed from: b */
        public final void mo19245b() {
        }

        /* renamed from: e */
        public final ServerRequest.BRANCH_API_VERSION mo19246e() {
            return ServerRequest.BRANCH_API_VERSION.V2;
        }

        /* renamed from: g */
        public final void mo19248g(int i, String str) {
        }

        /* renamed from: h */
        public final void mo19249h() {
        }

        /* renamed from: k */
        public final void mo19252k(C7031c0 c0Var, Branch branch) {
        }

        /* renamed from: n */
        public final void mo19254n(JSONObject jSONObject) throws JSONException {
            super.mo19254n(jSONObject);
            this.f15617c.mo19329s(jSONObject);
        }

        /* renamed from: o */
        public final boolean mo19255o() {
            return true;
        }

        /* renamed from: p */
        public final boolean mo19256p() {
            return true;
        }
    }

    public C7785a(BRANCH_STANDARD_EVENT branch_standard_event) {
        String name = branch_standard_event.getName();
        this.f17222a = name;
        BRANCH_STANDARD_EVENT[] values = BRANCH_STANDARD_EVENT.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (name.equals(values[i].getName())) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.f17223b = z;
        this.f17227f = new ArrayList();
    }
}
