package p001a0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.AttributeSet;
import kotlin.jvm.internal.C19383o;
import org.xmlpull.v1.XmlPullParser;
import p280x0.C8285c;
import p280x0.C8299j;

/* renamed from: a0.a */
public final class C0004a {

    /* renamed from: a */
    public final XmlPullParser f2a;

    /* renamed from: b */
    public int f3b = 0;

    public C0004a(XmlResourceParser xmlResourceParser) {
        this.f2a = xmlResourceParser;
    }

    /* renamed from: a */
    public final C8285c mo3a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        C8285c c = C8299j.m16590c(typedArray, this.f2a, theme, str, i);
        mo9f(typedArray.getChangingConfigurations());
        return c;
    }

    /* renamed from: b */
    public final float mo4b(TypedArray typedArray, String str, int i, float f) {
        float d = C8299j.m16591d(typedArray, this.f2a, str, i, f);
        mo9f(typedArray.getChangingConfigurations());
        return d;
    }

    /* renamed from: c */
    public final int mo5c(TypedArray typedArray, String str, int i, int i2) {
        int e = C8299j.m16592e(typedArray, this.f2a, str, i, i2);
        mo9f(typedArray.getChangingConfigurations());
        return e;
    }

    /* renamed from: d */
    public final String mo6d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        mo9f(typedArray.getChangingConfigurations());
        return string;
    }

    /* renamed from: e */
    public final TypedArray mo7e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, iArr);
        C19383o.m32796f(i, "obtainAttributes(\n      …          attrs\n        )");
        mo9f(i.getChangingConfigurations());
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0004a)) {
            return false;
        }
        C0004a aVar = (C0004a) obj;
        return C19383o.m32792b(this.f2a, aVar.f2a) && this.f3b == aVar.f3b;
    }

    /* renamed from: f */
    public final void mo9f(int i) {
        this.f3b = i | this.f3b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3b) + (this.f2a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AndroidVectorParser(xmlParser=");
        h.append(this.f2a);
        h.append(", config=");
        return C0073e.m208h(h, this.f3b, ')');
    }
}
