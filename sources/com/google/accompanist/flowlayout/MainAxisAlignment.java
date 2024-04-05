package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.C0718d;

public enum MainAxisAlignment {
    Center(C0718d.f1480e),
    Start(C0718d.f1478c),
    End(C0718d.f1479d),
    SpaceEvenly(C0718d.f1481f),
    SpaceBetween(C0718d.f1482g),
    SpaceAround(C0718d.f1483h);
    
    private final C0718d.C0729k arrangement;

    private MainAxisAlignment(C0718d.C0729k kVar) {
        this.arrangement = kVar;
    }

    public final C0718d.C0729k getArrangement$flowlayout_release() {
        return this.arrangement;
    }
}
