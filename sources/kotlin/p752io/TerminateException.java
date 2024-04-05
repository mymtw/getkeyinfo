package kotlin.p752io;

import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.io.TerminateException */
final class TerminateException extends FileSystemException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TerminateException(File file) {
        super(file, (File) null, (String) null, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(file, ResponseConstants.FILE);
    }
}
