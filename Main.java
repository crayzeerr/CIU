public class Main {
    public static void main(String[] args) throws Exception {
        Vector vector = new Vector(1); 

        for(int i = 0; i < 16; i++) {
            vector.push(i);
        }

        print(vector);
        System.out.println(vector.size());



        vector.insert(3, 2);
        print(vector);
        System.out.println(vector.size());



        vector.push(20025190);
        print(vector);
        System.out.println(vector.size());
        


        vector.insert(2, 4);
        print(vector);
        System.out.println(vector.size());



        vector.insert(0, -1);
        print(vector);
        System.out.println(vector.size());

        vector.prepend(100);
        print(vector);
        System.out.println(vector.size());


        vector.pop();
        print(vector);
        System.out.println(vector.size());

        System.out.println("Capacity: " + vector.capacity());
        

    }

    public static void print(Vector vector) throws Exception {
        System.out.println();
        System.out.print("[");
        for(int i = 0; i < vector.size(); i++) {
            if(i != vector.size() - 1) {
                System.out.print(vector.at(i) + ", ");
            }
            else {
                System.out.print(vector.at(i));
            }
        }
        System.out.println("]");
    }
}
