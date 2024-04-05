package p463v9;

import android.database.sqlite.SQLiteDatabase;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.core.posts.PersistentRequest;
import com.etsy.android.lib.core.posts.PostDatabase;
import com.etsy.android.lib.core.posts.PostInfo;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p425q9.C13265p;
import p463v9.C13537b;
import p628nj.C18263b;

/* renamed from: v9.d */
public final class C13541d {

    /* renamed from: a */
    public final EtsyApplication f29612a;

    /* renamed from: b */
    public final C13265p f29613b;

    /* renamed from: c */
    public final C8694h f29614c;

    /* renamed from: d */
    public final Connectivity f29615d;

    /* renamed from: e */
    public final CrashUtil f29616e;

    /* renamed from: f */
    public final OkHttpClientHolder f29617f;

    public C13541d(EtsyApplication etsyApplication, C13265p pVar, C8694h hVar, Connectivity connectivity, CrashUtil crashUtil, OkHttpClientHolder okHttpClientHolder) {
        C19383o.m32797g(etsyApplication, "application");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(crashUtil, "crashUtil");
        C19383o.m32797g(okHttpClientHolder, "okHttpClientHolder");
        this.f29612a = etsyApplication;
        this.f29613b = pVar;
        this.f29614c = hVar;
        this.f29615d = connectivity;
        this.f29616e = crashUtil;
        this.f29617f = okHttpClientHolder;
    }

    /* renamed from: a */
    public final void mo46197a(long j) {
        SQLiteDatabase writableDatabase = PostDatabase.getInstance(this.f29613b.f29142h.f29603a).getWritableDatabase();
        if (writableDatabase != null) {
            try {
                writableDatabase.delete("post", "_id = ?", new String[]{String.valueOf(j)});
            } catch (Exception e) {
                C8694h.f19097a.mo21309d("deletePostFromDb - db error - assume it doesn't exist.", e);
                C12673n nVar = C18263b.f40052P;
                StringBuilder h = C0072d.m201h("deletePostFromDb failed ");
                h.append(e.toString());
                nVar.mo45450b("EtsyPostManager", h.toString());
            }
        }
    }

    /* renamed from: b */
    public final <Result> void mo46198b(PersistentRequest<?, Result> persistentRequest) {
        if (persistentRequest.getRequest() != null && persistentRequest.getPostInfo() != null) {
            PostInfo postInfo = persistentRequest.getPostInfo();
            C19383o.m32794d(postInfo);
            postInfo.calculateNextRetryTime();
            PostInfo postInfo2 = persistentRequest.getPostInfo();
            C19383o.m32794d(postInfo2);
            if (postInfo2.shouldTryAgain()) {
                PostInfo postInfo3 = persistentRequest.getPostInfo();
                C19383o.m32794d(postInfo3);
                long nextRunAfterTime = postInfo3.getNextRunAfterTime();
                PostInfo postInfo4 = persistentRequest.getPostInfo();
                C19383o.m32794d(postInfo4);
                this.f29613b.f29142h.mo46195d(persistentRequest, postInfo4.canRunNow(nextRunAfterTime), nextRunAfterTime);
            }
        }
    }

    /* renamed from: c */
    public final <Result> void mo46199c(long j, PersistentRequest<?, Result> persistentRequest) {
        this.f29614c.mo21308c();
        if (persistentRequest.getRequest() != null) {
            if (persistentRequest.onPersistentResult(this.f29612a, persistentRequest.onPersistentRun(this.f29617f))) {
                mo46198b(persistentRequest);
            }
        } else {
            C8694h hVar = this.f29614c;
            hVar.mo21306a("runPost - bad post removing " + j);
            if (persistentRequest.onPersistentResult(this.f29612a, null)) {
                C8694h hVar2 = this.f29614c;
                hVar2.mo21306a("runPost - requested retry, but can't honor because request is missing/corrupted: " + j);
            }
        }
        mo46197a(j);
    }

    /* renamed from: d */
    public final boolean mo46200d() {
        C13537b.C13539b<?, ?> c = this.f29613b.f29142h.mo46194c();
        while (c != null) {
            if (!this.f29615d.mo29933a()) {
                this.f29614c.mo21308c();
                return false;
            }
            long j = c.f29607b;
            PersistentRequest<Request, Result> persistentRequest = c.f29606a;
            if (persistentRequest != null) {
                try {
                    if (persistentRequest.getPostInfo() != null) {
                        PostInfo postInfo = persistentRequest.getPostInfo();
                        C19383o.m32794d(postInfo);
                        postInfo.incrementAttempt();
                    }
                    persistentRequest.setPersisted(true);
                    int versionCode = persistentRequest.getVersionCode();
                    int i = c.f29608c;
                    if (versionCode > i) {
                        persistentRequest.onUpgraded(i, persistentRequest.getVersionCode());
                    }
                    if (!persistentRequest.isValidRequest()) {
                        C8694h hVar = this.f29614c;
                        persistentRequest.getClass().toString();
                        hVar.mo21308c();
                        mo46197a(j);
                        mo46198b(persistentRequest);
                    } else {
                        mo46199c(j, persistentRequest);
                    }
                } catch (Exception e) {
                    this.f29614c.mo21309d("runNext ERROR", e);
                    if (persistentRequest != null) {
                        mo46197a(j);
                        if (persistentRequest.onPersistentResult(this.f29612a, null)) {
                            mo46198b(persistentRequest);
                        }
                    }
                    this.f29616e.mo30457b(e);
                    throw e;
                }
            } else {
                C8694h hVar2 = this.f29614c;
                hVar2.mo21306a("runNext - bad post removing " + j);
                mo46197a(j);
            }
            this.f29614c.mo21308c();
            c = this.f29613b.f29142h.mo46194c();
            this.f29614c.mo21308c();
        }
        return true;
    }
}
