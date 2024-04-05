package p777yq;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.List;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p776xq.C20219a;

/* renamed from: yq.b */
public final class C20222b implements C20219a {
    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    /* renamed from: b */
    public final void mo72811b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put(ResponseConstants.COUNT, Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
