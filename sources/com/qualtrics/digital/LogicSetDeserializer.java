package com.qualtrics.digital;

import com.google.gson.C16796j;
import com.google.gson.C16799m;
import com.google.gson.C16800n;
import com.google.gson.C16802p;
import com.google.gson.JsonParseException;
import java.util.ArrayList;

class LogicSetDeserializer extends C17292a implements C16799m<C17310p> {
    /* renamed from: a */
    public final Object mo59634a(C16800n nVar) throws JsonParseException {
        Class<C17300g> cls = C17300g.class;
        C16802p a = nVar.mo59635a();
        C16796j jVar = new C16796j();
        jVar.mo59628b(new ExpressionDeserializer(), cls);
        C17292a.m29048b(a, new ArrayList(), jVar, cls);
        a.f37123b.get("Type").mo59630e();
        return new C17310p();
    }
}
