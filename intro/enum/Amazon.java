public class Amazon {

    private AmazonStatus status;

    public enum AmazonStatus {
        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },

        INTRANSIT(2){

            @Override
            public boolean isTransit() {
                return true;
            }
        },

        DELIVERED(0){

            @Override
            public boolean isDelivered() {
                return true;
            }};

        private int timeToDelivery;

        public boolean isOrdered() {
            return false;
        }

        public boolean isTransit() {
            return false;
        }

        public boolean isDelivered() {
            return false;
        }

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        AmazonStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }

    }

    public boolean isDeliverable() {
        return this.status.isTransit();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery());
    }

    public AmazonStatus getStatus() {
        return status;
    }

    public void setStatus(AmazonStatus status) {
        this.status = status;
    }
    @Test
    public void givenAmazonOrder_whenReady_thenDeliverable() {
        Amazon amz = new Amazon();
        amz.setStatus(AmazonStatus.INTRANSIT);
        assertTrue(amz.isDeliverable());
        // assertTrue(amz.isDeliverable());
    }

}
