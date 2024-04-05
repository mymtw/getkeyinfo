package com.google.accompanist.flowlayout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class FlowKt$Flow$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    public final /* synthetic */ float $crossAxisSpacing;
    public final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    public final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    public final /* synthetic */ SizeMode $mainAxisSize;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ LayoutOrientation $orientation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt$Flow$2(C1436d dVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$orientation = layoutOrientation;
        this.$mainAxisSize = sizeMode;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$mainAxisSpacing = f;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSpacing = f2;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        FlowKt.m20294a(this.$modifier, this.$orientation, this.$mainAxisSize, this.$mainAxisAlignment, this.$mainAxisSpacing, this.$crossAxisAlignment, this.$crossAxisSpacing, this.$lastLineMainAxisAlignment, this.$content, dVar, this.$$changed | 1);
    }
}
