

public class Admin {

    private static volatile Admin admin;

    private Admin(){

    }
    public static Admin getPatient(){

        if (admin == null) {
            synchronized (Admin.class) {
                if (admin == null) {

                    admin = new Admin();
                }
            }
        }
        return admin;
    }

}
