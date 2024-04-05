package com.etsy.android.p327ui.search;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.requests.apiv3.SearchHistoryEndpoint;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: com.etsy.android.ui.search.SearchHistoryRepository */
public final class SearchHistoryRepository {

    /* renamed from: a */
    public final SearchHistoryEndpoint f23657a;

    /* renamed from: b */
    public final CoroutineDispatcher f23658b;

    /* renamed from: com.etsy.android.ui.search.SearchHistoryRepository$a */
    public static abstract class C10724a {

        /* renamed from: com.etsy.android.ui.search.SearchHistoryRepository$a$a */
        public static final class C10725a extends C10724a {

            /* renamed from: a */
            public final Throwable f23659a;

            public C10725a(Exception exc) {
                this.f23659a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10725a) && C19383o.m32792b(this.f23659a, ((C10725a) obj).f23659a);
            }

            public final int hashCode() {
                return this.f23659a.hashCode();
            }

            public final String toString() {
                return C0070b.m185h(C0072d.m201h("Failure(throwable="), this.f23659a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.search.SearchHistoryRepository$a$b */
        public static final class C10726b extends C10724a {

            /* renamed from: a */
            public static final C10726b f23660a = new C10726b();
        }
    }

    public SearchHistoryRepository(SearchHistoryEndpoint searchHistoryEndpoint, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(searchHistoryEndpoint, "endpoint");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.f23657a = searchHistoryEndpoint;
        this.f23658b = coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35643a(kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.SearchHistoryRepository.C10724a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.etsy.android.p327ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.etsy.android.ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$1 r0 = (com.etsy.android.p327ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$1 r0 = new com.etsy.android.ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0069
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0032:
            java.lang.Object r2 = r0.L$0
            com.etsy.android.ui.search.SearchHistoryRepository r2 = (com.etsy.android.p327ui.search.SearchHistoryRepository) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x0076 }
            goto L_0x004b
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.etsy.android.lib.requests.apiv3.SearchHistoryEndpoint r7 = r6.f23657a     // Catch:{ Exception -> 0x0076 }
            r0.L$0 = r6     // Catch:{ Exception -> 0x0076 }
            r0.label = r4     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r7 = r7.deleteAllItemSearchHistory(r0)     // Catch:{ Exception -> 0x0076 }
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r6
        L_0x004b:
            retrofit2.v r7 = (retrofit2.C20145v) r7     // Catch:{ Exception -> 0x0076 }
            boolean r4 = r7.mo74384a()     // Catch:{ Exception -> 0x0076 }
            if (r4 == 0) goto L_0x0056
            com.etsy.android.ui.search.SearchHistoryRepository$a$b r7 = com.etsy.android.p327ui.search.SearchHistoryRepository.C10724a.C10726b.f23660a     // Catch:{ Exception -> 0x0076 }
            goto L_0x007d
        L_0x0056:
            kotlinx.coroutines.CoroutineDispatcher r2 = r2.f23658b     // Catch:{ Exception -> 0x0076 }
            com.etsy.android.ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$error$1 r4 = new com.etsy.android.ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$error$1     // Catch:{ Exception -> 0x0076 }
            r5 = 0
            r4.<init>(r7, r5)     // Catch:{ Exception -> 0x0076 }
            r0.L$0 = r5     // Catch:{ Exception -> 0x0076 }
            r0.label = r3     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r7 = kotlinx.coroutines.C19697g.m33471i(r0, r2, r4)     // Catch:{ Exception -> 0x0076 }
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0076 }
            com.etsy.android.ui.search.SearchHistoryRepository$a$a r0 = new com.etsy.android.ui.search.SearchHistoryRepository$a$a     // Catch:{ Exception -> 0x0076 }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0076 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x007c
        L_0x0076:
            r7 = move-exception
            com.etsy.android.ui.search.SearchHistoryRepository$a$a r0 = new com.etsy.android.ui.search.SearchHistoryRepository$a$a
            r0.<init>(r7)
        L_0x007c:
            r7 = r0
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.SearchHistoryRepository.mo35643a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35644b(java.lang.String r6, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.SearchHistoryRepository.C10724a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.etsy.android.p327ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$1 r0 = (com.etsy.android.p327ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$1 r0 = new com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0069
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.L$0
            com.etsy.android.ui.search.SearchHistoryRepository r6 = (com.etsy.android.p327ui.search.SearchHistoryRepository) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x0076 }
            goto L_0x004b
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.etsy.android.lib.requests.apiv3.SearchHistoryEndpoint r7 = r5.f23657a     // Catch:{ Exception -> 0x0076 }
            r0.L$0 = r5     // Catch:{ Exception -> 0x0076 }
            r0.label = r4     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r7 = r7.deleteSearchHistoryQuery(r6, r0)     // Catch:{ Exception -> 0x0076 }
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r6 = r5
        L_0x004b:
            retrofit2.v r7 = (retrofit2.C20145v) r7     // Catch:{ Exception -> 0x0076 }
            boolean r2 = r7.mo74384a()     // Catch:{ Exception -> 0x0076 }
            if (r2 == 0) goto L_0x0056
            com.etsy.android.ui.search.SearchHistoryRepository$a$b r6 = com.etsy.android.p327ui.search.SearchHistoryRepository.C10724a.C10726b.f23660a     // Catch:{ Exception -> 0x0076 }
            goto L_0x007d
        L_0x0056:
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.f23658b     // Catch:{ Exception -> 0x0076 }
            com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$error$1 r2 = new com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$error$1     // Catch:{ Exception -> 0x0076 }
            r4 = 0
            r2.<init>(r7, r4)     // Catch:{ Exception -> 0x0076 }
            r0.L$0 = r4     // Catch:{ Exception -> 0x0076 }
            r0.label = r3     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r7 = kotlinx.coroutines.C19697g.m33471i(r0, r6, r2)     // Catch:{ Exception -> 0x0076 }
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0076 }
            com.etsy.android.ui.search.SearchHistoryRepository$a$a r6 = new com.etsy.android.ui.search.SearchHistoryRepository$a$a     // Catch:{ Exception -> 0x0076 }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0076 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0076 }
            goto L_0x007d
        L_0x0076:
            r6 = move-exception
            com.etsy.android.ui.search.SearchHistoryRepository$a$a r7 = new com.etsy.android.ui.search.SearchHistoryRepository$a$a
            r7.<init>(r6)
            r6 = r7
        L_0x007d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.SearchHistoryRepository.mo35644b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
