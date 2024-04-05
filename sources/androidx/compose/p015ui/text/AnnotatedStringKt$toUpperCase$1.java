package androidx.compose.p015ui.text;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p157k0.C7173a;
import p157k0.C7174b;
import p157k0.C7175c;
import p157k0.C7177d;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1 */
final class AnnotatedStringKt$toUpperCase$1 extends Lambda implements C19862q<String, Integer, Integer, String> {
    public final /* synthetic */ C7175c $localeList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt$toUpperCase$1(C7175c cVar) {
        super(3);
        this.$localeList = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final String invoke(String str, int i, int i2) {
        C7174b bVar;
        C19383o.m32797g(str, "str");
        String substring = str.substring(i, i2);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        C7175c cVar = this.$localeList;
        C19383o.m32797g(cVar, "localeList");
        if (cVar.isEmpty()) {
            LocaleList localeList = LocaleList.getDefault();
            C19383o.m32796f(localeList, "getDefault()");
            ArrayList arrayList = new ArrayList();
            int size = localeList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Locale locale = localeList.get(i3);
                C19383o.m32796f(locale, "localeList[i]");
                arrayList.add(new C7173a(locale));
            }
            bVar = new C7174b((C7177d) arrayList.get(0));
        } else {
            bVar = cVar.f15951b.get(0);
        }
        C19383o.m32797g(bVar, "locale");
        C7177d dVar = bVar.f15950a;
        C19383o.m32797g(dVar, "locale");
        String upperCase = substring.toUpperCase(((C7173a) dVar).f15949a);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
