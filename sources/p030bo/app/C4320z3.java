package p030bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.z3 */
public class C4320z3 implements C3548a2 {

    /* renamed from: f */
    private static final String f9532f = BrazeLogger.m11287i(C4320z3.class);

    /* renamed from: b */
    private final C3550a4 f9533b;

    /* renamed from: c */
    private final String f9534c;

    /* renamed from: d */
    private final int f9535d;

    /* renamed from: e */
    private Object f9536e;

    /* renamed from: bo.app.z3$a */
    public static /* synthetic */ class C4321a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9537a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                bo.app.a4[] r0 = p030bo.app.C3550a4.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9537a = r0
                bo.app.a4 r1 = p030bo.app.C3550a4.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9537a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.a4 r1 = p030bo.app.C3550a4.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9537a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.a4 r1 = p030bo.app.C3550a4.DATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9537a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bo.app.a4 r1 = p030bo.app.C3550a4.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4320z3.C4321a.<clinit>():void");
        }
    }

    public C4320z3(C3550a4 a4Var, String str, int i) {
        this.f9533b = a4Var;
        this.f9534c = str;
        this.f9535d = i;
    }

    /* renamed from: b */
    private boolean m9999b(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Double)) {
            return this.f9535d == 2;
        }
        double doubleValue = ((Number) obj).doubleValue();
        double doubleValue2 = ((Number) this.f9536e).doubleValue();
        int i = this.f9535d;
        return i != 1 ? i != 2 ? i != 3 ? i == 5 && doubleValue < doubleValue2 : doubleValue > doubleValue2 : doubleValue != doubleValue2 : doubleValue == doubleValue2;
    }

    /* renamed from: c */
    private boolean m10000c(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.f9535d;
            return i == 2 || i == 17;
        }
        int i2 = this.f9535d;
        if (i2 == 1) {
            return obj.equals(this.f9536e);
        }
        if (i2 == 2) {
            return !obj.equals(this.f9536e);
        }
        if (i2 == 10) {
            return m9998a((String) this.f9536e, (String) obj);
        }
        if (i2 != 17) {
            return false;
        }
        return !m9998a((String) this.f9536e, (String) obj);
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (!(s2Var instanceof C4233u2)) {
            return false;
        }
        BrazeProperties c = ((C4233u2) s2Var).mo13336c();
        Object obj = null;
        if (c != null) {
            try {
                obj = c.f11850b.opt(this.f9534c);
            } catch (Exception e) {
                BrazeLogger.m11286h(f9532f, "Caught exception checking property filter condition.", e);
                return false;
            }
        }
        if (obj == null) {
            int i = this.f9535d;
            if (i == 12 || i == 17 || i == 2) {
                return true;
            }
            return false;
        }
        int i2 = this.f9535d;
        if (i2 == 11) {
            return true;
        }
        if (i2 == 12) {
            return false;
        }
        int i3 = C4321a.f9537a[this.f9533b.ordinal()];
        if (i3 == 1) {
            return m10000c(obj);
        }
        if (i3 == 2) {
            return m9996a(obj);
        }
        if (i3 == 3) {
            return m9997a(obj, s2Var.mo13264b());
        }
        if (i3 != 4) {
            return false;
        }
        return m9999b(obj);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f9533b.equals(C3550a4.UNKNOWN)) {
                jSONObject.put("property_type", this.f9533b.toString());
            }
            jSONObject.put("property_key", this.f9534c);
            jSONObject.put("comparator", this.f9535d);
            jSONObject.put("property_value", this.f9536e);
        } catch (JSONException e) {
            BrazeLogger.m11286h(f9532f, "Caught exception creating property filter Json.", e);
        }
        return jSONObject;
    }

    public C4320z3(JSONObject jSONObject) {
        this((C3550a4) JsonUtils.m11317h(jSONObject, "property_type", C3550a4.class, C3550a4.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (!jSONObject.has("property_value")) {
            return;
        }
        if (this.f9533b.equals(C3550a4.STRING)) {
            this.f9536e = jSONObject.getString("property_value");
        } else if (this.f9533b.equals(C3550a4.BOOLEAN)) {
            this.f9536e = Boolean.valueOf(jSONObject.getBoolean("property_value"));
        } else if (this.f9533b.equals(C3550a4.NUMBER)) {
            this.f9536e = Double.valueOf(jSONObject.getDouble("property_value"));
        } else if (this.f9533b.equals(C3550a4.DATE)) {
            this.f9536e = Long.valueOf(jSONObject.getLong("property_value"));
        }
    }

    /* renamed from: a */
    private boolean m9997a(Object obj, long j) {
        Date date = null;
        if (obj instanceof String) {
            try {
                date = DateTimeUtils.m11304f((String) obj, BrazeDateFormat.LONG);
            } catch (Exception e) {
                BrazeLogger.m11286h(f9532f, "Caught exception trying to parse date in compareTimestamps", e);
            }
        }
        if (date != null) {
            TimeZone timeZone = DateTimeUtils.f11946a;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(date.getTime());
            long longValue = ((Number) this.f9536e).longValue();
            int i = this.f9535d;
            if (i != 15) {
                if (i != 16) {
                    switch (i) {
                        case 1:
                            if (seconds == longValue) {
                                return true;
                            }
                            return false;
                        case 2:
                            if (seconds != longValue) {
                                return true;
                            }
                            return false;
                        case 3:
                            if (seconds > longValue) {
                                return true;
                            }
                            return false;
                        case 4:
                            if (seconds >= j - longValue) {
                                return true;
                            }
                            return false;
                        case 5:
                            if (seconds < longValue) {
                                return true;
                            }
                            return false;
                        case 6:
                            if (seconds <= j - longValue) {
                                return true;
                            }
                            return false;
                        default:
                            return false;
                    }
                } else if (seconds > j + longValue) {
                    return true;
                } else {
                    return false;
                }
            } else if (seconds < j + longValue) {
                return true;
            } else {
                return false;
            }
        } else if (this.f9535d == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m9996a(Object obj) {
        if (obj instanceof Boolean) {
            int i = this.f9535d;
            if (i == 1) {
                return obj.equals(this.f9536e);
            }
            if (i != 2) {
                return false;
            }
            return !obj.equals(this.f9536e);
        } else if (this.f9535d == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m9998a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}
