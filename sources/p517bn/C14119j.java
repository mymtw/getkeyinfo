package p517bn;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p575gm.C17793c;
import p607km.C18144a;

/* renamed from: bn.j */
public final class C14119j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final Set<Intent> f31106b = Collections.newSetFromMap(new WeakHashMap());

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent != null && this.f31106b.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
            if (bundle2 == null ? false : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle2.getString("google.c.a.e"))) {
                if (bundle2 != null) {
                    if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle2.getString("google.c.a.tc"))) {
                        C17793c b = C17793c.m29919b();
                        b.mo69021a();
                        C18144a aVar = (C18144a) b.f38675d.get(C18144a.class);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        if (aVar != null) {
                            String string = bundle2.getString("google.c.a.c_id");
                            aVar.mo69695g(string);
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString("campaign", string);
                            aVar.mo69690b("fcm", bundle3, "_cmp");
                        } else {
                            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                    }
                }
                C14128s.m21861b(bundle2, "_no");
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f31106b.remove(activity.getIntent());
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
