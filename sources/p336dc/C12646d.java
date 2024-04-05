package p336dc;

import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.etsy.android.push.C8941d;
import com.etsy.android.push.PushOptInFatigue;
import kotlin.jvm.internal.C19383o;

/* renamed from: dc.d */
public final class C12646d {

    /* renamed from: a */
    public final C8941d f27892a;

    /* renamed from: b */
    public final C12645c f27893b;

    /* renamed from: c */
    public final PushOptInFatigue f27894c;

    public C12646d(C8941d dVar, C12645c cVar, PushOptInFatigue pushOptInFatigue) {
        C19383o.m32797g(dVar, "notificationStateReader");
        C19383o.m32797g(cVar, "shownTracker");
        C19383o.m32797g(pushOptInFatigue, "fatigue");
        this.f27892a = dVar;
        this.f27893b = cVar;
        this.f27894c = pushOptInFatigue;
    }

    /* renamed from: a */
    public final boolean mo45425a() {
        if (!NotificationManagerCompat.from(this.f27892a.f19730a).areNotificationsEnabled() && (!this.f27893b.f27891a.mo46761a().getBoolean("convo_push_prompt_shown", false))) {
            return this.f27894c.mo30551a();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo45426b() {
        SharedPreferences.Editor edit = this.f27893b.f27891a.mo46761a().edit();
        C19383o.m32796f(edit, "editor");
        edit.putBoolean("convo_push_prompt_shown", true);
        edit.apply();
        this.f27894c.mo30552b();
    }
}
