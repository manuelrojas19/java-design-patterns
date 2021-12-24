/**
 * ColorSpecification
 */
public class ColorSpecification implements Specification<Product> {
    
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.color == item.getColor();
    }

    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
}
