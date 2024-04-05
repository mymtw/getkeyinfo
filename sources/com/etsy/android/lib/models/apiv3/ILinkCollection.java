package com.etsy.android.lib.models.apiv3;

import java.util.List;

public interface ILinkCollection {
    List<? extends ILink> getLinks();

    int getNumberOfRows();

    String getTitle();
}
