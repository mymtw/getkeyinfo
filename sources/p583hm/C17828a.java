package p583hm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: hm.a */
public final class C17828a {

    /* renamed from: g */
    public static final String[] f38732g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    public static final SimpleDateFormat f38733h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f38734a;

    /* renamed from: b */
    public final String f38735b;

    /* renamed from: c */
    public final String f38736c;

    /* renamed from: d */
    public final Date f38737d;

    /* renamed from: e */
    public final long f38738e;

    /* renamed from: f */
    public final long f38739f;

    public C17828a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f38734a = str;
        this.f38735b = str2;
        this.f38736c = str3;
        this.f38737d = date;
        this.f38738e = j;
        this.f38739f = j2;
    }
}
