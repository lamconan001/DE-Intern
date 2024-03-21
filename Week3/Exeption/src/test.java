public class test {
    public static void main(String args[]) {
        try {
            try {
                System.out.println("Thuc hien phep chia");
                int b = 39 / 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hello");
                e.printStackTrace();

            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

            System.out.println("khoi lenh khac");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("tiep tuc chuong trinh..");
    }
}