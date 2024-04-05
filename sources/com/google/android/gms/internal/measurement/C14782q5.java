package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C14782q5;
import com.google.android.gms.internal.measurement.C14819t5;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
public class C14782q5<MessageType extends C14819t5<MessageType, BuilderType>, BuilderType extends C14782q5<MessageType, BuilderType>> extends C14806s4<MessageType, BuilderType> {

    /* renamed from: b */
    public final MessageType f33057b;

    /* renamed from: c */
    public MessageType f33058c;

    /* renamed from: d */
    public boolean f33059d = false;

    public C14782q5(MessageType messagetype) {
        this.f33057b = messagetype;
        this.f33058c = (C14819t5) messagetype.mo50282q(4);
    }

    /* renamed from: b */
    public final /* synthetic */ C14819t5 mo50805b() {
        return this.f33057b;
    }

    /* renamed from: h */
    public final MessageType mo50807h() {
        MessageType i = mo50808i();
        boolean z = true;
        byte byteValue = ((Byte) i.mo50282q(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = C14892z6.f33192c.mo51009a(i.getClass()).mo50442h(i);
                i.mo50282q(2);
            }
        }
        if (z) {
            return i;
        }
        throw new zzma(i);
    }

    /* renamed from: i */
    public final MessageType mo50808i() {
        if (this.f33059d) {
            return this.f33058c;
        }
        MessageType messagetype = this.f33058c;
        C14892z6.f33192c.mo51009a(messagetype.getClass()).mo50435a(messagetype);
        this.f33059d = true;
        return this.f33058c;
    }

    /* renamed from: j */
    public final void mo50809j() {
        MessageType messagetype = (C14819t5) this.f33058c.mo50282q(4);
        C14892z6.f33192c.mo51009a(messagetype.getClass()).mo50439e(messagetype, this.f33058c);
        this.f33058c = messagetype;
    }

    /* renamed from: k */
    public final BuilderType clone() {
        BuilderType buildertype = (C14782q5) this.f33057b.mo50282q(5);
        buildertype.mo50811l(mo50808i());
        return buildertype;
    }

    /* renamed from: l */
    public final void mo50811l(C14819t5 t5Var) {
        if (this.f33059d) {
            mo50809j();
            this.f33059d = false;
        }
        MessageType messagetype = this.f33058c;
        C14892z6.f33192c.mo51009a(messagetype.getClass()).mo50439e(messagetype, t5Var);
    }

    /* renamed from: m */
    public final void mo50812m(byte[] bArr, int i, C14665h5 h5Var) throws zzkh {
        if (this.f33059d) {
            mo50809j();
            this.f33059d = false;
        }
        try {
            C14892z6.f33192c.mo51009a(this.f33058c.getClass()).mo50437c(this.f33058c, bArr, 0, i, new C14854w4(h5Var));
        } catch (zzkh e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.zzf();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }
}
