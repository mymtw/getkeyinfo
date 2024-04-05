package p365hg;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: hg.k0 */
public final class C12875k0 implements FilenameFilter {

    /* renamed from: a */
    public static final C12875k0 f28384a = new C12875k0();

    public final boolean accept(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }
}
