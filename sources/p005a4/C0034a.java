package p005a4;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

/* renamed from: a4.a */
public final class C0034a implements C0035b<JSONObject>, Comparable<C0034a> {

    /* renamed from: b */
    public final JSONObject f77b;

    /* renamed from: c */
    public final String f78c;

    /* renamed from: d */
    public final double f79d;

    /* renamed from: e */
    public final double f80e;

    /* renamed from: f */
    public final int f81f;

    /* renamed from: g */
    public final int f82g;

    /* renamed from: h */
    public final int f83h;

    /* renamed from: i */
    public final boolean f84i;

    /* renamed from: j */
    public final boolean f85j;

    /* renamed from: k */
    public final boolean f86k;

    /* renamed from: l */
    public final boolean f87l;

    /* renamed from: m */
    public final int f88m;

    /* renamed from: n */
    public double f89n = -1.0d;

    public C0034a(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        C19383o.m32796f(string, "jsonObject.getString(ID)");
        double d = jSONObject.getDouble("latitude");
        double d2 = jSONObject.getDouble("longitude");
        int i = jSONObject.getInt("radius");
        int i2 = jSONObject.getInt("cooldown_enter");
        int i3 = jSONObject.getInt("cooldown_exit");
        boolean z = jSONObject.getBoolean("analytics_enabled_enter");
        boolean z2 = jSONObject.getBoolean("analytics_enabled_exit");
        boolean optBoolean = jSONObject.optBoolean("enter_events", true);
        boolean optBoolean2 = jSONObject.optBoolean("exit_events", true);
        int optInt = jSONObject.optInt("notification_responsiveness", 30000);
        this.f77b = jSONObject;
        this.f78c = string;
        this.f79d = d;
        this.f80e = d2;
        this.f81f = i;
        this.f82g = i2;
        this.f83h = i3;
        this.f84i = z;
        this.f85j = z2;
        this.f86k = optBoolean;
        this.f87l = optBoolean2;
        this.f88m = optInt;
    }

    public final int compareTo(Object obj) {
        C0034a aVar = (C0034a) obj;
        C19383o.m32797g(aVar, "other");
        double d = this.f89n;
        return (!((d > -1.0d ? 1 : (d == -1.0d ? 0 : -1)) == 0) && d < aVar.f89n) ? -1 : 1;
    }

    public final Object forJsonPut() {
        return this.f77b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BrazeGeofence{id=");
        h.append(this.f78c);
        h.append(", latitude=");
        h.append(this.f79d);
        h.append(", longitude=");
        h.append(this.f80e);
        h.append(", radiusMeters=");
        h.append(this.f81f);
        h.append(", cooldownEnterSeconds=");
        h.append(this.f82g);
        h.append(", cooldownExitSeconds=");
        h.append(this.f83h);
        h.append(", analyticsEnabledEnter=");
        h.append(this.f84i);
        h.append(", analyticsEnabledExit=");
        h.append(this.f85j);
        h.append(", enterEvents=");
        h.append(this.f86k);
        h.append(", exitEvents=");
        h.append(this.f87l);
        h.append(", notificationResponsivenessMs=");
        h.append(this.f88m);
        h.append(", distanceFromGeofenceRefresh=");
        h.append(this.f89n);
        h.append(" }");
        return h.toString();
    }
}
