package androidx.compose.p015ui.text.platform.extensions;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import androidx.compose.p015ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p157k0.C7173a;
import p157k0.C7174b;
import p157k0.C7175c;

/* renamed from: androidx.compose.ui.text.platform.extensions.a */
public final class C2018a {

    /* renamed from: a */
    public static final C2018a f4585a = new C2018a();

    /* renamed from: a */
    public final Object mo7729a(C7175c cVar) {
        C19383o.m32797g(cVar, "localeList");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(cVar));
        Iterator<C7174b> it = cVar.iterator();
        while (it.hasNext()) {
            C7174b next = it.next();
            C19383o.m32797g(next, "<this>");
            arrayList.add(((C7173a) next.f15950a).f15949a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array != null) {
            Locale[] localeArr = (Locale[]) array;
            return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: b */
    public final void mo7730b(AndroidTextPaint androidTextPaint, C7175c cVar) {
        C19383o.m32797g(androidTextPaint, "textPaint");
        C19383o.m32797g(cVar, "localeList");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(cVar));
        Iterator<C7174b> it = cVar.iterator();
        while (it.hasNext()) {
            C7174b next = it.next();
            C19383o.m32797g(next, "<this>");
            arrayList.add(((C7173a) next.f15950a).f15949a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array != null) {
            Locale[] localeArr = (Locale[]) array;
            androidTextPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
