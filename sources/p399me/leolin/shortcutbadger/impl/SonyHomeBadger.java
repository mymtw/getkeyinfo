package p399me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;
import p777yq.C20226f;

/* renamed from: me.leolin.shortcutbadger.impl.SonyHomeBadger */
public class SonyHomeBadger implements C20219a {

    /* renamed from: a */
    public final Uri f43930a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    public C20226f f43931b;

    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z = false;
        if (!(context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null)) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            if (i > 0) {
                z = true;
            }
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
            context.sendBroadcast(intent);
        } else if (i >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i));
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f43931b == null) {
                    this.f43931b = new C20226f(context.getApplicationContext().getContentResolver());
                }
                this.f43931b.startInsert(0, (Object) null, this.f43930a, contentValues);
                return;
            }
            context.getApplicationContext().getContentResolver().insert(this.f43930a, contentValues);
        }
    }
}
