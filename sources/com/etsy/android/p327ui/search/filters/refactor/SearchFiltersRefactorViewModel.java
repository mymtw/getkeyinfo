package com.etsy.android.p327ui.search.filters.refactor;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10849q;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.util.C12065v;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import kotlin.text.Regex;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.C19680v;
import kotlinx.coroutines.flow.C19684w;
import kotlinx.coroutines.flow.StateFlowImpl;
import p001a0.C0005b;
import p346fa.C12703a;
import p486y9.C13888d;
import p744gq.C19060c;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel */
public final class SearchFiltersRefactorViewModel extends C2866i0 {

    /* renamed from: n */
    public static final /* synthetic */ int f23788n = 0;

    /* renamed from: b */
    public final C11786n f23789b;

    /* renamed from: c */
    public final SearchFiltersRepository f23790c;

    /* renamed from: d */
    public final C12703a f23791d;

    /* renamed from: e */
    public final C8629a f23792e;

    /* renamed from: f */
    public final C10836m f23793f;

    /* renamed from: g */
    public final C10857u f23794g;

    /* renamed from: h */
    public final C10863z f23795h;

    /* renamed from: i */
    public final C19285c f23796i = C19350d.m32677b(new SearchFiltersRefactorViewModel$defaultFilters$2(this));

    /* renamed from: j */
    public final C19285c f23797j = C19350d.m32677b(new SearchFiltersRefactorViewModel$defaultSelectionSpec$2(this));

    /* renamed from: k */
    public final StateFlowImpl f23798k;

    /* renamed from: l */
    public final C19662p1 f23799l;

    /* renamed from: m */
    public final C19671s1 f23800m;

