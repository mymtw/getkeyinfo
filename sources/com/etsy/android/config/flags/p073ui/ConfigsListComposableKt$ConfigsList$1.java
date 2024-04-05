package com.etsy.android.config.flags.p073ui;

import androidx.compose.foundation.lazy.C0859r;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$1 */
public final class ConfigsListComposableKt$ConfigsList$1 extends Lambda implements C19857l<C0859r, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ List<C6403c> $listItems;
    public final /* synthetic */ C19857l<String, C19394m> $onClickSwitchConfig;
    public final /* synthetic */ C19861p<String, String, C19394m> $onClickTextConfig;

    /* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$1$a */
    public /* synthetic */ class C6396a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14215a;

        static {
            int[] iArr = new int[ConfigFlagViewTypes.values().length];
            iArr[ConfigFlagViewTypes.SWITCH.ordinal()] = 1;
            iArr[ConfigFlagViewTypes.TEXT.ordinal()] = 2;
            f14215a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigsListComposableKt$ConfigsList$1(List<? extends C6403c> list, C19857l<? super String, C19394m> lVar, int i, C19861p<? super String, ? super String, C19394m> pVar) {
        super(1);
        this.$listItems = list;
        this.$onClickSwitchConfig = lVar;
        this.$$dirty = i;
        this.$onClickTextConfig = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0859r) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0859r rVar) {
        C19383o.m32797g(rVar, "$this$LazyColumn");
        List<C6403c> list = this.$listItems;
        C63951 r1 = C63951.INSTANCE;
        C19857l<String, C19394m> lVar = this.$onClickSwitchConfig;
        int i = this.$$dirty;
        C19861p<String, String, C19394m> pVar = this.$onClickTextConfig;
        rVar.mo4398a(list.size(), r1 != null ? new C6392xb27478d3(r1, list) : null, new C6393xb27478d4(C6391xb27478d2.INSTANCE, list), C18263b.m30807B(new C6394xb27478d5(list, lVar, i, pVar), -632812321, true));
    }
}
