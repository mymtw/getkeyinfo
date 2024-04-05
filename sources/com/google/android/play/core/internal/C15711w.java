package com.google.android.play.core.internal;

import android.support.p013v4.media.C0072d;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.play.core.assetpacks.C15595e0;
import com.google.android.play.core.assetpacks.C15667w0;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.w */
public final class C15711w {
    /* renamed from: a */
    public static void m25543a(C15595e0 e0Var, InputStream inputStream, C15667w0 w0Var, long j) throws IOException {
        byte[] bArr = new byte[PrimitiveArrayBuilder.SMALL_CHUNK_SIZE];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new zzck(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m25545c(bArr, dataInputStream, w0Var, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m25545c(bArr, dataInputStream, w0Var, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m25544b(bArr, e0Var, w0Var, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case NestedScrollView.ANIMATED_SCROLL_GAP:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                m25544b(bArr, e0Var, w0Var, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                m25544b(bArr, e0Var, w0Var, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m25544b(bArr, e0Var, w0Var, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                m25544b(bArr, e0Var, w0Var, readInt3, read2, j3);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                m25544b(bArr, e0Var, w0Var, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m25544b(bArr, e0Var, w0Var, readLong, read2, j3);
                                break;
                            default:
                                m25545c(bArr, dataInputStream, w0Var, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    w0Var.flush();
                }
            }
        } else {
            throw new zzck(C0072d.m200g(30, "Unexpected version=", read));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x004c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25544b(byte[] r11, com.google.android.play.core.assetpacks.C15595e0 r12, com.google.android.play.core.assetpacks.C15667w0 r13, long r14, int r16, long r17) throws java.io.IOException {
        /*
            r0 = r11
            r1 = r16
            if (r1 < 0) goto L_0x006d
            r2 = 0
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0065
            long r8 = (long) r1
            int r4 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r4 > 0) goto L_0x005d
            com.google.android.play.core.internal.y r10 = new com.google.android.play.core.internal.y     // Catch:{ EOFException -> 0x0054 }
            r4 = r10
            r5 = r12
            r6 = r14
            r4.<init>(r5, r6, r8)     // Catch:{ EOFException -> 0x0054 }
            monitor-enter(r10)     // Catch:{ EOFException -> 0x0054 }
            long r4 = r10.f35491d     // Catch:{ all -> 0x0051 }
            long r6 = r10.f35490c     // Catch:{ all -> 0x0051 }
            long r4 = r4 - r6
            java.io.InputStream r2 = r10.mo55395b(r2, r4)     // Catch:{ all -> 0x0051 }
            monitor-exit(r10)     // Catch:{ EOFException -> 0x0054 }
        L_0x0023:
            if (r1 <= 0) goto L_0x004d
            r3 = 16384(0x4000, float:2.2959E-41)
            int r3 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = r4
        L_0x002d:
            if (r5 >= r3) goto L_0x0042
            int r6 = r3 - r5
            int r6 = r2.read(r11, r5, r6)     // Catch:{ all -> 0x0048 }
            r7 = -1
            if (r6 == r7) goto L_0x003a
            int r5 = r5 + r6
            goto L_0x002d
        L_0x003a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "truncated input stream"
            r0.<init>(r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0042:
            r5 = r13
            r13.write(r11, r4, r3)     // Catch:{ all -> 0x0048 }
            int r1 = r1 - r3
            goto L_0x0023
        L_0x0048:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ EOFException -> 0x0054 }
        L_0x004d:
            r2.close()     // Catch:{ EOFException -> 0x0054 }
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ EOFException -> 0x0054 }
            throw r0     // Catch:{ EOFException -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "patch underrun"
            r1.<init>(r2, r0)
            throw r1
        L_0x005d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Output length overrun"
            r0.<init>(r1)
            throw r0
        L_0x0065:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "inputOffset negative"
            r0.<init>(r1)
            throw r0
        L_0x006d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "copyLength negative"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C15711w.m25544b(byte[], com.google.android.play.core.assetpacks.e0, com.google.android.play.core.assetpacks.w0, long, int, long):void");
    }

    /* renamed from: c */
    public static void m25545c(byte[] bArr, DataInputStream dataInputStream, C15667w0 w0Var, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
                    dataInputStream.readFully(bArr, 0, min);
                    w0Var.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
