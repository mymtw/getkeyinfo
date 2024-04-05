package com.paypal.pyplcheckout.navigation;

import kotlin.jvm.internal.C19383o;

public final class ContainerViewTypeDescriptor {
    private final ViewType containerViewType;

    public enum ViewType {
        HEADER(1),
        BODY(2),
        FOOTER(3);

        private ViewType(int i) {
        }
    }

    public ContainerViewTypeDescriptor(ViewType viewType) {
        C19383o.m32797g(viewType, "containerViewType");
        this.containerViewType = viewType;
    }

    public final ViewType getContainerViewType() {
        return this.containerViewType;
    }
}
