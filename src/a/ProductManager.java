package a;

public class ProductManager {

    private boolean isPermittedCreate = false;


    public Product createProduct(String name) {
        isPermittedCreate = true;
        Product product = new Product(this, name);
        new ProductEvent(product,ProductEventType.NEW_PRODUCT);
        return product;
    }

    public void abandonProduct(Product product){
        new ProductEvent(product,ProductEventType.DEL_PRODUCT);
        product = null;
    }

    public void editProduct(Product product,String name){
        new ProductEvent(product,ProductEventType.EDIT_PRODUCT);
        product.setName(name);
    }

    //获得是否可以创建一个产品
    public boolean isCreateProduct() {
        return isPermittedCreate;
    }

    public Product clone(Product product) {
        new ProductEvent(product,ProductEventType.CLONE_PRODUCT);
        return  product.clone();
    }

}
