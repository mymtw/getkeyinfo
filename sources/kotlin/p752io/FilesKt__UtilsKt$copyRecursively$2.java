package kotlin.p752io;

import java.io.File;
import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements C19861p<File, IOException, C19394m> {
    public final /* synthetic */ C19861p<File, IOException, OnErrorAction> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilesKt__UtilsKt$copyRecursively$2(C19861p<? super File, ? super IOException, ? extends OnErrorAction> pVar) {
        super(2);
        this.$onError = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((File) obj, (IOException) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(File file, IOException iOException) {
        C19383o.m32797g(file, "f");
        C19383o.m32797g(iOException, "e");
        if (this.$onError.invoke(file, iOException) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }
}
