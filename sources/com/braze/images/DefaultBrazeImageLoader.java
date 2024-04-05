package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.util.LruCache;
import android.widget.ImageView;
import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.C4897R;
import com.appboy.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19729m;
import p030bo.app.C3695h;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;
import p768rq.C20153b;

public final class DefaultBrazeImageLoader implements C5442a {

    /* renamed from: f */
    public static final String f11709f = BrazeLogger.m11287i(DefaultBrazeImageLoader.class);

    /* renamed from: a */
    public final ReentrantLock f11710a = new ReentrantLock();

    /* renamed from: b */
    public final C5420a f11711b;

    /* renamed from: c */
    public C3695h f11712c;

    /* renamed from: d */
    public boolean f11713d = true;

    /* renamed from: e */
    public boolean f11714e;

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$a */
    public static final class C5420a extends LruCache<String, Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ int f11715a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5420a(int i) {
            super(i);
            this.f11715a = i;
        }

        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            C19383o.m32797g(str, "key");
            C19383o.m32797g(bitmap, ResponseConstants.IMAGE);
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$c */
    public static final class C5421c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11716b;

        /* renamed from: c */
        public final /* synthetic */ DefaultBrazeImageLoader f11717c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5421c(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
            super(0);
            this.f11716b = str;
            this.f11717c = defaultBrazeImageLoader;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Got bitmap from mem cache for key ");
            h.append(this.f11716b);
            h.append("\nMemory cache stats: ");
            h.append(this.f11717c.f11711b);
            return h.toString();
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$d */
    public static final class C5422d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11718b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5422d(String str) {
            super(0);
            this.f11718b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11718b, "Got bitmap from disk cache for key ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$e */
    public static final class C5423e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11719b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5423e(String str) {
            super(0);
            this.f11719b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11719b, "No cache hit for bitmap: ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$f */
    final class C5424f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11720b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5424f(String str) {
            super(0);
            this.f11720b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11720b, "Disk cache still starting. Cannot retrieve key from disk cache: ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$g */
    final class C5425g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11721b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5425g(String str) {
            super(0);
            this.f11721b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11721b, "Getting bitmap from disk cache for key: ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$h */
    public static final class C5426h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5426h f11722b = new C5426h();

        public C5426h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with blank image url";
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$i */
    public static final class C5427i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5427i f11723b = new C5427i();

        public C5427i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cache is currently in offline mode. Not downloading bitmap.";
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$j */
    public static final class C5428j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11724b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5428j(String str) {
            super(0);
            this.f11724b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11724b, "Failed to get bitmap from url. Url: ");
        }
    }

    @C19060c(mo70540c = "com.braze.images.DefaultBrazeImageLoader$initDiskCacheTask$1", mo70541f = "DefaultBrazeImageLoader.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.images.DefaultBrazeImageLoader$k */
    final class C5429k extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11725b;

        /* renamed from: c */
        public final /* synthetic */ Context f11726c;

        /* renamed from: d */
        public final /* synthetic */ DefaultBrazeImageLoader f11727d;

        /* renamed from: com.braze.images.DefaultBrazeImageLoader$k$a */
        public static final class C5430a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5430a f11728b = new C5430a();

            public C5430a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Initializing disk cache";
            }
        }

        /* renamed from: com.braze.images.DefaultBrazeImageLoader$k$b */
        public static final class C5431b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5431b f11729b = new C5431b();

            public C5431b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Disk cache initialized";
            }
        }

        /* renamed from: com.braze.images.DefaultBrazeImageLoader$k$c */
        public static final class C5432c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5432c f11730b = new C5432c();

