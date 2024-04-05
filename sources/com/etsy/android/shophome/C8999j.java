package com.etsy.android.shophome;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.elk.uploading.C8683d;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.shophome.ShopListingsSearchResult;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p340ea.C12673n;
import p456ua.C13461f;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.shophome.j */
public final class C8999j extends C2866i0 {

    /* renamed from: b */
    public final String f19856b;

    /* renamed from: c */
    public final String f19857c;

    /* renamed from: d */
    public final C8994h f19858d;

    /* renamed from: e */
    public final C13461f f19859e;

    /* renamed from: f */
    public final C12673n f19860f;

    /* renamed from: g */
    public final PublishSubject<C9000a> f19861g = new PublishSubject<>();

    /* renamed from: h */
    public ShopHomeSortOption f19862h;

    /* renamed from: i */
    public final C7091a f19863i = new C7091a();

    /* renamed from: com.etsy.android.shophome.j$a */
    public static abstract class C9000a {

        /* renamed from: com.etsy.android.shophome.j$a$a */
        public static final class C9001a extends C9000a {

            /* renamed from: a */
            public static final C9001a f19864a = new C9001a();
        }

        /* renamed from: com.etsy.android.shophome.j$a$b */
        public static final class C9002b extends C9000a {

            /* renamed from: a */
            public final List<ListingCard> f19865a;

            /* renamed from: b */
            public final String f19866b;

            public C9002b(List<? extends ListingCard> list, String str) {
                C19383o.m32797g(list, "data");
                C19383o.m32797g(str, "sortOption");
                this.f19865a = list;
                this.f19866b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9002b)) {
                    return false;
                }
                C9002b bVar = (C9002b) obj;
                return C19383o.m32792b(this.f19865a, bVar.f19865a) && C19383o.m32792b(this.f19866b, bVar.f19866b);
            }

            public final int hashCode() {
                return this.f19866b.hashCode() + (this.f19865a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Loaded(data=");
                h.append(this.f19865a);
                h.append(", sortOption=");
                return C0391c.m1057c(h, this.f19866b, ')');
            }
        }
    }

    public C8999j(String str, String str2, C8994h hVar, C13461f fVar, C12673n nVar, C8618c cVar) {
        C19383o.m32797g(hVar, "repository");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(nVar, "elkLogger");
        C19383o.m32797g(cVar, "configMap");
        this.f19856b = str;
        this.f19857c = str2;
        this.f19858d = hVar;
        this.f19859e = fVar;
        this.f19860f = nVar;
    }

    /* renamed from: b */
    public final void mo30658b(int i, ShopHomeSortOption shopHomeSortOption) {
        String str = this.f19856b;
        if (str != null) {
            C8994h hVar = this.f19858d;
            String str2 = this.f19857c;
            String optionId = shopHomeSortOption != null ? shopHomeSortOption.getOptionId() : null;
            hVar.getClass();
            C8071s<C20145v<ShopListingsSearchResult>> a = hVar.f19851a.mo30657a(str, str2, optionId, i, 24, "true");
            C8683d dVar = new C8683d(1);
            a.getClass();
            ConsumerSingleObserver g = new C19208j(C0391c.m1056b(this.f19859e, C0472h.m1243e(this.f19859e, new C19211l(new C19208j(a, dVar), new C8993g(0)))), new C8998i(this, 0)).mo20658g(Functions.f28540d, Functions.f28541e);
            C7091a aVar = this.f19863i;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(g);
            return;
        }
        this.f19861g.onNext(C9000a.C9001a.f19864a);
    }

    public final void onCleared() {
        this.f19863i.dispose();
    }
}
