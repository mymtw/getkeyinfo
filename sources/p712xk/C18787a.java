package p712xk;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.util.TypedValue;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import p289y0.C8354f;
import p507al.C14024b;

/* renamed from: xk.a */
public final class C18787a {
    /* renamed from: a */
    public static float m31703a(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static boolean m31704b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* renamed from: c */
    public static int m31705c(int i, Context context, int i2) {
        TypedValue a = C14024b.m21580a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    /* renamed from: d */
    public static TimeInterpolator m31706d(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m31704b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(m31703a(0, split), m31703a(1, split), m31703a(2, split), m31703a(3, split));
                }
                StringBuilder h = C0072d.m201h("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                h.append(split.length);
                throw new IllegalArgumentException(h.toString());
            } else if (m31704b(valueOf, ResponseConstants.PATH)) {
                return new PathInterpolator(C8354f.m16674d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException(C0326j.m864i("Invalid motion easing type: ", valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
