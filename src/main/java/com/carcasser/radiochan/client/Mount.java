package com.carcasser.radiochan.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Mount
 */
public class Mount extends JavaScriptObject {

    protected Mount() {}

    public final native Statistic getStatistic() /*-{
        return this["/non-stop"];
    }-*/;

}
