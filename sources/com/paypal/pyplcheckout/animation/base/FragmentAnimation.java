package com.paypal.pyplcheckout.animation.base;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FragmentAnimation {
    private Type animation;

    public enum Type {
        SLIDE_UP_DOWN,
        SLIDE_RIGHT_LEFT,
        SLIDE_LEFT_RIGHT
    }

    public FragmentAnimation() {
        this((Type) null, 1, (DefaultConstructorMarker) null);
    }

    public FragmentAnimation(Type type) {
        C19383o.m32797g(type, ResponseConstants.ANIMATION);
        this.animation = type;
    }

    public final Type getAnimation() {
        return this.animation;
    }

    public final void setAnimation(Type type) {
        C19383o.m32797g(type, "<set-?>");
        this.animation = type;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentAnimation(Type type, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Type.SLIDE_UP_DOWN : type);
    }
}
