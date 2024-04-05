package kotlin.p752io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$1 */
final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements C19861p {
    public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();

    public FilesKt__UtilsKt$copyRecursively$1() {
        super(2);
    }

    public final Void invoke(File file, IOException iOException) {
        C19383o.m32797g(file, "<anonymous parameter 0>");
        C19383o.m32797g(iOException, "exception");
        throw iOException;
    }
}
