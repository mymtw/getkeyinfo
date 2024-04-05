package com.airbnb.paris;

import android.util.AttributeSet;
import com.airbnb.paris.C4864a;
import com.airbnb.paris.C4866b;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p242t3.C7950a;
import p242t3.C7951b;
import p242t3.C7952c;
import p242t3.C7953d;
import p242t3.C7955e;
import p242t3.C7956f;

/* renamed from: com.airbnb.paris.b */
public abstract class C4866b<B extends C4866b<? extends B, ? extends A>, A extends C4864a<?, ?>> {
    private final A applier;
    private C7953d.C7954a builder;
    private String name;
    private ArrayList<C7956f> styles;

    public C4866b() {
        this((C4864a) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public C4866b(A a) {
        this(a, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public C4866b(A a, String str) {
        C19383o.m32798h(str, "name");
        this.applier = a;
        this.name = str;
        this.builder = new C7953d.C7954a(0);
        this.styles = new ArrayList<>();
    }

    public final B add(AttributeSet attributeSet) {
        if (attributeSet != null) {
            add((C7956f) new C7950a(attributeSet));
        }
        return this;
    }

    public final A apply() {
        A a = this.applier;
        if (a != null) {
            a.mo14737a(build());
            return this.applier;
        }
        C19383o.m32803m();
        throw null;
    }

    public final C7956f build() {
        if (this.styles.size() == 0) {
            C7953d.C7954a builder2 = getBuilder();
            String str = this.name;
            builder2.getClass();
            C19383o.m32798h(str, "name");
            builder2.f17428b = str;
        }
        consumeProgrammaticStyleBuilder();
        String str2 = this.name;
        ArrayList<C7956f> arrayList = this.styles;
        C19383o.m32798h(str2, "name");
        C19383o.m32798h(arrayList, ResponseConstants.STYLES);
        int size = arrayList.size();
        return size != 0 ? size != 1 ? new C7952c(str2, arrayList) : (C7956f) C19327t.m32638T0(arrayList) : C7951b.f17420a;
    }

    public void consumeProgrammaticStyleBuilder() {
        if (!getBuilder().f17427a.isEmpty()) {
            ArrayList<C7956f> arrayList = this.styles;
            C7953d.C7954a builder2 = getBuilder();
            builder2.getClass();
            arrayList.add(new C7953d(builder2));
            setBuilder(new C7953d.C7954a(0));
        }
    }

    public final B debugName(String str) {
        C19383o.m32798h(str, "name");
        this.name = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C4866b bVar = (C4866b) obj;
            return !(C19383o.m32792b(this.name, bVar.name) ^ true) && !(C19383o.m32792b(this.applier, bVar.applier) ^ true) && !(C19383o.m32792b(getBuilder(), bVar.getBuilder()) ^ true) && !(C19383o.m32792b(this.styles, bVar.styles) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.airbnb.paris.StyleBuilder<*, *>");
    }

    public C7953d.C7954a getBuilder() {
        return this.builder;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        A a = this.applier;
        int hashCode2 = a != null ? a.hashCode() : 0;
        return this.styles.hashCode() + ((getBuilder().hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public void setBuilder(C7953d.C7954a aVar) {
        C19383o.m32798h(aVar, "<set-?>");
        this.builder = aVar;
    }

    public final B add(int i) {
        return add((C7956f) new C7955e(i));
    }

    public final B add(C7956f fVar) {
        C19383o.m32798h(fVar, "style");
        consumeProgrammaticStyleBuilder();
        this.styles.add(fVar);
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4866b(C4864a aVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? "a programmatic style" : str);
    }
}
