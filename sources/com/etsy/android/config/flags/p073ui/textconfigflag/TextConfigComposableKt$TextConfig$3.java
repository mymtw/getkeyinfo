package com.etsy.android.config.flags.p073ui.textconfigflag;

import androidx.compose.runtime.C1302d;
import com.etsy.collagecompose.BadgeStyle;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.textconfigflag.TextConfigComposableKt$TextConfig$3 */
public final class TextConfigComposableKt$TextConfig$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $flagName;
    public final /* synthetic */ String $flagValue;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ Integer $statusIcon;
    public final /* synthetic */ BadgeStyle $statusStyle;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextConfigComposableKt$TextConfig$3(String str, String str2, String str3, String str4, BadgeStyle badgeStyle, Integer num, C19846a<C19394m> aVar, int i) {
        super(2);
        this.$flagName = str;
        this.$description = str2;
        this.$flagValue = str3;
        this.$statusText = str4;
        this.$statusStyle = badgeStyle;
        this.$statusIcon = num;
        this.$onClick = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        TextConfigComposableKt.m12844a(this.$flagName, this.$description, this.$flagValue, this.$statusText, this.$statusStyle, this.$statusIcon, this.$onClick, dVar, this.$$changed | 1);
    }
}