    @C19060c(mo70540c = "com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$1", mo70541f = "SearchFiltersRefactorViewModel.kt", mo70542l = {76}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$1 */
    public static final class C107751 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;
        public final /* synthetic */ SearchFiltersRefactorViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C107751(this.this$0, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C107751) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                SearchFiltersRefactorViewModel searchFiltersRefactorViewModel = this.this$0;
                C19597d a = C19684w.m33456a(searchFiltersRefactorViewModel.f23800m, searchFiltersRefactorViewModel.f23793f.f23989a.mo21135e(C8592b.f18850z1));
                final SearchFiltersRefactorViewModel searchFiltersRefactorViewModel2 = this.this$0;
                C107761 r1 = new C19861p<Boolean, C19340c<? super C19394m>, Object>((C19340c<? super C107761>) null) {
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return 

                        static {
                            new Regex("^[.,].*$");
                        }

                        public SearchFiltersRefactorViewModel(C11786n nVar, C10855s sVar, SearchFiltersRepository searchFiltersRepository, C12703a aVar, C8630b bVar, C8629a aVar2, C13888d dVar, C10836m mVar, C10857u uVar, C10863z zVar) {
                            C19383o.m32797g(nVar, "resourceProvider");
                            C19383o.m32797g(sVar, "initialState");
                            C19383o.m32797g(searchFiltersRepository, "searchFiltersRepository");
                            C19383o.m32797g(aVar, "grafana");
                            C19383o.m32797g(bVar, "moneyFactory");
                            C19383o.m32797g(aVar2, "appCurrency");
                            C19383o.m32797g(dVar, "currentLocale");
                            C19383o.m32797g(mVar, "eligibility");
                            C19383o.m32797g(uVar, "searchFiltersUiFactory");
                            C19383o.m32797g(zVar, "searchOptionsFactory");
                            this.f23789b = nVar;
                            this.f23790c = searchFiltersRepository;
                            this.f23791d = aVar;
                            this.f23792e = aVar2;
                            this.f23793f = mVar;
                            this.f23794g = uVar;
                            this.f23795h = zVar;
                            StateFlowImpl g = C19388s.m32862g(sVar);
                            this.f23798k = g;
                            this.f23799l = C12065v.m19874b(g, C19388s.m32866i0(this), SearchFiltersRefactorViewModel$uiState$1.INSTANCE);
                            this.f23800m = C19680v.m33452a(0, 0, (BufferOverflow) null, 6);
                            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new C107751(this, (C19340c<? super C107751>) null), 3);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
                        /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
                        /* JADX WARNING: Removed duplicated region for block: B:58:0x018a  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                        /* renamed from: b */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public static final java.lang.Object m18679b(com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel r27, kotlin.coroutines.C19340c r28) {
                            /*
                                r0 = r27
                                r1 = r28
                                r27.getClass()
                                boolean r2 = r1 instanceof com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel$actualLoadFilters$1
                                if (r2 == 0) goto L_0x001a
                                r2 = r1
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$actualLoadFilters$1 r2 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel$actualLoadFilters$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x001a
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001f
                            L_0x001a:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$actualLoadFilters$1 r2 = new com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$actualLoadFilters$1
                                r2.<init>(r0, r1)
                            L_0x001f:
                                java.lang.Object r1 = r2.result
                                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r4 = r2.label
                                r5 = 1
                                if (r4 == 0) goto L_0x0044
                                if (r4 != r5) goto L_0x003c
                                java.lang.Object r0 = r2.L$2
                                com.etsy.android.ui.search.filters.refactor.p r0 = (com.etsy.android.p327ui.search.filters.refactor.C10841p) r0
                                java.lang.Object r3 = r2.L$1
                                com.etsy.android.ui.search.filters.refactor.t r3 = (com.etsy.android.p327ui.search.filters.refactor.C10856t) r3
                                java.lang.Object r2 = r2.L$0
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel r2 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel) r2
                                androidx.compose.foundation.layout.C0761x.m1684O0(r1)
                                r4 = r0
                                r0 = r2
                                goto L_0x0096
                            L_0x003c:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                r0.<init>(r1)
                                throw r0
                            L_0x0044:
                                androidx.compose.foundation.layout.C0761x.m1684O0(r1)
                                kotlinx.coroutines.flow.StateFlowImpl r1 = r0.f23798k
                                java.lang.Object r1 = r1.getValue()
                                com.etsy.android.ui.search.filters.refactor.s r1 = (com.etsy.android.p327ui.search.filters.refactor.C10855s) r1
                                com.etsy.android.ui.search.filters.refactor.t r1 = r1.f24058a
                                kotlinx.coroutines.flow.StateFlowImpl r4 = r0.f23798k
                                java.lang.Object r4 = r4.getValue()
                                com.etsy.android.ui.search.filters.refactor.s r4 = (com.etsy.android.p327ui.search.filters.refactor.C10855s) r4
                                com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterParams r4 = r4.f24059b
                                if (r4 == 0) goto L_0x0062
                                com.etsy.android.ui.search.v2.SearchOptions r4 = r4.getSearchOptions()
                                goto L_0x0063
                            L_0x0062:
                                r4 = 0
                            L_0x0063:
                                com.etsy.android.ui.search.filters.refactor.p r4 = r0.mo35783c(r1, r4)
                                kotlinx.coroutines.flow.StateFlowImpl r7 = r0.f23798k
                                java.lang.Object r7 = r7.getValue()
                                com.etsy.android.ui.search.filters.refactor.s r7 = (com.etsy.android.p327ui.search.filters.refactor.C10855s) r7
                                com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterParams r7 = r7.f24059b
                                if (r7 == 0) goto L_0x0078
                                java.lang.String r7 = r7.getQuery()
                                goto L_0x0079
                            L_0x0078:
                                r7 = 0
                            L_0x0079:
                                if (r7 != 0) goto L_0x007d
                                java.lang.String r7 = ""
                            L_0x007d:
                                com.etsy.android.ui.search.filters.refactor.r r8 = new com.etsy.android.ui.search.filters.refactor.r
                                r8.<init>(r4, r7)
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository r7 = r0.f23790c
                                r2.L$0 = r0
                                r2.L$1 = r1
                                r2.L$2 = r4
                                r2.label = r5
                                java.lang.Object r2 = r7.mo35790a(r8, r2)
                                if (r2 != r3) goto L_0x0094
                                goto L_0x01d3
                            L_0x0094:
                                r3 = r1
                                r1 = r2
                            L_0x0096:
                                com.etsy.android.ui.search.filters.refactor.o r1 = (com.etsy.android.p327ui.search.filters.refactor.C10838o) r1
                                boolean r2 = r1 instanceof com.etsy.android.p327ui.search.filters.refactor.C10838o.C10840b
                                if (r2 == 0) goto L_0x018a
                                r2 = r1
                                com.etsy.android.ui.search.filters.refactor.o$b r2 = (com.etsy.android.p327ui.search.filters.refactor.C10838o.C10840b) r2
                                com.etsy.android.lib.models.apiv3.FacetCountListMap r1 = r2.f24002b
                                if (r1 == 0) goto L_0x00a8
                                java.util.List r1 = r1.getCategoryFacetCounts()
                                goto L_0x00a9
                            L_0x00a8:
                                r1 = 0
                            L_0x00a9:
                                if (r1 != 0) goto L_0x00ad
                                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
                            L_0x00ad:
                                int r7 = r2.f24001a
                                r0.getClass()
                                com.etsy.android.lib.models.apiv3.FacetCount r8 = new com.etsy.android.lib.models.apiv3.FacetCount
                                com.etsy.android.ui.util.n r9 = r0.f23789b
                                r10 = 0
                                java.lang.Object[] r10 = new java.lang.Object[r10]
                                r11 = 2131951690(0x7f13004a, float:1.9539802E38)
                                java.lang.String r9 = r9.mo38059c(r11, r10)
                                java.lang.String r10 = "top-level-facets"
                                r8.<init>(r10, r9, r7, r1)
                                kotlinx.coroutines.flow.StateFlowImpl r7 = r0.f23798k
                            L_0x00c7:
                                java.lang.Object r1 = r7.getValue()
                                r9 = r1
                                com.etsy.android.ui.search.filters.refactor.s r9 = (com.etsy.android.p327ui.search.filters.refactor.C10855s) r9
                                com.etsy.android.ui.search.filters.refactor.t r10 = r9.f24058a
                                kotlin.c r11 = r0.f23797j
                                java.lang.Object r11 = r11.getValue()
                                com.etsy.android.ui.search.filters.refactor.p r11 = (com.etsy.android.p327ui.search.filters.refactor.C10841p) r11
                                boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r4, r11)
                                r24 = r11 ^ 1
                                int r11 = r2.f24001a
                                com.etsy.android.ui.search.filters.refactor.u r12 = r0.f23794g
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$b r13 = r3.f24064b
                                if (r13 == 0) goto L_0x00eb
                                java.lang.String r13 = r13.mo35828f()
                                goto L_0x00ec
                            L_0x00eb:
                                r13 = 0
                            L_0x00ec:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$b r12 = r12.mo36048c(r8, r13)
                                com.etsy.android.ui.search.filters.refactor.u r13 = r0.f23794g
                                com.etsy.android.lib.models.apiv3.FacetCountListMap r14 = r2.f24002b
                                if (r14 == 0) goto L_0x00fb
                                java.util.List r14 = r14.getAttributeFacets()
                                goto L_0x00fc
                            L_0x00fb:
                                r14 = 0
                            L_0x00fc:
                                if (r14 != 0) goto L_0x0100
                                kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.INSTANCE
                            L_0x0100:
                                com.etsy.android.lib.models.apiv3.filters.StaticFilters r15 = r2.f24003c
                                java.util.Map r5 = r3.mo36034c()
                                java.util.ArrayList r16 = r3.mo36033b()
                                java.util.ArrayList r6 = new java.util.ArrayList
                                r6.<init>()
                                java.util.Iterator r16 = r16.iterator()
                            L_0x0113:
                                boolean r17 = r16.hasNext()
                                if (r17 == 0) goto L_0x012f
                                r27 = r2
                                java.lang.Object r2 = r16.next()
                                r17 = r2
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem r17 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem) r17
                                boolean r17 = r17.mo35792a()
                                if (r17 == 0) goto L_0x012c
                                r6.add(r2)
                            L_0x012c:
                                r2 = r27
                                goto L_0x0113
                            L_0x012f:
                                r27 = r2
                                java.util.ArrayList r2 = new java.util.ArrayList
                                r26 = r3
                                int r3 = kotlin.collections.C19322o.m32624F0(r6)
                                r2.<init>(r3)
                                java.util.Iterator r3 = r6.iterator()
                            L_0x0140:
                                boolean r6 = r3.hasNext()
                                if (r6 == 0) goto L_0x0154
                                java.lang.Object r6 = r3.next()
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem r6 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem) r6
                                java.lang.String r6 = r6.mo35793b()
                                r2.add(r6)
                                goto L_0x0140
                            L_0x0154:
                                java.util.ArrayList r19 = r13.mo36049d(r14, r15, r5, r2)
                                r2 = 0
                                r13 = 0
                                r14 = 0
                                r15 = 0
                                r16 = 0
                                r17 = 0
                                r18 = 0
                                r20 = 0
                                r21 = 0
                                java.lang.Integer r3 = new java.lang.Integer
                                r3.<init>(r11)
                                r23 = 0
                                r25 = 3837(0xefd, float:5.377E-42)
                                r11 = r2
                                r22 = r3
                                com.etsy.android.ui.search.filters.refactor.t r2 = com.etsy.android.p327ui.search.filters.refactor.C10856t.m18854a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                                r3 = 2
                                r5 = 0
                                com.etsy.android.ui.search.filters.refactor.s r2 = com.etsy.android.p327ui.search.filters.refactor.C10855s.m18848b(r9, r2, r5, r8, r3)
                                boolean r1 = r7.mo72337i(r1, r2)
                                if (r1 == 0) goto L_0x0183
                                goto L_0x01d1
                            L_0x0183:
                                r2 = r27
                                r3 = r26
                                r5 = 1
                                goto L_0x00c7
                            L_0x018a:
                                boolean r2 = r1 instanceof com.etsy.android.p327ui.search.filters.refactor.C10838o.C10839a
                                if (r2 == 0) goto L_0x01d1
                                kotlinx.coroutines.flow.StateFlowImpl r2 = r0.f23798k
                            L_0x0190:
                                java.lang.Object r3 = r2.getValue()
                                r4 = r3
                                com.etsy.android.ui.search.filters.refactor.s r4 = (com.etsy.android.p327ui.search.filters.refactor.C10855s) r4
                                com.etsy.android.ui.search.filters.refactor.t r5 = r4.f24058a
                                r8 = 0
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r13 = 0
                                r14 = 0
                                r15 = 0
                                r16 = 0
                                r17 = 0
                                r18 = 0
                                r19 = 0
                                r20 = 24575(0x5fff, float:3.4437E-41)
                                r6 = 0
                                r7 = 0
                                r9 = 0
                                com.etsy.android.ui.search.filters.refactor.t r5 = com.etsy.android.p327ui.search.filters.refactor.C10856t.m18854a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                r6 = 6
                                r7 = 0
                                com.etsy.android.ui.search.filters.refactor.s r4 = com.etsy.android.p327ui.search.filters.refactor.C10855s.m18848b(r4, r5, r7, r7, r6)
                                boolean r3 = r2.mo72337i(r3, r4)
                                if (r3 == 0) goto L_0x0190
                                com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.LogCatKt.m17045a()
                                com.etsy.android.ui.search.filters.refactor.o$a r1 = (com.etsy.android.p327ui.search.filters.refactor.C10838o.C10839a) r1
                                java.lang.Throwable r1 = r1.f24000a
                                java.lang.String r3 = "Error applying filters"
                                r2.mo21309d(r3, r1)
                                fa.a r0 = r0.f23791d
                                java.lang.String r1 = "cbf.search.search_filters.error.loading_filters"
                                r0.mo45474a(r1)
                            L_0x01d1:
                                kotlin.m r3 = kotlin.C19394m.f43287a
                            L_0x01d3:
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel.m18679b(com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
                            r6 = r4.f23818d;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
                        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
                        /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
                        /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
                        /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
                        /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
                        /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
                        /* JADX WARNING: Removed duplicated region for block: B:32:0x0057  */
                        /* JADX WARNING: Removed duplicated region for block: B:40:0x0067  */
                        /* JADX WARNING: Removed duplicated region for block: B:48:0x007c  */
                        /* JADX WARNING: Removed duplicated region for block: B:50:0x007f  */
                        /* JADX WARNING: Removed duplicated region for block: B:51:0x0083  */
                        /* JADX WARNING: Removed duplicated region for block: B:53:0x0086  */
                        /* JADX WARNING: Removed duplicated region for block: B:54:0x008b  */
                        /* JADX WARNING: Removed duplicated region for block: B:57:0x0091  */
                        /* JADX WARNING: Removed duplicated region for block: B:58:0x0094  */
                        /* JADX WARNING: Removed duplicated region for block: B:61:0x0099  */
                        /* JADX WARNING: Removed duplicated region for block: B:62:0x009c  */
                        /* JADX WARNING: Removed duplicated region for block: B:75:0x00c5  */
                        /* JADX WARNING: Removed duplicated region for block: B:88:0x00f3  */
                        /* JADX WARNING: Removed duplicated region for block: B:89:0x00f6  */
                        /* JADX WARNING: Removed duplicated region for block: B:93:0x0101  */
                        /* JADX WARNING: Removed duplicated region for block: B:94:0x0104  */
                        /* renamed from: c */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final com.etsy.android.p327ui.search.filters.refactor.C10841p mo35783c(com.etsy.android.p327ui.search.filters.refactor.C10856t r26, com.etsy.android.p327ui.search.p330v2.SearchOptions r27) {
                            /*
                                r25 = this;
                                r0 = r26
                                r1 = r25
                                com.etsy.android.ui.search.filters.refactor.m r2 = r1.f23793f
                                com.etsy.android.lib.config.c r2 = r2.f23989a
                                com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.f18762U0
                                boolean r2 = r2.mo21132b(r3)
                                r3 = 0
                                if (r2 == 0) goto L_0x001a
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$c r2 = r0.f24066d
                                if (r2 == 0) goto L_0x0023
                                com.etsy.android.ui.search.filters.refactor.f r2 = r2.mo35833h()
                                goto L_0x0024
                            L_0x001a:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$d r2 = r0.f24067e
                                if (r2 == 0) goto L_0x0023
                                com.etsy.android.ui.search.filters.refactor.f r2 = r2.mo35841i()
                                goto L_0x0024
                            L_0x0023:
                                r2 = r3
                            L_0x0024:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$OtherOptions r4 = r0.f24072j
                                r5 = 0
                                if (r4 == 0) goto L_0x0031
                                com.etsy.android.ui.search.filters.refactor.d r6 = r4.f23818d
                                if (r6 == 0) goto L_0x0031
                                boolean r6 = r6.f23922d
                                r8 = r6
                                goto L_0x0032
                            L_0x0031:
                                r8 = r5
                            L_0x0032:
                                if (r4 == 0) goto L_0x003c
                                com.etsy.android.ui.search.filters.refactor.d r6 = r4.f23819e
                                if (r6 == 0) goto L_0x003c
                                boolean r6 = r6.f23922d
                                r11 = r6
                                goto L_0x003d
                            L_0x003c:
                                r11 = r5
                            L_0x003d:
                                if (r4 == 0) goto L_0x0047
                                com.etsy.android.ui.search.filters.refactor.d r6 = r4.f23820f
                                if (r6 == 0) goto L_0x0047
                                boolean r6 = r6.f23922d
                                r12 = r6
                                goto L_0x0048
                            L_0x0047:
                                r12 = r5
                            L_0x0048:
                                if (r4 == 0) goto L_0x0052
                                com.etsy.android.ui.search.filters.refactor.d r4 = r4.f23821g
                                if (r4 == 0) goto L_0x0052
                                boolean r4 = r4.f23922d
                                r13 = r4
                                goto L_0x0053
                            L_0x0052:
                                r13 = r5
                            L_0x0053:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$Shipping r4 = r0.f24068f
                                if (r4 == 0) goto L_0x0059
                                boolean r5 = r4.f23826e
                            L_0x0059:
                                r9 = r5
                                if (r4 == 0) goto L_0x0060
                                java.util.ArrayList r4 = r4.f23827f
                                if (r4 != 0) goto L_0x0062
                            L_0x0060:
                                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
                            L_0x0062:
                                r10 = r4
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$f r4 = r0.f24070h
                                if (r4 == 0) goto L_0x007c
                                com.etsy.android.ui.search.filters.refactor.e0 r5 = r4.f23875e
                                boolean r6 = r5.f23930c
                                if (r6 == 0) goto L_0x0070
                                java.lang.String r4 = r5.f23929b
                                goto L_0x007a
                            L_0x0070:
                                com.etsy.android.ui.search.filters.refactor.c0 r4 = r4.f23876f
                                boolean r5 = r4.f23909c
                                if (r5 == 0) goto L_0x0079
                                java.lang.String r4 = r4.f23910d
                                goto L_0x007a
                            L_0x0079:
                                r4 = r3
                            L_0x007a:
                                r14 = r4
                                goto L_0x007d
                            L_0x007c:
                                r14 = r3
                            L_0x007d:
                                if (r2 == 0) goto L_0x0083
                                java.math.BigDecimal r4 = r2.f23932a
                                r15 = r4
                                goto L_0x0084
                            L_0x0083:
                                r15 = r3
                            L_0x0084:
                                if (r2 == 0) goto L_0x008b
                                java.math.BigDecimal r2 = r2.f23933b
                                r16 = r2
                                goto L_0x008d
                            L_0x008b:
                                r16 = r3
                            L_0x008d:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$e r2 = r0.f24069g
                                if (r2 == 0) goto L_0x0094
                                java.lang.String r2 = r2.f23870e
                                goto L_0x0095
                            L_0x0094:
                                r2 = r3
                            L_0x0095:
                                java.lang.String r4 = ""
                                if (r2 != 0) goto L_0x009c
                                r17 = r4
                                goto L_0x009e
                            L_0x009c:
                                r17 = r2
                            L_0x009e:
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SortBy r2 = r0.f24063a
                                if (r2 == 0) goto L_0x00a8
                                com.etsy.android.ui.search.SortOrder r2 = r2.mo35824h()
                                if (r2 != 0) goto L_0x00b1
                            L_0x00a8:
                                com.etsy.android.ui.search.SortOrder$a r2 = com.etsy.android.p327ui.search.SortOrder.Companion
                                r2.getClass()
                                com.etsy.android.ui.search.SortOrder r2 = com.etsy.android.p327ui.search.SortOrder.DEFAULT
                            L_0x00b1:
                                r18 = r2
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ItemType r2 = r0.f24065c
                                if (r2 == 0) goto L_0x00bd
                                com.etsy.android.ui.search.v2.SearchOptions$MarketPlace r2 = r2.mo35803h()
                                if (r2 != 0) goto L_0x00bf
                            L_0x00bd:
                                com.etsy.android.ui.search.v2.SearchOptions$MarketPlace r2 = com.etsy.android.p327ui.search.p330v2.SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS
                            L_0x00bf:
                                r19 = r2
                                com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$b r2 = r0.f24064b
                                if (r2 == 0) goto L_0x00e4
                                java.util.List<com.etsy.android.ui.search.filters.refactor.b> r2 = r2.f23847d
                                java.util.Iterator r2 = r2.iterator()
                            L_0x00cb:
                                boolean r5 = r2.hasNext()
                                if (r5 == 0) goto L_0x00dd
                                java.lang.Object r5 = r2.next()
                                r6 = r5
                                com.etsy.android.ui.search.filters.refactor.b r6 = (com.etsy.android.p327ui.search.filters.refactor.C10789b) r6
                                boolean r6 = r6.f23892c
                                if (r6 == 0) goto L_0x00cb
                                goto L_0x00de
                            L_0x00dd:
                                r5 = r3
                            L_0x00de:
                                com.etsy.android.ui.search.filters.refactor.b r5 = (com.etsy.android.p327ui.search.filters.refactor.C10789b) r5
                                if (r5 == 0) goto L_0x00e4
                                java.lang.String r3 = r5.f23893d
                            L_0x00e4:
                                r21 = r3
                                java.util.Map r20 = r26.mo36034c()
                                if (r27 == 0) goto L_0x00f6
                                java.lang.String r0 = r27.getPctDiscountMin()
                                if (r0 != 0) goto L_0x00f3
                                goto L_0x00f6
                            L_0x00f3:
                                r22 = r0
                                goto L_0x00f8
                            L_0x00f6:
                                r22 = r4
                            L_0x00f8:
                                if (r27 == 0) goto L_0x0104
                                java.lang.String r0 = r27.getPctDiscountMax()
                                if (r0 != 0) goto L_0x0101
                                goto L_0x0104
                            L_0x0101:
                                r23 = r0
                                goto L_0x0106
                            L_0x0104:
                                r23 = r4
                            L_0x0106:
                                com.etsy.android.ui.search.filters.refactor.p r0 = new com.etsy.android.ui.search.filters.refactor.p
                                r7 = r0
                                r24 = 64
                                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel.mo35783c(com.etsy.android.ui.search.filters.refactor.t, com.etsy.android.ui.search.v2.SearchOptions):com.etsy.android.ui.search.filters.refactor.p");
                        }

                        /* renamed from: d */
                        public final void mo35784d() {
                            Object value;
                            C10855s sVar;
                            StateFlowImpl stateFlowImpl = this.f23798k;
                            do {
                                value = stateFlowImpl.getValue();
                                sVar = (C10855s) value;
                            } while (!stateFlowImpl.mo72337i(value, C10855s.m18848b(sVar, C10856t.m18854a(sVar.f24058a, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, true, false, 24575), (FilterParams) null, (FacetCount) null, 6)));
                            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SearchFiltersRefactorViewModel$loadFilters$2(this, (C19340c<? super SearchFiltersRefactorViewModel$loadFilters$2>) null), 3);
                        }

                        /* renamed from: e */
                        public final void mo35785e(C10813l lVar) {
                            Object value;
                            C10855s sVar;
                            C10856t f;
                            SearchFiltersUiGroupItem.C10782c cVar;
                            SearchFiltersUiGroupItem.C10782c h;
                            Object value2;
                            Object value3;
                            C10855s sVar2;
                            String query;
                            Object value4;
                            C10855s sVar3;
                            SearchOptions searchOptions;
                            SearchOptions searchOptions2;
                            FilterParams c;
                            SearchOptions searchOptions3;
                            T t;
                            C10856t tVar;
                            Object value5;
                            C10855s sVar4;
                            C10813l.C10817d dVar;
                            Object value6;
                            C10855s sVar5;
                            Object value7;
                            Object value8;
                            C10855s sVar6;
                            C10856t f2;
                            SearchFiltersUiGroupItem.OtherOptions otherOptions;
                            Object value9;
                            Object value10;
                            SearchFiltersUiGroupItem.C10783d g;
                            Object value11;
                            Object value12;
                            Object value13;
                            Object value14;
                            Object value15;
                            C10855s sVar7;
                            SearchFiltersUiGroupItem.Shipping i;
                            ArrayList arrayList;
                            Object value16;
                            C10855s sVar8;
                            C10856t f3;
                            SearchFiltersUiGroupItem.C10784e eVar;
                            Object value17;
                            C10855s sVar9;
                            SearchFiltersUiGroupItem.C10784e j;
                            Object value18;
                            C10855s sVar10;
                            C10856t f4;
                            SearchFiltersUiGroupItem.C10785f k;
                            SearchFiltersUiGroupItem.C10785f fVar;
                            Object value19;
                            C10855s sVar11;
                            C10856t f5;
                            SearchFiltersUiGroupItem.C10785f k2;
                            C10813l lVar2 = lVar;
                            C19383o.m32797g(lVar2, "event");
                            if (lVar2 instanceof C10813l.C10826m) {
                                StateFlowImpl stateFlowImpl = this.f23798k;
                                do {
                                    value19 = stateFlowImpl.getValue();
                                    sVar11 = (C10855s) value19;
                                    f5 = sVar11.mo36030f();
                                    k2 = sVar11.mo36030f().mo36044k();
                                } while (!stateFlowImpl.mo72337i(value19, C10855s.m18848b(sVar11, C10856t.m18854a(f5, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, k2 != null ? k2.mo35850g() : null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32639), (FilterParams) null, (FacetCount) null, 6)));
                            } else if (lVar2 instanceof C10813l.C10827n) {
                                StateFlowImpl stateFlowImpl2 = this.f23798k;
                                while (true) {
                                    Object value20 = stateFlowImpl2.getValue();
                                    C10855s sVar12 = (C10855s) value20;
                                    C10856t f6 = sVar12.mo36030f();
                                    SearchFiltersUiGroupItem.C10785f k3 = sVar12.mo36030f().mo36044k();
                                    if (k3 != null) {
                                        C10813l.C10827n nVar = (C10813l.C10827n) lVar2;
                                        fVar = k3.mo35853i(nVar.mo35968a(), nVar.mo35969b());
                                    } else {
                                        fVar = null;
                                    }
                                    if (stateFlowImpl2.mo72337i(value20, C10855s.m18848b(sVar12, C10856t.m18854a(f6, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, fVar, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32639), (FilterParams) null, (FacetCount) null, 6))) {
                                        break;
                                    }
                                }
                            } else {
                                int i2 = 0;
                                if (lVar2 instanceof C10813l.C10828o) {
                                    StateFlowImpl stateFlowImpl3 = this.f23798k;
                                    do {
                                        value18 = stateFlowImpl3.getValue();
                                        sVar10 = (C10855s) value18;
                                        f4 = sVar10.mo36030f();
                                        k = sVar10.mo36030f().mo36044k();
                                    } while (!stateFlowImpl3.mo72337i(value18, C10855s.m18848b(sVar10, C10856t.m18854a(f4, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, k != null ? SearchFiltersUiGroupItem.C10785f.m18777f(k, (C10799d0) null, (C10801e0) null, C10793c0.m18798a(sVar10.mo36030f().mo36044k().mo35851h(), false, ((C10813l.C10828o) lVar2).mo35973a(), 7), 31) : null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32639), (FilterParams) null, (FacetCount) null, 6)));
                                } else if (lVar2 instanceof C10813l.C10832s) {
                                    StateFlowImpl stateFlowImpl4 = this.f23798k;
                                    do {
                                        value17 = stateFlowImpl4.getValue();
                                        sVar9 = (C10855s) value17;
                                        j = ((C10855s) this.f23798k.getValue()).mo36030f().mo36043j();
                                        if (j == null) {
                                            return;
                                        }
                                    } while (!stateFlowImpl4.mo72337i(value17, sVar9.mo36025a(new C10849q.C10851b(j.mo35846g())).mo36025a(new C10849q.C10850a(0))));
                                } else if (lVar2 instanceof C10813l.C10833t) {
                                    StateFlowImpl stateFlowImpl5 = this.f23798k;
                                    do {
                                        value16 = stateFlowImpl5.getValue();
                                        sVar8 = (C10855s) value16;
                                        f3 = sVar8.mo36030f();
                                        SearchFiltersUiGroupItem.C10784e j2 = sVar8.mo36030f().mo36043j();
                                        if (j2 != null) {
                                            C10813l.C10833t tVar2 = (C10813l.C10833t) lVar2;
                                            eVar = SearchFiltersUiGroupItem.C10784e.m18770f(j2, tVar2.mo35986a().getDisplayName(), tVar2.mo35986a().getCountryCode());
                                        } else {
                                            eVar = null;
                                        }
                                    } while (!stateFlowImpl5.mo72337i(value16, C10855s.m18848b(sVar8, C10856t.m18854a(f3, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, eVar, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32703), (FilterParams) null, (FacetCount) null, 6)));
                                } else if (lVar2 instanceof C10813l.C10825l) {
                                    StateFlowImpl stateFlowImpl6 = this.f23798k;
                                    do {
                                        value15 = stateFlowImpl6.getValue();
                                        sVar7 = (C10855s) value15;
                                        i = sVar7.mo36030f().mo36042i();
                                        C19383o.m32794d(i);
                                        List<ShippingSelectItem> g2 = i.mo35815g();
                                        arrayList = new ArrayList(C19322o.m32624F0(g2));
                                        for (ShippingSelectItem shippingSelectItem : g2) {
                                            C10813l.C10825l lVar3 = (C10813l.C10825l) lVar2;
                                            if (C19383o.m32792b(shippingSelectItem.mo35863b(), lVar3.mo35963a())) {
                                                shippingSelectItem = ShippingSelectItem.m18786a(shippingSelectItem, lVar3.mo35964b());
                                            }
                                            arrayList.add(shippingSelectItem);
                                        }
                                    } while (!stateFlowImpl6.mo72337i(value15, C10855s.m18848b(sVar7, C10856t.m18854a(sVar7.mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, SearchFiltersUiGroupItem.Shipping.m18717f(i, arrayList), (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32735), (FilterParams) null, (FacetCount) null, 6)));
                                } else if (lVar2 instanceof C10813l.C10831r) {
                                    SortBySelectItem a = ((C10813l.C10831r) lVar2).mo35982a();
                                    SearchFiltersUiGroupItem.SortBy l = ((C10855s) this.f23798k.getValue()).mo36030f().mo36045l();
                                    if (l != null) {
                                        List<SortBySelectItem> g3 = l.mo35823g();
                                        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(g3));
                                        for (SortBySelectItem sortBySelectItem : g3) {
                                            arrayList2.add(SortBySelectItem.m18789a(sortBySelectItem, C19383o.m32792b(sortBySelectItem.mo35870b(), a.mo35870b())));
                                        }
                                        C10856t a2 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), SearchFiltersUiGroupItem.SortBy.m18731f(l, arrayList2), (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32766);
                                        StateFlowImpl stateFlowImpl7 = this.f23798k;
                                        do {
                                            value14 = stateFlowImpl7.getValue();
                                        } while (!stateFlowImpl7.mo72337i(value14, C10855s.m18848b((C10855s) value14, a2, (FilterParams) null, (FacetCount) null, 6)));
                                    } else {
                                        return;
                                    }
                                } else if (lVar2 instanceof C10813l.C10818e) {
                                    ItemTypeSelectItem a3 = ((C10813l.C10818e) lVar2).mo35935a();
                                    SearchFiltersUiGroupItem.ItemType e = ((C10855s) this.f23798k.getValue()).mo36030f().mo36036e();
                                    if (e != null) {
                                        List<ItemTypeSelectItem> g4 = e.mo35802g();
                                        ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(g4));
                                        for (ItemTypeSelectItem itemTypeSelectItem : g4) {
                                            arrayList3.add(ItemTypeSelectItem.m18672a(itemTypeSelectItem, C19383o.m32792b(itemTypeSelectItem.mo35758b(), a3.mo35758b())));
                                        }
                                        C10856t a4 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, SearchFiltersUiGroupItem.ItemType.m18696f(e, arrayList3), (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32763);
                                        StateFlowImpl stateFlowImpl8 = this.f23798k;
                                        do {
                                            value13 = stateFlowImpl8.getValue();
                                        } while (!stateFlowImpl8.mo72337i(value13, C10855s.m18848b((C10855s) value13, a4, (FilterParams) null, (FacetCount) null, 6)));
                                    } else {
                                        return;
                                    }
                                } else if (lVar2 instanceof C10813l.C10821h) {
                                    C10803g a5 = ((C10813l.C10821h) lVar2).mo35949a();
                                    SearchFiltersUiGroupItem.C10783d g5 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36039g();
                                    if (g5 != null) {
                                        List<C10803g> h2 = g5.mo35839h();
                                        ArrayList arrayList4 = new ArrayList(C19322o.m32624F0(h2));
                                        for (C10803g gVar : h2) {
                                            arrayList4.add(C10803g.m18808a(gVar, C19383o.m32792b(gVar.mo35903b(), a5.mo35903b()), false, 123));
                                        }
                                        C10856t a6 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, SearchFiltersUiGroupItem.C10783d.m18759f(g5, a5.mo35905d() ? this.f23794g.mo36054i(false, g5.mo35838g().mo35765d(), g5.mo35838g().mo35764c()) : a5.mo35904c(), arrayList4, (PriceRange) null, a5.mo35905d(), 227), (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32751);
                                        StateFlowImpl stateFlowImpl9 = this.f23798k;
                                        do {
                                            value12 = stateFlowImpl9.getValue();
                                        } while (!stateFlowImpl9.mo72337i(value12, C10855s.m18848b((C10855s) value12, a6, (FilterParams) null, (FacetCount) null, 6)));
                                    } else {
                                        return;
                                    }
                                } else if (lVar2 instanceof C10813l.C10816c) {
                                    C10813l.C10816c cVar2 = (C10813l.C10816c) lVar2;
                                    BigDecimal S0 = C19456j.m33015S0(cVar2.mo35925a());
                                    if (S0 != null && (g = ((C10855s) this.f23798k.getValue()).mo36030f().mo36039g()) != null) {
                                        PriceRange g6 = g.mo35838g();
                                        PriceRange a7 = cVar2.mo35926b() ? PriceRange.m18674a(g6, S0, (BigDecimal) null, 2) : PriceRange.m18674a(g6, (BigDecimal) null, S0, 1);
                                        C10856t a8 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, SearchFiltersUiGroupItem.C10783d.m18759f(g, this.f23794g.mo36054i(false, a7.mo35765d(), a7.mo35764c()), (ArrayList) null, a7, true, 115), (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32751);
                                        StateFlowImpl stateFlowImpl10 = this.f23798k;
                                        do {
                                            value11 = stateFlowImpl10.getValue();
                                        } while (!stateFlowImpl10.mo72337i(value11, C10855s.m18848b((C10855s) value11, a8, (FilterParams) null, (FacetCount) null, 6)));
                                    } else {
                                        return;
                                    }
                                } else {
                                    int i3 = -1;
                                    if (lVar2 instanceof C10813l.C10819f) {
                                        C10813l.C10819f fVar2 = (C10813l.C10819f) lVar2;
                                        C10798d a9 = fVar2.mo35939a();
                                        Iterator<SearchFiltersUiGroupItem> it = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            } else if (C19383o.m32792b(it.next().mo35793b(), fVar2.mo35939a().mo35889b())) {
                                                i3 = i2;
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        Object W0 = C19327t.m32641W0(i3, ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                        SearchFiltersUiGroupItem.MultiSelect multiSelect = W0 instanceof SearchFiltersUiGroupItem.MultiSelect ? (SearchFiltersUiGroupItem.MultiSelect) W0 : null;
                                        if (multiSelect != null) {
                                            List<C10798d> g7 = multiSelect.mo35807g();
                                            ArrayList arrayList5 = new ArrayList(C19322o.m32624F0(g7));
                                            for (C10798d dVar2 : g7) {
                                                if (C19383o.m32792b(dVar2.mo35890c(), a9.mo35890c())) {
                                                    dVar2 = C10798d.m18802a(dVar2, fVar2.mo35940b());
                                                }
                                                arrayList5.add(dVar2);
                                            }
                                            ArrayList q1 = C19327t.m32661q1(((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                            q1.set(i3, SearchFiltersUiGroupItem.MultiSelect.m18704f(multiSelect, true, arrayList5, 3));
                                            C10856t a10 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, q1, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32511);
                                            StateFlowImpl stateFlowImpl11 = this.f23798k;
                                            do {
                                                value10 = stateFlowImpl11.getValue();
                                            } while (!stateFlowImpl11.mo72337i(value10, C10855s.m18848b((C10855s) value10, a10, (FilterParams) null, (FacetCount) null, 6)));
                                        } else {
                                            return;
                                        }
                                    } else if (lVar2 instanceof C10813l.C10830q) {
                                        C10813l.C10830q qVar = (C10813l.C10830q) lVar2;
                                        C10798d a11 = qVar.mo35977a();
                                        Iterator<SearchFiltersUiGroupItem> it2 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            } else if (C19383o.m32792b(it2.next().mo35793b(), qVar.mo35977a().mo35889b())) {
                                                i3 = i2;
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        Object W02 = C19327t.m32641W0(i3, ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                        SearchFiltersUiGroupItem.SizeSelect sizeSelect = W02 instanceof SearchFiltersUiGroupItem.SizeSelect ? (SearchFiltersUiGroupItem.SizeSelect) W02 : null;
                                        if (sizeSelect != null) {
                                            List<C10798d> g8 = sizeSelect.mo35819g();
                                            ArrayList arrayList6 = new ArrayList(C19322o.m32624F0(g8));
                                            for (C10798d dVar3 : g8) {
                                                if (C19383o.m32792b(dVar3.mo35890c(), a11.mo35890c())) {
                                                    dVar3 = C10798d.m18802a(dVar3, qVar.mo35978b());
                                                }
                                                arrayList6.add(dVar3);
                                            }
                                            ArrayList q12 = C19327t.m32661q1(((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                            q12.set(i3, SearchFiltersUiGroupItem.SizeSelect.m18724f(sizeSelect, true, arrayList6, 3));
                                            C10856t a12 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, q12, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32511);
                                            StateFlowImpl stateFlowImpl12 = this.f23798k;
                                            do {
                                                value9 = stateFlowImpl12.getValue();
                                            } while (!stateFlowImpl12.mo72337i(value9, C10855s.m18848b((C10855s) value9, a12, (FilterParams) null, (FacetCount) null, 6)));
                                        } else {
                                            return;
                                        }
                                    } else if (lVar2 instanceof C10813l.C10820g) {
                                        StateFlowImpl stateFlowImpl13 = this.f23798k;
                                        do {
                                            value8 = stateFlowImpl13.getValue();
                                            sVar6 = (C10855s) value8;
                                            f2 = sVar6.mo36030f();
                                            SearchFiltersUiGroupItem.OtherOptions f7 = sVar6.mo36030f().mo36038f();
                                            if (f7 != null) {
                                                C10813l.C10820g gVar2 = (C10813l.C10820g) lVar2;
                                                otherOptions = f7.mo35811f(gVar2.mo35944a(), gVar2.mo35945b());
                                            } else {
                                                otherOptions = null;
                                            }
                                        } while (!stateFlowImpl13.mo72337i(value8, C10855s.m18848b(sVar6, C10856t.m18854a(f2, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, otherOptions, (ArrayList) null, (Integer) null, false, false, 32255), (FilterParams) null, (FacetCount) null, 6)));
                                    } else if (lVar2 instanceof C10813l.C10815b) {
                                        C10813l.C10815b bVar = (C10813l.C10815b) lVar2;
                                        C10792c a13 = bVar.mo35923a();
                                        Iterator<SearchFiltersUiGroupItem> it3 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                break;
                                            } else if (C19383o.m32792b(it3.next().mo35793b(), bVar.mo35923a().mo35879b())) {
                                                i3 = i2;
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        Object W03 = C19327t.m32641W0(i3, ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                        SearchFiltersUiGroupItem.ColorSelect colorSelect = W03 instanceof SearchFiltersUiGroupItem.ColorSelect ? (SearchFiltersUiGroupItem.ColorSelect) W03 : null;
                                        if (colorSelect != null) {
                                            List<C10792c> g9 = colorSelect.mo35798g();
                                            ArrayList arrayList7 = new ArrayList(C19322o.m32624F0(g9));
                                            for (C10792c cVar3 : g9) {
                                                if (C19383o.m32792b(cVar3.mo35880c(), a13.mo35880c())) {
                                                    cVar3 = C10792c.m18795a(cVar3, bVar.mo35924b());
                                                }
                                                arrayList7.add(cVar3);
                                            }
                                            ArrayList q13 = C19327t.m32661q1(((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                            q13.set(i3, SearchFiltersUiGroupItem.ColorSelect.m18689f(colorSelect, true, arrayList7, 3));
                                            C10856t a14 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, q13, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32511);
                                            StateFlowImpl stateFlowImpl14 = this.f23798k;
                                            do {
                                                value7 = stateFlowImpl14.getValue();
                                            } while (!stateFlowImpl14.mo72337i(value7, C10855s.m18848b((C10855s) value7, a14, (FilterParams) null, (FacetCount) null, 6)));
                                        } else {
                                            return;
                                        }
                                    } else if (lVar2 instanceof C10813l.C10814a) {
                                        StateFlowImpl stateFlowImpl15 = this.f23798k;
                                        do {
                                            value6 = stateFlowImpl15.getValue();
                                            sVar5 = (C10855s) value6;
                                        } while (!stateFlowImpl15.mo72337i(value6, C10855s.m18848b(sVar5, C10856t.m18854a(sVar5.mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, this.f23794g.mo36048c(sVar5.mo36028e(), ((C10813l.C10814a) lVar2).mo35919a().mo35875a()), (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32765), (FilterParams) null, (FacetCount) null, 6)));
                                    } else if (lVar2 instanceof C10813l.C10817d) {
                                        Iterator<T> it4 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it4.next();
                                            if (C19383o.m32792b(((SearchFiltersUiGroupItem) t).mo35793b(), ((C10813l.C10817d) lVar2).mo35930a())) {
                                                break;
                                            }
                                        }
                                        SearchFiltersUiGroupItem searchFiltersUiGroupItem = (SearchFiltersUiGroupItem) t;
                                        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.MultiSelect) {
                                            Iterator<SearchFiltersUiGroupItem> it5 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                } else if (C19383o.m32792b(it5.next().mo35793b(), ((C10813l.C10817d) lVar2).mo35930a())) {
                                                    i3 = i2;
                                                    break;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                            Object W04 = C19327t.m32641W0(i3, ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                            SearchFiltersUiGroupItem.MultiSelect multiSelect2 = W04 instanceof SearchFiltersUiGroupItem.MultiSelect ? (SearchFiltersUiGroupItem.MultiSelect) W04 : null;
                                            if (multiSelect2 != null) {
                                                SearchFiltersUiGroupItem.MultiSelect f8 = SearchFiltersUiGroupItem.MultiSelect.m18704f(multiSelect2, ((C10813l.C10817d) lVar2).mo35931b(), (ArrayList) null, 11);
                                                ArrayList q14 = C19327t.m32661q1(((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                                q14.set(i3, f8);
                                                tVar = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, q14, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32511);
                                            } else {
                                                return;
                                            }
                                        } else if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.ColorSelect) {
                                            Iterator<SearchFiltersUiGroupItem> it6 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    break;
                                                } else if (C19383o.m32792b(it6.next().mo35793b(), ((C10813l.C10817d) lVar2).mo35930a())) {
                                                    i3 = i2;
                                                    break;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                            Object W05 = C19327t.m32641W0(i3, ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                            SearchFiltersUiGroupItem.ColorSelect colorSelect2 = W05 instanceof SearchFiltersUiGroupItem.ColorSelect ? (SearchFiltersUiGroupItem.ColorSelect) W05 : null;
                                            if (colorSelect2 != null) {
                                                SearchFiltersUiGroupItem.ColorSelect f9 = SearchFiltersUiGroupItem.ColorSelect.m18689f(colorSelect2, ((C10813l.C10817d) lVar2).mo35931b(), (ArrayList) null, 11);
                                                ArrayList q15 = C19327t.m32661q1(((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                                q15.set(i3, f9);
                                                tVar = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, q15, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32511);
                                            } else {
                                                return;
                                            }
                                        } else if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.SizeSelect) {
                                            Iterator<SearchFiltersUiGroupItem> it7 = ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d().iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    break;
                                                } else if (C19383o.m32792b(it7.next().mo35793b(), ((C10813l.C10817d) lVar2).mo35930a())) {
                                                    i3 = i2;
                                                    break;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                            Object W06 = C19327t.m32641W0(i3, ((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                            SearchFiltersUiGroupItem.SizeSelect sizeSelect2 = W06 instanceof SearchFiltersUiGroupItem.SizeSelect ? (SearchFiltersUiGroupItem.SizeSelect) W06 : null;
                                            if (sizeSelect2 != null) {
                                                SearchFiltersUiGroupItem.SizeSelect f10 = SearchFiltersUiGroupItem.SizeSelect.m18724f(sizeSelect2, ((C10813l.C10817d) lVar2).mo35931b(), (ArrayList) null, 11);
                                                ArrayList q16 = C19327t.m32661q1(((C10855s) this.f23798k.getValue()).mo36030f().mo36035d());
                                                q16.set(i3, f10);
                                                tVar = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, q16, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32511);
                                            } else {
                                                return;
                                            }
                                        } else {
                                            tVar = ((C10855s) this.f23798k.getValue()).mo36030f();
                                        }
                                        StateFlowImpl stateFlowImpl16 = this.f23798k;
                                        do {
                                            value5 = stateFlowImpl16.getValue();
                                            sVar4 = (C10855s) value5;
                                            dVar = (C10813l.C10817d) lVar2;
                                        } while (!stateFlowImpl16.mo72337i(value5, dVar.mo35931b() ? C10855s.m18848b(sVar4, tVar, (FilterParams) null, (FacetCount) null, 6).mo36025a(new C10849q.C10853d(dVar.mo35930a())) : C10855s.m18848b(sVar4, tVar, (FilterParams) null, (FacetCount) null, 6)));
                                    } else if (C19383o.m32792b(lVar2, C10813l.C10824k.f23967a)) {
                                        StateFlowImpl stateFlowImpl17 = this.f23798k;
                                        do {
                                            value4 = stateFlowImpl17.getValue();
                                            sVar3 = (C10855s) value4;
                                            FilterParams c2 = sVar3.mo36026c();
                                            if (c2 == null || (searchOptions3 = c2.getSearchOptions()) == null || (searchOptions = SearchOptions.copy$default(searchOptions3, (List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, "", "", (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 266862591, (Object) null)) == null) {
                                                searchOptions = new SearchOptions((List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
                                            }
                                            searchOptions2 = searchOptions;
                                            c = sVar3.mo36026c();
                                        } while (!stateFlowImpl17.mo72337i(value4, C10855s.m18848b(sVar3, (C10856t) this.f23796i.getValue(), c != null ? FilterParams.copy$default(c, (String) null, (List) null, (List) null, (List) null, (StaticFilters) null, searchOptions2, (SearchFiltersRequest) null, 0, 223, (Object) null) : null, (FacetCount) null, 4)));
                                    } else if (lVar2 instanceof C10813l.C10829p) {
                                        StateFlowImpl stateFlowImpl18 = this.f23798k;
                                        do {
                                            value3 = stateFlowImpl18.getValue();
                                            sVar2 = (C10855s) value3;
                                            FilterParams c3 = sVar2.mo36026c();
                                            query = c3 != null ? c3.getQuery() : null;
                                            if (query == null) {
                                                query = "";
                                            }
                                        } while (!stateFlowImpl18.mo72337i(value3, sVar2.mo36025a(new C10849q.C10852c(query, this.f23795h.mo36067a(sVar2), sVar2.mo36027d()))));
                                    } else if (lVar2 instanceof C10813l.C10822i) {
                                        C10813l.C10822i iVar = (C10813l.C10822i) lVar2;
                                        if (!(iVar.mo35953a().length() == 0) && (h = ((C10855s) this.f23798k.getValue()).mo36030f().mo36040h()) != null) {
                                            PriceRange g10 = h.mo35832g();
                                            PriceRange a15 = iVar.mo35954b() ? PriceRange.m18674a(g10, new BigDecimal(iVar.mo35953a()), (BigDecimal) null, 2) : PriceRange.m18674a(g10, (BigDecimal) null, new BigDecimal(iVar.mo35953a()), 1);
                                            C10856t a16 = C10856t.m18854a(((C10855s) this.f23798k.getValue()).mo36030f(), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, SearchFiltersUiGroupItem.C10782c.m18750f(h, this.f23794g.mo36054i(false, a15.mo35765d(), a15.mo35764c()), true, (ArrayList) null, a15, true, 115), (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32759);
                                            StateFlowImpl stateFlowImpl19 = this.f23798k;
                                            do {
                                                value2 = stateFlowImpl19.getValue();
                                            } while (!stateFlowImpl19.mo72337i(value2, C10855s.m18848b((C10855s) value2, a16, (FilterParams) null, (FacetCount) null, 6)));
                                        } else {
                                            return;
                                        }
                                    } else if (lVar2 instanceof C10813l.C10823j) {
                                        StateFlowImpl stateFlowImpl20 = this.f23798k;
                                        do {
                                            value = stateFlowImpl20.getValue();
                                            sVar = (C10855s) value;
                                            SearchFiltersUiGroupItem.C10782c h3 = sVar.mo36030f().mo36040h();
                                            f = sVar.mo36030f();
                                            if (h3 != null) {
                                                C10813l.C10823j jVar = (C10813l.C10823j) lVar2;
                                                cVar = h3.mo35835i(jVar.mo35958a(), jVar.mo35959b());
                                            } else {
                                                cVar = null;
                                            }
                                        } while (!stateFlowImpl20.mo72337i(value, C10855s.m18848b(sVar, C10856t.m18854a(f, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, cVar, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, false, 32759), (FilterParams) null, (FacetCount) null, 6)));
                                    }
                                }
                            }
                            if (C0005b.m52o0(lVar)) {
                                mo35784d();
                            }
                        }
                    }
