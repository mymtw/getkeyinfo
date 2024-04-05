package p777yq;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p399me.leolin.shortcutbadger.impl.DefaultBadger;
import p776xq.C20219a;
import p778zq.C20230a;

/* renamed from: yq.e */
public final class C20225e implements C20219a {

    /* renamed from: b */
    public static final String[] f44843b = {AnalyticsLogDatabaseHelper.f19040ID, "class"};

    /* renamed from: a */
    public DefaultBadger f44844a = new DefaultBadger();

    /* renamed from: c */
    public static ContentValues m34600c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f44844a != null) {
            if (C20230a.m34609a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || C20230a.m34609a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0) {
                this.f44844a.mo72811b(context, componentName, i);
                return;
            }
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f44843b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, m34600c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(parse, m34600c(componentName, i, true));
                }
            }
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }
}
