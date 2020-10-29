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

### compareTo
	
	java dont support operator overloading
	so if we want to sort class like Arrays.sort(class[])
	we need to custom define our own compareTo method

	if obj1.compareTo(obj2) < 0
		obj1 is less than obj2

	if obj1.compareTo(obj2) > 0
		obj1 is greater than obj2

	if obj1.compareTo(obj2) == 0
		both are identical

### recursive permute
    static void recursive_permute(char[] arr, int l, int r)
    {
        if (l==r)
        {
            for (char c: arr)
                System.out.print(c + " ");

            System.out.println();
        }


        else
        {
            for (int i = l; i <= r; i++) {
                char temp;
                // swap(arr , l, i)
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                recursive_permute(arr, l+1, r);
                // swap back to normal
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
            }
        }

    }