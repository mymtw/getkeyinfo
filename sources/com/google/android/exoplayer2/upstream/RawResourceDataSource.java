package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import p505aj.C13996d;
import p513bj.C14049b0;

public final class RawResourceDataSource extends C13996d {

    /* renamed from: e */
    public final Resources f32507e;

    /* renamed from: f */
    public final String f32508f;

    /* renamed from: g */
    public Uri f32509g;

    /* renamed from: h */
    public AssetFileDescriptor f32510h;

    /* renamed from: i */
    public FileInputStream f32511i;

    /* renamed from: j */
    public long f32512j;

    /* renamed from: k */
    public boolean f32513k;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(Throwable th) {
            super(th);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f32507e = context.getResources();
        this.f32508f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0152  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo46812b(p505aj.C14002i r14) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        /*
            r13 = this;
            android.net.Uri r0 = r14.f30774a
            r13.f32509g = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 1
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0037
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = r0.getLastPathSegment()
            r1.getClass()
            java.lang.String r4 = "\\d+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0037
            goto L_0x00a0
        L_0x0037:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r0.getPath()
            r1.getClass()
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0054
            java.lang.String r1 = r1.substring(r2)
        L_0x0054:
            java.lang.String r3 = r0.getHost()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = ""
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.concat(r4)
        L_0x006b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x007e
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0083
        L_0x007e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0083:
            android.content.res.Resources r3 = r13.f32507e
            java.lang.String r4 = r13.f32508f
            java.lang.String r5 = "raw"
            int r1 = r3.getIdentifier(r1, r5, r4)
            if (r1 == 0) goto L_0x0090
            goto L_0x00ab
        L_0x0090:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r14 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "Resource not found."
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x0098:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r14 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x00a0:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x017a }
            r1.getClass()     // Catch:{ NumberFormatException -> 0x017a }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x017a }
        L_0x00ab:
            r13.mo46809m(r14)
            android.content.res.Resources r3 = r13.f32507e     // Catch:{ NotFoundException -> 0x0173 }
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)     // Catch:{ NotFoundException -> 0x0173 }
            r13.f32510h = r1
            if (r1 == 0) goto L_0x0152
            long r3 = r1.getLength()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r1.getFileDescriptor()
            r0.<init>(r5)
            r13.f32511i = r0
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L_0x00db
            long r9 = r14.f30779f     // Catch:{ IOException -> 0x014b }
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00d5
            goto L_0x00db
        L_0x00d5:
            com.google.android.exoplayer2.upstream.DataSourceException r14 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014b }
            r14.<init>(r8)     // Catch:{ IOException -> 0x014b }
            throw r14     // Catch:{ IOException -> 0x014b }
        L_0x00db:
            long r9 = r1.getStartOffset()     // Catch:{ IOException -> 0x014b }
            long r11 = r14.f30779f     // Catch:{ IOException -> 0x014b }
            long r11 = r11 + r9
            long r11 = r0.skip(r11)     // Catch:{ IOException -> 0x014b }
            long r11 = r11 - r9
            long r9 = r14.f30779f     // Catch:{ IOException -> 0x014b }
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0145
            r9 = 0
            if (r7 != 0) goto L_0x0116
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x014b }
            long r3 = r0.size()     // Catch:{ IOException -> 0x014b }
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            r13.f32512j = r5     // Catch:{ IOException -> 0x014b }
            goto L_0x011d
        L_0x0100:
            long r3 = r0.size()     // Catch:{ IOException -> 0x014b }
            long r0 = r0.position()     // Catch:{ IOException -> 0x014b }
            long r3 = r3 - r0
            r13.f32512j = r3     // Catch:{ IOException -> 0x014b }
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0110
            goto L_0x011d
        L_0x0110:
            com.google.android.exoplayer2.upstream.DataSourceException r14 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014b }
            r14.<init>(r8)     // Catch:{ IOException -> 0x014b }
            throw r14     // Catch:{ IOException -> 0x014b }
        L_0x0116:
            long r3 = r3 - r11
            r13.f32512j = r3     // Catch:{ IOException -> 0x014b }
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x013f
        L_0x011d:
            long r0 = r14.f30780g
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0130
            long r3 = r13.f32512j
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x012a
            goto L_0x012e
        L_0x012a:
            long r0 = java.lang.Math.min(r3, r0)
        L_0x012e:
            r13.f32512j = r0
        L_0x0130:
            r13.f32513k = r2
            r13.mo46810n(r14)
            long r0 = r14.f30780g
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            long r0 = r13.f32512j
        L_0x013e:
            return r0
        L_0x013f:
            com.google.android.exoplayer2.upstream.DataSourceException r14 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014b }
            r14.<init>(r8)     // Catch:{ IOException -> 0x014b }
            throw r14     // Catch:{ IOException -> 0x014b }
        L_0x0145:
            com.google.android.exoplayer2.upstream.DataSourceException r14 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014b }
            r14.<init>(r8)     // Catch:{ IOException -> 0x014b }
            throw r14     // Catch:{ IOException -> 0x014b }
        L_0x014b:
            r14 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r0.<init>((java.lang.Throwable) r14)
            throw r0
        L_0x0152:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r14 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Resource is compressed: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x0173:
            r14 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r0.<init>((java.lang.Throwable) r14)
            throw r0
        L_0x017a:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r14 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "Resource identifier must be an integer."
            r14.<init>((java.lang.String) r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.mo46812b(aj.i):long");
    }

    public final void close() throws RawResourceDataSourceException {
        this.f32509g = null;
        try {
            FileInputStream fileInputStream = this.f32511i;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f32511i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f32510h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f32510h = null;
                if (this.f32513k) {
                    this.f32513k = false;
                    mo46808l();
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException((Throwable) e);
            } catch (Throwable th) {
                this.f32510h = null;
                if (this.f32513k) {
                    this.f32513k = false;
                    mo46808l();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException((Throwable) e2);
        } catch (Throwable th2) {
            this.f32511i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f32510h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f32510h = null;
                if (this.f32513k) {
                    this.f32513k = false;
                    mo46808l();
                }
                throw th2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException((Throwable) e3);
            } catch (Throwable th3) {
                this.f32510h = null;
                if (this.f32513k) {
                    this.f32513k = false;
                    mo46808l();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.f32509g;
    }

    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f32512j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException((Throwable) e);
            }
        }
        FileInputStream fileInputStream = this.f32511i;
        int i3 = C14049b0.f30913a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f32512j;
            if (j2 != -1) {
                this.f32512j = j2 - ((long) read);
            }
            mo46807k(read);
            return read;
        } else if (this.f32512j == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException((Throwable) new EOFException());
        }
    }
}
