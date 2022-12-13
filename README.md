# UseGPU.cljs (EXPERIMENTAL, DO NOT USE!)

> NOTE that this project is totally experimental and doesn't work AT ALL yet.
> All of this documentation and code's up as a placeholder as I explore.
>
> To get this working, we'll need to get a Webpack build up by following
> https://usegpu.live/docs/guides-getting-started. Here's how to get this
> working with Shadow:
> https://code.thheller.com/blog/shadow-cljs/2020/05/08/how-about-webpack-now.html#option-2-js-provider-external,
> push experimental

[![Build Status](https://github.com/mentat-collective/usegpu.cljs/actions/workflows/kondo.yml/badge.svg?branch=main)](https://github.com/mentat-collective/usegpu.cljs/actions/workflows/kondo.yml)
[![License](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/mentat-collective/usegpu.cljs/blob/main/LICENSE)
[![cljdoc badge](https://cljdoc.org/badge/org.mentat/usegpu.cljs)](https://cljdoc.org/d/org.mentat/usegpu.cljs/CURRENT)
[![Clojars Project](https://img.shields.io/clojars/v/org.mentat/usegpu.cljs.svg)](https://clojars.org/org.mentat/usegpu.cljs)

## Quickstart

Install `usegpu.cljs` into your Clojurescript project using the instructions
at its Clojars page:

[![Clojars Project](https://img.shields.io/clojars/v/org.mentat/usegpu.cljs.svg)](https://clojars.org/org.mentat/usegpu.cljs)

Require `usegpu.core` in your namespace:

```clj
(ns my-app
   (:require [usegpu.core :as gpu]))
```

See the project's [interactive documentation
notebook](https://usegpu.mentat.org) for more guides and examples.

## Interactive Documentation via Clerk

The project's [interactive documentation](https://usegpu.mentat.org) was
generated using Nextjournal's [Clerk](https://github.com/nextjournal/clerk). If
you'd like to edit or play with the documentation, you'll need to install

- [node.js](https://nodejs.org/en/)
- The [clojure command line tool](https://clojure.org/guides/install_clojure)
- [Babashka](https://github.com/babashka/babashka#installation)

Once this is done, run this command in one terminal window to build and serve the custom JS required by the notebook:

```
bb dev-notebook
```

In another terminal window, run

```
bb start-clerk
```

This should open a browser window to `http://localhost:7777` with the contents
of the documentation notebook. Any edits you make to `dev/usegpu/notebook.clj`
will be picked up and displayed in the browser on save.

## Thanks and Support

To support this work and my other open source projects, consider sponsoring me
via my [GitHub Sponsors page](https://github.com/sponsors/sritchie). Thank you
to my current sponsors!

I'm grateful to [Clojurists Together](https://www.clojuriststogether.org/) for
financial support during this library's creation. Please consider [becoming a
member](https://www.clojuriststogether.org/developers/) to support this work and
projects like it.

## License

Copyright © 2022 Sam Ritchie.

Distributed under the [MIT License](LICENSE). See [LICENSE](LICENSE).

[CLJS]: https://clojurescript.org/
[USEGPU]: https://usegpu.live/
[REACT]: https://reactjs.org/
[REAGENT]: https://reagent-project.github.io/
