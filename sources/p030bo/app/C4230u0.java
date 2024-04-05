package p030bo.app;

import com.braze.support.BrazeLogger;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.u0 */
public final class C4230u0 {

    /* renamed from: a */
    public static final C4230u0 f9378a = new C4230u0();

    /* renamed from: bo.app.u0$a */
    public static final class C4231a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9379b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4231a(String str) {
            super(0);
            this.f9379b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9379b, "Failed to create valid enum from string: ");
        }
    }

    private C4230u0() {
    }

    /* renamed from: a */
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum m9698a(String str, Class<TargetEnum> cls) {
        C19383o.m32797g(str, "enumValue");
        C19383o.m32797g(cls, "targetEnumClass");
        return Enum.valueOf(cls, str);
    }

    /* renamed from: a */
    public static final <TargetEnum extends Enum<TargetEnum>> EnumSet<TargetEnum> m9699a(Class<TargetEnum> cls, Set<String> set) {
        C19383o.m32797g(cls, "targetEnumClass");
        C19383o.m32797g(set, "sourceStringSet");
        EnumSet<TargetEnum> noneOf = EnumSet.noneOf(cls);
        for (String str : set) {
            try {
                Locale locale = Locale.US;
                C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                String upperCase = str.toUpperCase(locale);
                C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                noneOf.add(m9698a(upperCase, cls));
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f9378a, BrazeLogger.Priority.E, e, new C4231a(str), 4);
            }
        }
        C19383o.m32796f(noneOf, "result");
        return noneOf;
    }

    /* renamed from: a */
    public static final Set<String> m9700a(EnumSet<?> enumSet) {
        C19383o.m32797g(enumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(enumSet));
        Iterator<T> it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return C19327t.m32664t1(arrayList);
    }
}
