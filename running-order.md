# Course Running Order Notes

* Show existing classes
* Need to define instance of Retrofit interface: Converter, Logging, Error Handling
* Create Application subclass and `AndroidManifest.xml` name
* Create methods, field, getter in `MyRssReaderApplication.java`
* Create `RssFeedActivity.loadFeed()` as empty callback with logging
* Add `RecyclerView` to XML
* Call `findViewById` to get as a field
* Set the `RecyclerView`'s `LayoutManager`
* Create `BasicAdapter` implementation and Card layout
* In data callback, set `RecyclerView` adapter

DEMO and BREAK

* Add `OnClickListener` to `BasicAdapter`
* Add `OnClickListener` implementation
* Add `launch()` to open new `ArticleActivity`