package kotlin.p752io;

import kotlin.jvm.internal.C19382n;

/* renamed from: kotlin.io.b */
public class C19365b extends C19382n {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        kotlin.reflect.C19421p.m32917E(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        kotlin.reflect.C19421p.m32917E(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        throw r8;
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m32685Q0(java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0025
            boolean r0 = r8.delete()
            if (r0 == 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r7, r8, r1)
            throw r0
        L_0x0025:
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r8.mkdirs()
            if (r0 == 0) goto L_0x0032
            goto L_0x0059
        L_0x0032:
            kotlin.io.FileSystemException r0 = new kotlin.io.FileSystemException
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r7, r8, r1)
            throw r0
        L_0x003a:
            java.io.File r0 = r8.getParentFile()
            if (r0 == 0) goto L_0x0043
            r0.mkdirs()
        L_0x0043:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0061 }
            r7.<init>(r8)     // Catch:{ all -> 0x0061 }
            r8 = 8192(0x2000, float:1.14794E-41)
            p568fn.C17782b.m29848N(r0, r7, r8)     // Catch:{ all -> 0x005a }
            r8 = 0
            kotlin.reflect.C19421p.m32917E(r7, r8)     // Catch:{ all -> 0x0061 }
            kotlin.reflect.C19421p.m32917E(r0, r8)
        L_0x0059:
            return
        L_0x005a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x005c }
        L_0x005c:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r7, r8)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r8 = move-exception
            kotlin.reflect.C19421p.m32917E(r0, r7)
            throw r8
        L_0x0068:
            kotlin.io.NoSuchFileException r8 = new kotlin.io.NoSuchFileException
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.String r4 = "The source file doesn't exist."
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p752io.C19365b.m32685Q0(java.io.File, java.io.File):void");
    }
}
