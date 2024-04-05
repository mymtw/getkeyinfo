package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.C14479b0;
import com.google.android.gms.internal.icing.C14491e0;

/* renamed from: com.google.android.gms.internal.icing.b0 */
public class C14479b0<MessageType extends C14491e0<MessageType, BuilderType>, BuilderType extends C14479b0<MessageType, BuilderType>> extends C14502h<MessageType, BuilderType> {

    /* renamed from: b */
    public final MessageType f32616b;

    /* renamed from: c */
    public MessageType f32617c;

    /* renamed from: d */
    public boolean f32618d = false;

    public C14479b0(MessageType messagetype) {
        this.f32616b = messagetype;
        this.f32617c = (C14491e0) messagetype.mo49756e(4);
    }

    /* renamed from: a */
    public static final void m22934a(MessageType messagetype, MessageType messagetype2) {
        C14512j1.f32651c.mo49820a(messagetype.getClass()).mo49766e(messagetype, messagetype2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14491e0 mo49737b() {
        return this.f32616b;
    }

    public final Object clone() throws CloneNotSupportedException {
        C14479b0 b0Var = (C14479b0) this.f32616b.mo49756e(5);
        C14491e0 f = mo49740f();
        if (b0Var.f32618d) {
            b0Var.mo49739d();
            b0Var.f32618d = false;
        }
        m22934a(b0Var.f32617c, f);
        return b0Var;
    }

    /* renamed from: d */
    public final void mo49739d() {
        MessageType messagetype = (C14491e0) this.f32617c.mo49756e(4);
        m22934a(messagetype, this.f32617c);
        this.f32617c = messagetype;
    }

    /* renamed from: f */
    public final MessageType mo49740f() {
        if (this.f32618d) {
            return this.f32617c;
        }
        MessageType messagetype = this.f32617c;
        C14512j1.f32651c.mo49820a(messagetype.getClass()).mo49767f(messagetype);
        this.f32618d = true;
        return this.f32617c;
    }
}
