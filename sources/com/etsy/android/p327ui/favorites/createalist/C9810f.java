package com.etsy.android.p327ui.favorites.createalist;

import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.f */
public abstract class C9810f {

    /* renamed from: com.etsy.android.ui.favorites.createalist.f$a */
    public static final class C9811a extends C9810f {

        /* renamed from: a */
        public static final C9811a f21700a = new C9811a();
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.f$b */
    public static final class C9812b extends C9810f {

        /* renamed from: a */
        public static final C9812b f21701a = new C9812b();
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.f$c */
    public static final class C9813c extends C9810f {

        /* renamed from: a */
        public final List<ListingCard> f21702a;

        public C9813c(List<ListingCard> list) {
            C19383o.m32797g(list, Collection.TYPE_FAVORITES);
            this.f21702a = list;
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.f$d */
    public static final class C9814d extends C9810f {

        /* renamed from: a */
        public static final C9814d f21703a = new C9814d();
    }
}
