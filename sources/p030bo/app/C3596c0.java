package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p753kq.C19846a;

/* renamed from: bo.app.c0 */
public final class C3596c0 {

    /* renamed from: a */
    public static final C3596c0 f8258a = new C3596c0();

    /* renamed from: bo.app.c0$a */
    public static final class C3597a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3597a f8259b = new C3597a();

        public C3597a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    /* renamed from: bo.app.c0$b */
    public static final class C3598b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8260b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3598b(String str) {
            super(0);
            this.f8260b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Custom attribute key cannot be blocklisted attribute: ");
            h.append(this.f8260b);
            h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            return h.toString();
        }
    }

    /* renamed from: bo.app.c0$c */
    public static final class C3599c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3599c f8261b = new C3599c();

        public C3599c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute value cannot be null.";
        }
    }

    private C3596c0() {
    }

    /* renamed from: a */
    public static final boolean m8499a(String str, Set<String> set) {
        C19383o.m32797g(set, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8258a, BrazeLogger.Priority.W, (Throwable) null, C3597a.f8259b, 6);
        } else if (!set.contains(str)) {
            return true;
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8258a, BrazeLogger.Priority.W, (Throwable) null, new C3598b(str), 6);
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m8498a(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, f8258a, BrazeLogger.Priority.W, (Throwable) null, C3599c.f8261b, 6);
        return false;
    }

    /* renamed from: a */
    public static final String[] m8500a(String[] strArr) {
        C19383o.m32797g(strArr, ResponseConstants.VALUES);
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            arrayList.add(ValidationUtils.m11346a(str));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
