package androidx.compose.p015ui.text;

import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p157k0.C7173a;
import p157k0.C7174b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$LocaleSaver$2 */
public final class SaversKt$LocaleSaver$2 extends Lambda implements C19857l<Object, C7174b> {
    public static final SaversKt$LocaleSaver$2 INSTANCE = new SaversKt$LocaleSaver$2();

    public SaversKt$LocaleSaver$2() {
        super(1);
    }

    public final C7174b invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        Locale forLanguageTag = Locale.forLanguageTag((String) obj);
        C19383o.m32796f(forLanguageTag, "forLanguageTag(languageTag)");
        return new C7174b(new C7173a(forLanguageTag));
    }
}
