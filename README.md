# java15

* [How to take String input](https://www.javatpoint.com/how-to-take-string-input-in-java)
* [StringTokenizer](https://www.javatpoint.com/string-tokenizer-in-java)
* long i = 123465465446L
* long MX = Long.MAX_VALUE


### Submission specification

	Java Specifications:

	The Java programs submitted must be in a single source code (not .class) file.
	Nevertheless, you can add as many classes as you need in this file.
	All the classes in this file must not be within any package.

	* All programs must begin in a static main method in a Main class.

	* Do not use public classes: even Main must be non public to avoid compile error.

	* Use buffered I/O to avoid time limit exceeded due to excesive flushing.


### LocalDate
    LocalDate date = LocalDate.of(2020, Month.OCTOBER, 28);
    System.out.println(date.getDayOfWeek());    

### Collections
	it help to insert an array to any data structure in collection format

        Integer a[] = {99,1, 2, 3, 4, 5, 6, 1 , 2, 4, 8};

        SortedSet<Integer> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, a);

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, a);
