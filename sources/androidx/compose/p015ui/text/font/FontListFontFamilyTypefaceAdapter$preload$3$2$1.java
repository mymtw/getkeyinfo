package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {105}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1 */
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Object>, Object> {
    public final /* synthetic */ C1950f $font;
    public final /* synthetic */ C1963q $resourceLoader;
    public int label;
    public final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    @C19060c(mo70540c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {107}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1 */
    public static final class C19431 extends SuspendLambda implements C19857l<C19340c<? super Object>, Object> {
        public int label;

        public final C19340c<C19394m> create(C19340c<?> cVar) {
            return new C19431(fVar, qVar, cVar);
        }

        public final Object invoke(C19340c<Object> cVar) {
            return ((C19431) create(cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final C1963q qVar = qVar;
                final C1950f fVar = fVar;
                C19441 r9 = new C19861p<C19525d0, C19340c<? super Object>, Object>((C19340c<? super C19441>) null) {
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, C1950f fVar, C1963q qVar, C19340c<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> cVar) {
                            super(2, cVar);
                            this.this$0 = fontListFontFamilyTypefaceAdapter;
                            this.$font = fVar;
                            this.$resourceLoader = qVar;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, cVar);
                        }

                        public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
                            return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                AsyncTypefaceCache asyncTypefaceCache = this.this$0.f4392a;
                                final C1950f fVar = this.$font;
                                final C1963q qVar = this.$resourceLoader;
                                C19431 r7 = new C19431((C19340c<? super C19431>) null);
                                this.label = 1;
                                obj = asyncTypefaceCache.mo7505b(fVar, qVar, true, r7, this);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i == 1) {
                                C0761x.m1684O0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return obj;
                        }
                    }
