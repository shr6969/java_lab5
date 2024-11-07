package onlineStore;

public class Main {
    public static void main(String[] args) {
        // Створення таблиці
        System.out.println("Creating Product table...");
        CreateTable.createProductTable();

        // Вставка нового продукту
        System.out.println("\nInserting a new product...");
        CreateProduct.insertProduct("Laptop", "A powerful gaming laptop", 1200.99, 10);

        // Читання всіх продуктів
        System.out.println("\nReading all products...");
        ReadProduct.getAllProducts();

        // Оновлення ціни продукту (наприклад, продукт з id = 1)
        System.out.println("\nUpdating product price...");
        UpdateProduct.updateProductPrice(1, 999.99);

        // Читання всіх продуктів після оновлення
        System.out.println("\nReading all products after update...");
        ReadProduct.getAllProducts();

        // Видалення продукту (наприклад, продукт з id = 1)
        System.out.println("\nDeleting a product...");
        DeleteProduct.deleteProduct(1);

        // Читання всіх продуктів після видалення
        System.out.println("\nReading all products after delete...");
        ReadProduct.getAllProducts();
    }
}
