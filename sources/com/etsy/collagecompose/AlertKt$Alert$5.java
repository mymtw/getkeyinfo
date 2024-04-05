package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import com.etsy.collagecompose.C12122a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class AlertKt$Alert$5 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C12122a.C12123a $altButton;
    public final /* synthetic */ AnchorDirection $anchorDirection;
    public final /* synthetic */ float $anchorOffset;
    public final /* synthetic */ String $badgeText;
    public final /* synthetic */ String $bodyText;
    public final /* synthetic */ C12122a.C12124b $dismissButton;
    public final /* synthetic */ boolean $floating;
    public final /* synthetic */ boolean $fullWidth;
    public final /* synthetic */ String $iconName;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ boolean $largeTitle;
    public final /* synthetic */ C12122a.C12125c $mainButton;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onBackgroundClick;
    public final /* synthetic */ String $titleText;
    public final /* synthetic */ boolean $tooltipLayout;
    public final /* synthetic */ AlertType $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertKt$Alert$5(AlertType alertType, String str, C1436d dVar, C12122a.C12125c cVar, C12122a.C12123a aVar, C12122a.C12124b bVar, C19846a<C19394m> aVar2, String str2, String str3, int i, String str4, boolean z, boolean z2, AnchorDirection anchorDirection, float f, boolean z3, boolean z4, int i2, int i3, int i4) {
        super(2);
        this.$type = alertType;
        this.$titleText = str;
        this.$modifier = dVar;
        this.$mainButton = cVar;
        this.$altButton = aVar;
        this.$dismissButton = bVar;
        this.$onBackgroundClick = aVar2;
        this.$bodyText = str2;
        this.$badgeText = str3;
        this.$iconRes = i;
        this.$iconName = str4;
        this.$fullWidth = z;
        this.$largeTitle = z2;
        this.$anchorDirection = anchorDirection;
        this.$anchorOffset = f;
        this.$floating = z3;
        this.$tooltipLayout = z4;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        AlertType alertType = this.$type;
        AlertType alertType2 = alertType;
        AlertKt.m19937a(alertType2, this.$titleText, this.$modifier, this.$mainButton, this.$altButton, this.$dismissButton, this.$onBackgroundClick, this.$bodyText, this.$badgeText, this.$iconRes, this.$iconName, this.$fullWidth, this.$largeTitle, this.$anchorDirection, this.$anchorOffset, this.$floating, this.$tooltipLayout, dVar2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
