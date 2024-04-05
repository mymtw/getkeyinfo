package kotlin.p752io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.io.FileSystemException */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FileSystemException(java.io.File r4, java.io.File r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            if (r5 == 0) goto L_0x0024
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " -> "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x0024:
            if (r6 == 0) goto L_0x003a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x003a:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            r3.<init>(r0)
            r3.file = r4
            r3.other = r5
            r3.reason = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p752io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystemException(File file2, File file3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file2, (i & 2) != 0 ? null : file3, (i & 4) != 0 ? null : str);
    }
}
