package com.etsy.android.config.flags.p073ui.switchconfigflag;

import androidx.compose.runtime.C1302d;
import com.etsy.collagecompose.BadgeStyle;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.SwitchConfigComposableKt$SwitchConfig$4 */
public final class SwitchConfigComposableKt$SwitchConfig$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $description;
    public final /* synthetic */ boolean $flagChecked;
    public final /* synthetic */ String $flagName;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onLongClick;
    public final /* synthetic */ Integer $statusIcon;
    public final /* synthetic */ BadgeStyle $statusStyle;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchConfigComposableKt$SwitchConfig$4(String str, String str2, boolean z, String str3, BadgeStyle badgeStyle, Integer num, C19846a<C19394m> aVar, C19857l<? super Boolean, C19394m> lVar, int i) {
        super(2);
        this.$flagName = str;
        this.$description = str2;
        this.$flagChecked = z;
        this.$statusText = str3;
        this.$statusStyle = badgeStyle;
        this.$statusIcon = num;
        this.$onClick = aVar;
        this.$onLongClick = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SwitchConfigComposableKt.m12835a(this.$flagName, this.$description, this.$flagChecked, this.$statusText, this.$statusStyle, this.$statusIcon, this.$onClick, this.$onLongClick, dVar, this.$$changed | 1);
    }
}
