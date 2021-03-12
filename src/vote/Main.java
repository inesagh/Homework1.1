package vote;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setUpvotes(3);
        product.setDownvotes(32);
        System.out.println(product.getVoteCount());

    }
}
