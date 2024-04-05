package p030bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0034a;
import p753kq.C19846a;

/* renamed from: bo.app.h1 */
public final class C3725h1 {

    /* renamed from: a */
    public static final C3725h1 f8510a = new C3725h1();

    /* renamed from: bo.app.h1$a */
    public static final class C3726a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3726a f8511b = new C3726a();

        public C3726a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank geofence Json. Not parsing.";
        }
    }

    /* renamed from: bo.app.h1$b */
    public static final class C3727b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8512b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3727b(JSONObject jSONObject) {
            super(0);
            this.f8512b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8512b, "Failed to deserialize geofence Json due to JSONException: ");
        }
    }

    /* renamed from: bo.app.h1$c */
    public static final class C3728c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8513b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3728c(JSONObject jSONObject) {
            super(0);
            this.f8513b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8513b, "Failed to deserialize geofence Json:");
        }
    }

    private C3725h1() {
    }

    /* renamed from: a */
    public static final List<C0034a> m8742a(JSONArray jSONArray) {
        C19383o.m32797g(jSONArray, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, f8510a, BrazeLogger.Priority.W, (Throwable) null, C3726a.f8511b, 6);
                } catch (JSONException e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, f8510a, BrazeLogger.Priority.W, e, new C3727b(optJSONObject), 4);
                } catch (Exception e2) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, f8510a, BrazeLogger.Priority.E, e2, new C3728c(optJSONObject), 4);
                }
            } else {
                arrayList.add(new C0034a(optJSONObject));
            }
            i = i2;
        }
        return arrayList;
    }
}
