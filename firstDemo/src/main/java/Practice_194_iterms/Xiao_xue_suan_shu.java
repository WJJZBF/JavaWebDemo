package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午11:08
 **/
public class Xiao_xue_suan_shu {
    public static void main(String[] args) {
        Xiao_xue_suan_shu st = new Xiao_xue_suan_shu();
        st.st_func();

    }

    public void fun2() {
        int size = 20;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    for (int l = 0; l < size; l++) {
                        if (i + j == 8 && i + k == 14 && k - l == 6 && l + j == 10) {
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(k);
                            System.out.println(l);
                        }
                    }
                }

            }
        }
    }

    public void st_func() {
        int size = 15;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i + j != 8) {
                    continue;
                }
                for (int k = 0; k <= size; k++) {
                    if (i + k != 14) {
                        continue;
                    }
                    for (int m = 0; m <= size; m++) {
                        if (k - m != 6) {
                            continue;
                        }
                        if (j + m != 10) {
                            continue;
                        }
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                        System.out.println(m);
                    }
                }
            }
        }
    }
}
