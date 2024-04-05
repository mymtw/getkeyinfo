package p289y0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.FontStyle;
import com.google.logging.type.LogSeverity;
import java.io.IOException;
import p021b1.C3464l;
import p280x0.C8286d;

/* renamed from: y0.k */
public final class C8361k extends C8363m {
    /* renamed from: a */
    public final Typeface mo20944a(Context context, C8286d.C8288b bVar, Resources resources, int i) {
        try {
            C8286d.C8289c[] cVarArr = bVar.f18159a;
            int length = cVarArr.length;
            int i2 = 0;
            FontFamily$Builder fontFamily$Builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                C8286d.C8289c cVar = cVarArr[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.f18165f).setWeight(cVar.f18161b);
                    if (!cVar.f18162c) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(cVar.f18164e).setFontVariationSettings(cVar.f18163d).build();
                    if (fontFamily$Builder == null) {
                        fontFamily$Builder = new FontFamily$Builder(build);
                    } else {
                        fontFamily$Builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (fontFamily$Builder == null) {
                return null;
            }
            int i5 = (i & 1) != 0 ? LogSeverity.ALERT_VALUE : LogSeverity.WARNING_VALUE;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            return new Typeface$CustomFallbackBuilder(fontFamily$Builder.build()).setStyle(new FontStyle(i5, i2)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r4 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        if ((r13 & 1) == 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        r12 = com.google.logging.type.LogSeverity.ALERT_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        r12 = com.google.logging.type.LogSeverity.WARNING_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if ((r13 & 2) == 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        return new android.graphics.Typeface$CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r12, r2)).build();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo20945b(android.content.Context r11, p021b1.C3464l[] r12, int r13) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r12.length     // Catch:{ Exception -> 0x007f }
            r2 = 0
            r4 = r0
            r3 = r2
        L_0x0009:
            r5 = 1
            if (r3 >= r1) goto L_0x0057
            r6 = r12[r3]     // Catch:{ Exception -> 0x007f }
            android.net.Uri r7 = r6.f8079a     // Catch:{ IOException -> 0x0054 }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r0)     // Catch:{ IOException -> 0x0054 }
            if (r7 != 0) goto L_0x001b
            if (r7 == 0) goto L_0x0054
            goto L_0x0046
        L_0x001b:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x004a }
            r8.<init>(r7)     // Catch:{ all -> 0x004a }
            int r9 = r6.f8081c     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x004a }
            boolean r9 = r6.f8082d     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r5 = r2
        L_0x002c:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x004a }
            int r6 = r6.f8080b     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0043
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x004a }
            r6.<init>(r5)     // Catch:{ all -> 0x004a }
            r4 = r6
            goto L_0x0046
        L_0x0043:
            r4.addFont(r5)     // Catch:{ all -> 0x004a }
        L_0x0046:
            r7.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x004a:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ IOException -> 0x0054 }
        L_0x0053:
            throw r5     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0057:
            if (r4 != 0) goto L_0x005a
            return r0
        L_0x005a:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch:{ Exception -> 0x007f }
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0063
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x0065
        L_0x0063:
            r12 = 400(0x190, float:5.6E-43)
        L_0x0065:
            r13 = r13 & 2
            if (r13 == 0) goto L_0x006a
            r2 = r5
        L_0x006a:
            r11.<init>(r12, r2)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x007f }
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch:{ Exception -> 0x007f }
            r12.<init>(r13)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ Exception -> 0x007f }
            return r11
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289y0.C8361k.mo20945b(android.content.Context, b1.l[], int):android.graphics.Typeface");
    }

    /* renamed from: c */
    public final Typeface mo20946c(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final C3464l mo20952e(int i, C3464l[] lVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
