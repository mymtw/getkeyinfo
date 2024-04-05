package p770sq;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.apache.commons.cli.HelpFormatter;
import p773uq.C20205a;

/* renamed from: sq.d */
public final class C20171d {
    /* renamed from: a */
    public static String m34477a(boolean z) {
        return z ? UUID.randomUUID().toString() : UUID.randomUUID().toString().replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, "");
    }

    /* renamed from: b */
    public static void m34478b(Class<?> cls, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C20205a.m34555b(e, cls.getClass());
            }
        }
    }

    /* renamed from: c */
    public static boolean m34479c(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    /* renamed from: d */
    public static boolean m34480d(Object obj) throws NoSuchFieldException {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof Long ? ((Long) obj).longValue() == 0 : !(obj instanceof Integer) || ((Integer) obj).intValue() == 0;
    }
}
