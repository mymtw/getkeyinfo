package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.window.C2089b;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class AndroidAlertDialog_androidKt$AlertDialog$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $buttons;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2089b $properties;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$4(C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C1530k0 k0Var, long j, long j2, C2089b bVar, int i, int i2) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$buttons = pVar;
        this.$modifier = dVar;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$shape = k0Var;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$properties = bVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AndroidAlertDialog_androidKt.m2164a(this.$onDismissRequest, this.$buttons, this.$modifier, this.$title, this.$text, this.$shape, this.$backgroundColor, this.$contentColor, this.$properties, dVar, this.$$changed | 1, this.$$default);
    }
}
