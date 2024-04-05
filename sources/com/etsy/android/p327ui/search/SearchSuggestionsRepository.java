package com.etsy.android.p327ui.search;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.lib.requests.apiv3.SearchSuggestionsEndpoint;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.SearchSuggestionsRepository */
public final class SearchSuggestionsRepository {

    /* renamed from: a */
    public final SearchSuggestionsEndpoint f23661a;

    /* renamed from: b */
    public final C8694h f23662b;

    /* renamed from: c */
    public C10727a.C10729b f23663c;

    /* renamed from: com.etsy.android.ui.search.SearchSuggestionsRepository$a */
    public static abstract class C10727a {

        /* renamed from: com.etsy.android.ui.search.SearchSuggestionsRepository$a$a */
        public static final class C10728a extends C10727a {

            /* renamed from: a */
            public static final C10728a f23664a = new C10728a();
        }

        /* renamed from: com.etsy.android.ui.search.SearchSuggestionsRepository$a$b */
        public static final class C10729b extends C10727a {

            /* renamed from: a */
            public final SearchLandingSuggestions f23665a;

            public C10729b(SearchLandingSuggestions searchLandingSuggestions) {
                this.f23665a = searchLandingSuggestions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10729b) && C19383o.m32792b(this.f23665a, ((C10729b) obj).f23665a);
            }

            public final int hashCode() {
                return this.f23665a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Success(searchLandingSuggestions=");
                h.append(this.f23665a);
                h.append(')');
                return h.toString();
            }
        }
    }

    public SearchSuggestionsRepository(SearchSuggestionsEndpoint searchSuggestionsEndpoint, C8694h hVar) {
        C19383o.m32797g(searchSuggestionsEndpoint, "endpoint");
        C19383o.m32797g(hVar, "logCat");
        this.f23661a = searchSuggestionsEndpoint;
        this.f23662b = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35654a(boolean r5, boolean r6, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.etsy.android.p327ui.search.SearchSuggestionsRepository$getLandingSuggestions$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.etsy.android.ui.search.SearchSuggestionsRepository$getLandingSuggestions$1 r0 = (com.etsy.android.p327ui.search.SearchSuggestionsRepository$getLandingSuggestions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.SearchSuggestionsRepository$getLandingSuggestions$1 r0 = new com.etsy.android.ui.search.SearchSuggestionsRepository$getLandingSuggestions$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            com.etsy.android.ui.search.SearchSuggestionsRepository r5 = (com.etsy.android.p327ui.search.SearchSuggestionsRepository) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0057
        L_0x002b:
            r6 = move-exception
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$b r7 = r4.f23663c
            if (r7 == 0) goto L_0x003d
            return r7
        L_0x003d:
            com.etsy.android.lib.requests.apiv3.SearchSuggestionsEndpoint r7 = r4.f23661a     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r5 == 0) goto L_0x0043
            r2 = r3
        L_0x0043:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x005e }
            r0.L$0 = r4     // Catch:{ all -> 0x005e }
            r0.label = r3     // Catch:{ all -> 0x005e }
            java.lang.Object r7 = r7.getSearchLandingSuggestions(r5, r6, r0)     // Catch:{ all -> 0x005e }
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r5 = r4
        L_0x0057:
            retrofit2.v r7 = (retrofit2.C20145v) r7     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = kotlin.Result.m35480constructorimpl(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0069
        L_0x005e:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x0061:
            kotlin.Result$Failure r6 = androidx.compose.foundation.layout.C0761x.m1673J(r6)
            java.lang.Object r6 = kotlin.Result.m35480constructorimpl(r6)
        L_0x0069:
            boolean r7 = kotlin.Result.m35486isSuccessimpl(r6)
            r0 = 0
            if (r7 == 0) goto L_0x008e
            retrofit2.v r6 = (retrofit2.C20145v) r6
            T r7 = r6.f44615b
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r7 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions) r7
            boolean r6 = r6.mo74384a()
            if (r6 == 0) goto L_0x0086
            if (r7 == 0) goto L_0x0086
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$b r6 = new com.etsy.android.ui.search.SearchSuggestionsRepository$a$b
            r6.<init>(r7)
            r5.f23663c = r6
            goto L_0x008e
        L_0x0086:
            com.etsy.android.lib.logger.h r6 = r5.f23662b
            java.lang.String r7 = "Unsuccessful map in SearchSuggestionsRepository.getSearchLandingSuggestionsCR()"
            r6.mo21306a(r7)
            r6 = r0
        L_0x008e:
            java.lang.Object r6 = kotlin.Result.m35480constructorimpl(r6)
            java.lang.Throwable r7 = kotlin.Result.m35483exceptionOrNullimpl(r6)
            if (r7 == 0) goto L_0x009f
            com.etsy.android.lib.logger.h r5 = r5.f23662b
            java.lang.String r1 = "Http exception in SearchSuggestionsRepository"
            r5.mo21309d(r1, r7)
        L_0x009f:
            boolean r5 = kotlin.Result.m35485isFailureimpl(r6)
            if (r5 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r0 = r6
        L_0x00a7:
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$b r0 = (com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a.C10729b) r0
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$a r0 = com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a.C10728a.f23664a
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.SearchSuggestionsRepository.mo35654a(boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
