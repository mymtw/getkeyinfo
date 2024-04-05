package p399me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Collections;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;
import p778zq.C20230a;

/* renamed from: me.leolin.shortcutbadger.impl.NewHtcHomeBadger */
public class NewHtcHomeBadger implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return Collections.singletonList("com.htc.launcher");
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra(ResponseConstants.COUNT, i);
        boolean z2 = false;
        try {
            C20230a.m34610b(context, intent);
            z = true;
        } catch (ShortcutBadgeException unused) {
            z = false;
        }
        try {
            C20230a.m34610b(context, intent2);
            z2 = true;
        } catch (ShortcutBadgeException unused2) {
        }
        if (!z && !z2) {
            StringBuilder h = C0072d.m201h("unable to resolve intent: ");
            h.append(intent2.toString());
            throw new ShortcutBadgeException(h.toString());
        }
    }
}
