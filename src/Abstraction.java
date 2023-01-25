
    interface olaCustomer{
        void bookCap();
        void findRide();
        void rateDriver();
        void scheduleCab();
        void cancelCab();
        void addMoneytoWallet();
        void raiseTicket();
        void signuUp();
        void signIn();
    }
    interface  olaDriver{
        void acceptBooking();
        void getCustomerLocation();
        void setAvaiableStatus();
        void getMyComission();
        void raiseMoneyTransferRequest();
        void callCustomer();
        void setUpYourVehicle();
        void customerFeedback();
    }
    interface olaOwner{
        void getDriverRecords();
        void getReportByDriverID();
        void getReportByRegion();
        void getTotalRevenue();
        void getCustomersFeedback();
        void addDriver();
        void removeDriver();
        void changeDriverStatus();
    }
    public class Abstraction implements olaOwner,olaDriver,olaCustomer {
        public static void main(String[] args){
            olaCustomer cust = new Abstraction();
            olaDriver prakash = new Abstraction();
            olaOwner   Raju = new Abstraction();
        }

        @Override
        public void bookCap() {

        }

        @Override
        public void findRide() {

        }

        @Override
        public void rateDriver() {

        }

        @Override
        public void scheduleCab() {

        }

        @Override
        public void cancelCab() {

        }

        @Override
        public void addMoneytoWallet() {

        }

        @Override
        public void raiseTicket() {

        }

        @Override
        public void signuUp() {

        }

        @Override
        public void signIn() {

        }

        @Override
        public void acceptBooking() {

        }

        @Override
        public void getCustomerLocation() {

        }

        @Override
        public void setAvaiableStatus() {

        }

        @Override
        public void getMyComission() {

        }

        @Override
        public void raiseMoneyTransferRequest() {

        }

        @Override
        public void callCustomer() {

        }

        @Override
        public void setUpYourVehicle() {

        }

        @Override
        public void customerFeedback() {

        }

        @Override
        public void getDriverRecords() {

        }

        @Override
        public void getReportByDriverID() {

        }

        @Override
        public void getReportByRegion() {

        }

        @Override
        public void getTotalRevenue() {

        }

        @Override
        public void getCustomersFeedback() {

        }

        @Override
        public void addDriver() {

        }

        @Override
        public void removeDriver() {

        }

        @Override
        public void changeDriverStatus() {

        }
    }
