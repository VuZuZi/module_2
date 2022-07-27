package _ss4_classAndObject.exersice.stopWatch;

import java.util.Arrays;
import java.util.Date;

public class stopWatch {
       public Date startTime;
       public Date endTime;

       public void statrt(){
           startTime = new Date();
       }
        public void stop(){
            endTime = new Date();
        }

        public long getElapsedTime(){
           return endTime.getTime() - startTime.getTime();
        }

    public static void main(String[] args) {
        int[]arr;
        arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100000);
        }
        stopWatch sw = new stopWatch();
        sw.statrt();
        Arrays.sort(arr);
        sw.stop();
        System.out.println("Elapsedtime " + sw.getElapsedTime() + " ms");
    }
}
