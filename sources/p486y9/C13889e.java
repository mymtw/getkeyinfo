package p486y9;

import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;

/* renamed from: y9.e */
public final class C13889e {
    /* renamed from: a */
    public static Locale m21414a(String str) throws Exception {
        List<T> list;
        boolean z;
        List<String> split = new Regex("[_,-]").split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (listIterator.previous().length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    list = C19327t.m32657m1(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = EmptyList.INSTANCE;
        Object[] array = list.toArray(new String[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (strArr.length >= 2) {
            return new Locale(strArr[0], strArr[1]);
        }
        throw new Exception("couldn't split language tag into at least 2 components (lang, COUNTRY) be sure your string is in the format en_US");
    }
}
