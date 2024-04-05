package com.etsy.android.search;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;

public final class AutoSuggestRepository {

    /* renamed from: a */
    public final C8969a f19769a;

    /* renamed from: b */
    public final LinkedHashMap f19770b = new LinkedHashMap();

    /* renamed from: com.etsy.android.search.AutoSuggestRepository$a */
    public static abstract class C8965a {

        /* renamed from: com.etsy.android.search.AutoSuggestRepository$a$a */
        public static final class C8966a extends C8965a {

            /* renamed from: a */
            public final Throwable f19771a;

            public C8966a(Exception exc) {
                this.f19771a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8966a) && C19383o.m32792b(this.f19771a, ((C8966a) obj).f19771a);
            }

            public final int hashCode() {
                return this.f19771a.hashCode();
            }

            public final String toString() {
                return C0070b.m185h(C0072d.m201h("Failure(error="), this.f19771a, ')');
            }
        }

        /* renamed from: com.etsy.android.search.AutoSuggestRepository$a$b */
        public static final class C8967b extends C8965a {

            /* renamed from: a */
            public final CompositeSuggestions f19772a;

            public C8967b(CompositeSuggestions compositeSuggestions) {
                C19383o.m32797g(compositeSuggestions, "compositeSuggestions");
                this.f19772a = compositeSuggestions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8967b) && C19383o.m32792b(this.f19772a, ((C8967b) obj).f19772a);
            }

            public final int hashCode() {
                return this.f19772a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Success(compositeSuggestions=");
                h.append(this.f19772a);
                h.append(')');
                return h.toString();
            }
        }
    }

    public AutoSuggestRepository(C8969a aVar) {
        this.f19769a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo30567a(java.lang.String r8, java.lang.String r9, int r10, boolean r11, kotlin.coroutines.C19340c<? super com.etsy.android.search.AutoSuggestRepository.C8965a> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.etsy.android.search.AutoSuggestRepository$getCompositeSuggestionsCR$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.etsy.android.search.AutoSuggestRepository$getCompositeSuggestionsCR$1 r0 = (com.etsy.android.search.AutoSuggestRepository$getCompositeSuggestionsCR$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.search.AutoSuggestRepository$getCompositeSuggestionsCR$1 r0 = new com.etsy.android.search.AutoSuggestRepository$getCompositeSuggestionsCR$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r8 = r6.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.L$0
            com.etsy.android.search.AutoSuggestRepository r9 = (com.etsy.android.search.AutoSuggestRepository) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0068
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            java.util.LinkedHashMap r12 = r7.f19770b
            java.lang.Object r12 = r12.get(r8)
            com.etsy.android.search.CompositeSuggestions r12 = (com.etsy.android.search.CompositeSuggestions) r12
            if (r12 == 0) goto L_0x004b
            com.etsy.android.search.AutoSuggestRepository$a$b r8 = new com.etsy.android.search.AutoSuggestRepository$a$b
            r8.<init>(r12)
            goto L_0x007c
        L_0x004b:
            com.etsy.android.search.a r1 = r7.f19769a     // Catch:{ Exception -> 0x0075 }
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0052
        L_0x0051:
            r11 = 0
        L_0x0052:
            java.lang.Integer r5 = new java.lang.Integer     // Catch:{ Exception -> 0x0075 }
            r5.<init>(r11)     // Catch:{ Exception -> 0x0075 }
            r6.L$0 = r7     // Catch:{ Exception -> 0x0075 }
            r6.L$1 = r8     // Catch:{ Exception -> 0x0075 }
            r6.label = r2     // Catch:{ Exception -> 0x0075 }
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r12 = r1.mo30606a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0075 }
            if (r12 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r9 = r7
        L_0x0068:
            com.etsy.android.search.CompositeSuggestions r12 = (com.etsy.android.search.CompositeSuggestions) r12     // Catch:{ Exception -> 0x0075 }
            java.util.LinkedHashMap r9 = r9.f19770b     // Catch:{ Exception -> 0x0075 }
            r9.put(r8, r12)     // Catch:{ Exception -> 0x0075 }
            com.etsy.android.search.AutoSuggestRepository$a$b r8 = new com.etsy.android.search.AutoSuggestRepository$a$b     // Catch:{ Exception -> 0x0075 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x0075 }
            goto L_0x007c
        L_0x0075:
            r8 = move-exception
            com.etsy.android.search.AutoSuggestRepository$a$a r9 = new com.etsy.android.search.AutoSuggestRepository$a$a
            r9.<init>(r8)
            r8 = r9
        L_0x007c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.search.AutoSuggestRepository.mo30567a(java.lang.String, java.lang.String, int, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
