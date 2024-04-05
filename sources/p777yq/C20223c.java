package p777yq;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;

/* renamed from: yq.c */
public final class C20223c implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
