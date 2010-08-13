Building ChemWriter 2: JavaScript All the Way Down

[ChemWriter&trade;](http://chemwriter.com) is the chemical structure editor for Web applications. It was designed from the ground up with the strengths and limitations of the Web in mind.

Times change and at [Metamolecular](http://metamolecular.com) we've been busily creating the next major release of ChemWriter. This is no mere revision, but a complete rewrite of ChemWriter - in [JavaScript](http://depth-first.com/tags/javascript).

This article, the first in a series, discusses ChemWriter 2. Specifically, it describes why we decided to offer the ultimate in Web integration to ChemWriter customers by implementing the next major release of our structure editor in JavaScript.

####Built for the Web

When I started writing what would become ChemWriter back in April 2007, I had some [very specific ideas about how this structure editor should work](http://depth-first.com/articles/2007/04/23/a-chemical-structure-editor-for-the-web-fireflys-two-audiences). One priority was that ChemWriter must respect the Web as a unique software platform.

One example of ChemWriter's Web friendliness: its deployment footprint is just over 100K, enabling fast page loading. As a result, you can [put ChemWriter right on your site's front page](http://emolecules.com), without driving your users away with a slow page load.

Another example of how ChemWriter embraces the Web: no scary security dialogs. Any user would have the right (and in many cases the obligation) to avoid any site that shows a dialog indicating that their system is about to be exposed to a security risk. [Other companies may not see it this way](http://www.chemaxon.com/products/marvin/marvinsketch/), but we do. Security matters a lot on the Web, and no user should have to sacrifice this precious commodity just to use a structure editor.

####Goodbye Java Applets

ChemWriter is currently offered as a Java applet, and nearly every other structure editor that can be used within a browser is based on the same technology. I would maintain that applets are still useful, but they come with some significant downsides. These tradeoffs work against ChemWriter's purpose, which is to offer the very best chemical structure user experience for Web applications. The four most important limitations of applets in this context are:

1.  **Plugin Dependency.** Every user must have a functioning, properly-configured version of the [Java plugin](http://www.java.com/en/) to draw structures. In some cases, this is not a simple matter. Even if the operating system supports it, most chemists are uncomfortable installing and configuring any software. Even if a chemist is willing and able to install/configure Java, their IT department may not let them. Even if neither consideration is a problem, things can still go wrong - resulting in additional support costs.

2.  **Future Support.**  Sun Microsystems has been an extremely poor steward of its Java applet technology over the last decade, leaving developers on their own to work around numerous problems. Oracle, Sun's new owner, has said little about the future of applets, but given the low regard applets have among Web developers after years of neglect, I would not be at all surprised to find the entire technology discontinued by the database giant in the near future.

3.  **LiveConnect Doesn't Work Reliably.** [LiveConnect](http://en.wikipedia.org/wiki/LiveConnect) allows objects created in a Java applet to be used within a browser and vice versa - in theory. In practice, support across browsers has been too patchy to do anything significant with this otherwise promising technology. The newest releases of the Java plugin address this issue, but it's too little, too late. The upshot: applets live in their own self-contained world within the browser, limiting the amount of control developers have in using them as first-class citizens of the rest of the page.

4.  **Tablets: The Future of Laboratory Informatics.** iPad forced many to re-consider the tablet as a viable computing platform. It seems very likely that the laboratory information systems of the future will be based on computers with a tablet form factor and operating system. Neither iPad, nor its closest competitor, Android, support applets, nor are they likely to ever support them. The success of the iPad, a platform that supports neither Java applets nor Flash, raises serious questions about the need for browser plugins going forward.

In addition to these applet drawbacks, the browser itself has advanced in sophistication by leaps and bounds over the last five years:

1.  **JavaScript Now Works Everywhere.** JavaScript is a serious (if widely [misunderstood](http://depth-first.com/articles/2009/09/11/tech-fridays-javascript-the-good-parts)) programming language. It offers the most widely-available runtime environment in the world and the de facto language of the Web. Four major browsers - IE, Firefox, Safari, and Chrome - have made JavaScript performance a top priority [with amazing results](http://depth-first.com/articles/2008/09/05/chrome-and-a-v8-javascript-takes-a-giant-leap-forward). Most of JavaScript's perceived problems come from inconsistently implemented ancillary technologies, such as the DOM and event handling. These differences are rendered inconsequential with any of a number of libraries such as [jQuery](http://jquery.com/) or [Prototype](http://www.prototypejs.org/). I have been particularly impressed with [Google Closure](http://code.google.com/closure/), which future articles will discuss in more detail. [JavaScript has not been widely-used in the past for Cheminformatics](http://depth-first.com/articles/2008/07/15/javascript-for-cheminformatics), but this seems likely to change significantly in the near future.

2.  **Vector Graphics Now Work on All Browsers.** One of the Web's best-kept secrets is [Internet Explorer's longtime support for vector graphics in the form of VML](http://depth-first.com/articles/2008/06/06/the-other-vector-graphics-markup-language). Taken together with the support by standards-compliant browsers for SVG, it's obvious that interactive graphics of the kind needed to create a structure editor are well within reach on every modern browser. Even better, [the next version of Internet Explorer will directly support high performance SVG](http://blogs.msdn.com/b/ie/archive/2010/03/18/svg-in-ie9-roadmap.aspx). A [number of desktop-like user interface elements for the visualization and manipulation of complex data types in chemistry](http://depth-first.com/articles/2008/07/17/javascript-for-cheminformatics-an-introduction-to-webspex-a-spectroscopy-tool-for-the-internet) are not just feasible, but compelling.

3.  **HTML 5.** JavaScript and SVG are two key components of a larger technological context - [HTML&nbsp;5](http://depth-first.com/articles/2010/06/18/html-5-mobile-devices-and-chemistry). With HTML 5, differences between browser-based software and thick clients will become ever more difficult to perceive. HTML 5 eliminates many of the most compelling arguments in favor of using browser plugins - and building thick clients.

####Bottom Line: JavaScript Offers a Better User Experience

No switch in base technology should be undertaken without a compelling case for it. In switching ChemWriter from Java to JavaScript, the choice was easy: JavaScript now offers the potential for a superior user experience with little or no performance penalty. Future articles will discuss how we've done in making this vision reality.