package p453tf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;
import p365hg.C12879l0;

/* renamed from: tf.t */
public abstract class C13434t {

    /* renamed from: a */
    public final C13435a f29422a;

    /* renamed from: b */
    public final C8115a f29423b;

    /* renamed from: c */
    public boolean f29424c;

    /* renamed from: tf.t$a */
    public final class C13435a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C13434t f29425a;

        public C13435a(ProfilePictureView.C12330a aVar) {
            this.f29425a = aVar;
        }

        public final void onReceive(Context context, Intent intent) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent, "intent");
            if (C19383o.m32792b("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED", intent.getAction())) {
                Profile profile = (Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE");
                Profile profile2 = (Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE");
                ProfilePictureView.C12330a aVar = (ProfilePictureView.C12330a) this.f29425a;
                ProfilePictureView.this.setProfileId(profile2 != null ? profile2.getId() : null);
                ProfilePictureView.this.refreshImage(true);
            }
        }
    }

    public C13434t() {
        C12879l0.m20603g();
        C13435a aVar = new C13435a((ProfilePictureView.C12330a) this);
        this.f29422a = aVar;
        C8115a a = C8115a.m16322a(C13418j.m21106b());
        C19383o.m32796f(a, "LocalBroadcastManager.ge….getApplicationContext())");
        this.f29423b = a;
        if (!this.f29424c) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            a.mo20708b(aVar, intentFilter);
            this.f29424c = true;
        }
    }
}
