package p453tf;

import android.content.Intent;
import com.facebook.Profile;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p251u1.C8115a;
import p365hg.C12869i0;

/* renamed from: tf.s */
public final class C13432s {

    /* renamed from: d */
    public static volatile C13432s f29417d;

    /* renamed from: e */
    public static final C13433a f29418e = new C13433a();

    /* renamed from: a */
    public Profile f29419a;

    /* renamed from: b */
    public final C8115a f29420b;

    /* renamed from: c */
    public final C13431r f29421c;

    /* renamed from: tf.s$a */
    public static final class C13433a {
        /* renamed from: a */
        public final C13432s mo46107a() {
            if (C13432s.f29417d == null) {
                synchronized (this) {
                    if (C13432s.f29417d == null) {
                        C8115a a = C8115a.m16322a(C13418j.m21106b());
                        C19383o.m32796f(a, "LocalBroadcastManager.ge…tance(applicationContext)");
                        C13432s.f29417d = new C13432s(a, new C13431r());
                    }
                    C19394m mVar = C19394m.f43287a;
                }
            }
            C13432s sVar = C13432s.f29417d;
            if (sVar != null) {
                return sVar;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public C13432s(C8115a aVar, C13431r rVar) {
        this.f29420b = aVar;
        this.f29421c = rVar;
    }

    /* renamed from: a */
    public final void mo46106a(Profile profile, boolean z) {
        Profile profile2 = this.f29419a;
        this.f29419a = profile;
        if (z) {
            if (profile != null) {
                C13431r rVar = this.f29421c;
                rVar.getClass();
                JSONObject jSONObject = profile.toJSONObject();
                if (jSONObject != null) {
                    rVar.f29416a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                this.f29421c.f29416a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!C12869i0.m20562a(profile2, profile)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            this.f29420b.mo20709c(intent);
        }
    }
}
