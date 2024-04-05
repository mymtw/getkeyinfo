package p242t3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import com.airbnb.paris.typed_array_wrappers.C4869b;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import kotlin.jvm.internal.C19383o;

/* renamed from: t3.a */
public final class C7950a implements C7956f {

    /* renamed from: a */
    public final AttributeSet f17419a;

    public C7950a(AttributeSet attributeSet) {
        C19383o.m32798h(attributeSet, "attributeSet");
        this.f17419a = attributeSet;
    }

    /* renamed from: a */
    public final boolean mo20483a() {
        return false;
    }

    @SuppressLint({"Recycle"})
    /* renamed from: b */
    public final C4870c mo20484b(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f17419a, iArr, 0, 0);
        C19383o.m32793c(obtainStyledAttributes, "context.obtainStyledAttr…ttributeSet, attrs, 0, 0)");
        return new C4869b(context, obtainStyledAttributes);
    }

    /* renamed from: c */
    public final String mo20485c(Context context) {
        throw new UnsupportedOperationException("Style names are meant to be used in a debug context and never for AttributeSetStyle");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7950a) && C19383o.m32792b(this.f17419a, ((C7950a) obj).f17419a);
        }
        return true;
    }

    public final int hashCode() {
        AttributeSet attributeSet = this.f17419a;
        if (attributeSet != null) {
            return attributeSet.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AttributeSetStyle(attributeSet=");
        h.append(this.f17419a);
        h.append(")");
        return h.toString();
    }
}
