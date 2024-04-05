package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionAction;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.h */
public final class C9766h {

    /* renamed from: a */
    public final C9770k f21604a;

    /* renamed from: com.etsy.android.ui.favorites.add.h$a */
    public /* synthetic */ class C9767a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21605a;

        static {
            int[] iArr = new int[CollectionUtil$ListingCollectionAction.values().length];
            iArr[CollectionUtil$ListingCollectionAction.REMOVE.ordinal()] = 1;
            iArr[CollectionUtil$ListingCollectionAction.ADD.ordinal()] = 2;
            f21605a = iArr;
        }
    }

    public C9766h(C9770k kVar) {
        C19383o.m32797g(kVar, "endpoint");
        this.f21604a = kVar;
    }
}
