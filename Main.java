public class Main {
    public static void main(String[] args) throws Exception {
        Vector vector = new Vector(1); 

        for(int i = 0; i < 16; i++) {
            vector.push(i);
        }


        for(int i = 0; i < 13; i++) {
            vector.pop();
            print(vector);
        }

        System.out.println(vector.capacity());

        for(int i = 0; i < 10; i++) {
            vector.push(i);
            print(vector);
        }

        
        System.out.println(vector.capacity());


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
