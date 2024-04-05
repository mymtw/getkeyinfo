package com.google.common.hash;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Funnels$SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
    private final Funnel<E> elementFunnel;

    public Funnels$SequentialFunnel(Funnel<E> funnel) {
        funnel.getClass();
        this.elementFunnel = funnel;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Funnels$SequentialFunnel) {
            return this.elementFunnel.equals(((Funnels$SequentialFunnel) obj).elementFunnel);
        }
        return false;
    }

    public int hashCode() {
        return Funnels$SequentialFunnel.class.hashCode() ^ this.elementFunnel.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Funnels.sequentialFunnel(");
        h.append(this.elementFunnel);
        h.append(")");
        return h.toString();
    }

    public void funnel(Iterable<? extends E> iterable, C16276j jVar) {
        for (Object funnel : iterable) {
            this.elementFunnel.funnel(funnel, jVar);
        }
    }
}
