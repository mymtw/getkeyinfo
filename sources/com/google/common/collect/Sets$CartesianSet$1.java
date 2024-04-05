package com.google.common.collect;

import java.util.List;

final class Sets$CartesianSet$1 extends ImmutableList<List<Object>> {
    public final /* synthetic */ ImmutableList val$axes;

    public Sets$CartesianSet$1(ImmutableList immutableList) {
        this.val$axes = immutableList;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.val$axes.size();
    }

    public List<Object> get(int i) {
        return ((ImmutableSet) this.val$axes.get(i)).asList();
    }
}
