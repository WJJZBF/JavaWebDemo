package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-24 下午10:01
 **/
public class MagicPotion extends Item {
    public boolean disposable() {
        return true;
    }

    public static void main(String[] args) {
//        new MagicPotion().effect();
        MagicPotion mp = new MagicPotion();
        mp.getdisposable(mp.disposable());
    }

    @Override
    public void effect() {
        System.out.println("oooo");
    }
}

