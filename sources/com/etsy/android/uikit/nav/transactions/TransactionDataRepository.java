package com.etsy.android.uikit.nav.transactions;

import android.util.LruCache;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public final class TransactionDataRepository {

    /* renamed from: b */
    public static final C19285c<TransactionDataRepository> f26402b = C19350d.m32677b(TransactionDataRepository$Companion$INSTANCE$2.INSTANCE);

    /* renamed from: a */
    public final LruCache<Integer, Object> f26403a;

    /* renamed from: com.etsy.android.uikit.nav.transactions.TransactionDataRepository$a */
    public static final class C11867a {
        /* renamed from: a */
        public static TransactionDataRepository m19552a() {
            return TransactionDataRepository.f26402b.getValue();
        }
    }

    /* renamed from: com.etsy.android.uikit.nav.transactions.TransactionDataRepository$b */
    public static final class C11868b {

        /* renamed from: a */
        public static final TransactionDataRepository f26404a = new TransactionDataRepository((Object) null);
    }

    public TransactionDataRepository() {
        this((Object) null);
    }

    public TransactionDataRepository(Object obj) {
        this.f26403a = new LruCache<>(100);
    }

    /* renamed from: a */
    public final <S> S mo38342a(int i) {
        S s = this.f26403a.get(Integer.valueOf(i));
        this.f26403a.remove(Integer.valueOf(i));
        return s;
    }

    /* renamed from: b */
    public final int mo38343b(Object obj) {
        C19383o.m32797g(obj, "data");
        int hashCode = obj.hashCode();
        this.f26403a.put(Integer.valueOf(hashCode), obj);
        return hashCode;
    }
}
