package p469vf;

import com.facebook.internal.FetchedAppSettingsManager;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;
import p469vf.C13791d;

/* renamed from: vf.b */
public final class C13789b {

    /* renamed from: a */
    public static final String f30347a = C13789b.class.getCanonicalName();

    /* renamed from: b */
    public static boolean f30348b;

    /* renamed from: c */
    public static final C13789b f30349c = new C13789b();

    /* renamed from: a */
    public static final void m21337a(C13789b bVar) {
        String str;
        Class<C13789b> cls = C13789b.class;
        if (!C13080a.m20762b(cls)) {
            try {
                bVar.getClass();
                if (!C13080a.m20762b(bVar)) {
                    C12882n f = FetchedAppSettingsManager.m20107f(C13418j.m21107c(), false);
                    if (f != null && (str = f.f28409m) != null) {
                        C13791d.f30352e.getClass();
                        try {
                            C13791d.m21342a().clear();
                            C13791d.C13792a.m21344a(new JSONObject(str));
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }
}
