package p778zq;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.p013v4.media.C0072d;
import java.util.Collections;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: zq.a */
public final class C20230a {
    /* renamed from: a */
    public static List<ResolveInfo> m34609a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    /* renamed from: b */
    public static void m34610b(Context context, Intent intent) throws ShortcutBadgeException {
        List<ResolveInfo> a = m34609a(context, intent);
        if (a.size() != 0) {
            for (ResolveInfo next : a) {
                Intent intent2 = new Intent(intent);
                if (next != null) {
                    intent2.setPackage(next.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        StringBuilder h = C0072d.m201h("unable to resolve intent: ");
        h.append(intent.toString());
        throw new ShortcutBadgeException(h.toString());
    }
}
