package p378jg;

import androidx.compose.animation.C0388a;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;

/* renamed from: jg.f */
public final class C12986f implements FilenameFilter {

    /* renamed from: a */
    public static final C12986f f28599a = new C12986f();

    public final boolean accept(File file, String str) {
        C19383o.m32796f(str, "name");
        return new Regex(C0388a.m1049e(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(str);
    }
}
