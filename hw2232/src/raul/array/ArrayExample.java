package raul.array;

public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("*** Array ***");
        Array<Integer> data = new ArrayImpl<>();
        for(int i=0; i<100000; i++) {               // тут задается n - количество элементов в массиве i<n
            data.add((int)(100.0*Math.random()));
        }


//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i));
//        }

//        System.out.println("After bubble sort");
//        long startBubble = System.currentTimeMillis();
//        data.sortBubble();
//        System.out.println("bubble sort finished");
//        long finishBubble = System.currentTimeMillis();
//        long timeConsumedMillisBubble = finishBubble - startBubble;
//        System.out.println(timeConsumedMillisBubble);                   //3 место по скорости! опыт 1: 66505мс для 100000 элементов; опыт 2: 66724мс для 100000 элементов
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i));
//        }

        System.out.println("After select sort");
        long startSelect = System.currentTimeMillis();
        data.sortSelect();
        System.out.println("select sort finished");
        long finishSelect = System.currentTimeMillis();
        long timeConsumedMillisSelect = finishSelect - startSelect;
        System.out.println(timeConsumedMillisSelect);                   //1 место по скорости! опыт 1: 9490 мс для 100000 элементов; опыт 2: 9839  мс для 100000 элементов
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i));
//        }

//        System.out.println("After insert sort");
//        long startInsert = System.currentTimeMillis();
//        data.sortInsert();
//        System.out.println("insert sort finished");
//        long finishInsert = System.currentTimeMillis();
//        long timeConsumedMillisInsert = finishInsert - startInsert;
//        System.out.println(timeConsumedMillisInsert);                     //2 место по скорости! опыт 1: 20832  мс для 100000 элементов; опыт 2: 20741  мс для 100000 элементов
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i));
//        }
    }
}