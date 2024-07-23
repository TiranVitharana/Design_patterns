public class Subtract implements Expression{

        
    private Expression leftExpression, rightExpression;
    
    public Subtract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interprit() {
       return leftExpression.interprit() - rightExpression.interprit();
    }
    

}

