public class Main {
    public static void main(String[] args) {
        ProgrammingBook pr1 = new ProgrammingBook("Java", "Frame-1", 1000);
        ProgrammingBook pr2 = new ProgrammingBook("Java", "Frame-2", 2000);
        ProgrammingBook pr3 = new ProgrammingBook("C#", "Frame-3", 3000);
        FictionBook fb1 = new FictionBook("Vien Tuong 1", 2000);
        FictionBook fb2 = new FictionBook("Vien Tuong 2", 3000);
        FictionBook fb3 = new FictionBook("Vien Tuong 1", 100);

        Book[] books = new Book[6];
        books[0] = pr1;
        books[1] = pr2;
        books[2] = pr3;
        books[3] = fb1;
        books[4] = fb2;
        books[5] = fb3;

        //Tinh tong tien
        double totalPrice = 0;
        for (int i = 0; i < books.length; i++) {
            totalPrice += books[i].getPrice();
        }
        System.out.println("Tong tien 6 cuon: " + totalPrice);

        //Dem so sach Programing lang Java
        int countJavaProgrammingBook = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                ProgrammingBook pb = (ProgrammingBook) books[i];
                if (pb.getLanguage().equals("Java")) {
                    countJavaProgrammingBook++;
                }
            }
        }
        System.out.println("So sach Programming co ngon ngu Java la " + countJavaProgrammingBook);

        //Dem so sach Fiction Category VienTuong 1
        int countFictionBook = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook fb = (FictionBook) books[i];
                if (fb.getCategory().equals("Vien Tuong 1")) {
                    countFictionBook++;
                }
            }
        }
        System.out.println("So sach Fiction co Category la Vien Tuong 1 la " + countFictionBook);

        //Dem so sach fiction gia < 100
        int countFictionPriceU100 = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook fb = (FictionBook) books[i];
                if (fb.getPrice() < 100) {
                    countFictionPriceU100++;
                }
            }
        }
        System.out.println("So sach Fiction co gia < 100 la " + countFictionPriceU100);
    }
}