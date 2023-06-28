public class Main {
    public static int WorkLeft(int work, int f1, int d1, int f2, int d2) {
        int work_done = (f1 * d1) + (f2 * d2);
        int work_left = work - work_done;
        return work_left;
    }

    public static void main(String[] args) {
        int work = 50;
        int f1 = 5;
        int d1 = 2;
        int f2 = 7;
        int d2 = 3;

        int result = WorkLeft(work, f1, d1, f2, d2);
        System.out.println(result);
    }
}
