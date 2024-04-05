package com.etsy.android.vespa;

import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import java.util.List;
import p415of.C13186o;

public interface IVespaListSectionHeader extends C13186o {

    public enum Style {
        EXTRA_PADDING
    }

    IServerDrivenAction getAction() {
        return null;
    }

    IPageLink getPageLink() {
        return null;
    }

    String getSubtitle();

    String getTitle();

    List<Style> getViewStyles() {
        return null;
    }
}
