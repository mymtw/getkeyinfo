package p233s4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.view.ContextThemeWrapper;
import p075d.C6614a;
import p260v0.C8184a;
import p280x0.C8292f;

/* renamed from: s4.b */
public final class C7816b {

    /* renamed from: a */
    public static volatile boolean f17278a = true;

    /* renamed from: a */
    public static Drawable m15070a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f17278a) {
                return C6614a.m12981a(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            f17278a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = C8184a.f17966a;
                return C8184a.C8187c.m16466b(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        return resources.getDrawable(i, theme);
    }
}
