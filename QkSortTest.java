
class QkSort {
    int[] a;

    QkSort(int[] a) {
        this.a = a;
    }

    void Sort(int p, int r) {
        if (p<r) {
            int q=Partition(p,r);
            Sort(p,q-1);
            Sort(q+1,r);
        }
    }

    int  Partition(int p, int r) {
        int x = a[r];
        int i = p - 1, temp;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = temp;
        return i+1;
    }
}

public class QkSortTest {
    public static void main(String[] args) {
        int[] a = {145,645,22,48,6,2,46,651,51,21,6,5};
        new QkSort(a).Sort(0,a.length-1);
        for (int b : a) {
            System.out.print(b+" ");
        }
    }
}
