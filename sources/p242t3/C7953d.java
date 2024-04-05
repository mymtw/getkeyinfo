package p242t3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import com.airbnb.paris.typed_array_wrappers.C4869b;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import com.airbnb.paris.typed_array_wrappers.MapTypedArrayWrapper;
import com.airbnb.paris.typed_array_wrappers.MultiTypedArrayWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p221r3.C7740b;
import p221r3.C7741c;
import p568fn.C17782b;

/* renamed from: t3.d */
public final class C7953d implements C7956f {

    /* renamed from: a */
    public final boolean f17424a = true;

    /* renamed from: b */
    public final Map<Integer, Object> f17425b;

    /* renamed from: c */
    public String f17426c;

    /* renamed from: t3.d$a */
    public static final class C7954a {

        /* renamed from: a */
        public final Map<Integer, Object> f17427a;

        /* renamed from: b */
        public String f17428b;

        public C7954a() {
            this(0);
        }

        public C7954a(int i) {
            this.f17427a = new HashMap();
            this.f17428b = "a programmatic style";
        }

        /* renamed from: a */
        public final void mo20495a(int i, Object obj) {
            this.f17427a.put(Integer.valueOf(i), obj);
        }

        /* renamed from: b */
        public final void mo20496b(int i, int i2) {
            mo20495a(i, new C7740b(i2));
        }

        /* renamed from: c */
        public final void mo20497c(int i, int i2) {
            mo20495a(i, new C7741c(i2));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7954a)) {
                return false;
            }
            C7954a aVar = (C7954a) obj;
            return C19383o.m32792b(this.f17427a, aVar.f17427a) && C19383o.m32792b(this.f17428b, aVar.f17428b);
        }

        public final int hashCode() {
            Map<Integer, Object> map = this.f17427a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            String str = this.f17428b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Builder(attrResToValueResMap=");
            h.append(this.f17427a);
            h.append(", name=");
            return C0023f.m110k(h, this.f17428b, ")");
        }
    }

    public C7953d(C7954a aVar) {
        Map<Integer, Object> map = aVar.f17427a;
        String str = aVar.f17428b;
        C19383o.m32798h(map, "attributeMap");
        this.f17425b = map;
        this.f17426c = str;
    }

    /* renamed from: a */
    public final boolean mo20483a() {
        return this.f17424a;
    }

    @SuppressLint({"Recycle"})
    /* renamed from: b */
    public final C4870c mo20484b(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        C19383o.m32793c(obtainStyledAttributes, "context.obtainStyledAttributes(attrs)");
        C4869b bVar = new C4869b(context, obtainStyledAttributes);
        MapTypedArrayWrapper mapTypedArrayWrapper = new MapTypedArrayWrapper(context, iArr, this.f17425b);
        if (bVar.mo14765h() <= 0) {
            return mapTypedArrayWrapper;
        }
        return new MultiTypedArrayWrapper(C17782b.m29865e0(bVar, mapTypedArrayWrapper), iArr);
    }

    /* renamed from: c */
    public final String mo20485c(Context context) {
        String str = this.f17426c;
        return str != null ? str : "a programmatic style";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7953d)) {
            return false;
        }
        C7953d dVar = (C7953d) obj;
        return C19383o.m32792b(this.f17425b, dVar.f17425b) && C19383o.m32792b(this.f17426c, dVar.f17426c);
    }

    public final int hashCode() {
        Map<Integer, Object> map = this.f17425b;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.f17426c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ProgrammaticStyle(attributeMap=");
        h.append(this.f17425b);
        h.append(", name=");
        return C0023f.m110k(h, this.f17426c, ")");
    }
}
