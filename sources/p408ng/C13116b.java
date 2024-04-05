package p408ng;

import androidx.compose.animation.C0388a;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;

/* renamed from: ng.b */
public final class C13116b implements FilenameFilter {

    /* renamed from: a */
    public static final C13116b f28841a = new C13116b();

    public final boolean accept(File file, String str) {
        C19383o.m32796f(str, "name");
        return new Regex(C0388a.m1049e(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(str);
    }
}
