package p312ag;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import p453tf.C13418j;

/* renamed from: ag.h */
public final class C8532h {

    /* renamed from: a */
    public int f18583a;

    /* renamed from: b */
    public Long f18584b;

    /* renamed from: c */
    public C8535j f18585c;

    /* renamed from: d */
    public final Long f18586d;

    /* renamed from: e */
    public Long f18587e;

    /* renamed from: f */
    public UUID f18588f;

    /* renamed from: ag.h$a */
    public static final class C8533a {
        /* renamed from: a */
        public static C8532h m16939a() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C13418j.m21106b());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
            C8535j jVar = null;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            C8532h hVar = new C8532h(Long.valueOf(j), Long.valueOf(j2));
            hVar.f18583a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(C13418j.m21106b());
            if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                jVar = new C8535j(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
            }
            hVar.f18585c = jVar;
            hVar.f18584b = Long.valueOf(System.currentTimeMillis());
            UUID fromString = UUID.fromString(string);
            C19383o.m32796f(fromString, "UUID.fromString(sessionIDStr)");
            hVar.f18588f = fromString;
            return hVar;
        }
    }

    public C8532h(Long l, Long l2) {
        UUID randomUUID = UUID.randomUUID();
        C19383o.m32796f(randomUUID, "UUID.randomUUID()");
        this.f18586d = l;
        this.f18587e = l2;
        this.f18588f = randomUUID;
    }

    /* renamed from: a */
    public final void mo21059a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C13418j.m21106b()).edit();
        Long l = this.f18586d;
        long j = 0;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0);
        Long l2 = this.f18587e;
        if (l2 != null) {
            j = l2.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f18583a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f18588f.toString());
        edit.apply();
        C8535j jVar = this.f18585c;
        if (jVar != null && jVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(C13418j.m21106b()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", jVar.f18592a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", jVar.f18593b);
            edit2.apply();
        }
    }
}
