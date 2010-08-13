Linked Chemical Data in Chempedia

####The One Database Model for Chemical Information

During my talk, an audience member asked a question about whether Chempedia could be used to associate URLs with substances. My response was that this subject would be covered in the talk (Slide 38), but time constraints didn't permit me to go into detail.

There is no support currently for URL-Substance associations, but there will be. In fact, it's hard to imagine Chempedia being very useful at all without it.

It's technically feasible to turn Chempedia into a data warehouse for just about any kind of chemical information. In other words, Chempedia would actually contain data such as melting points, NMR spectra, X-Ray diffraction data, videos, and more. Let's call this idea the "One Database Model" for chemical information.

The One Database Model has the advantage that chemists would only need to access one website to in theory get any piece of data associated with a substance. Ditto for depositors seeking a place to store their information.

Antony Williams' talk at this session on [ChemSpider](http://chemspider.com) made it clear that the RSC's service has pursued and will actively pursue the One Database Model. I sincerely wish them luck and salute the ChemSpider team for what it's doing to break down chemical information barriers.

But my gut tells me the One Database Model may not be the best fit in the long term.

####The Linked Data Model

Chempedia will not be pursuing the One Database Model, but rather the [Linked Data](http://linkeddata.org/) Model.

Instead of storing melting points, spectra, gas chromatograms, differential scanning calorimetry curves, cyclic voltammograms, or any of the myriad forms of data chemists in numerous specialties work with, Chempedia will only store four things in each substance record:

1.  A Global Substance Identifier
2.  A Machine-readable substance representation
3.  Synonyms and synonym metadata
4.  URLs and URL metadata

Chempedia currently stores (1) - (3). What's missing is (4).

Each highly specialized form of chemical data has very little in common with the other. For example, each has its own concepts of error analysis, presentation, and interpretation. Each form of data may require its own specialized database system, user interface, and community of experts to create and maintain it. Each may have different sets of intellectual property rights that come into play.

Do you visit YouTube to get photos? Do you visit Flickr to get videos?

Of course not, but why? Each form of data requires a platform specific to its needs. Each media type attracts its own [user community](http://depth-first.com/articles/2008/05/07/1908-and-all-that-the-long-tail-and-chemistry). I believe that the same factors will apply in chemical data.

####What This Means to You

Let's say you maintain a collection of substance-specific chemical data - how should you prepare to interface your system with Chempedia?

To take advantage of the Chempdia Linked Data Model, each unique piece of data in your system needs to have a URL. For example, if you maintain a spectroscopy database, your spectra each require a canonical landing page where every bit of information about the spectrum can be discovered. If you maintain a collection of melting points, then each melting point determination should have a landing page through which everything relevant to that measurement can be immediately found, or traced through another URL.

If you've created, or want to create, a collection of substance-associated chemical data that can be easily located and linked to other forms of data, I encourage you to get in touch to discuss how we can make this happen.