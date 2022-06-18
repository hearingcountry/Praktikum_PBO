class Helper {
    // Helper function to initialize variable that used in runtime environment
    static void initialize() {

        // Code Here
        // P.S: I think something is wrong with Initialize function

        // Initilaize Admin Instances
        Main.admins[0] = new Admin("joko", "ini_password_joko");
        Main.admins[1] = new Admin("dengklek", "ini_password_dengklek");

        // Initialize Hewan Instances
        Main.ayam = new Ayam();
        Main.domba = new Domba();
        Main.sapi = new Sapi();

        // Initialize Tanaman Instances
        Main.cengkeh = new Cengkeh();
        Main.kepalaSawit = new KepalaSawit();

        // Initialize Medicine instances
        Main.boosterAyam = new Medicine();
        Main.boosterSapi = new Medicine();
        Main.pesticideCengkeh = new Medicine();
        Main.boosterKepalaSawit = new Medicine();

        // Uang Kas 100000000
        Main.cash = 0;
    }

    // Helper function to authentication
    // PS: Doing an iteration to check one by one admin instances
    static boolean authentication(String username, String password) {
        // Code Here
        for (int i = 0; i < Main.admins.length; i++) {
            if (Main.admins[i].isMatch(username, password)) {
                return true;
            }
        }
        return false;
    }

    // PS: You can add new helper function below this comment if you want
}