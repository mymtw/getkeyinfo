package p242t3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import com.airbnb.paris.typed_array_wrappers.C4869b;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: t3.e */
public final class C7955e implements C7956f {

    /* renamed from: a */
    public final boolean f17429a = true;

    /* renamed from: b */
    public final int f17430b;

    /* renamed from: c */
    public String f17431c = null;

    public C7955e(int i) {
        this.f17430b = i;
    }

    /* renamed from: a */
    public final boolean mo20483a() {
        return this.f17429a;
    }

    @SuppressLint({"Recycle"})
    /* renamed from: b */
    public final C4870c mo20484b(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f17430b, iArr);
        C19383o.m32793c(obtainStyledAttributes, "context.obtainStyledAttributes(styleRes, attrs)");
        return new C4869b(context, obtainStyledAttributes);
    }

    /* renamed from: c */
    public final String mo20485c(Context context) {
        String resourceEntryName = context.getResources().getResourceEntryName(this.f17430b);
        C19383o.m32793c(resourceEntryName, "context.resources.getResourceEntryName(styleRes)");
        return resourceEntryName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7955e)) {
            return false;
        }
        C7955e eVar = (C7955e) obj;
        return this.f17430b == eVar.f17430b && C19383o.m32792b(this.f17431c, eVar.f17431c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f17430b) * 31;
        String str = this.f17431c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ResourceStyle(styleRes=");
        h.append(this.f17430b);
        h.append(", name=");
        return C0023f.m110k(h, this.f17431c, ")");
    }
}
