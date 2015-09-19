package com.moac.android.myrssreader.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Simple-XML deserialization of a single RSS feed item.
 *
 * @see <a href="http://simple.sourceforge.net/download/stream/doc/tutorial/tutorial.php">Simple-XML</a>
 */
@Root(strict = false, name = "item")
public class FeedItem {

    @Element
    private String title;

    @Element
    private String description;

    @Element
    private String link;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

}
