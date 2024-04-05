package com.bumptech.glide;

import com.bumptech.glide.C5961f;
import p006a5.C0036a;

/* renamed from: com.bumptech.glide.f */
public abstract class C5961f<CHILD extends C5961f<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    public C0036a.C0037a f12770b = C0036a.f90a;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C5961f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
