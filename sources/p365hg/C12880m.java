package p365hg;

import android.content.Context;
import org.json.JSONObject;
import p401mg.C13080a;

/* renamed from: hg.m */
public final class C12880m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f28393b;

    /* renamed from: c */
    public final /* synthetic */ Context f28394c;

    /* renamed from: d */
    public final /* synthetic */ String f28395d;

    public C12880m(Context context, String str, String str2) {
        this.f28393b = str;
        this.f28394c = context;
        this.f28395d = str2;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                C12876l lVar = C12876l.f28390f;
                String str = this.f28393b;
                lVar.getClass();
                JSONObject a = C12876l.m20591a(str);
                if (a.length() != 0) {
                    C12876l.m20594d(this.f28393b, a);
                    this.f28394c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f28395d, a.toString()).apply();
                    C12876l.f28388d = Long.valueOf(System.currentTimeMillis());
                }
                C12876l.m20595e();
                C12876l.f28385a.set(false);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
