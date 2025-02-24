package mediatheque;

public class BookPrinter implements ItemVisitor {
    
    @Override
    public void visit(Book m) {
        System.out.println("Livre regardé: " + m);
    }

    @Override
    public void visit(CD m) {}
}