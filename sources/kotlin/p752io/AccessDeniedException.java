package kotlin.p752io;

import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.io.AccessDeniedException */
public final class AccessDeniedException extends FileSystemException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessDeniedException(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessDeniedException(File file, File file2, String str) {
        super(file, file2, str);
        C19383o.m32797g(file, ResponseConstants.FILE);
    }
}
