package p777yq;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;

/* renamed from: yq.i */
public final class C20229i implements C20219a {

    /* renamed from: a */
    public final Uri f44845a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public final List<String> mo72810a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f44845a, "setAppBadgeCount", (String) null, bundle);
    }
}
