package homework_28.task_1;

import lists.MyArrayList;
import lists.MyList;

public class RectangleUtils {
//    public static void removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
//        for (int i = 0; i < rectangles.size(); i++) {
//            if(rectangles.get(i).equals(rectangleToRemove)){
//                rectangles.remove(i);
//                i--;
//            }
//        }
//    }
    public static void removeDuplicates2(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        while(rectangles.contains(rectangleToRemove)){
            rectangles.remove(rectangleToRemove);
        }
    }
    public static MyList<Rectangle> removeOnly(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        MyList<Rectangle> res = new MyArrayList<>();

        for (int i = 0; i < rectangles.size(); i++) {
            if(!res.contains(rectangles.get(i))){
                res.add(rectangles.get(i));
            }
        }
        return res;
    }

}