            public C5432c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception creating new disk cache. Unable to create new disk cache";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5429k(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, C19340c<? super C5429k> cVar) {
            super(2, cVar);
            this.f11726c = context;
            this.f11727d = defaultBrazeImageLoader;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5429k) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5429k(this.f11726c, this.f11727d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11725b == 0) {
                C0761x.m1684O0(obj);
                String str = DefaultBrazeImageLoader.f11709f;
                Context context = this.f11726c;
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                File file = new File(context.getCacheDir().getPath() + File.separator + "appboy.imageloader.lru.cache");
                DefaultBrazeImageLoader defaultBrazeImageLoader = this.f11727d;
                ReentrantLock reentrantLock = defaultBrazeImageLoader.f11710a;
                reentrantLock.lock();
                try {
                    String str2 = DefaultBrazeImageLoader.f11709f;
                    BrazeLogger.m11283e(str2, (BrazeLogger.Priority) null, (Throwable) null, C5430a.f11728b, 14);
                    defaultBrazeImageLoader.f11712c = new C3695h(file, 1, 1, 52428800);
                    BrazeLogger.m11283e(str2, (BrazeLogger.Priority) null, (Throwable) null, C5431b.f11729b, 14);
                    defaultBrazeImageLoader.f11713d = false;
                } catch (Exception e) {
                    BrazeLogger.m11283e(DefaultBrazeImageLoader.f11709f, BrazeLogger.Priority.E, e, C5432c.f11730b, 8);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
                C19394m mVar = C19394m.f43287a;
                reentrantLock.unlock();
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$l */
    public static final class C5433l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11731b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5433l(String str) {
            super(0);
            this.f11731b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11731b, "Adding bitmap to mem cache for key ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$m */
    public static final class C5434m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11732b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5434m(String str) {
            super(0);
            this.f11732b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11732b, "Skipping disk cache for key: ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$n */
    public static final class C5435n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11733b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5435n(String str) {
            super(0);
            this.f11733b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11733b, "Adding bitmap to disk cache for key ");
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$o */
    final class C5436o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5436o f11734b = new C5436o();

        public C5436o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with a blank image url";
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$p */
    final class C5437p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11735b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5437p(String str) {
            super(0);
            this.f11735b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11735b, "Failed to render url into view. Url: ");
        }
    }

    @C19060c(mo70540c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1", mo70541f = "DefaultBrazeImageLoader.kt", mo70542l = {249}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.images.DefaultBrazeImageLoader$q */
    final class C5438q extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11736b;

        /* renamed from: d */
        public final /* synthetic */ Context f11738d;

        /* renamed from: e */
        public final /* synthetic */ String f11739e;

        /* renamed from: f */
        public final /* synthetic */ BrazeViewBounds f11740f;

        /* renamed from: g */
        public final /* synthetic */ ImageView f11741g;

        /* renamed from: com.braze.images.DefaultBrazeImageLoader$q$a */
        public static final class C5439a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11742b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5439a(String str) {
                super(0);
                this.f11742b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11742b, "Failed to retrieve bitmap from url: ");
            }
        }

        @C19060c(mo70540c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1$2", mo70541f = "DefaultBrazeImageLoader.kt", mo70542l = {}, mo70543m = "invokeSuspend")
        /* renamed from: com.braze.images.DefaultBrazeImageLoader$q$b */
        public static final class C5440b extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

            /* renamed from: b */
            public int f11743b;

            /* renamed from: c */
            public final /* synthetic */ String f11744c;

            /* renamed from: d */
            public final /* synthetic */ ImageView f11745d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f11746e;

            /* renamed from: f */
            public final /* synthetic */ BrazeViewBounds f11747f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5440b(String str, ImageView imageView, Bitmap bitmap, BrazeViewBounds brazeViewBounds, C19340c<? super C5440b> cVar) {
                super(2, cVar);
                this.f11744c = str;
                this.f11745d = imageView;
                this.f11746e = bitmap;
                this.f11747f = brazeViewBounds;
            }

            /* renamed from: a */
            public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                return ((C5440b) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
            }

            public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                return new C5440b(this.f11744c, this.f11745d, this.f11746e, this.f11747f, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f11743b == 0) {
                    C0761x.m1684O0(obj);
                    String str = this.f11744c;
                    Object tag = this.f11745d.getTag(C4897R.string.com_braze_image_lru_cache_image_url_key);
                    if (tag != null) {
                        if (C19383o.m32792b(str, (String) tag)) {
                            this.f11745d.setImageBitmap(this.f11746e);
                            if (this.f11747f == BrazeViewBounds.BASE_CARD_VIEW) {
                                BrazeImageUtils.m11256f(this.f11746e, this.f11745d);
                            }
                        }
                        return C19394m.f43287a;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5438q(Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, C19340c<? super C5438q> cVar) {
            super(2, cVar);
            this.f11738d = context;
            this.f11739e = str;
            this.f11740f = brazeViewBounds;
            this.f11741g = imageView;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5438q) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5438q(this.f11738d, this.f11739e, this.f11740f, this.f11741g, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f11736b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
                Bitmap b = DefaultBrazeImageLoader.this.mo15921b(this.f11738d, this.f11739e, this.f11740f);
                if (b == null) {
                    BrazeLogger.m11283e(DefaultBrazeImageLoader.f11709f, (BrazeLogger.Priority) null, (Throwable) null, new C5439a(this.f11739e), 14);
                } else {
                    C20153b bVar = C19760n0.f43719a;
                    C19764o1 o1Var = C19729m.f43681a;
                    C5440b bVar2 = new C5440b(this.f11739e, this.f11741g, b, this.f11740f, (C19340c<? super C5440b>) null);
                    this.f11736b = 1;
                    if (C19697g.m33471i(this, o1Var, bVar2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.images.DefaultBrazeImageLoader$r */
    public static final class C5441r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f11748b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5441r(boolean z) {
            super(0);
            this.f11748b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11748b ? "disabled" : ResponseConstants.ENABLED, "DefaultBrazeImageLoader outbound network requests are now ");
        }
    }

    public DefaultBrazeImageLoader(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        String str = BrazeImageUtils.f11898a;
        this.f11711b = new C5420a(Math.max(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / ((long) 8), ParserMinimalBase.MAX_INT_L), 33554432)));
        C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C5429k(context, this, (C19340c<? super C5429k>) null), 3);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo15920a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r1 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            com.braze.images.DefaultBrazeImageLoader$a r1 = r10.f11711b
            java.lang.Object r1 = r1.get(r11)
            r7 = r1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 != 0) goto L_0x008e
            java.util.concurrent.locks.ReentrantLock r7 = r10.f11710a
            r7.lock()
            boolean r1 = r10.f11713d     // Catch:{ all -> 0x0089 }
            r8 = 0
            if (r1 == 0) goto L_0x002a
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ all -> 0x0089 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.V     // Catch:{ all -> 0x0089 }
            r4 = 0
            com.braze.images.DefaultBrazeImageLoader$f r5 = new com.braze.images.DefaultBrazeImageLoader$f     // Catch:{ all -> 0x0089 }
            r5.<init>(r11)     // Catch:{ all -> 0x0089 }
            r6 = 6
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0056
        L_0x002a:
            bo.app.h r1 = r10.f11712c     // Catch:{ all -> 0x0089 }
            java.lang.String r9 = "diskLruCache"
            if (r1 == 0) goto L_0x0085
            boolean r1 = r1.mo13338a(r11)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0056
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ all -> 0x0089 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.V     // Catch:{ all -> 0x0089 }
            r4 = 0
            com.braze.images.DefaultBrazeImageLoader$g r5 = new com.braze.images.DefaultBrazeImageLoader$g     // Catch:{ all -> 0x0089 }
            r5.<init>(r11)     // Catch:{ all -> 0x0089 }
            r6 = 6
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0089 }
            bo.app.h r1 = r10.f11712c     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0052
            android.graphics.Bitmap r1 = r1.mo13339b(r11)     // Catch:{ all -> 0x0089 }
            r7.unlock()
            r7 = r1
            goto L_0x005c
        L_0x0052:
            kotlin.jvm.internal.C19383o.m32805o(r9)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0056:
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0089 }
            r7.unlock()
            r7 = r8
        L_0x005c:
            if (r7 != 0) goto L_0x006d
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.images.DefaultBrazeImageLoader$e r5 = new com.braze.images.DefaultBrazeImageLoader$e
            r5.<init>(r11)
            r3 = 0
            r4 = 0
            r6 = 7
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x006d:
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.V
            com.braze.images.DefaultBrazeImageLoader$d r5 = new com.braze.images.DefaultBrazeImageLoader$d
            r5.<init>(r11)
            r4 = 0
            r6 = 6
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            com.braze.images.DefaultBrazeImageLoader$a r1 = r10.f11711b
            java.lang.Object r0 = r1.put(r11, r7)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r7
        L_0x0085:
            kotlin.jvm.internal.C19383o.m32805o(r9)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            r7.unlock()
            throw r0
        L_0x008e:
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.V
            com.braze.images.DefaultBrazeImageLoader$c r5 = new com.braze.images.DefaultBrazeImageLoader$c
            r5.<init>(r11, r10)
            r4 = 0
            r6 = 6
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.images.DefaultBrazeImageLoader.mo15920a(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final Bitmap mo15921b(Context context, String str, BrazeViewBounds brazeViewBounds) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "imageUrl");
        if (C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5426h.f11722b, 7);
            return null;
        }
        try {
            Bitmap a = mo15920a(str);
            if (a != null) {
                return a;
            }
            if (this.f11714e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5427i.f11723b, 7);
            } else {
                Uri parse = Uri.parse(str);
                C19383o.m32796f(parse, "imageUri");
                if (brazeViewBounds == null) {
                    brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
                }
                Bitmap b = BrazeImageUtils.m11252b(context, parse, brazeViewBounds);
                if (b != null) {
                    mo15923d(str, b, BrazeFileUtils.m11240d(parse));
                    return b;
                }
            }
            return null;
        } catch (Throwable th) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, th, new C5428j(str), 4);
        }
    }

    /* renamed from: c */
    public final Bitmap mo15922c(Context context, String str, BrazeViewBounds brazeViewBounds) {
        C19383o.m32797g(str, "imageUrl");
        return mo15921b(context, str, brazeViewBounds);
    }

    /* renamed from: d */
    public final void mo15923d(String str, Bitmap bitmap, boolean z) {
        C19383o.m32797g(str, "key");
        if (((Bitmap) this.f11711b.get(str)) == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5433l(str), 7);
            this.f11711b.put(str, bitmap);
        }
        if (z) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5434m(str), 7);
            return;
        }
        ReentrantLock reentrantLock = this.f11710a;
        reentrantLock.lock();
        try {
            if (!this.f11713d) {
                C3695h hVar = this.f11712c;
                if (hVar == null) {
                    C19383o.m32805o("diskLruCache");
                    throw null;
                } else if (!hVar.mo13338a(str)) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5435n(str), 7);
                    C3695h hVar2 = this.f11712c;
                    if (hVar2 != null) {
                        hVar2.mo13337a(str, bitmap);
                    } else {
                        C19383o.m32805o("diskLruCache");
                        throw null;
                    }
                }
            }
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final void mo15924e(Context context, C5483a aVar, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        C19383o.m32797g(aVar, "inAppMessage");
        mo15925f(context, imageView, brazeViewBounds, str);
    }

    /* renamed from: f */
    public final void mo15925f(Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String str) {
        if (C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5436o.f11734b, 7);
            return;
        }
        try {
            imageView.setTag(C4897R.string.com_braze_image_lru_cache_image_url_key, str);
            C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C5438q(context, str, brazeViewBounds, imageView, (C19340c<? super C5438q>) null), 3);
        } catch (Throwable th) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, th, new C5437p(str), 4);
        }
    }

    /* renamed from: g */
    public final void mo15926g(boolean z) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C5441r(z), 6);
        this.f11714e = z;
    }
}
