# string-calculator

This is [Neil Kidd](https://github.com/neilkidd) and my attempt at the [String Calculator kata](http://osherove.com/tdd-kata-1/) at the [Agile Staffordshire January session](http://www.agilestaffordshire.org/agile/january-2014-kata-with-constraints/) using Clojure. 

We wrote it using basic [Clojure](http://clojure.org), edited with [Lighttable](http://www.lighttable.com) and continuous testing enabled through [lein-expectations](https://github.com/gar3thjon3s/lein-expectations) and the [expectation](https://github.com/jaycfields/expectations) framework. 

During the 1 1/2 hour session at Agile Staffs, we struggled with some basic syntax and Lighttable REPL evaluation not picking up clojure.core functions. We did however, manage to get to started to validate against negative numbers. 

Today (the following Saturday), I spent another 40 minutes completing validation, filtering numbers under 1000 and extra testing scenarios. 

## Usage

Provided you have [Leiningen](http://leiningen.org) installed, then you need to simply clone this repo, and within your clone issue:

    lein autoexpect :growl
    

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
