package p242t3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.airbnb.paris.typed_array_wrappers.C4869b;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import com.airbnb.paris.typed_array_wrappers.MultiTypedArrayWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: t3.c */
public final class C7952c implements C7956f {

    /* renamed from: a */
    public final boolean f17421a = true;

    /* renamed from: b */
    public final String f17422b;

    /* renamed from: c */
    public final List<C7956f> f17423c;

    public C7952c(String str, List<? extends C7956f> list) {
        this.f17422b = str;
        this.f17423c = list;
    }

    /* renamed from: a */
    public final boolean mo20483a() {
        return this.f17421a;
    }

    @SuppressLint({"Recycle"})
    /* renamed from: b */
    public final C4870c mo20484b(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        C19383o.m32793c(obtainStyledAttributes, "context.obtainStyledAttributes(attrs)");
        C4869b bVar = new C4869b(context, obtainStyledAttributes);
        List<C7956f> list = this.f17423c;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (C7956f b : list) {
            arrayList.add(b.mo20484b(context, iArr));
        }
        return new MultiTypedArrayWrapper(C19327t.m32650f1(arrayList, C17782b.m29864d0(bVar)), iArr);
    }

    /* renamed from: c */
    public final String mo20485c(Context context) {
        return this.f17422b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7952c)) {
            return false;
        }
        C7952c cVar = (C7952c) obj;
        return C19383o.m32792b(this.f17422b, cVar.f17422b) && C19383o.m32792b(this.f17423c, cVar.f17423c);
    }

    public final int hashCode() {
        String str = this.f17422b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C7956f> list = this.f17423c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MultiStyle(name=");
        h.append(this.f17422b);
        h.append(", styles=");
        return C0326j.m865j(h, this.f17423c, ")");
    }
}
