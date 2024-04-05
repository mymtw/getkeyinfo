package com.google.common.reflect;

import com.google.common.reflect.C16333f;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.reflect.g */
public final class C16338g extends C16333f.C16335b {

    /* renamed from: b */
    public final /* synthetic */ TypeVariable f36439b;

    /* renamed from: c */
    public final /* synthetic */ C16333f.C16335b f36440c;

    public C16338g(TypeVariable typeVariable, C16333f.C16335b bVar) {
        this.f36439b = typeVariable;
        this.f36440c = bVar;
    }

    /* renamed from: a */
    public final Type mo58300a(TypeVariable typeVariable, C16338g gVar) {
        return typeVariable.getGenericDeclaration().equals(this.f36439b.getGenericDeclaration()) ? typeVariable : this.f36440c.mo58300a(typeVariable, gVar);
    }
}
