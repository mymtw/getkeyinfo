package p030bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.TimeZone;

/* renamed from: bo.app.e6 */
public abstract class C3652e6 implements C4173s2 {

    /* renamed from: d */
    private static final String f8379d = BrazeLogger.m11287i(C3652e6.class);

    /* renamed from: a */
    private final long f8380a;

    /* renamed from: b */
    private final long f8381b;

    /* renamed from: c */
    private C4208t1 f8382c;

    public C3652e6() {
        TimeZone timeZone = DateTimeUtils.f11946a;
        long currentTimeMillis = System.currentTimeMillis();
        this.f8381b = currentTimeMillis;
        this.f8380a = currentTimeMillis / 1000;
    }

    /* renamed from: a */
    public C4208t1 mo13262a() {
        return this.f8382c;
    }

    /* renamed from: b */
    public long mo13264b() {
        return this.f8380a;
    }

    /* renamed from: e */
    public long mo13265e() {
        return this.f8381b;
    }

    /* renamed from: a */
    public String mo13263a(String str) {
        if (StringUtils.m11343d(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = f8379d;
            BrazeLogger.m11286h(str2, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    public C3652e6(C4208t1 t1Var) {
        this();
        this.f8382c = t1Var;
    }
}
