package p777yq;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;
import p778zq.C20230a;

/* renamed from: yq.a */
public final class C20221a implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"com.asus.launcher"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        boolean z = false;
        intent.putExtra("badge_vip_count", 0);
        Intent intent2 = new Intent(intent);
        intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
        try {
            C20230a.m34610b(context, intent2);
            z = true;
        } catch (ShortcutBadgeException unused) {
        }
        if (!z) {
            C20230a.m34610b(context, intent);
        }
    }
}
