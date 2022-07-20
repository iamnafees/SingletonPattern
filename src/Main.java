public class Main {
    public static void main(String[] args) {



        Admin admin = Admin.getPatient();
        System.out.println(admin);

        Admin admin1 = Admin.getPatient();
        System.out.println(admin1);
    }
}