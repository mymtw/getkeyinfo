package p777yq;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;

/* renamed from: yq.g */
public final class C20227g implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }
}
