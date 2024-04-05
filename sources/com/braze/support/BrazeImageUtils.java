package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.ImageView;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19846a;

public final class BrazeImageUtils {

    /* renamed from: a */
    public static final String f11898a = C19383o.m32802l("BrazeImageUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: com.braze.support.BrazeImageUtils$a */
    final class C5548a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5548a f11899b = new C5548a();

        public C5548a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not sampling on 0 destination width or height";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$b */
    final class C5549b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ BitmapFactory.Options f11900b;

        /* renamed from: c */
        public final /* synthetic */ int f11901c;

        /* renamed from: d */
        public final /* synthetic */ int f11902d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5549b(BitmapFactory.Options options, int i, int i2) {
            super(0);
            this.f11900b = options;
            this.f11901c = i;
            this.f11902d = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Calculating sample size for source image bounds: (width ");
            h.append(this.f11900b.outWidth);
            h.append(" height ");
            h.append(this.f11900b.outHeight);
            h.append(") and destination image bounds: (width ");
            h.append(this.f11901c);
            h.append(" height ");
            return C0073e.m208h(h, this.f11902d, ')');
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$c */
    final class C5550c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$IntRef f11903b;

        /* renamed from: c */
        public final /* synthetic */ int f11904c;

        /* renamed from: d */
        public final /* synthetic */ int f11905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5550c(Ref$IntRef ref$IntRef, int i, int i2) {
            super(0);
            this.f11903b = ref$IntRef;
            this.f11904c = i;
            this.f11905d = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Using image sample size of ");
            h.append(this.f11903b.element);
            h.append(". Image will be scaled to width: ");
            h.append(this.f11904c / this.f11903b.element);
            h.append(" and height: ");
            h.append(this.f11905d / this.f11903b.element);
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$d */
    public static final class C5551d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Uri f11906b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5551d(Uri uri) {
            super(0);
            this.f11906b = uri;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11906b, "Uri with unknown scheme received. Not getting image. Uri: ");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$e */
    final class C5552e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Uri f11907b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5552e(Uri uri) {
            super(0);
            this.f11907b = uri;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11907b, "Local bitmap path is null. URI: ");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$f */
    final class C5553f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Uri f11908b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5553f(Uri uri) {
            super(0);
            this.f11908b = uri;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11908b, "Local bitmap file does not exist. URI: ");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$g */
    final class C5554g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ File f11909b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5554g(File file) {
            super(0);
            this.f11909b = file;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11909b.getAbsolutePath(), "Retrieving image from local path: ");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$h */
    final class C5555h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5555h f11910b = new C5555h();

        public C5555h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Destination bounds unset. Loading entire bitmap into memory.";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$i */
    final class C5556i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11911b;

        /* renamed from: c */
        public final /* synthetic */ int f11912c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5556i(int i, int i2) {
            super(0);
            this.f11911b = i;
            this.f11912c = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Sampling bitmap with destination image bounds: (height ");
            h.append(this.f11911b);
            h.append(" width ");
            return C0073e.m208h(h, this.f11912c, ')');
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$j */
    final class C5557j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Uri f11913b;

        /* renamed from: c */
        public final /* synthetic */ BitmapFactory.Options f11914c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5557j(Uri uri, BitmapFactory.Options options) {
            super(0);
            this.f11913b = uri;
            this.f11914c = options;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("The bitmap metadata with image uri ");
            h.append(this.f11913b);
            h.append(" had bounds: (height ");
            h.append(this.f11914c.outHeight);
            h.append(" width ");
            return C0071c.m191c(h, this.f11914c.outWidth, "). Returning a bitmap with no sampling.");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$k */
    final class C5558k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5558k f11915b = new C5558k();

        public C5558k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Decoding sampled bitmap";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$l */
    final class C5559l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Exception f11916b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5559l(Exception exc) {
            super(0);
            this.f11916b = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11916b.getMessage(), "Exception occurred when attempting to retrieve local bitmap. ");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$m */
    final class C5560m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5560m f11917b = new C5560m();

        public C5560m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata image stream.";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$n */
    final class C5561n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11918b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5561n(String str) {
            super(0);
            this.f11918b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11918b, "SDK is in offline mode, not downloading remote bitmap with uri: ");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$o */
    final class C5562o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11919b;

        /* renamed from: c */
        public final /* synthetic */ URL f11920c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5562o(int i, URL url) {
            super(0);
            this.f11919b = i;
            this.f11920c = url;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("HTTP response code was ");
            h.append(this.f11919b);
            h.append(". Bitmap with url ");
            h.append(this.f11920c);
            h.append(" could not be downloaded.");
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$p */
    final class C5563p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11921b;

        /* renamed from: c */
        public final /* synthetic */ int f11922c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5563p(int i, int i2) {
            super(0);
            this.f11921b = i;
            this.f11922c = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Sampling bitmap with destination image bounds: (height ");
            h.append(this.f11921b);
            h.append(" width ");
            return C0073e.m208h(h, this.f11922c, ')');
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$q */
    final class C5564q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ URL f11923b;

        /* renamed from: c */
        public final /* synthetic */ BitmapFactory.Options f11924c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5564q(URL url, BitmapFactory.Options options) {
            super(0);
            this.f11923b = url;
            this.f11924c = options;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("The bitmap metadata with image url ");
            h.append(this.f11923b);
            h.append(" had bounds: (height ");
            h.append(this.f11924c.outHeight);
            h.append(" width ");
            return C0071c.m191c(h, this.f11924c.outWidth, "). Returning a bitmap with no sampling.");
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$r */
    final class C5565r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11925b;

        /* renamed from: c */
        public final /* synthetic */ Exception f11926c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5565r(String str, Exception exc) {
            super(0);
            this.f11925b = str;
            this.f11926c = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Exception in image bitmap download for Uri: ");
            h.append(this.f11925b);
            h.append(' ');
            h.append(this.f11926c.getMessage());
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$s */
    final class C5566s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5566s f11927b = new C5566s();

        public C5566s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata download stream.";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$t */
    final class C5567t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5567t f11928b = new C5567t();

        public C5567t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$u */
    final class C5568u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5568u f11929b = new C5568u();

        public C5568u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Bitmap dimensions cannot be 0. Not resizing ImageView";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$v */
    final class C5569v extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5569v f11930b = new C5569v();

        public C5569v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "ImageView dimensions cannot be 0. Not resizing ImageView";
        }
    }

    /* renamed from: com.braze.support.BrazeImageUtils$w */
    final class C5570w extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ float f11931b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5570w(float f) {
            super(0);
            this.f11931b = f;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Float.valueOf(this.f11931b), "Resizing ImageView to aspect ratio: ");
        }
    }

    /* renamed from: a */
    public static final Bitmap m11251a(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (i2 == 0 || i == 0) {
            BrazeLogger.m11283e(f11898a, (BrazeLogger.Priority) null, (Throwable) null, C5548a.f11899b, 14);
        } else {
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            BrazeLogger.m11283e(f11898a, (BrazeLogger.Priority) null, (Throwable) null, new C5549b(options, i, i2), 14);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = 1;
            if (i4 > i2 || i5 > i) {
                int i6 = i4 / 2;
                int i7 = i5 / 2;
                while (true) {
                    int i8 = ref$IntRef.element;
                    if (i6 / i8 < i2 || i7 / i8 < i) {
                        break;
                    }
                    ref$IntRef.element = i8 * 2;
                }
            }
            BrazeLogger.m11283e(f11898a, (BrazeLogger.Priority) null, (Throwable) null, new C5550c(ref$IntRef, i5, i4), 14);
            i3 = ref$IntRef.element;
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0261 A[SYNTHETIC, Splitter:B:119:0x0261] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x027a A[SYNTHETIC, Splitter:B:127:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148 A[SYNTHETIC, Splitter:B:51:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015f A[SYNTHETIC, Splitter:B:59:0x015f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m11252b(android.content.Context r11, android.net.Uri r12, com.braze.enums.BrazeViewBounds r13) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "viewBounds"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            kotlin.Pair r0 = m11254d(r11)
            java.lang.Object r1 = r0.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            com.braze.enums.BrazeViewBounds r2 = com.braze.enums.BrazeViewBounds.NO_BOUNDS
            if (r2 != r13) goto L_0x0034
            kotlin.Pair r11 = new kotlin.Pair
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.<init>(r13, r0)
            goto L_0x005e
        L_0x0034:
            int r11 = m11253c(r11)
            int r2 = r13.getHeightDp()
            int r2 = m11255e(r11, r2)
            int r13 = r13.getWidthDp()
            int r11 = m11255e(r11, r13)
            kotlin.Pair r13 = new kotlin.Pair
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r11 = java.lang.Math.min(r0, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.<init>(r1, r11)
            r11 = r13
        L_0x005e:
            java.lang.Object r13 = r11.component1()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r11 = r11.component2()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r0 = com.braze.support.BrazeFileUtils.m11240d(r12)
            r1 = 0
            r2 = 1
            r3 = 14
            r4 = 12
            r5 = 8
            r6 = 0
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = r12.getPath()     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            if (r0 == 0) goto L_0x008d
            int r7 = r0.length()     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            if (r7 != 0) goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            if (r1 == 0) goto L_0x009c
            java.lang.String r11 = f11898a     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeImageUtils$e r13 = new com.braze.support.BrazeImageUtils$e     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeLogger.m11283e(r11, r6, r6, r13, r3)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            goto L_0x0295
        L_0x009c:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r11 = f11898a     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeImageUtils$f r13 = new com.braze.support.BrazeImageUtils$f     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeLogger.m11283e(r11, r6, r6, r13, r3)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            goto L_0x0295
        L_0x00b3:
            java.lang.String r0 = f11898a     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeImageUtils$g r8 = new com.braze.support.BrazeImageUtils$g     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeLogger.m11283e(r0, r7, r6, r8, r4)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            if (r11 <= 0) goto L_0x0125
            if (r13 > 0) goto L_0x00c4
            goto L_0x0125
        L_0x00c4:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeImageUtils$i r8 = new com.braze.support.BrazeImageUtils$i     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r8.<init>(r13, r11)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            com.braze.support.BrazeLogger.m11283e(r0, r6, r6, r8, r3)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r8.<init>()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r8.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            android.graphics.BitmapFactory.decodeStream(r7, r6, r8)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r7.close()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            int r7 = r8.outHeight     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            if (r7 == 0) goto L_0x00f7
            int r7 = r8.outWidth     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            if (r7 != 0) goto L_0x00ec
            goto L_0x00f7
        L_0x00ec:
            com.braze.support.BrazeImageUtils$k r12 = com.braze.support.BrazeImageUtils.C5558k.f11915b     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.braze.support.BrazeLogger.m11283e(r0, r6, r6, r12, r3)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            android.graphics.Bitmap r11 = m11251a(r2, r8, r11, r13)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
        L_0x00f5:
            r6 = r11
            goto L_0x010a
        L_0x00f7:
            com.braze.support.BrazeLogger$Priority r11 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.braze.support.BrazeImageUtils$j r13 = new com.braze.support.BrazeImageUtils$j     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r13.<init>(r12, r8)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            com.braze.support.BrazeLogger.m11283e(r0, r11, r6, r13, r4)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r11 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r11)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            goto L_0x00f5
        L_0x010a:
            r2.close()     // Catch:{ IOException -> 0x010f }
            goto L_0x0295
        L_0x010f:
            r11 = move-exception
            java.lang.String r12 = f11898a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E
            com.braze.support.BrazeImageUtils$m r0 = com.braze.support.BrazeImageUtils.C5560m.f11917b
            com.braze.support.BrazeLogger.m11283e(r12, r13, r11, r0, r5)
            goto L_0x0295
        L_0x011b:
            r11 = move-exception
            r7 = r2
            goto L_0x015c
        L_0x011e:
            r11 = move-exception
            r7 = r2
            goto L_0x0138
        L_0x0121:
            r11 = move-exception
            goto L_0x015c
        L_0x0123:
            r11 = move-exception
            goto L_0x0138
        L_0x0125:
            com.braze.support.BrazeImageUtils$h r11 = com.braze.support.BrazeImageUtils.C5555h.f11910b     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            com.braze.support.BrazeLogger.m11283e(r0, r6, r6, r11, r3)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            java.lang.String r11 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r11)     // Catch:{ Exception -> 0x0136, all -> 0x0134 }
            goto L_0x0295
        L_0x0134:
            r11 = move-exception
            goto L_0x015b
        L_0x0136:
            r11 = move-exception
            r7 = r6
        L_0x0138:
            java.lang.String r12 = f11898a     // Catch:{ all -> 0x0159 }
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E     // Catch:{ all -> 0x0159 }
            com.braze.support.BrazeImageUtils$l r0 = new com.braze.support.BrazeImageUtils$l     // Catch:{ all -> 0x0159 }
            r0.<init>(r11)     // Catch:{ all -> 0x0159 }
            com.braze.support.BrazeLogger.m11283e(r12, r13, r11, r0, r5)     // Catch:{ all -> 0x0159 }
            if (r7 != 0) goto L_0x0148
            goto L_0x0295
        L_0x0148:
            r7.close()     // Catch:{ IOException -> 0x014d }
            goto L_0x0295
        L_0x014d:
            r11 = move-exception
            java.lang.String r12 = f11898a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E
            com.braze.support.BrazeImageUtils$m r0 = com.braze.support.BrazeImageUtils.C5560m.f11917b
            com.braze.support.BrazeLogger.m11283e(r12, r13, r11, r0, r5)
            goto L_0x0295
        L_0x0159:
            r11 = move-exception
            r6 = r7
        L_0x015b:
            r7 = r6
        L_0x015c:
            if (r7 != 0) goto L_0x015f
            goto L_0x016d
        L_0x015f:
            r7.close()     // Catch:{ IOException -> 0x0163 }
            goto L_0x016d
        L_0x0163:
            r12 = move-exception
            java.lang.String r13 = f11898a
            com.braze.support.BrazeLogger$Priority r0 = com.braze.support.BrazeLogger.Priority.E
            com.braze.support.BrazeImageUtils$m r1 = com.braze.support.BrazeImageUtils.C5560m.f11917b
            com.braze.support.BrazeLogger.m11283e(r13, r0, r12, r1, r5)
        L_0x016d:
            throw r11
        L_0x016e:
            java.lang.String r0 = r12.getScheme()
            if (r0 == 0) goto L_0x017d
            boolean r7 = kotlin.text.C19457k.m33020X0(r0)
            if (r7 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r7 = r1
            goto L_0x017e
        L_0x017d:
            r7 = r2
        L_0x017e:
            if (r7 == 0) goto L_0x018a
            java.lang.String r0 = com.braze.support.BrazeFileUtils.f11885a
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.I
            com.braze.support.BrazeFileUtils$j r8 = com.braze.support.BrazeFileUtils.C5547j.f11897b
            com.braze.support.BrazeLogger.m11283e(r0, r7, r6, r8, r4)
            goto L_0x0190
        L_0x018a:
            java.util.List<java.lang.String> r1 = com.braze.support.BrazeFileUtils.f11886b
            boolean r1 = r1.contains(r0)
        L_0x0190:
            if (r1 == 0) goto L_0x0289
            r0 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "uri.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r12, r0)
            boolean r0 = com.braze.Braze.f11178u
            if (r0 == 0) goto L_0x01b2
            java.lang.String r11 = f11898a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.I
            com.braze.support.BrazeImageUtils$n r0 = new com.braze.support.BrazeImageUtils$n
            r0.<init>(r12)
            com.braze.support.BrazeLogger.m11283e(r11, r13, r6, r0, r4)
            goto L_0x0295
        L_0x01b2:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x0249, all -> 0x0246 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x0249, all -> 0x0246 }
            bo.app.p6 r1 = p030bo.app.C4079p6.f9086a     // Catch:{ Exception -> 0x0249, all -> 0x0246 }
            java.net.HttpURLConnection r7 = r1.mo13882a(r0)     // Catch:{ Exception -> 0x0249, all -> 0x0246 }
            int r8 = r7.getResponseCode()     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x01d6
            java.lang.String r11 = f11898a     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            com.braze.support.BrazeImageUtils$o r1 = new com.braze.support.BrazeImageUtils$o     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            r1.<init>(r8, r0)     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            com.braze.support.BrazeLogger.m11283e(r11, r13, r6, r1, r4)     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            r7.disconnect()
            goto L_0x0295
        L_0x01d6:
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ Exception -> 0x0243, all -> 0x0240 }
            if (r11 == 0) goto L_0x0221
            if (r13 == 0) goto L_0x0221
            java.lang.String r9 = f11898a     // Catch:{ Exception -> 0x021f }
            com.braze.support.BrazeImageUtils$p r10 = new com.braze.support.BrazeImageUtils$p     // Catch:{ Exception -> 0x021f }
            r10.<init>(r13, r11)     // Catch:{ Exception -> 0x021f }
            com.braze.support.BrazeLogger.m11283e(r9, r6, r6, r10, r3)     // Catch:{ Exception -> 0x021f }
            java.lang.String r3 = "inputStream"
            kotlin.jvm.internal.C19383o.m32797g(r8, r3)     // Catch:{ Exception -> 0x021f }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x021f }
            r3.<init>()     // Catch:{ Exception -> 0x021f }
            r3.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x021f }
            android.graphics.BitmapFactory.decodeStream(r8, r6, r3)     // Catch:{ Exception -> 0x021f }
            r7.disconnect()     // Catch:{ Exception -> 0x021f }
            java.net.HttpURLConnection r7 = r1.mo13882a(r0)     // Catch:{ Exception -> 0x021f }
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ Exception -> 0x021f }
            int r1 = r3.outHeight     // Catch:{ Exception -> 0x021f }
            if (r1 == 0) goto L_0x0210
            int r1 = r3.outWidth     // Catch:{ Exception -> 0x021f }
            if (r1 != 0) goto L_0x020b
            goto L_0x0210
        L_0x020b:
            android.graphics.Bitmap r11 = m11251a(r8, r3, r11, r13)     // Catch:{ Exception -> 0x021f }
            goto L_0x0225
        L_0x0210:
            com.braze.support.BrazeLogger$Priority r11 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x021f }
            com.braze.support.BrazeImageUtils$q r13 = new com.braze.support.BrazeImageUtils$q     // Catch:{ Exception -> 0x021f }
            r13.<init>(r0, r3)     // Catch:{ Exception -> 0x021f }
            com.braze.support.BrazeLogger.m11283e(r9, r11, r6, r13, r4)     // Catch:{ Exception -> 0x021f }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ Exception -> 0x021f }
            goto L_0x0225
        L_0x021f:
            r11 = move-exception
            goto L_0x024c
        L_0x0221:
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ Exception -> 0x021f }
        L_0x0225:
            r6 = r11
            r7.disconnect()
            if (r8 != 0) goto L_0x022d
            goto L_0x0295
        L_0x022d:
            r8.close()     // Catch:{ IOException -> 0x0232 }
            goto L_0x0295
        L_0x0232:
            r11 = move-exception
            java.lang.String r12 = f11898a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E
            com.braze.support.BrazeImageUtils$s r0 = com.braze.support.BrazeImageUtils.C5566s.f11927b
            com.braze.support.BrazeLogger.m11283e(r12, r13, r11, r0, r5)
            goto L_0x0295
        L_0x023e:
            r11 = move-exception
            goto L_0x0270
        L_0x0240:
            r11 = move-exception
            r8 = r6
            goto L_0x0270
        L_0x0243:
            r11 = move-exception
            r8 = r6
            goto L_0x024c
        L_0x0246:
            r11 = move-exception
            r8 = r6
            goto L_0x0271
        L_0x0249:
            r11 = move-exception
            r7 = r6
            r8 = r7
        L_0x024c:
            java.lang.String r13 = f11898a     // Catch:{ all -> 0x023e }
            com.braze.support.BrazeLogger$Priority r0 = com.braze.support.BrazeLogger.Priority.E     // Catch:{ all -> 0x023e }
            com.braze.support.BrazeImageUtils$r r1 = new com.braze.support.BrazeImageUtils$r     // Catch:{ all -> 0x023e }
            r1.<init>(r12, r11)     // Catch:{ all -> 0x023e }
            com.braze.support.BrazeLogger.m11283e(r13, r0, r11, r1, r5)     // Catch:{ all -> 0x023e }
            if (r7 != 0) goto L_0x025b
            goto L_0x025e
        L_0x025b:
            r7.disconnect()
        L_0x025e:
            if (r8 != 0) goto L_0x0261
            goto L_0x0295
        L_0x0261:
            r8.close()     // Catch:{ IOException -> 0x0265 }
            goto L_0x0295
        L_0x0265:
            r11 = move-exception
            java.lang.String r12 = f11898a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E
            com.braze.support.BrazeImageUtils$s r0 = com.braze.support.BrazeImageUtils.C5566s.f11927b
            com.braze.support.BrazeLogger.m11283e(r12, r13, r11, r0, r5)
            goto L_0x0295
        L_0x0270:
            r6 = r7
        L_0x0271:
            if (r6 != 0) goto L_0x0274
            goto L_0x0277
        L_0x0274:
            r6.disconnect()
        L_0x0277:
            if (r8 != 0) goto L_0x027a
            goto L_0x0288
        L_0x027a:
            r8.close()     // Catch:{ IOException -> 0x027e }
            goto L_0x0288
        L_0x027e:
            r12 = move-exception
            java.lang.String r13 = f11898a
            com.braze.support.BrazeLogger$Priority r0 = com.braze.support.BrazeLogger.Priority.E
            com.braze.support.BrazeImageUtils$s r1 = com.braze.support.BrazeImageUtils.C5566s.f11927b
            com.braze.support.BrazeLogger.m11283e(r13, r0, r12, r1, r5)
        L_0x0288:
            throw r11
        L_0x0289:
            java.lang.String r11 = f11898a
            com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.W
            com.braze.support.BrazeImageUtils$d r0 = new com.braze.support.BrazeImageUtils$d
            r0.<init>(r12)
            com.braze.support.BrazeLogger.m11283e(r11, r13, r6, r0, r4)
        L_0x0295:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.m11252b(android.content.Context, android.net.Uri, com.braze.enums.BrazeViewBounds):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static final int m11253c(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getResources().getConfiguration().densityDpi;
    }

    /* renamed from: d */
    public static final Pair<Integer, Integer> m11254d(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                C19383o.m32796f(bounds, "windowManager.currentWindowMetrics.bounds");
                return new Pair<>(Integer.valueOf(bounds.height()), Integer.valueOf(bounds.width()));
            }
            Object systemService2 = context.getSystemService("window");
            if (systemService2 != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics);
                return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: e */
    public static final int m11255e(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    /* renamed from: f */
    public static final void m11256f(Bitmap bitmap, ImageView imageView) {
        C19383o.m32797g(imageView, "imageView");
        if (bitmap == null) {
            BrazeLogger.m11283e(f11898a, BrazeLogger.Priority.W, (Throwable) null, C5567t.f11928b, 12);
        } else if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.m11283e(f11898a, BrazeLogger.Priority.W, (Throwable) null, C5568u.f11929b, 12);
        } else if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.m11283e(f11898a, BrazeLogger.Priority.W, (Throwable) null, C5569v.f11930b, 12);
        } else {
            float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
            BrazeLogger.m11283e(f11898a, (BrazeLogger.Priority) null, (Throwable) null, new C5570w(width), 14);
            imageView.getLayoutParams().height = (int) (((float) imageView.getWidth()) / width);
        }
    }
}
