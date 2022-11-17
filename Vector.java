class Vector {
    private Integer[] arr;
    private int pow = 4;
    private int arrSize = 16;

    public Vector(int size) {
        /**
         * initalizes an array with a length of 2^n where 2^n >= input size
         * all elements are null
         * array will never be initialized with under 16 length
         */
        while(Math.pow(2, pow) < size) {
            pow = pow + 1;
        }

        arrSize = (int) Math.pow(2, pow); 

        arr = new Integer[arrSize];
    }

    private void upsize() {
        pow += 1;
        Integer[] newArr = new Integer[(int) Math.pow(2, pow)];
        for(int i = 0; i < arrSize; i++) {
            newArr[i] = arr[i];
        }
        arrSize = (int) Math.pow(2, pow);
        arr = newArr;
    }

    public int size() {

        /**
         * @return count of non null elements
         */

        int count = 0;

        for(int i = 0; i < arrSize; i++) {
            if(arr[i] != null) {
                count++;
            }
        }

        return count;
    }

    public int capacity() {
        /**
         * @return length of the array
         */
        return arrSize;
    }

    public boolean isEmpty() {
        /**
         * @return true if size of non-null elements in arr is equal to 0
         */

        return size() == 0 ? true : false;
    }

    public int at(int index) throws Exception {
        /**
         * @throws exception if index is out of bounds
         * @return value at index input
         */

        if(index < 0 || index >= arrSize) {
            throw new Exception("Index out of bounds");
        } else {
            return arr[index];
        }
    }

    public void push(int item) {
        /**
         * if non-null elements is equal to capacity, increment pow and make new array of size 2^pow (e.g. 16 -> 32, 32 -> 64, 64 -> 128, etc.)
         * copy over all elements from arr to newArr
         * assign arr to newArr
         * 
         * iterate backwards through arr
         * if item to the left of arr[i] is not null and arr[i] is null, assign arr[i] to item
         * if we get to i - 1 = 0, arr must be empty so we add it to the beginning
         */

        if(size() == capacity()) {
            pow += 1;
            Integer[] newArr = new Integer[(int) Math.pow(2, pow)];
            for(int i = 0; i < arrSize; i++) {
                newArr[i] = arr[i];
            }
            arrSize = (int) Math.pow(2, pow);
            arr = newArr;
        }

        // for(int i = arrSize - 1; i > 0; i--) {
        //     if(arr[i - 1] != null && arr[i] == null) {
        //         arr[i] = item;
        //         break;
        //     } else if (i - 1 == 0) {
        //         arr[i - 1] = item;
        //         break;
        //     }
        // }

        /**
         * THE COMMENTED OUT CODE ABOVE AND THE CODE BELOW THIS ONE PERFORM THE SAME THING, PUSHING AN ITEM ONTO THE END OF THE VECTOR
         */

        arr[size()] = item;



    }

    public void insert(int index, int item) {
        if(size() >= capacity() - 1) {
            upsize();
        }
        
        int end = arr[size() - 1];

        for(int i = capacity() - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        if(size() == capacity()) {
            upsize();
        }

        arr[size() - 1] = end;

        
        arr[index] = item;

    }
    
    public void prepend(int item) {
        insert(0, item);
    }
    
    public int pop() {
        int popped = arr[size() - 1];
        arr[size() - 1] = null;
        return popped;
    }


}