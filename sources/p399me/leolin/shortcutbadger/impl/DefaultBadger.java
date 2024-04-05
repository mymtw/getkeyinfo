package p399me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;
import p778zq.C20230a;

/* renamed from: me.leolin.shortcutbadger.impl.DefaultBadger */
public class DefaultBadger implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        Intent intent2 = new Intent(intent);
        intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
        try {
            C20230a.m34610b(context, intent2);
            z = true;
        } catch (ShortcutBadgeException unused) {
            z = false;
        }
        if (!z) {
            C20230a.m34610b(context, intent);
        }
    }
}
