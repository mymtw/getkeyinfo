package com.etsy.android.vespa;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;

public class PositionList implements Serializable {
    public int mChildPosition = -1;
    public int mParentPosition = -1;

    public int getChildPosition() {
        if (this.mParentPosition == -1) {
            return -1;
        }
        return this.mChildPosition;
    }

    public int getParentPosition() {
        int i = this.mParentPosition;
        return i == -1 ? this.mChildPosition : i;
    }

    public void setChildPosition(int i) {
        this.mChildPosition = i;
    }

    public void setParentPosition(int i) {
        this.mParentPosition = i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PositionList:[");
        h.append(getParentPosition());
        h.append(",");
        h.append(getChildPosition());
        h.append("]");
        return h.toString();
    }

    public PositionList withChildPosition(int i) {
        setChildPosition(i);
        return this;
    }

    public PositionList withParentPosition(int i) {
        setParentPosition(i);
        return this;
    }
}
