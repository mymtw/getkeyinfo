package p507al;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: al.b */
public final class C14024b {
    /* renamed from: a */
    public static TypedValue m21580a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static int m21581b(Context context, int i, String str) {
        TypedValue a = m21580a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }
}
