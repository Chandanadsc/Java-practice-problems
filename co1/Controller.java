package co1;



public class Controller {
    private Connection conn;
    private Sales sales;
    private Accounting account;
    private Management management;

    public Controller() {
        sales = new Sales();
        account = new Accounting();
        management = new Management();
    }

    public void setAccountingConnection() {
        conn = account;
    }

    public void setSalesConnection() {
        conn = sales;
    }

    public void setManagementConnection() {
        conn = management;
    }

    public void openConnection() {
        conn.open();
    }

    public void closeConnection() {
        conn.close();
    }

    public void logConnection() {
        conn.log();
    }

    
    public void updateSalesConnection() {
        if (conn instanceof Sales) {
            ((Sales) conn).update();
        } else {
            System.out.println("Cannot update. Current connection is not Sales.");
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();

      
        controller.setAccountingConnection();
        controller.openConnection();
        controller.logConnection();
        controller.closeConnection();

        controller.setSalesConnection();
        controller.openConnection();
        controller.updateSalesConnection(); // Only available for Sales
        controller.closeConnection();

        controller.setManagementConnection();
        controller.openConnection();
        controller.logConnection();
        controller.closeConnection();
    }
}

