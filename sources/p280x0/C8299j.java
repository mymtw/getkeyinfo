package p280x0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: x0.j */
public final class C8299j {
    /* renamed from: a */
    public static int m16588a(int i, Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: b */
    public static ColorStateList m16589b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!m16595h(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + 1 + ": " + typedValue);
        } else if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        } else {
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal<TypedValue> threadLocal = C8284b.f18155a;
            try {
                return C8284b.m16575a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
    }

    /* renamed from: c */
    public static C8285c m16590c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C8285c cVar;
        if (m16595h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C8285c((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                cVar = C8285c.m16577a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new C8285c((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: d */
    public static float m16591d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m16595h(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: e */
    public static int m16592e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m16595h(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: f */
    public static String m16593f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m16595h(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: g */
    public static String m16594g(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: h */
    public static boolean m16595h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: i */
    public static TypedArray m16596i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
