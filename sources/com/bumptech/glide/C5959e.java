package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.C6024j;
import com.bumptech.glide.request.C6121a;
import com.bumptech.glide.request.C6122b;
import com.bumptech.glide.request.C6124d;
import com.bumptech.glide.request.C6125e;
import com.bumptech.glide.request.C6127f;
import com.bumptech.glide.request.C6128g;
import com.bumptech.glide.request.C6130i;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p036c5.C4416e;
import p036c5.C4426l;
import p302z4.C8448i;

/* renamed from: com.bumptech.glide.e */
public class C5959e<TranscodeType> extends C6121a<C5959e<TranscodeType>> {

    /* renamed from: B */
    public final Context f12756B;

    /* renamed from: C */
    public final RequestManager f12757C;

    /* renamed from: D */
    public final Class<TranscodeType> f12758D;

    /* renamed from: E */
    public final GlideContext f12759E;

    /* renamed from: F */
    public C5961f<?, ? super TranscodeType> f12760F;

    /* renamed from: G */
    public Object f12761G;

    /* renamed from: H */
    public ArrayList f12762H;

    /* renamed from: I */
    public C5959e<TranscodeType> f12763I;

    /* renamed from: J */
    public C5959e<TranscodeType> f12764J;

    /* renamed from: K */
    public boolean f12765K = true;

    /* renamed from: L */
    public boolean f12766L;

    /* renamed from: M */
    public boolean f12767M;

