package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.C2681i;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p193o.C7496d;

/* renamed from: androidx.emoji2.text.e */
public final class C2665e {

    /* renamed from: j */
    public static final Object f6003j = new Object();

    /* renamed from: k */
    public static volatile C2665e f6004k;

    /* renamed from: a */
    public final ReentrantReadWriteLock f6005a;

    /* renamed from: b */
    public final C7496d f6006b;

    /* renamed from: c */
    public volatile int f6007c = 3;

    /* renamed from: d */
    public final Handler f6008d;

    /* renamed from: e */
    public final C2666a f6009e;

    /* renamed from: f */
    public final C2672g f6010f;

    /* renamed from: g */
    public final int f6011g = -16711936;

    /* renamed from: h */
    public final int f6012h;

    /* renamed from: i */
    public final C2681i.C2682a f6013i;

    /* renamed from: androidx.emoji2.text.e$a */
    public static final class C2666a extends C2667b {

        /* renamed from: b */
        public volatile C2681i f6014b;

        /* renamed from: c */
        public volatile C2689l f6015c;

        public C2666a(C2665e eVar) {
            super(eVar);
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    public static class C2667b {

        /* renamed from: a */
        public final C2665e f6016a;

        public C2667b(C2665e eVar) {
            this.f6016a = eVar;
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    public static abstract class C2668c {

        /* renamed from: a */
        public final C2672g f6017a;

        /* renamed from: b */
        public int f6018b = 0;

        /* renamed from: c */
        public C2681i.C2682a f6019c = new C2681i.C2682a();

        public C2668c(C2672g gVar) {
            this.f6017a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    public interface C2669d {
    }

    /* renamed from: androidx.emoji2.text.e$e */
    public static abstract class C2670e {
        /* renamed from: a */
        public void mo2834a() {
        }

        /* renamed from: b */
        public void mo2835b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    public static class C2671f implements Runnable {

        /* renamed from: b */
        public final ArrayList f6020b;

        /* renamed from: c */
        public final int f6021c;

        public C2671f(List list, int i, Throwable th) {
            if (list != null) {
                this.f6020b = new ArrayList(list);
                this.f6021c = i;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        public final void run() {
            int size = this.f6020b.size();
            int i = 0;
            if (this.f6021c != 1) {
                while (i < size) {
                    ((C2670e) this.f6020b.get(i)).mo2834a();
                    i++;
                }
                return;
            }
            while (i < size) {
                ((C2670e) this.f6020b.get(i)).mo2835b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    public interface C2672g {
        /* renamed from: a */
        void mo10026a(C2673h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    public static abstract class C2673h {
        /* renamed from: a */
        public abstract void mo10062a(Throwable th);

        /* renamed from: b */
        public abstract void mo10063b(C2689l lVar);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    public static class C2674i {
    }

    public C2665e(EmojiCompatInitializer.C2654a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6005a = reentrantReadWriteLock;
        C2672g gVar = aVar.f6017a;
        this.f6010f = gVar;
        int i = aVar.f6018b;
        this.f6012h = i;
        this.f6013i = aVar.f6019c;
        this.f6008d = new Handler(Looper.getMainLooper());
        this.f6006b = new C7496d();
        C2666a aVar2 = new C2666a(this);
        this.f6009e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f6007c = 0;
            } catch (Throwable th) {
                this.f6005a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (mo10064b() == 0) {
            try {
                gVar.mo10026a(new C2664d(aVar2));
            } catch (Throwable th2) {
                aVar2.f6016a.mo10066d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C2665e m6414a() {
        C2665e eVar;
        synchronized (f6003j) {
            eVar = f6004k;
            if (!(eVar != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public final int mo10064b() {
        this.f6005a.readLock().lock();
        try {
            return this.f6007c;
        } finally {
            this.f6005a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void mo10065c() {
        boolean z = true;
        if (this.f6012h == 1) {
            if (mo10064b() != 1) {
                z = false;
            }
            if (!z) {
                this.f6005a.writeLock().lock();
                try {
                    if (this.f6007c != 0) {
                        this.f6007c = 0;
                        this.f6005a.writeLock().unlock();
                        C2666a aVar = this.f6009e;
                        aVar.getClass();
                        try {
                            aVar.f6016a.f6010f.mo10026a(new C2664d(aVar));
                        } catch (Throwable th) {
                            aVar.f6016a.mo10066d(th);
                        }
                    }
                } finally {
                    this.f6005a.writeLock().unlock();
                }
            }
        } else {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo10066d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6005a.writeLock().lock();
        try {
            this.f6007c = 2;
            arrayList.addAll(this.f6006b);
            this.f6006b.clear();
            this.f6005a.writeLock().unlock();
            this.f6008d.post(new C2671f(arrayList, this.f6007c, th));
        } catch (Throwable th2) {
            this.f6005a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo10067e() {
        ArrayList arrayList = new ArrayList();
        this.f6005a.writeLock().lock();
        try {
            this.f6007c = 1;
            arrayList.addAll(this.f6006b);
            this.f6006b.clear();
            this.f6005a.writeLock().unlock();
            this.f6008d.post(new C2671f(arrayList, this.f6007c, (Throwable) null));
        } catch (Throwable th) {
            this.f6005a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0101, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e5, code lost:
        if (r7.mo10079b(r2, r11, r0, r10.f6045d.f6063b) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e7, code lost:
        if (r3 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        r3 = new android.text.SpannableString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ee, code lost:
        r4 = r10.f6045d.f6063b;
        r7.f6037a.getClass();
        r3.setSpan(new androidx.emoji2.text.TypefaceEmojiSpan(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[Catch:{ all -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00af A[Catch:{ all -> 0x0173 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo10068f(int r17, int r18, java.lang.CharSequence r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r16.mo10064b()
            r5 = 1
            if (r3 != r5) goto L_0x000f
            r3 = r5
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            if (r3 == 0) goto L_0x0194
            if (r0 < 0) goto L_0x018a
            if (r1 < 0) goto L_0x0180
            if (r0 > r1) goto L_0x001a
            r3 = r5
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            java.lang.String r6 = "start should be <= than end"
            p001a0.C0005b.m20N(r3, r6)
            r3 = 0
            if (r2 != 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r19.length()
            if (r0 > r6) goto L_0x002c
            r6 = r5
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            java.lang.String r7 = "start should be < than charSequence length"
            p001a0.C0005b.m20N(r6, r7)
            int r6 = r19.length()
            if (r1 > r6) goto L_0x003a
            r6 = r5
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            java.lang.String r7 = "end should be < than charSequence length"
            p001a0.C0005b.m20N(r6, r7)
            int r6 = r19.length()
            if (r6 == 0) goto L_0x017d
            if (r0 != r1) goto L_0x004a
            goto L_0x017d
        L_0x004a:
            r6 = r16
            androidx.emoji2.text.e$a r7 = r6.f6009e
            androidx.emoji2.text.i r7 = r7.f6014b
            r7.getClass()
            boolean r8 = r2 instanceof androidx.emoji2.text.SpannableBuilder
            if (r8 == 0) goto L_0x005d
            r9 = r2
            androidx.emoji2.text.SpannableBuilder r9 = (androidx.emoji2.text.SpannableBuilder) r9
            r9.beginBatchEdit()
        L_0x005d:
            if (r8 != 0) goto L_0x007d
            boolean r9 = r2 instanceof android.text.Spannable     // Catch:{ all -> 0x0173 }
            if (r9 == 0) goto L_0x0064
            goto L_0x007d
        L_0x0064:
            boolean r9 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x0173 }
            if (r9 == 0) goto L_0x0080
            r9 = r2
            android.text.Spanned r9 = (android.text.Spanned) r9     // Catch:{ all -> 0x0173 }
            int r10 = r0 + -1
            int r11 = r1 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r12 = androidx.emoji2.text.EmojiSpan.class
            int r9 = r9.nextSpanTransition(r10, r11, r12)     // Catch:{ all -> 0x0173 }
            if (r9 > r1) goto L_0x0080
            android.text.SpannableString r3 = new android.text.SpannableString     // Catch:{ all -> 0x0173 }
            r3.<init>(r2)     // Catch:{ all -> 0x0173 }
            goto L_0x0080
        L_0x007d:
            r3 = r2
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x0173 }
        L_0x0080:
            if (r3 == 0) goto L_0x00ad
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r9 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r9 = r3.getSpans(r0, r1, r9)     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.EmojiSpan[] r9 = (androidx.emoji2.text.EmojiSpan[]) r9     // Catch:{ all -> 0x0173 }
            if (r9 == 0) goto L_0x00ad
            int r10 = r9.length     // Catch:{ all -> 0x0173 }
            if (r10 <= 0) goto L_0x00ad
            int r10 = r9.length     // Catch:{ all -> 0x0173 }
            r11 = 0
        L_0x0091:
            if (r11 >= r10) goto L_0x00ad
            r12 = r9[r11]     // Catch:{ all -> 0x0173 }
            int r13 = r3.getSpanStart(r12)     // Catch:{ all -> 0x0173 }
            int r14 = r3.getSpanEnd(r12)     // Catch:{ all -> 0x0173 }
            if (r13 == r1) goto L_0x00a2
            r3.removeSpan(r12)     // Catch:{ all -> 0x0173 }
        L_0x00a2:
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0173 }
            int r1 = java.lang.Math.max(r14, r1)     // Catch:{ all -> 0x0173 }
            int r11 = r11 + 1
            goto L_0x0091
        L_0x00ad:
            if (r0 == r1) goto L_0x016a
            int r9 = r19.length()     // Catch:{ all -> 0x0173 }
            if (r0 < r9) goto L_0x00b7
            goto L_0x016a
        L_0x00b7:
            r9 = 2147483647(0x7fffffff, float:NaN)
            androidx.emoji2.text.i$b r10 = new androidx.emoji2.text.i$b     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.l r11 = r7.f6038b     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.l$a r11 = r11.f6060c     // Catch:{ all -> 0x0173 }
            r10.<init>(r11)     // Catch:{ all -> 0x0173 }
            int r11 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0173 }
            r12 = 0
        L_0x00c8:
            r13 = r11
        L_0x00c9:
            r11 = r0
        L_0x00ca:
            r14 = 2
            r15 = 33
            if (r0 >= r1) goto L_0x011f
            if (r12 >= r9) goto L_0x011f
            int r4 = r10.mo10080a(r13)     // Catch:{ all -> 0x0173 }
            if (r4 == r5) goto L_0x010f
            if (r4 == r14) goto L_0x0103
            r14 = 3
            if (r4 == r14) goto L_0x00dd
            goto L_0x00ca
        L_0x00dd:
            androidx.emoji2.text.l$a r4 = r10.f6045d     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.h r4 = r4.f6063b     // Catch:{ all -> 0x0173 }
            boolean r4 = r7.mo10079b(r2, r11, r0, r4)     // Catch:{ all -> 0x0173 }
            if (r4 != 0) goto L_0x0101
            if (r3 != 0) goto L_0x00ee
            android.text.SpannableString r3 = new android.text.SpannableString     // Catch:{ all -> 0x0173 }
            r3.<init>(r2)     // Catch:{ all -> 0x0173 }
        L_0x00ee:
            androidx.emoji2.text.l$a r4 = r10.f6045d     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.h r4 = r4.f6063b     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.e$i r14 = r7.f6037a     // Catch:{ all -> 0x0173 }
            r14.getClass()     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.TypefaceEmojiSpan r14 = new androidx.emoji2.text.TypefaceEmojiSpan     // Catch:{ all -> 0x0173 }
            r14.<init>(r4)     // Catch:{ all -> 0x0173 }
            r3.setSpan(r14, r11, r0, r15)     // Catch:{ all -> 0x0173 }
            int r12 = r12 + 1
        L_0x0101:
            r11 = r13
            goto L_0x00c8
        L_0x0103:
            int r4 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0173 }
            int r0 = r0 + r4
            if (r0 >= r1) goto L_0x00ca
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0173 }
            goto L_0x00ca
        L_0x010f:
            int r0 = java.lang.Character.codePointAt(r2, r11)     // Catch:{ all -> 0x0173 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x0173 }
            int r0 = r0 + r11
            if (r0 >= r1) goto L_0x00c9
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0173 }
            goto L_0x00c9
        L_0x011f:
            int r1 = r10.f6042a     // Catch:{ all -> 0x0173 }
            if (r1 != r14) goto L_0x0135
            androidx.emoji2.text.l$a r1 = r10.f6044c     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.h r1 = r1.f6063b     // Catch:{ all -> 0x0173 }
            if (r1 == 0) goto L_0x0135
            int r1 = r10.f6047f     // Catch:{ all -> 0x0173 }
            if (r1 > r5) goto L_0x0133
            boolean r1 = r10.mo10082c()     // Catch:{ all -> 0x0173 }
            if (r1 == 0) goto L_0x0135
        L_0x0133:
            r4 = r5
            goto L_0x0136
        L_0x0135:
            r4 = 0
        L_0x0136:
            if (r4 == 0) goto L_0x015d
            if (r12 >= r9) goto L_0x015d
            androidx.emoji2.text.l$a r1 = r10.f6044c     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.h r1 = r1.f6063b     // Catch:{ all -> 0x0173 }
            boolean r1 = r7.mo10079b(r2, r11, r0, r1)     // Catch:{ all -> 0x0173 }
            if (r1 != 0) goto L_0x015d
            if (r3 != 0) goto L_0x014c
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0173 }
            r1.<init>(r2)     // Catch:{ all -> 0x0173 }
            r3 = r1
        L_0x014c:
            androidx.emoji2.text.l$a r1 = r10.f6044c     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.h r1 = r1.f6063b     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.e$i r4 = r7.f6037a     // Catch:{ all -> 0x0173 }
            r4.getClass()     // Catch:{ all -> 0x0173 }
            androidx.emoji2.text.TypefaceEmojiSpan r4 = new androidx.emoji2.text.TypefaceEmojiSpan     // Catch:{ all -> 0x0173 }
            r4.<init>(r1)     // Catch:{ all -> 0x0173 }
            r3.setSpan(r4, r11, r0, r15)     // Catch:{ all -> 0x0173 }
        L_0x015d:
            if (r3 != 0) goto L_0x0160
            r3 = r2
        L_0x0160:
            if (r8 == 0) goto L_0x0168
            r0 = r2
            androidx.emoji2.text.SpannableBuilder r0 = (androidx.emoji2.text.SpannableBuilder) r0
            r0.endBatchEdit()
        L_0x0168:
            r2 = r3
            goto L_0x0172
        L_0x016a:
            if (r8 == 0) goto L_0x0172
            r0 = r2
            androidx.emoji2.text.SpannableBuilder r0 = (androidx.emoji2.text.SpannableBuilder) r0
            r0.endBatchEdit()
        L_0x0172:
            return r2
        L_0x0173:
            r0 = move-exception
            if (r8 == 0) goto L_0x017c
            r1 = r2
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.endBatchEdit()
        L_0x017c:
            throw r0
        L_0x017d:
            r6 = r16
            return r2
        L_0x0180:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "end cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x018a:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "start cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x0194:
            r6 = r16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized yet"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C2665e.mo10068f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* renamed from: g */
    public final void mo10069g(C2670e eVar) {
        if (eVar != null) {
            this.f6005a.writeLock().lock();
            try {
                if (this.f6007c != 1) {
                    if (this.f6007c != 2) {
                        this.f6006b.add(eVar);
                    }
                }
                this.f6008d.post(new C2671f(Arrays.asList(new C2670e[]{eVar}), this.f6007c, (Throwable) null));
            } finally {
                this.f6005a.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }
}
