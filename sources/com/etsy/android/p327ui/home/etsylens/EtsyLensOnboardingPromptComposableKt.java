package com.etsy.android.p327ui.home.etsylens;

import android.view.View;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.R;
import com.etsy.collagecompose.ThemeKt;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$FloatRef;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt */
public final class EtsyLensOnboardingPromptComposableKt {
    /* renamed from: a */
    public static final void m18160a(View view, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19846a<C19394m> aVar3, C19846a<C19394m> aVar4, C1302d dVar, int i) {
        View view2 = view;
        C19383o.m32797g(view2, "target");
        C19383o.m32797g(aVar, "onMainButtonClicked");
        C19383o.m32797g(aVar2, "onAltButtonClicked");
        C19383o.m32797g(aVar3, "onCameraButtonClicked");
        C19383o.m32797g(aVar4, "onBackgroundClicked");
        ComposerImpl h = dVar.mo5440h(2127662518);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = i2;
        int i4 = iArr[1];
        int i5 = i4;
        int width = view.getWidth() + i2;
        int height = view.getHeight() + i4;
        float width2 = (float) ((view.getWidth() / 2) + i2);
        String S0 = C15588c1.m25305S0(R.string.etsy_lens_onboarding_popup_title, h);
        String S02 = C15588c1.m25305S0(R.string.etsy_lens_onboarding_popup_badge, h);
        String S03 = C15588c1.m25305S0(R.string.etsy_lens_onboarding_popup_main_button, h);
        String S04 = C15588c1.m25305S0(R.string.etsy_lens_onboarding_popup_alt_button, h);
        String S05 = C15588c1.m25305S0(R.string.etsy_lens_button_content_description, h);
        ComposerImpl composerImpl = h;
        Ref$FloatRef ref$FloatRef = r0;
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef3 = r2;
        Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
        C7282b bVar = (C7282b) composerImpl.mo5410J(CompositionLocalsKt.f4019e);
        ComposerImpl composerImpl2 = composerImpl;
        ref$FloatRef2.element = bVar.mo3797p(width - i2);
        ref$FloatRef4.element = bVar.mo3797p(height - i4);
        C9957x883f9e29 etsyLensOnboardingPromptComposableKt$EtsyLensOnboardingPromptComposable$2 = r0;
        View view3 = view;
        C19846a<C19394m> aVar5 = aVar4;
        int i6 = i;
        C9957x883f9e29 etsyLensOnboardingPromptComposableKt$EtsyLensOnboardingPromptComposable$22 = new C9957x883f9e29(view3, aVar5, i6, ref$FloatRef, ref$FloatRef3, i3, i5, S05, aVar3, S03, aVar, S04, aVar2, height, S0, S02, width2);
        ComposerImpl composerImpl3 = composerImpl2;
        ThemeKt.m19959a(false, C18263b.m30805A(composerImpl3, 1680097018, etsyLensOnboardingPromptComposableKt$EtsyLensOnboardingPromptComposable$2), composerImpl3, 48, 1);
        C1418v0 U = composerImpl3.mo5421U();
        if (U != null) {
            U.f3081d = new C9965x883f9e2a(view, aVar, aVar2, aVar3, aVar4, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1} */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0076, code lost:
        if (r3 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x0078;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m18161b(android.view.View r11, androidx.compose.runtime.C1302d r12, int r13) {
        /*
            java.lang.String r0 = "target"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r0 = -1185528257(0xffffffffb956463f, float:-2.0434799E-4)
            androidx.compose.runtime.ComposerImpl r12 = r12.mo5440h(r0)
            r0 = 2
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r1 = 0
            r2 = r0[r1]
            float r2 = (float) r2
            int r3 = r11.getWidth()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r3 + r2
            r2 = 1
            r0 = r0[r2]
            float r0 = (float) r0
            int r2 = r11.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r4
            float r2 = r2 + r0
            long r6 = kotlin.reflect.C19421p.m32952q(r3, r2)
            int r0 = r11.getWidth()
            float r0 = (float) r0
            float r8 = r0 / r4
            androidx.compose.runtime.l1 r0 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3987b
            java.lang.Object r0 = r12.mo5410J(r0)
            android.content.Context r0 = (android.content.Context) r0
            h0.a r2 = p122h0.C6905a.f15283a
            r3 = 2131099720(0x7f060048, float:1.7811801E38)
            long r9 = r2.mo19016a(r0, r3)
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.SizeKt.m1486f(r0)
            y.c r2 = new y.c
            r2.<init>(r6)
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
            androidx.compose.ui.graphics.s r4 = new androidx.compose.ui.graphics.s
            r4.<init>(r9)
            r5 = 1618982084(0x607fb4c4, float:7.370227E19)
            r12.mo5465u(r5)
            boolean r2 = r12.mo5408I(r2)
            boolean r3 = r12.mo5408I(r3)
            r2 = r2 | r3
            boolean r3 = r12.mo5408I(r4)
            r2 = r2 | r3
            java.lang.Object r3 = r12.mo5431c0()
            if (r2 != 0) goto L_0x0078
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r2) goto L_0x0081
        L_0x0078:
            com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1 r3 = new com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1
            r5 = r3
            r5.<init>(r6, r8, r9)
            r12.mo5407H0(r3)
        L_0x0081:
            r12.mo5418R(r1)
            kq.l r3 = (p753kq.C19857l) r3
            r1 = 6
            androidx.compose.foundation.CanvasKt.m1294a(r0, r3, r12, r1)
            androidx.compose.runtime.v0 r12 = r12.mo5421U()
            if (r12 != 0) goto L_0x0091
            goto L_0x0098
        L_0x0091:
            com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$2 r0 = new com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$2
            r0.<init>(r11, r13)
            r12.f3081d = r0
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.etsylens.EtsyLensOnboardingPromptComposableKt.m18161b(android.view.View, androidx.compose.runtime.d, int):void");
    }
}
