import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Nickolas on 17.01.2018.
 */
public class TestMain {
    public static void main(String[] args) {

        //double[] d = new double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        /*ArrayList<HashSet<Double>> listOfSets = new ArrayList<>();
        double d = 1.0;
        for(int i = 0; i < 3; i++ ){
            HashSet<Double> hs = new HashSet<>();
            for(int n = 1; n < 10; n++){
                hs.add((n * 1.0) + d);
            }
            for(int n = 1; n < 10; n++){
                hs.add((n * 1.0) + d + 50);
            }
            System.out.println(new TreeSet(hs));
            listOfSets.add(hs);
            d++;
        }*/

        /*System.out.println(Intersection.nearestNumber(listOfSets, 20));

        System.out.println(new TreeSet<>(Intersection.searchIntersection(listOfSets)));

        ArrayList<String> listOfIntervals = Intersection.getIntervals(new TreeSet<>(Intersection.searchIntersection(listOfSets)));
        for(String s : listOfIntervals){
            System.out.println(s);
        }*/

        Interval i1 = new Interval(-1/0.0, false, -10, true);
        Interval i2 = new Interval(0, true, 10, true);
        Interval i3 = new Interval(20, true, 1/0.0, true);
        Interval i4 = new Interval(-1/0.0, false, 1/0.0, false);
        Interval i5 = new Interval(-5, true, 5, true);
        Interval i6 = new Interval(8, true, 15, true);
        Interval i7 = new Interval(17, true, 17, true);

        ArrayList<Interval> interArr1 = new ArrayList<>();
        interArr1.add(i1);
        interArr1.add(i2);
        interArr1.add(i3);
        ArrayList<Interval> interArr2 = new ArrayList<>();
        interArr2.add(i4);
        ArrayList<Interval> interArr3 = new ArrayList<>();
        interArr3.add(i5);
        interArr3.add(i6);
        interArr3.add(i7);



        ArrayList<ArrayList<Interval>> listlist = new ArrayList<>();
        listlist.add(interArr1);
        listlist.add(interArr2);
        listlist.add(interArr3);

        ArrayList<Interval> interArr = Intersection.searchIntersection(listlist);

        for(Interval i : interArr){
            System.out.println(i);
        }



        System.out.println(Intersection.nearestNumber(listlist, -1/0.0));
        System.out.println(Intersection.nearestNumber(listlist, 3));
        System.out.println(Intersection.nearestNumber(listlist, 6));
        System.out.println(Intersection.nearestNumber(listlist, 7));
        System.out.println(Intersection.nearestNumber(listlist, 9));
        System.out.println(Intersection.nearestNumber(listlist, 1/0.0));




        /*System.out.println(Intersection.intervalIntersection(i1, i2));
        System.out.println(Intersection.intervalIntersection(i1, i3));
        System.out.println(Intersection.intervalIntersection(i1, i4));
        System.out.println(Intersection.intervalIntersection(i1, i5));
        System.out.println(Intersection.intervalIntersection(i1, i6));
*/
    }

}
