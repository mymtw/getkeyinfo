package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.profileinstaller.h */
public final class C3063h {

    /* renamed from: a */
    public static final C3064a f6980a = new C3064a();

    /* renamed from: b */
    public static final C3065b f6981b = new C3065b();

    /* renamed from: androidx.profileinstaller.h$a */
    public class C3064a implements C3066c {
        /* renamed from: a */
        public final void mo11216a(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.h$b */
    public class C3065b implements C3066c {
        /* renamed from: a */
        public final void mo11216a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.h$c */
    public interface C3066c {
        /* renamed from: a */
        void mo11216a(int i, Object obj);
    }

    /* renamed from: a */
    public static void m7229a(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x024e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x025a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:186:0x0243, B:196:0x0256] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7230b(android.content.Context r17, java.util.concurrent.Executor r18, androidx.profileinstaller.C3063h.C3066c r19, boolean r20) {
        /*
            r4 = r19
            java.lang.String r7 = "Invalid magic"
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            android.content.res.AssetManager r8 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.sourceDir
            r0.<init>(r2)
            java.lang.String r9 = r0.getName()
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x029c }
            java.io.File r11 = r17.getFilesDir()
            r12 = 0
            java.lang.String r3 = "ProfileInstaller"
            r13 = 1
            if (r20 != 0) goto L_0x0088
            java.io.File r0 = new java.io.File
            java.lang.String r5 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x0040
            goto L_0x006f
        L_0x0040:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006e }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006e }
            r5.<init>(r0)     // Catch:{ IOException -> 0x006e }
            r2.<init>(r5)     // Catch:{ IOException -> 0x006e }
            long r5 = r2.readLong()     // Catch:{ all -> 0x0062 }
            r2.close()     // Catch:{ IOException -> 0x006e }
            long r14 = r10.lastUpdateTime
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            r2 = r13
            goto L_0x005b
        L_0x0059:
            r0 = 0
            r2 = r0
        L_0x005b:
            if (r2 == 0) goto L_0x006f
            r0 = 2
            r4.mo11216a(r0, r12)
            goto L_0x006f
        L_0x0062:
            r0 = move-exception
            r5 = r0
            r2.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
            r2 = r0
            r5.addSuppressed(r2)     // Catch:{ IOException -> 0x006e }
        L_0x006d:
            throw r5     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            r2 = 0
        L_0x006f:
            if (r2 != 0) goto L_0x0072
            goto L_0x0088
        L_0x0072:
            java.lang.String r0 = "Skipping profile installation for "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r1 = r17.getPackageName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            goto L_0x028a
        L_0x0088:
            java.lang.String r0 = "Installing profile for "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r2 = r17.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r14 = new java.io.File
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r2.<init>(r3, r1)
            java.lang.String r1 = "primary.prof"
            r14.<init>(r2, r1)
            androidx.profileinstaller.b r15 = new androidx.profileinstaller.b
            java.lang.String r6 = "dexopt/baseline.prof"
            r1 = r15
            r2 = r8
            r3 = r18
            r4 = r19
            r5 = r9
            r16 = r6
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            byte[] r1 = r15.f6961d
            r2 = 4
            if (r1 != 0) goto L_0x00cb
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.mo11218a(r1, r0)
            goto L_0x00d4
        L_0x00cb:
            boolean r0 = r14.canWrite()
            if (r0 != 0) goto L_0x00d6
            r15.mo11218a(r2, r12)
        L_0x00d4:
            r0 = 0
            goto L_0x00d9
        L_0x00d6:
            r15.f6963f = r13
            r0 = r13
        L_0x00d9:
            if (r0 != 0) goto L_0x00dd
            goto L_0x028a
        L_0x00dd:
            boolean r0 = r15.f6963f
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0296
            byte[] r0 = r15.f6961d
            r3 = 6
            r4 = 8
            if (r0 != 0) goto L_0x00ec
            goto L_0x01bf
        L_0x00ec:
            r0 = r16
            android.content.res.AssetFileDescriptor r5 = r8.openFd(r0)     // Catch:{ FileNotFoundException -> 0x0144, IOException -> 0x013c, IllegalStateException -> 0x0135 }
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ all -> 0x0127 }
            byte[] r0 = androidx.profileinstaller.C3071m.f6990a     // Catch:{ all -> 0x0119 }
            byte[] r8 = androidx.profileinstaller.C3059d.m7223b(r6, r2)     // Catch:{ all -> 0x0119 }
            boolean r0 = java.util.Arrays.equals(r0, r8)     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x0113
            byte[] r0 = androidx.profileinstaller.C3059d.m7223b(r6, r2)     // Catch:{ all -> 0x0119 }
            androidx.profileinstaller.c[] r0 = androidx.profileinstaller.C3071m.m7241h(r6, r0, r9)     // Catch:{ all -> 0x0119 }
            r15.f6964g = r0     // Catch:{ all -> 0x0119 }
            r6.close()     // Catch:{ all -> 0x0127 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0144, IOException -> 0x013c, IllegalStateException -> 0x0135 }
            goto L_0x014a
        L_0x0113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0119 }
            r0.<init>(r7)     // Catch:{ all -> 0x0119 }
            throw r0     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            r8 = r0
            if (r6 == 0) goto L_0x0126
            r6.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            r6 = r0
            r8.addSuppressed(r6)     // Catch:{ all -> 0x0127 }
        L_0x0126:
            throw r8     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r0 = move-exception
            r6 = r0
            if (r5 == 0) goto L_0x0134
            r5.close()     // Catch:{ all -> 0x012f }
            goto L_0x0134
        L_0x012f:
            r0 = move-exception
            r5 = r0
            r6.addSuppressed(r5)     // Catch:{ FileNotFoundException -> 0x0144, IOException -> 0x013c, IllegalStateException -> 0x0135 }
        L_0x0134:
            throw r6     // Catch:{ FileNotFoundException -> 0x0144, IOException -> 0x013c, IllegalStateException -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            androidx.profileinstaller.h$c r5 = r15.f6960c
            r5.mo11216a(r4, r0)
            goto L_0x014a
        L_0x013c:
            r0 = move-exception
            androidx.profileinstaller.h$c r5 = r15.f6960c
            r6 = 7
            r5.mo11216a(r6, r0)
            goto L_0x014a
        L_0x0144:
            r0 = move-exception
            androidx.profileinstaller.h$c r5 = r15.f6960c
            r5.mo11216a(r3, r0)
        L_0x014a:
            androidx.profileinstaller.c[] r0 = r15.f6964g
            if (r0 == 0) goto L_0x01bf
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r5 == r6) goto L_0x0156
            r5 = 0
            goto L_0x0157
        L_0x0156:
            r5 = r13
        L_0x0157:
            if (r5 == 0) goto L_0x01bf
            android.content.res.AssetManager r5 = r15.f6958a     // Catch:{ FileNotFoundException -> 0x01b7, IOException -> 0x01af, IllegalStateException -> 0x01a6 }
            java.lang.String r6 = "dexopt/baseline.profm"
            android.content.res.AssetFileDescriptor r5 = r5.openFd(r6)     // Catch:{ FileNotFoundException -> 0x01b7, IOException -> 0x01af, IllegalStateException -> 0x01a6 }
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ all -> 0x0198 }
            byte[] r8 = androidx.profileinstaller.C3071m.f6991b     // Catch:{ all -> 0x018a }
            byte[] r9 = androidx.profileinstaller.C3059d.m7223b(r6, r2)     // Catch:{ all -> 0x018a }
            boolean r8 = java.util.Arrays.equals(r8, r9)     // Catch:{ all -> 0x018a }
            if (r8 == 0) goto L_0x0184
            byte[] r2 = androidx.profileinstaller.C3059d.m7223b(r6, r2)     // Catch:{ all -> 0x018a }
            byte[] r7 = r15.f6961d     // Catch:{ all -> 0x018a }
            androidx.profileinstaller.c[] r0 = androidx.profileinstaller.C3071m.m7238e(r6, r2, r7, r0)     // Catch:{ all -> 0x018a }
            r15.f6964g = r0     // Catch:{ all -> 0x018a }
            r6.close()     // Catch:{ all -> 0x0198 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x01b7, IOException -> 0x01af, IllegalStateException -> 0x01a6 }
            goto L_0x01bf
        L_0x0184:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x018a }
            r0.<init>(r7)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
            r2 = r0
            if (r6 == 0) goto L_0x0197
            r6.close()     // Catch:{ all -> 0x0192 }
            goto L_0x0197
        L_0x0192:
            r0 = move-exception
            r6 = r0
            r2.addSuppressed(r6)     // Catch:{ all -> 0x0198 }
        L_0x0197:
            throw r2     // Catch:{ all -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            r2 = r0
            if (r5 == 0) goto L_0x01a5
            r5.close()     // Catch:{ all -> 0x01a0 }
            goto L_0x01a5
        L_0x01a0:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ FileNotFoundException -> 0x01b7, IOException -> 0x01af, IllegalStateException -> 0x01a6 }
        L_0x01a5:
            throw r2     // Catch:{ FileNotFoundException -> 0x01b7, IOException -> 0x01af, IllegalStateException -> 0x01a6 }
        L_0x01a6:
            r0 = move-exception
            r15.f6964g = r12
            androidx.profileinstaller.h$c r2 = r15.f6960c
            r2.mo11216a(r4, r0)
            goto L_0x01bf
        L_0x01af:
            r0 = move-exception
            androidx.profileinstaller.h$c r2 = r15.f6960c
            r5 = 7
            r2.mo11216a(r5, r0)
            goto L_0x01bf
        L_0x01b7:
            r0 = move-exception
            androidx.profileinstaller.h$c r2 = r15.f6960c
            r5 = 9
            r2.mo11216a(r5, r0)
        L_0x01bf:
            androidx.profileinstaller.c[] r0 = r15.f6964g
            byte[] r2 = r15.f6961d
            if (r0 == 0) goto L_0x0218
            if (r2 != 0) goto L_0x01c8
            goto L_0x0218
        L_0x01c8:
            boolean r5 = r15.f6963f
            if (r5 == 0) goto L_0x0212
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0201 }
            r5.<init>()     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0201 }
            byte[] r6 = androidx.profileinstaller.C3071m.f6990a     // Catch:{ all -> 0x01f5 }
            r5.write(r6)     // Catch:{ all -> 0x01f5 }
            r5.write(r2)     // Catch:{ all -> 0x01f5 }
            boolean r0 = androidx.profileinstaller.C3071m.m7243j(r5, r2, r0)     // Catch:{ all -> 0x01f5 }
            if (r0 != 0) goto L_0x01eb
            androidx.profileinstaller.h$c r0 = r15.f6960c     // Catch:{ all -> 0x01f5 }
            r2 = 5
            r0.mo11216a(r2, r12)     // Catch:{ all -> 0x01f5 }
            r15.f6964g = r12     // Catch:{ all -> 0x01f5 }
            r5.close()     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0201 }
            goto L_0x0218
        L_0x01eb:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x01f5 }
            r15.f6965h = r0     // Catch:{ all -> 0x01f5 }
            r5.close()     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0201 }
            goto L_0x020f
        L_0x01f5:
            r0 = move-exception
            r2 = r0
            r5.close()     // Catch:{ all -> 0x01fb }
            goto L_0x0200
        L_0x01fb:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0201 }
        L_0x0200:
            throw r2     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0201 }
        L_0x0201:
            r0 = move-exception
            androidx.profileinstaller.h$c r2 = r15.f6960c
            r2.mo11216a(r4, r0)
            goto L_0x020f
        L_0x0208:
            r0 = move-exception
            androidx.profileinstaller.h$c r2 = r15.f6960c
            r4 = 7
            r2.mo11216a(r4, r0)
        L_0x020f:
            r15.f6964g = r12
            goto L_0x0218
        L_0x0212:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0218:
            byte[] r0 = r15.f6965h
            if (r0 != 0) goto L_0x0220
            r0 = 0
            r13 = r0
            goto L_0x0285
        L_0x0220:
            boolean r2 = r15.f6963f
            if (r2 == 0) goto L_0x0290
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x027b, IOException -> 0x0274 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x027b, IOException -> 0x0274 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0260 }
            java.io.File r0 = r15.f6962e     // Catch:{ all -> 0x0260 }
            r2.<init>(r0)     // Catch:{ all -> 0x0260 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0252 }
        L_0x0234:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0252 }
            if (r4 <= 0) goto L_0x023f
            r5 = 0
            r2.write(r0, r5, r4)     // Catch:{ all -> 0x0250 }
            goto L_0x0234
        L_0x023f:
            r5 = 0
            r15.mo11218a(r13, r12)     // Catch:{ all -> 0x0250 }
            r2.close()     // Catch:{ all -> 0x024e }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0270, IOException -> 0x026e }
            r15.f6965h = r12
            r15.f6964g = r12
            goto L_0x0285
        L_0x024e:
            r0 = move-exception
            goto L_0x0263
        L_0x0250:
            r0 = move-exception
            goto L_0x0255
        L_0x0252:
            r0 = move-exception
            r4 = 0
            r5 = r4
        L_0x0255:
            r4 = r0
            r2.close()     // Catch:{ all -> 0x025a }
            goto L_0x025f
        L_0x025a:
            r0 = move-exception
            r2 = r0
            r4.addSuppressed(r2)     // Catch:{ all -> 0x024e }
        L_0x025f:
            throw r4     // Catch:{ all -> 0x024e }
        L_0x0260:
            r0 = move-exception
            r2 = 0
            r5 = r2
        L_0x0263:
            r2 = r0
            r1.close()     // Catch:{ all -> 0x0268 }
            goto L_0x026d
        L_0x0268:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)     // Catch:{ FileNotFoundException -> 0x0270, IOException -> 0x026e }
        L_0x026d:
            throw r2     // Catch:{ FileNotFoundException -> 0x0270, IOException -> 0x026e }
        L_0x026e:
            r0 = move-exception
            goto L_0x0276
        L_0x0270:
            r0 = move-exception
            goto L_0x027d
        L_0x0272:
            r0 = move-exception
            goto L_0x028b
        L_0x0274:
            r0 = move-exception
            r5 = 0
        L_0x0276:
            r1 = 7
            r15.mo11218a(r1, r0)     // Catch:{ all -> 0x0272 }
            goto L_0x0280
        L_0x027b:
            r0 = move-exception
            r5 = 0
        L_0x027d:
            r15.mo11218a(r3, r0)     // Catch:{ all -> 0x0272 }
        L_0x0280:
            r15.f6965h = r12
            r15.f6964g = r12
            r13 = r5
        L_0x0285:
            if (r13 == 0) goto L_0x028a
            m7229a(r10, r11)
        L_0x028a:
            return
        L_0x028b:
            r15.f6965h = r12
            r15.f6964g = r12
            throw r0
        L_0x0290:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0296:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x029c:
            r0 = move-exception
            r1 = r0
            r0 = 7
            r4.mo11216a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C3063h.m7230b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.h$c, boolean):void");
    }
}