    /* renamed from: com.bumptech.glide.e$a */
    public static /* synthetic */ class C5960a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12768a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12769b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12769b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12769b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12769b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f12769b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f12768a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f12768a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f12768a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f12768a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f12768a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f12768a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f12768a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f12768a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5959e.C5960a.<clinit>():void");
        }
    }

    static {
        C6128g gVar = (C6128g) ((C6128g) ((C6128g) new C6128g().mo17148f(C6024j.f12929b)).mo17161u(Priority.LOW)).mo17166z(true);
    }

    @SuppressLint({"CheckResult"})
    public C5959e(Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        this.f12757C = requestManager;
        this.f12758D = cls;
        this.f12756B = context;
        this.f12760F = requestManager.getDefaultTransitionOptions(cls);
        this.f12759E = glide.getGlideContext();
        for (C6127f<Object> I : requestManager.getDefaultRequestListeners()) {
            mo16812I(I);
        }
        mo16829a(requestManager.getDefaultRequestOptions());
    }

    /* renamed from: I */
    public C5959e<TranscodeType> mo16812I(C6127f<TranscodeType> fVar) {
        if (this.f13217w) {
            return clone().mo16812I(fVar);
        }
        if (fVar != null) {
            if (this.f12762H == null) {
                this.f12762H = new ArrayList();
            }
            this.f12762H.add(fVar);
        }
        mo17163w();
        return this;
    }

    /* renamed from: J */
    public C5959e<TranscodeType> mo16829a(C6121a<?> aVar) {
        C0114h.m281L(aVar);
        return (C5959e) super.mo16829a(aVar);
    }

    /* renamed from: K */
    public final C6124d mo16814K(int i, int i2, Priority priority, C5961f fVar, C6121a aVar, RequestCoordinator requestCoordinator, C6125e eVar, C8448i iVar, Object obj, Executor executor) {
        C6122b bVar;
        C6122b bVar2;
        C6130i iVar2;
        int i3;
        Priority priority2;
        int i4;
        int i5;
        C6121a aVar2 = aVar;
        Object obj2 = obj;
        if (this.f12764J != null) {
            bVar2 = new C6122b(obj2, requestCoordinator);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = requestCoordinator;
        }
        C5959e<TranscodeType> eVar2 = this.f12763I;
        if (eVar2 == null) {
            iVar2 = mo16830a0(i, i2, priority, fVar, aVar, bVar2, eVar, iVar, obj, executor);
        } else if (!this.f12767M) {
            C5961f<?, ? super TranscodeType> fVar2 = eVar2.f12765K ? fVar : eVar2.f12760F;
            if (C6121a.m12173k(eVar2.f13196b, 8)) {
                priority2 = this.f12763I.f13199e;
            } else {
                int i6 = C5960a.f12769b[priority.ordinal()];
                if (i6 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i6 == 2) {
                    priority2 = Priority.HIGH;
                } else if (i6 == 3 || i6 == 4) {
                    priority2 = Priority.IMMEDIATE;
                } else {
                    StringBuilder h = C0072d.m201h("unknown priority: ");
                    h.append(this.f13199e);
                    throw new IllegalArgumentException(h.toString());
                }
            }
            Priority priority3 = priority2;
            C5959e<TranscodeType> eVar3 = this.f12763I;
            int i7 = eVar3.f13206l;
            int i8 = eVar3.f13205k;
            if (C4426l.m10135i(i, i2)) {
                C5959e<TranscodeType> eVar4 = this.f12763I;
                if (!C4426l.m10135i(eVar4.f13206l, eVar4.f13205k)) {
                    i5 = aVar2.f13206l;
                    i4 = aVar2.f13205k;
                    C6130i iVar3 = new C6130i(obj2, bVar2);
                    C6130i iVar4 = iVar3;
                    C6125e eVar5 = eVar;
                    C8448i iVar5 = iVar;
                    C6130i iVar6 = iVar3;
                    Object obj3 = obj;
                    SingleRequest a0 = mo16830a0(i, i2, priority, fVar, aVar, iVar4, eVar5, iVar5, obj3, executor);
                    this.f12767M = true;
                    C5959e<TranscodeType> eVar6 = this.f12763I;
                    C6124d K = eVar6.mo16814K(i5, i4, priority3, fVar2, eVar6, iVar6, eVar5, iVar5, obj3, executor);
                    this.f12767M = false;
                    C6130i iVar7 = iVar6;
                    iVar7.f13239c = a0;
                    iVar7.f13240d = K;
                    iVar2 = iVar7;
                }
            }
            i4 = i8;
            i5 = i7;
            C6130i iVar32 = new C6130i(obj2, bVar2);
            C6130i iVar42 = iVar32;
            C6125e eVar52 = eVar;
            C8448i iVar52 = iVar;
            C6130i iVar62 = iVar32;
            Object obj32 = obj;
            SingleRequest a02 = mo16830a0(i, i2, priority, fVar, aVar, iVar42, eVar52, iVar52, obj32, executor);
            this.f12767M = true;
            C5959e<TranscodeType> eVar62 = this.f12763I;
            C6124d K2 = eVar62.mo16814K(i5, i4, priority3, fVar2, eVar62, iVar62, eVar52, iVar52, obj32, executor);
            this.f12767M = false;
            C6130i iVar72 = iVar62;
            iVar72.f13239c = a02;
            iVar72.f13240d = K2;
            iVar2 = iVar72;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return iVar2;
        }
        C5959e<TranscodeType> eVar7 = this.f12764J;
        int i9 = eVar7.f13206l;
        int i10 = eVar7.f13205k;
        if (C4426l.m10135i(i, i2)) {
            C5959e<TranscodeType> eVar8 = this.f12764J;
            if (!C4426l.m10135i(eVar8.f13206l, eVar8.f13205k)) {
                int i11 = aVar2.f13206l;
                i3 = aVar2.f13205k;
                i9 = i11;
                C5959e<TranscodeType> eVar9 = this.f12764J;
                C6124d K3 = eVar9.mo16814K(i9, i3, eVar9.f13199e, eVar9.f12760F, eVar9, bVar, eVar, iVar, obj, executor);
                bVar.f13223c = iVar2;
                bVar.f13224d = K3;
                return bVar;
            }
        }
        i3 = i10;
        C5959e<TranscodeType> eVar92 = this.f12764J;
        C6124d K32 = eVar92.mo16814K(i9, i3, eVar92.f13199e, eVar92.f12760F, eVar92, bVar, eVar, iVar, obj, executor);
        bVar.f13223c = iVar2;
        bVar.f13224d = K32;
        return bVar;
    }

    /* renamed from: L */
    public C5959e<TranscodeType> clone() {
        C5959e<TranscodeType> eVar = (C5959e) super.clone();
        eVar.f12760F = eVar.f12760F.clone();
        if (eVar.f12762H != null) {
            eVar.f12762H = new ArrayList(eVar.f12762H);
        }
        C5959e<TranscodeType> eVar2 = eVar.f12763I;
        if (eVar2 != null) {
            eVar.f12763I = eVar2.clone();
        }
        C5959e<TranscodeType> eVar3 = eVar.f12764J;
        if (eVar3 != null) {
            eVar.f12764J = eVar3.clone();
        }
        return eVar;
    }

    /* renamed from: M */
    public final void mo16816M(ImageView imageView) {
        C6121a aVar;
        C4426l.m10127a();
        C0114h.m281L(imageView);
        if (!C6121a.m12173k(this.f13196b, RecyclerView.C3084b0.FLAG_MOVED) && this.f13209o && imageView.getScaleType() != null) {
            switch (C5960a.f12768a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = mo16831c().mo17154m();
                    break;
                case 2:
                    aVar = mo16831c().mo17155o();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = mo16831c().mo17156p();
                    break;
                case 6:
                    aVar = mo16831c().mo17155o();
                    break;
            }
        }
        aVar = this;
        mo16817N(this.f12759E.buildImageViewTarget(imageView, this.f12758D), (C6125e) null, aVar, C4416e.f9694a);
    }

    /* renamed from: N */
    public final void mo16817N(C8448i iVar, C6125e eVar, C6121a aVar, Executor executor) {
        C8448i iVar2 = iVar;
        C6121a aVar2 = aVar;
        C0114h.m281L(iVar);
        if (this.f12766L) {
            Object obj = new Object();
            C6124d K = mo16814K(aVar2.f13206l, aVar2.f13205k, aVar2.f13199e, this.f12760F, aVar, (RequestCoordinator) null, eVar, iVar, obj, executor);
            C6124d request = iVar.getRequest();
            if (K.mo17128g(request)) {
                if (!(!aVar2.f13204j && request.mo17126e())) {
                    C0114h.m281L(request);
                    if (!request.isRunning()) {
                        request.mo17129h();
                        return;
                    }
                    return;
                }
            }
            this.f12757C.clear((C8448i<?>) iVar);
            iVar.mo16753g(K);
            this.f12757C.track(iVar, K);
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: O */
    public C5959e<TranscodeType> mo16818O(C6127f<TranscodeType> fVar) {
        if (this.f13217w) {
            return clone().mo16818O(fVar);
        }
        this.f12762H = null;
        return mo16812I(fVar);
    }

    /* renamed from: P */
    public C5959e<TranscodeType> mo16819P(Bitmap bitmap) {
        return mo16828Z(bitmap).mo16829a(C6128g.m12233K(C6024j.f12928a));
    }

    /* renamed from: Q */
    public C5959e<TranscodeType> mo16820Q(Drawable drawable) {
        return mo16828Z(drawable).mo16829a(C6128g.m12233K(C6024j.f12928a));
    }

    /* renamed from: R */
    public C5959e<TranscodeType> mo16821R(Uri uri) {
        return mo16828Z(uri);
    }

    /* renamed from: T */
    public C5959e<TranscodeType> mo16822T(File file) {
        return mo16828Z(file);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: j4.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bumptech.glide.C5959e<TranscodeType> mo16823U(java.lang.Integer r6) {
        /*
            r5 = this;
            com.bumptech.glide.e r6 = r5.mo16828Z(r6)
            android.content.Context r0 = r5.f12756B
            java.util.concurrent.ConcurrentHashMap r1 = p025b5.C3477b.f8099a
            java.lang.String r1 = r0.getPackageName()
            java.util.concurrent.ConcurrentHashMap r2 = p025b5.C3477b.f8099a
            java.lang.Object r2 = r2.get(r1)
            j4.b r2 = (p150j4.C7109b) r2
            if (r2 != 0) goto L_0x005e
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0024 }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0024 }
            r4 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0024 }
            goto L_0x003c
        L_0x0024:
            r2 = move-exception
            java.lang.String r3 = "Cannot resolve info for"
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r0.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "AppVersionSignature"
            android.util.Log.e(r4, r3, r2)
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0045
            int r2 = r2.versionCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x004d
        L_0x0045:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        L_0x004d:
            b5.d r3 = new b5.d
            r3.<init>(r2)
            java.util.concurrent.ConcurrentHashMap r2 = p025b5.C3477b.f8099a
            java.lang.Object r1 = r2.putIfAbsent(r1, r3)
            r2 = r1
            j4.b r2 = (p150j4.C7109b) r2
            if (r2 != 0) goto L_0x005e
            r2 = r3
        L_0x005e:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            b5.a r1 = new b5.a
            r1.<init>(r0, r2)
            com.bumptech.glide.request.g r0 = new com.bumptech.glide.request.g
            r0.<init>()
            com.bumptech.glide.request.a r0 = r0.mo17165y(r1)
            com.bumptech.glide.request.g r0 = (com.bumptech.glide.request.C6128g) r0
            com.bumptech.glide.e r6 = r6.mo16829a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5959e.mo16823U(java.lang.Integer):com.bumptech.glide.e");
    }

    /* renamed from: V */
    public C5959e<TranscodeType> mo16824V(Object obj) {
        return mo16828Z(obj);
    }

    /* renamed from: W */
    public C5959e<TranscodeType> mo16825W(String str) {
        return mo16828Z(str);
    }

    @Deprecated
    /* renamed from: X */
    public C5959e<TranscodeType> mo16826X(URL url) {
        return mo16828Z(url);
    }

    /* renamed from: Y */
    public C5959e<TranscodeType> mo16827Y(byte[] bArr) {
        C5959e<TranscodeType> Z = mo16828Z(bArr);
        if (!C6121a.m12173k(Z.f13196b, 4)) {
            Z = Z.mo16829a(C6128g.m12233K(C6024j.f12928a));
        }
        return !C6121a.m12173k(Z.f13196b, 256) ? Z.mo16829a(C6128g.m12234L()) : Z;
    }

    /* renamed from: Z */
    public final C5959e<TranscodeType> mo16828Z(Object obj) {
        if (this.f13217w) {
            return clone().mo16828Z(obj);
        }
        this.f12761G = obj;
        this.f12766L = true;
        mo17163w();
        return this;
    }

    /* renamed from: a0 */
    public final SingleRequest mo16830a0(int i, int i2, Priority priority, C5961f fVar, C6121a aVar, RequestCoordinator requestCoordinator, C6125e eVar, C8448i iVar, Object obj, Executor executor) {
        C6121a aVar2 = aVar;
        C6125e eVar2 = eVar;
        C8448i iVar2 = iVar;
        Object obj2 = obj;
        Context context = this.f12756B;
        GlideContext glideContext = this.f12759E;
        return new SingleRequest(context, glideContext, obj2, this.f12761G, this.f12758D, aVar2, i, i2, priority, iVar2, eVar2, this.f12762H, requestCoordinator, glideContext.getEngine(), fVar.f12770b, executor);
    }
}
