package com.etsy.android.lib.useraction;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class UserActionBus$convertUserActionsToJson$1$1 extends Lambda implements C19861p<C17412w, C8874g, C19394m> {
    public static final UserActionBus$convertUserActionsToJson$1$1 INSTANCE = new UserActionBus$convertUserActionsToJson$1$1();

    public UserActionBus$convertUserActionsToJson$1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C17412w) obj, (C8874g) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(C17412w wVar, C8874g gVar) {
        C19383o.m32797g(gVar, "userAction");
        C17412w h = wVar.mo68522b().mo68529h(ResponseConstants.SUBJECT_ID).mo68535x(gVar.f19606c).mo68529h(ResponseConstants.ACTION);
        h.mo68535x(gVar.f19604a + '_' + gVar.f19605b).mo68529h(ResponseConstants.TIMESTAMP).mo68533t(gVar.f19607d).mo68526f();
    }
}
