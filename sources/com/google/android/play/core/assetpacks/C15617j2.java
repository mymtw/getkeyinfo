package com.google.android.play.core.assetpacks;

import com.etsy.android.lib.models.editable.EditableListing;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.measurement.internal.C15032m3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.j2 */
public final class C15617j2 {

    /* renamed from: h */
    public static final C15032m3 f35209h = new C15032m3("SliceMetadataManager");

    /* renamed from: a */
    public final byte[] f35210a = new byte[8192];

    /* renamed from: b */
    public final C15583b0 f35211b;

    /* renamed from: c */
    public final String f35212c;

    /* renamed from: d */
    public final int f35213d;

    /* renamed from: e */
    public final long f35214e;

    /* renamed from: f */
    public final String f35215f;

    /* renamed from: g */
    public int f35216g;

    public C15617j2(C15583b0 b0Var, String str, int i, long j, String str2) {
        this.f35211b = b0Var;
        this.f35212c = str;
        this.f35213d = i;
        this.f35214e = j;
        this.f35215f = str2;
        this.f35216g = -1;
    }

    /* renamed from: a */
    public final int mo55432a() throws IOException {
        C15583b0 b0Var = this.f35211b;
        String str = this.f35212c;
        int i = this.f35213d;
        long j = this.f35214e;
        String str2 = this.f35215f;
        b0Var.getClass();
        File file = new File(new File(new File(new File(b0Var.mo55377c(str, i, j), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", EditableListing.LISTING_ID_DEVICE_DRAFT)) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new zzck("Slice checkpoint file corrupt.");
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: b */
    public final C15611i0 mo55433b() throws IOException {
        C15583b0 b0Var = this.f35211b;
        String str = this.f35212c;
        int i = this.f35213d;
        long j = this.f35214e;
        String str2 = this.f35215f;
        b0Var.getClass();
        File file = new File(new File(new File(new File(b0Var.mo55377c(str, i, j), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new zzck("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", EditableListing.LISTING_ID_DEVICE_DRAFT));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", EditableListing.LISTING_ID_DEVICE_DRAFT));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f35216g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C15611i0(parseInt, parseInt2, parseLong, parseLong2, property);
                } catch (NumberFormatException e) {
                    throw new zzck("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable unused) {
            }
        } else {
            throw new zzck("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* renamed from: c */
    public final File mo55434c() {
        C15583b0 b0Var = this.f35211b;
        String str = this.f35212c;
        int i = this.f35213d;
        long j = this.f35214e;
        String str2 = this.f35215f;
        b0Var.getClass();
        File file = new File(new File(new File(b0Var.mo55377c(str, i, j), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f35216g)}));
    }

    /* renamed from: d */
    public final void mo55435d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo55434c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35216g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo55441j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo55436e(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35216g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo55441j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo55437f(int i, byte[] bArr) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35216g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo55441j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            C15583b0 b0Var = this.f35211b;
            String str = this.f35212c;
            int i2 = this.f35213d;
            long j = this.f35214e;
            String str2 = this.f35215f;
            b0Var.getClass();
            File file = new File(new File(new File(new File(b0Var.mo55377c(str, i2, j), "_slices"), "_metadata"), str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
            throw th;
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: g */
    public final void mo55438g(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35216g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo55441j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0059 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55439h(byte[] r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f35216g
            r1 = 1
            int r0 = r0 + r1
            r11.f35216g = r0
            java.io.File r0 = new java.io.File
            com.google.android.play.core.assetpacks.b0 r2 = r11.f35211b
            java.lang.String r3 = r11.f35212c
            int r4 = r11.f35213d
            long r5 = r11.f35214e
            java.lang.String r7 = r11.f35215f
            r2.getClass()
            java.io.File r8 = new java.io.File
            java.io.File r9 = new java.io.File
            java.io.File r10 = new java.io.File
            java.io.File r2 = r2.mo55377c(r3, r4, r5)
            java.lang.String r3 = "_slices"
            r10.<init>(r2, r3)
            java.lang.String r2 = "_metadata"
            r9.<init>(r10, r2)
            r8.<init>(r9, r7)
            boolean r2 = r8.exists()
            if (r2 != 0) goto L_0x0035
            r8.mkdirs()
        L_0x0035:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r11.f35216g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "%s-LFH.dat"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r8, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x005a }
            r1.write(r12)     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ IOException -> 0x005a }
            return
        L_0x0055:
            r12 = move-exception
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r12     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r12 = move-exception
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>((java.lang.String) r1, (java.lang.Exception) r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15617j2.mo55439h(byte[]):void");
    }

    /* renamed from: i */
    public final void mo55440i(InputStream inputStream, byte[] bArr) throws IOException {
        this.f35216g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo55434c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f35210a);
            while (read > 0) {
                fileOutputStream.write(this.f35210a, 0, read);
                read = inputStream.read(this.f35210a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: j */
    public final File mo55441j() throws IOException {
        C15583b0 b0Var = this.f35211b;
        String str = this.f35212c;
        int i = this.f35213d;
        long j = this.f35214e;
        String str2 = this.f35215f;
        b0Var.getClass();
        File file = new File(new File(new File(new File(b0Var.mo55377c(str, i, j), "_slices"), "_metadata"), str2), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
