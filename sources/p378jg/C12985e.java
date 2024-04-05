package p378jg;

import androidx.compose.animation.C0388a;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;

/* renamed from: jg.e */
public final class C12985e implements FilenameFilter {

    /* renamed from: a */
    public static final C12985e f28598a = new C12985e();

    public final boolean accept(File file, String str) {
        C19383o.m32796f(str, "name");
        return new Regex(C0388a.m1049e(new Object[]{"analysis_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(str);
    }
}
