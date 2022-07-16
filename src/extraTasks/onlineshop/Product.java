package extraTasks.onlineshop;


public class Product {
    private String typeProduct;
    private String nameProduct;
    private Integer priceProduct;
    private Integer amountProduct;
    private String size;

    public Product(String typeProduct, String nameProduct, Integer priceProduct, Integer amountProduct, String size) {
        this.typeProduct = typeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
        this.size = size;
    }
}
