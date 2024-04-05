package p777yq;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;

/* renamed from: yq.h */
public final class C20228h implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return new ArrayList(0);
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }
}
