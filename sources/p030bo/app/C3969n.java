package p030bo.app;

import android.location.Location;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.n */
public final class C3969n implements C4257w1 {

    /* renamed from: b */
    private final double f8907b;

    /* renamed from: c */
    private final double f8908c;

    /* renamed from: d */
    private final Double f8909d;

    /* renamed from: e */
    private final Double f8910e;

    /* renamed from: bo.app.n$a */
    public static final class C3970a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3970a f8911b = new C3970a();

        public C3970a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating location Json.";
        }
    }

    public C3969n(double d, double d2, Double d3, Double d4) {
        this.f8907b = d;
        this.f8908c = d2;
        this.f8909d = d3;
        this.f8910e = d4;
        if (!ValidationUtils.m11347b(getLatitude(), getLongitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively".toString());
        }
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            if (mo13728w() != null) {
                jSONObject.put("altitude", mo13728w());
            }
            if (mo13727v() != null) {
                jSONObject.put("ll_accuracy", mo13727v());
            }
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3970a.f8911b, 4);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3969n)) {
            return false;
        }
        C3969n nVar = (C3969n) obj;
        return C19383o.m32792b(Double.valueOf(this.f8907b), Double.valueOf(nVar.f8907b)) && C19383o.m32792b(Double.valueOf(this.f8908c), Double.valueOf(nVar.f8908c)) && C19383o.m32792b(this.f8909d, nVar.f8909d) && C19383o.m32792b(this.f8910e, nVar.f8910e);
    }

    public double getLatitude() {
        return this.f8907b;
    }

    public double getLongitude() {
        return this.f8908c;
    }

    public int hashCode() {
        int hashCode = (Double.hashCode(this.f8908c) + (Double.hashCode(this.f8907b) * 31)) * 31;
        Double d = this.f8909d;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f8910e;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BrazeLocation(_latitude=");
        h.append(this.f8907b);
        h.append(", _longitude=");
        h.append(this.f8908c);
        h.append(", _altitude=");
        h.append(this.f8909d);
        h.append(", _accuracy=");
        h.append(this.f8910e);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public Double mo13727v() {
        return this.f8910e;
    }

    /* renamed from: w */
    public Double mo13728w() {
        return this.f8909d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3969n(double d, double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3969n(Location location) {
        this(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Double.valueOf((double) location.getAccuracy()));
        C19383o.m32797g(location, "location");
    }
}
