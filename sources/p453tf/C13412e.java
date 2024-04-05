package p453tf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.AccessToken;
import p251u1.C8115a;
import p365hg.C12869i0;
import p365hg.C12879l0;

/* renamed from: tf.e */
public abstract class C13412e {

    /* renamed from: d */
    public static final /* synthetic */ int f29374d = 0;

    /* renamed from: a */
    public final C13413a f29375a;

    /* renamed from: b */
    public final C8115a f29376b;

    /* renamed from: c */
    public boolean f29377c = false;

    /* renamed from: tf.e$a */
    public class C13413a extends BroadcastReceiver {
        public C13413a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                int i = C13412e.f29374d;
                C12869i0.m20551G("e", "AccessTokenChanged");
                AccessToken accessToken = (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                C13412e.this.mo39685a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public C13412e() {
        C12879l0.m20603g();
        C13413a aVar = new C13413a();
        this.f29375a = aVar;
        C8115a a = C8115a.m16322a(C13418j.m21106b());
        this.f29376b = a;
        if (!this.f29377c) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            a.mo20708b(aVar, intentFilter);
            this.f29377c = true;
        }
    }

    /* renamed from: a */
    public abstract void mo39685a(AccessToken accessToken);
}
