package p777yq;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;

/* renamed from: yq.d */
public final class C20224d implements C20219a {

    /* renamed from: a */
    public int f44842a = -1;

    /* renamed from: a */
    public final List<String> mo72810a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f44842a != i) {
            this.f44842a = i;
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            } catch (Throwable unused) {
                throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
            }
        }
    }
}
