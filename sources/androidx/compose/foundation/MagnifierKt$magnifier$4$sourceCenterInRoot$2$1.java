package androidx.compose.foundation;

import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p174m0.C7282b;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;

public final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends Lambda implements C19846a<C8343c> {
    public final /* synthetic */ C1338j0<C8343c> $anchorPositionInRoot$delegate;
    public final /* synthetic */ C7282b $density;
    public final /* synthetic */ C1342k1<C19857l<C7282b, C8343c>> $updatedSourceCenter$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(C7282b bVar, C1342k1<? extends C19857l<? super C7282b, C8343c>> k1Var, C1338j0<C8343c> j0Var) {
        super(0);
        this.$density = bVar;
        this.$updatedSourceCenter$delegate = k1Var;
        this.$anchorPositionInRoot$delegate = j0Var;
    }

    public /* synthetic */ Object invoke() {
        return new C8343c(m34669invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
    public final long m34669invokeF1C5BW0() {
        long j = ((C8343c) MagnifierKt$magnifier$4.m34663access$invoke$lambda3(this.$updatedSourceCenter$delegate).invoke(this.$density)).f18299a;
        if (C19421p.m32928R(MagnifierKt$magnifier$4.m34660access$invoke$lambda1(this.$anchorPositionInRoot$delegate)) && C19421p.m32928R(j)) {
            return C8343c.m16645f(MagnifierKt$magnifier$4.m34660access$invoke$lambda1(this.$anchorPositionInRoot$delegate), j);
        }
        int i = C8343c.f18298e;
        return C8343c.f18297d;
    }
}
